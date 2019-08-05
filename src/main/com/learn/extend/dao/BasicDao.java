package main.com.learn.extend.dao;

import java.util.List;
import java.util.Map;

/**
 * DAO公用方法封装接口
 * @author liujiegang
 */
public interface BasicDao<T extends Object> {

    /**
     * 查询指定实体对象（过期）
     * @param clazz
     * @param id
     * @return
     */
    @Deprecated
    public T getEntityById(Class<T> clazz, String id);

    /**
     * 查询指定对象
     * @param id
     * @return
     */
    public T getEntityById(String id);

    /**
     * 保存实体对象
     * @param entity
     */
    public void saveEntity(T entity);

    /**
     * 修改实体对象
     * @param entity
     */
    public void updateEntity(T entity);

    /**
     * 删除实体对象
     * @param entity
     */
    public void deleteEntity(T entity);

    /**
     * 删除实体对象
     * @param clazz
     * @param id
     */
    public void deleteEntityById(Class clazz, String id);

    /**
     * 查询对象集合
     * @param hql
     * @param params
     * @return
     */
    public List<?> find(String hql, Object... params);

    /**
     * 查询结果List<Map>
     * @param sql
     * @param params
     * @return
     */
    public List<Map> findForMap(String sql, Object... params);

    /**
     * 查询指定实体对象
     * @param hql
     * @param params
     * @return
     */
    public T findEntity(String hql, Object... params);

    /**
     * hql统计
     * @param hql
     * @param params
     * @return
     */
    public int countHql(String hql, Object... params);

    /**
     * sql统计
     * @param sql
     * @param params
     * @return
     */
    public int countSql(String sql, Object... params);
}
