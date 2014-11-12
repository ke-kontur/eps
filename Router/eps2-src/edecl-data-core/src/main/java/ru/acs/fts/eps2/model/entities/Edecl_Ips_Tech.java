package ru.acs.fts.eps2.model.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * User: CAA
 * Date: 28.12.2012
 * Time: 12:00
 */

@Entity
@Table(name = "EDECL_IPS_TECH")
public class Edecl_Ips_Tech {
    public Edecl_Ips_Tech(){

    }

    @Id
    @Column(name="IPST_RECORD_ID", length = 36, nullable = false)
    private String recordId;
    @Column(name="IPST_TCHLID", nullable = false, length = 36)
    private String tchListId;
    @Column(name="IPST_IPSID", nullable = false, length = 36)
    private String ipsId;
    @Temporal(TemporalType.DATE)
    @Column(name="IPST_ENDDATE")
    private Date endDate;
    @Column(name="IPST_COMMENTS", length = 250)
    private String comments;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="IPST_CHDATETIME", length = 6, nullable = false)
    private Date changeDateTime;
    @Column(name="IPST_CLOSEFLAG", length = 1, nullable = false)
    private int closeFlag;
    @Temporal(TemporalType.DATE)
    @Column(name="IPST_BEGINDATE", nullable = false)
    private Date beginDate;
    @Column(name="IPST_CERTNUM", length = 50, nullable = false)
    private String certNum;
    @Temporal(TemporalType.DATE)
    @Column(name="IPST_CERTDATE", nullable = false)
    private Date certDate;
    @Temporal(TemporalType.DATE)
    @Column(name="IPST_CREATEDATE")
    private Date createDate;

    public String getRecordId() {
        return recordId;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getComments() {
        return comments;
    }

    public Date getChangeDateTime() {
        return changeDateTime;
    }

    public int getCloseFlag() {
        return closeFlag;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public String getCertNum() {
        return certNum;
    }

    public Date getCertDate() {
        return certDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getIpsId() {
        return ipsId;
    }

    public String getTchListId() {
        return tchListId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public void setTchListId(String tchListId) {
        this.tchListId = tchListId;
    }

    public void setIpsId(String ipsId) {
        this.ipsId = ipsId;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setChangeDateTime(Date changeDateTime) {
        this.changeDateTime = changeDateTime;
    }

    public void setCloseFlag(int closeFlag) {
        this.closeFlag = closeFlag;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public void setCertNum(String certNum) {
        this.certNum = certNum;
    }

    public void setCertDate(Date certDate) {
        this.certDate = certDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
