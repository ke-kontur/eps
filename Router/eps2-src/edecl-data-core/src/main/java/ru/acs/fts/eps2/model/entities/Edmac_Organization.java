package ru.acs.fts.eps2.model.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * User: CAA
 * Date: 28.12.2012
 * Time: 12:00
 */

@Entity
@Table(name = "EDMAC_ORGANIZATION")
public class Edmac_Organization {
    public Edmac_Organization(){

    }

    @Id
    @Column(name="ORG_ORGID", length = 36, nullable = false)
    private String orgId;
    @Column(name="ORG_ORGNAME", length = 150, nullable = false)
    private String orgName;
    @Column(name="ORG_ORGMAIL", length = 150)
    private String orgMail;
    @Column(name="ORG_OGRN", length = 15)
    private String orgN;
    @Column(name="ORG_INN", length = 12)
    private String inn;
    @Column(name="ORG_KPP", length = 9)
    private String kpp;
    @Column(name="ORG_E_MAIL", length = 50)
    private String eMail;
    @Column(name="ORG_ACCINFO", length = 250)
    private String accInfo;
    @Temporal(TemporalType.DATE)
    @Column(name="ORG_CONTRACTDATE")
    private Date contractDate;
    @Column(name="ORG_COMMENTS", length = 250)
    private String comments;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ORG_CHDATETIME", length = 6)
    private Date changeDatetime;
    @Column(name="ORG_INFBROKERFLAG", length = 1)
    private Integer infBrokerFlag;
    @Column(name="ORG_CODEDOCUMENT", length = 18)
    private String codeDocument;

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgMail() {
        return orgMail;
    }

    public void setOrgMail(String orgMail) {
        this.orgMail = orgMail;
    }

    public String getOrgN() {
        return orgN;
    }

    public void setOrgN(String orgN) {
        this.orgN = orgN;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getKpp() {
        return kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getAccInfo() {
        return accInfo;
    }

    public void setAccInfo(String accInfo) {
        this.accInfo = accInfo;
    }

    public Date getContractDate() {
        return contractDate;
    }

    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getChangeDatetime() {
        return changeDatetime;
    }

    public void setChangeDatetime(Date changeDatetime) {
        this.changeDatetime = changeDatetime;
    }

    public Integer getInfBrokerFlag() {
        return infBrokerFlag;
    }

    public void setInfBrokerFlag(Integer infBrokerFlag) {
        this.infBrokerFlag = infBrokerFlag;
    }

    public String getCodeDocument() {
        return codeDocument;
    }

    public void setCodeDocument(String codeDocument) {
        this.codeDocument = codeDocument;
    }
}
