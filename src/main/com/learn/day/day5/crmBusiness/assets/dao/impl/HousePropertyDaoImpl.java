package main.com.learn.day.day5.crmBusiness.assets.dao.impl;

import main.com.learn.day.day5.crmBusiness.assets.dao.HousePropertyDao;
import main.com.learn.day.day5.crmBusiness.assets.po.HousePropertyEntity;
import main.com.learn.extend.dao.impl.BasicDaoImpl;
import org.springframework.stereotype.Repository;

@Repository
public class HousePropertyDaoImpl extends BasicDaoImpl<HousePropertyEntity> implements HousePropertyDao {
}
