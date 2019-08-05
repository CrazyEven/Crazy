package main.com.learn.extend.dao.impl;

import com.order.cc.sys.dao.*;
import main.com.learn.extend.dao.BasicDao;
import org.hibernate.SessionFactory;

import javax.annotation.Resource;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;

/**
 * 扩展DAO，注解注入SessionFactory
 * @author liujiegang
 */
public abstract class BasicDaoImpl<T extends Object> extends FoHibernateDaoSupport implements BasicDao<T> {

    private Class<T> persistentClass;

    public BasicDaoImpl() {
        this.persistentClass = (Class<T>) (((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0]);
    }

    public Class<T> getPersistentClass() {
        return persistentClass;
    }

    @Resource
	public void setSessionFactoryOverride(SessionFactory sessionFactory){
		super.setSessionFactory(sessionFactory);
	}

    @Override
    public T getEntityById(Class<T> clazz, String id) {
        return this.getHibernateTemplate().get(clazz, id);
    }

    @Override
    public T getEntityById(String id) {
        return this.getEntityById(getPersistentClass(), id);
    }

    @Override
    public void saveEntity(T entity) {
        this.getHibernateTemplate().save(entity);
    }

    @Override
    public void updateEntity(T entity) {
        this.getHibernateTemplate().update(entity);
    }

    @Override
    public void deleteEntity(T entity) {
        this.getHibernateTemplate().delete(entity);
    }

    @Override
    public void deleteEntityById(Class clazz, String id) {
        Object entity = this.getEntityById(clazz, id);
        if(entity != null) {
            this.getHibernateTemplate().delete(entity);
        }
    }

    @Override
    public List<T> find(String hql, Object... params) {
        return (List<T>) this.getHibernateTemplate().find(hql, params);
    }

    @Override
    public List<Map> findForMap(String sql, Object... params) {
        FoSQLQuery query = new FoSQLQuery(sql);
        this.setQueryParams(query, params);
        query.setEntityMap(true);
        return this.execFoQuery(query);
    }

    @Override
    public T findEntity(String hql, Object... params) {
        FoHQLQuery query = new FoHQLQuery(hql);
        this.setQueryParams(query, params);
        return (T)this.execFoQuery1(query);
    }

    @Override
    public int countHql(String hql, Object... params) {
        FoHQLQuery query = new FoHQLQuery(hql);
        this.setQueryParams(query, params);
        return this.execFoCountHql(query);
    }

    @Override
    public int countSql(String sql, Object... params) {
        FoSQLQuery query = new FoSQLQuery(sql);
        this.setQueryParams(query, params);
        return this.execFoQuery2(query);
    }

    @Override
	public FoPage execFoPageQuery(FoQuery foQuery) {
	    return super.execFoPageQuery(this.resetFoQuery(foQuery));
	}
	
	@Override
	public List execFoQuery(FoQuery foQuery) {
        return super.execFoQuery(this.resetFoQuery(foQuery));
	}
	
	/**
	 * 重新设置FoQuery
	 * @param foQuery
	 * @return
	 */
	public FoQuery resetFoQuery(FoQuery foQuery) {
	    if(foQuery.getSortFields() != null && foQuery.getSortFields().length > 0) {
            if (foQuery instanceof FoHQLQuery) {
                FoHQLQuery query = (FoHQLQuery) foQuery;
                query.setHQL(this.setSortFieldsToSQL(query.getHQL(), query.getSortFields()));
                return query;
            }
            if(foQuery instanceof FoSQLQuery) {
                FoSQLQuery query = (FoSQLQuery) foQuery;
                query.setSQL(this.setSortFieldsToSQL(query.getSQL(), query.getSortFields()));
                return query;
            }
        }
	    return foQuery;
	}
	
	/**
	 * 将排序字段设置到SQL
	 * @param sql
	 * @param sortFields
	 * @return
	 */
	private String setSortFieldsToSQL(String sql, String[] sortFields) {
	    if(sql.indexOf("order by") > 0) {
	        sql += ",";
	    }else {
            sql += " order by ";
        }
	    for (int i = 0; i < sortFields.length; i+=2) {
            sql += sortFields[i] + " " + sortFields[i+1];
            if(i+2 < sortFields.length) {
                sql += ",";
            }
        }
	    return sql;
	}

    /**
     * 设置参数
     * @param query
     * @param params
     */
    private void setQueryParams(FoQuery query, Object... params) {
        for(int i = 0; i < params.length; i++) {
            query.setObject(i, params[i]);
        }
    }
}
