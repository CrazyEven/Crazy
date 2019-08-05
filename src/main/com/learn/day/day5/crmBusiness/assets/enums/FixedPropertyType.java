package main.com.learn.day.day5.crmBusiness.assets.enums;

public enum FixedPropertyType {
    HOUSE("房屋"),
    CAR("车辆"),
    PARK("车位");

    FixedPropertyType(String desc) {
        this.desc = desc;
    }

    private String desc;

    public String getDesc() {
        return desc;
    }
}
