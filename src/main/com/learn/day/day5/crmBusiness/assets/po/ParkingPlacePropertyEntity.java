package main.com.learn.day.day5.crmBusiness.assets.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 固定资产-车位
 */
@Entity
@Table(name = "CRM_PARKING_PLACE_PROPERTY")
public class ParkingPlacePropertyEntity extends FixedPropertyBaseEntity {

    /** 车位编号 */
    private String parkingBerthSn ;
    /** 车位市值 */
    private Integer parkingBerthPrice ;

    @Column(name = "PARKING_BERTH_SN")
    public String getParkingBerthSn() {
        return parkingBerthSn;
    }

    public void setParkingBerthSn(String parkingBerthSn) {
        this.parkingBerthSn = parkingBerthSn;
    }

    @Column(name = "PARKING_BERTH_PRICE")
    public Integer getParkingBerthPrice() {
        return parkingBerthPrice;
    }

    public void setParkingBerthPrice(Integer parkingBerthPrice) {
        this.parkingBerthPrice = parkingBerthPrice;
    }
}
