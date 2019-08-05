package main.com.learn.day.day5.crmBusiness.assets.po;

import main.com.learn.day.day5.crmBusiness.assets.enums.FixedPropertyType;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 固定资产基础信息
 */
@Entity
@Table(name = "CRM_FIXED_PROPERTY_BASE")
@Inheritance(strategy = InheritanceType.JOINED)
public class FixedPropertyBaseEntity implements Serializable {

    private String propertyId;
    /**
     * 客户
     */
    private String customerId ;
    /**
     * 资产类型
     */
    private FixedPropertyType propertyType;
    /**
     * 购入日期
     */
    private Date payTime;
    /**
     * 贷款总额
     */
    private Integer loanAmount = 0;
    /**
     * 贷款利率
     */
    private BigDecimal loanRate = new BigDecimal("0.000");
    /**
     * 贷款年限
     */
    private Integer loanYears;
    /**
     * 还款方式
     */
    private String repaymentType;
    /**
     * 固定资产编号
     */
    private String fixedCode;
    /**
     * 创建人
     */
    private String createdBy;
    /**
     * 创建时间
     */
    private Date createdTime;
    /**
     * 更新人
     */
    private String updatedBy;
    /**
     * 更新时间
     */
    private Date updatedTime;

    @Id
    @Column(name = "PROPERTY_ID")
    @GeneratedValue(generator = "propertyGenerator")
    @GenericGenerator(name = "propertyGenerator", strategy = "uuid")
    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    @Column(name = "CUSTOMER_ID")
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Column(name = "PROPERTY_TYPE")
    public FixedPropertyType getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(FixedPropertyType propertyType) {
        this.propertyType = propertyType;
    }

    @Column(name = "PAY_TIME")
    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    @Column(name = "LOAN_AMOUNT")
    public Integer getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Integer loanAmount) {
        this.loanAmount = loanAmount;
    }

    @Column(name = "LOAN_RATE")
    public BigDecimal getLoanRate() {
        return loanRate;
    }

    public void setLoanRate(BigDecimal loanRate) {
        this.loanRate = loanRate;
    }

    @Column(name = "LOAN_YEARS")
    public Integer getLoanYears() {
        return loanYears;
    }

    public void setLoanYears(Integer loanYears) {
        this.loanYears = loanYears;
    }

    @Column(name = "REPAYMENT_TYPE")
    public String getRepaymentType() {
        return repaymentType;
    }

    public void setRepaymentType(String repaymentType) {
        this.repaymentType = repaymentType;
    }

    @Column(name = "FIXED_CODE")
    public String getFixedCode() {
        return fixedCode;
    }

    public void setFixedCode(String fixedCode) {
        this.fixedCode = fixedCode;
    }

    @Column(name = "CREATED_BY")
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Column(name = "CREATED_TIME")
    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    @Column(name = "UPDATED_BY")
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Column(name = "UPDATED_TIME")
    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}
