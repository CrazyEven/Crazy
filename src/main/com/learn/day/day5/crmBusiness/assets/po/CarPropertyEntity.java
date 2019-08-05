package main.com.learn.day.day5.crmBusiness.assets.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 固定资产-车
 */
@Entity
@Table(name = "CRM_CAR_PROPERTY")
public class CarPropertyEntity extends FixedPropertyBaseEntity {
    /**
     * 车辆编号
     */
    private String carSn;
    /**
     * 车辆购置价
     */
    private Integer carPrice = 0;

    @Column(name = "CAR_SN")
    public String getCarSn() {
        return carSn;
    }

    public void setCarSn(String carSn) {
        this.carSn = carSn;
    }

    @Column(name = "CAR_PRICE")
    public Integer getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(Integer carPrice) {
        this.carPrice = carPrice;
    }
}
