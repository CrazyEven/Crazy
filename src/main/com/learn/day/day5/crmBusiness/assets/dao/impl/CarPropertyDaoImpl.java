package main.com.learn.day.day5.crmBusiness.assets.dao.impl;

import main.com.learn.day.day5.crmBusiness.assets.dao.CarPropertyDao;
import main.com.learn.day.day5.crmBusiness.assets.po.CarPropertyEntity;
import main.com.learn.extend.dao.impl.BasicDaoImpl;
import org.springframework.stereotype.Repository;

@Repository
public class CarPropertyDaoImpl extends BasicDaoImpl<CarPropertyEntity> implements CarPropertyDao {
}
