package main.com.learn.day.day5.crmBusiness.assets.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 固定资产-房
 */
@Entity
@Table(name = "CRM_HOUSE_PROPERTY")
public class HousePropertyEntity extends FixedPropertyBaseEntity {

    /**
     * 房屋编号
     */
    private String houseSn;
    /**
     * 房屋市值
     */
    private Integer housePrice = 0;
    /**
     * 贷款性质
     */
    private String loanNature;
    /**
     * 房屋用途
     */
    private String houseUse;
    /**
     * 房屋租金
     */
    private Integer houseRent = 0;

    @Column(name = "HOUSE_SN")
    public String getHouseSn() {
        return houseSn;
    }

    public void setHouseSn(String houseSn) {
        this.houseSn = houseSn;
    }

    @Column(name = "HOUSE_PRICE")
    public Integer getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(Integer housePrice) {
        this.housePrice = housePrice;
    }

    @Column(name = "LOAN_NATURE")
    public String getLoanNature() {
        return loanNature;
    }

    public void setLoanNature(String loanNature) {
        this.loanNature = loanNature;
    }

    @Column(name = "HOUSE_USE")
    public String getHouseUse() {
        return houseUse;
    }

    public void setHouseUse(String houseUse) {
        this.houseUse = houseUse;
    }

    @Column(name = "HOUSE_RENT")
    public Integer getHouseRent() {
        return houseRent;
    }

    public void setHouseRent(Integer houseRent) {
        this.houseRent = houseRent;
    }
}
