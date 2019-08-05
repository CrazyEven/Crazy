package main.com.learn.day.day5.crmBusiness.assets.po;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 流动资产
 */
@Entity
@Table(name = "CRM_FIXED_PROPERTY_BASE")
public class FlowPropertyEntity implements Serializable {

    private String flowId;
    /**
     * 客户
     */
    private String customerId;
    /**
     * 银行存款
     */
    private Integer bankDeposit;
    /**
     * 银行理财
     */
    private Integer bankFinancing;
    /**
     * 货币基金
     */
    private Integer monetaryFund;
    /**
     * 存款年化利率
     */
    private Double depositRate;
    /**
     * 理财年化利率
     */
    private Double financingRate;
    /**
     * 基金年化利率
     */
    private Double monetaryRate;
    /**
     * 非货币基金
     */
    private Integer noMonetaryFund;
    /**
     * 私人债权
     */
    private Integer privateClaims;
    /**
     * 其它资产
     */
    private Integer otherProperty;
    /**
     * 股票
     */
    private Integer shares_;
    /**
     * 债权年化利率
     */
    private Double privateRate;
    /**
     * 其它年华利率
     */
    private Double otherRate;
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
    @Column(name = "FLOW_ID")
    @GeneratedValue(generator = "flowPropertyGenerator")
    @GenericGenerator(name = "flowPropertyGenerator", strategy = "uuid")
    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Column(name = "BANK_DEPOSIT")
    public Integer getBankDeposit() {
        return bankDeposit;
    }

    public void setBankDeposit(Integer bankDeposit) {
        this.bankDeposit = bankDeposit;
    }

    @Column(name = "BANK_FINANCING")
    public Integer getBankFinancing() {
        return bankFinancing;
    }

    public void setBankFinancing(Integer bankFinancing) {
        this.bankFinancing = bankFinancing;
    }

    @Column(name = "MONETARY_FUND")
    public Integer getMonetaryFund() {
        return monetaryFund;
    }

    public void setMonetaryFund(Integer monetaryFund) {
        this.monetaryFund = monetaryFund;
    }

    @Column(name = "DEPOSIT_RATE")
    public Double getDepositRate() {
        return depositRate;
    }

    public void setDepositRate(Double depositRate) {
        this.depositRate = depositRate;
    }

    @Column(name = "FINANCING_RATE")
    public Double getFinancingRate() {
        return financingRate;
    }

    public void setFinancingRate(Double financingRate) {
        this.financingRate = financingRate;
    }

    @Column(name = "MONETARY_RATE")
    public Double getMonetaryRate() {
        return monetaryRate;
    }

    public void setMonetaryRate(Double monetaryRate) {
        this.monetaryRate = monetaryRate;
    }

    @Column(name = "NO_MONETARY_FUND")
    public Integer getNoMonetaryFund() {
        return noMonetaryFund;
    }

    public void setNoMonetaryFund(Integer noMonetaryFund) {
        this.noMonetaryFund = noMonetaryFund;
    }

    @Column(name = "PRIVATE_CLAIMS")
    public Integer getPrivateClaims() {
        return privateClaims;
    }

    public void setPrivateClaims(Integer privateClaims) {
        this.privateClaims = privateClaims;
    }

    @Column(name = "OTHER_PROPERTY")
    public Integer getOtherProperty() {
        return otherProperty;
    }

    public void setOtherProperty(Integer otherProperty) {
        this.otherProperty = otherProperty;
    }

    @Column(name = "SHARES_")
    public Integer getShares_() {
        return shares_;
    }

    public void setShares_(Integer shares_) {
        this.shares_ = shares_;
    }

    @Column(name = "PRIVATE_RATE")
    public Double getPrivateRate() {
        return privateRate;
    }

    public void setPrivateRate(Double privateRate) {
        this.privateRate = privateRate;
    }

    @Column(name = "OTHER_RATE")
    public Double getOtherRate() {
        return otherRate;
    }

    public void setOtherRate(Double otherRate) {
        this.otherRate = otherRate;
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
