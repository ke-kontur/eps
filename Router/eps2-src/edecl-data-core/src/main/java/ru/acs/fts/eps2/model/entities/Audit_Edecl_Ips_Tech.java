package ru.acs.fts.eps2.model.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * User: CAA
 * Date: 28.12.2012
 * Time: 12:00
 */
@Entity
@Table(name = "AUDIT_EDECL_IPS_TECH")
public class Audit_Edecl_Ips_Tech { // NO_UCD (for future use)
    public Audit_Edecl_Ips_Tech(){

    }

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name = "AIPST_AID", nullable = false)
    private Long aId;
    @Column(name = "AIPST_TCHLID", length = 36, nullable = true)
    private String tchlId;
    @Column(name = "AIPST_IPSID", length = 36, nullable = true)
    private String ipsId;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "AIPST_CHDATE", length = 6, nullable = false)
    private Date changeDate;
    @Column(name = "AIPST_CHUSER", length = 50, nullable = false)
    private String chUser;
    @Column(name = "AIPST_CHDESCRIPTION", length = 250, nullable = false)
    private String chDescription;
    @Column(name = "AIPST_CHTYPE", length = 1, nullable = false)
    private Integer chType;
    @Column(name = "AIPST_PUBLISHED", length = 1, nullable = false)
    private Integer published;
    @Temporal(TemporalType.DATE)
    @Column(name = "AIPST_BEGINDATE", nullable = true)
    private Date beginDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "AIPST_ENDDATE", nullable = true)
    private Date endDate;
    @Column(name = "AIPST_CLOSEFLAG", length = 1, nullable = true)
    private Integer closeFlag;
    @Temporal(TemporalType.DATE)
    @Column(name = "AIPST_CERTDATE", nullable = true)
    private Date certDate;
    @Column(name = "AIPST_CERTNUM", length = 50, nullable = true)
    private String certNum;
    @Temporal(TemporalType.DATE)
    @Column(name = "AIPST_CREATEDATE", nullable = true)
    private Date createDate;
    @Column(name = "AIPST_COMMENTS", length = 250, nullable = true)
    private String comments;
    @Column(name = "AIPST_MSG_ENVELOPEID", length = 36, nullable = true)
    private String envelopeId;
    @Column(name = "AIPST_MSG_DOCUMENTID", length = 36, nullable = true)
    private String documentId;
    @Column(name = "AIPST_RECORD_ID", length = 36, nullable = true)
    private String recordId;

    public Long getaId() {
        return aId;
    }

    public void setaId(Long aId) {
        this.aId = aId;
    }

    public String getTchlId() {
        return tchlId;
    }

    public void setTchlId(String tchlId) {
        this.tchlId = tchlId;
    }

    public String getIpsId() {
        return ipsId;
    }

    public void setIpsId(String ipsId) {
        this.ipsId = ipsId;
    }

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

    public String getChUser() {
        return chUser;
    }

    public void setChUser(String chUser) {
        this.chUser = chUser;
    }

    public String getChDescription() {
        return chDescription;
    }

    public void setChDescription(String chDescription) {
        this.chDescription = chDescription;
    }

    public Integer getChType() {
        return chType;
    }

    public void setChType(Integer chType) {
        this.chType = chType;
    }

    public Integer getPublished() {
        return published;
    }

    public void setPublished(Integer published) {
        this.published = published;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getCloseFlag() {
        return closeFlag;
    }

    public void setCloseFlag(Integer closeFlag) {
        this.closeFlag = closeFlag;
    }

    public Date getCertDate() {
        return certDate;
    }

    public void setCertDate(Date certDate) {
        this.certDate = certDate;
    }

    public String getCertNum() {
        return certNum;
    }

    public void setCertNum(String certNum) {
        this.certNum = certNum;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }
}
