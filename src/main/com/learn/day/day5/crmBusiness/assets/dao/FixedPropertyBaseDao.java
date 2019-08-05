package main.com.learn.day.day5.crmBusiness.assets.dao;

import main.com.learn.day.day5.crmBusiness.assets.po.FixedPropertyBaseEntity;
import main.com.learn.extend.dao.BasicDao;

public interface FixedPropertyBaseDao extends BasicDao<FixedPropertyBaseEntity> {

    /**
     * 查询客户资产
     *
     * @param customerId
     * @param propertyClass
     * @param <T>
     * @return
     */
    <T extends FixedPropertyBaseEntity> T findFixedProperty(String customerId, Class<T> propertyClass);
}
