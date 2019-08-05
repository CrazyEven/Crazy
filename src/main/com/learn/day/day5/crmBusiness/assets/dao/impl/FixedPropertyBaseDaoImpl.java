package main.com.learn.day.day5.crmBusiness.assets.dao.impl;

import com.order.cc.sys.dao.FoHQLQuery;
import main.com.learn.day.day5.crmBusiness.assets.dao.FixedPropertyBaseDao;
import main.com.learn.day.day5.crmBusiness.assets.po.FixedPropertyBaseEntity;
import main.com.learn.extend.dao.impl.BasicDaoImpl;
import org.springframework.stereotype.Repository;

@Repository
public class FixedPropertyBaseDaoImpl extends BasicDaoImpl<FixedPropertyBaseEntity> implements FixedPropertyBaseDao {

    @Override
    public <T extends FixedPropertyBaseEntity> T findFixedProperty(String customerId, Class<T> propertyClass) {
        String hql = "from " + propertyClass.getName() + " p  where p.customerId = ? ";
        FoHQLQuery query = new FoHQLQuery();
        query.setString(0, customerId);
        query.setHQL(hql);
        return (T) this.execFoQuery1(query);
    }
}
