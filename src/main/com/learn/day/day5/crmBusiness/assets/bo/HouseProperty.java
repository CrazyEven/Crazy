package main.com.learn.day.day5.crmBusiness.assets.bo;

public class HouseProperty extends FixedPropertyBase {
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

    public String getHouseSn() {
        return houseSn;
    }

    public void setHouseSn(String houseSn) {
        this.houseSn = houseSn;
    }

    public Integer getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(Integer housePrice) {
        this.housePrice = housePrice;
    }

    public String getLoanNature() {
        return loanNature;
    }

    public void setLoanNature(String loanNature) {
        this.loanNature = loanNature;
    }

    public String getHouseUse() {
        return houseUse;
    }

    public void setHouseUse(String houseUse) {
        this.houseUse = houseUse;
    }

    public Integer getHouseRent() {
        return houseRent;
    }

    public void setHouseRent(Integer houseRent) {
        this.houseRent = houseRent;
    }
}
