package main.com.learn.day.day5.crmBusiness.assets.bo;

import main.com.learn.day.day5.crmBusiness.assets.enums.FixedPropertyType;

import java.math.BigDecimal;
import java.util.Date;

public class FixedPropertyBase {
    private String propertyId;
    private String customerId;
    private FixedPropertyType propertyType;
    private Date payTime;
    private Integer loanAmount = 0;
    private BigDecimal loanRate = new BigDecimal("0.000");
    private Integer loanYears;
    private String repaymentType;
    private String fixedCode;
    private String createdBy;
    private Date createdTime = new Date();
    private String updatedBy;
    private Date updatedTime = new Date();

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public FixedPropertyType getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(FixedPropertyType propertyType) {
        this.propertyType = propertyType;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Integer getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Integer loanAmount) {
        this.loanAmount = loanAmount;
    }

    public BigDecimal getLoanRate() {
        return loanRate;
    }

    public void setLoanRate(BigDecimal loanRate) {
        this.loanRate = loanRate;
    }

    public Integer getLoanYears() {
        return loanYears;
    }

    public void setLoanYears(Integer loanYears) {
        this.loanYears = loanYears;
    }

    public String getRepaymentType() {
        return repaymentType;
    }

    public void setRepaymentType(String repaymentType) {
        this.repaymentType = repaymentType;
    }

    public String getFixedCode() {
        return fixedCode;
    }

    public void setFixedCode(String fixedCode) {
        this.fixedCode = fixedCode;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}
