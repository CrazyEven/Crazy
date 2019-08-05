package main.com.learn.day.day5.crmBusiness.assets.po;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 负债
 */
@Entity
@Table(name = "CRM_LIABILITIES")
public class LiabilitiesEntity implements Serializable {

    private String liabId;
    /**
     * 客户
     */
    private String customerId;
    /**
     * 个人消费贷
     */
    private Integer consumptionLoan;
    /**
     * 私人借贷
     */
    private Integer privateLoan;
    /**
     * 其它负债
     */
    private Integer otherLiabilities;
    /**
     * 未来一年确定支出
     */
    private Integer definePay;
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
    @Column(name = "LIAB_ID")
    @GeneratedValue(generator = "liabilitiesGenerator")
    @GenericGenerator(name = "liabilitiesGenerator", strategy = "uuid")
    public String getLiabId() {
        return liabId;
    }

    public void setLiabId(String liabId) {
        this.liabId = liabId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Column(name = "CONSUMPTION_LOAN")
    public Integer getConsumptionLoan() {
        return consumptionLoan;
    }

    public void setConsumptionLoan(Integer consumptionLoan) {
        this.consumptionLoan = consumptionLoan;
    }

    @Column(name = "PRIVATE_LOAN")
    public Integer getPrivateLoan() {
        return privateLoan;
    }

    public void setPrivateLoan(Integer privateLoan) {
        this.privateLoan = privateLoan;
    }

    @Column(name = "OTHER_LIABILITIES")
    public Integer getOtherLiabilities() {
        return otherLiabilities;
    }

    public void setOtherLiabilities(Integer otherLiabilities) {
        this.otherLiabilities = otherLiabilities;
    }

    @Column(name = "DEFINE_PAY")
    public Integer getDefinePay() {
        return definePay;
    }

    public void setDefinePay(Integer definePay) {
        this.definePay = definePay;
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
