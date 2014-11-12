package ru.acs.fts.eps2.model.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * User: CAA
 * Date: 28.12.2012
 * Time: 12:00
 */

@Entity
@Table(name = "EDECL_UDCUSTLIST")
public class Edecl_Udcustlist {
    public Edecl_Udcustlist(){

    }

    @Id
    @Column(name="UCL_ID", length = 36, nullable = false)
    private String id;
    @Column(name="UCL_EXTCUSTCODE", length = 8, nullable = false)
    private String extCustCode;
    @Column(name="UCL_INTCUSTCODE", length = 8, nullable = false)
    private String intCustCode;
    @Column(name="UCL_EXTCUSTNAME", length = 250, nullable = false)
    private String extCustName;
    @Column(name="UCL_INTCUSTNAME", length = 250, nullable = false)
    private String intCustName;
    @Column(name="UCL_ACCINFO_CONNECT", length = 250, nullable = false)
    private String accInfoConnect;
    @Temporal(TemporalType.DATE)
    @Column(name="UCL_CONTRACTDATE_CONNECT")
    private Date contractDateConnect;
    @Column(name="UCL_CODEDOCUMENT_CONNECT", length = 18, nullable = false)
    private String codeDocumentConnect;
    @Column(name="UCL_ACCINFO_DISCONNECT", length = 250)
    private String accInfoDisconnect;
    @Temporal(TemporalType.DATE)
    @Column(name="UCL_CONTRACTDATE_DISCONNECT")
    private Date contractDateDisconnect;
    @Column(name="UCL_CODEDOCUMENT_DISCONNECT", length = 18)
    private String codeDocumentDisconnect;
    @Temporal(TemporalType.DATE)
    @Column(name="UCL_STARTDATE", nullable = false)
    private Date startDate;
    @Temporal(TemporalType.DATE)
    @Column(name="UCL_ENDDATE")
    private Date endDate;
    @Column(name="UCL_COMMENTS", length = 250)
    private String comments;

    public String getId() {
        return id;
    }

    public String getExtCustCode() {
        return extCustCode;
    }

    public String getIntCustCode() {
        return intCustCode;
    }

    public String getExtCustName() {
        return extCustName;
    }

    public String getIntCustName() {
        return intCustName;
    }

    public String getAccInfoConnect() {
        return accInfoConnect;
    }

    public Date getContractDateConnect() {
        return contractDateConnect;
    }

    public String getCodeDocumentConnect() {
        return codeDocumentConnect;
    }

    public String getAccInfoDisconnect() {
        return accInfoDisconnect;
    }

    public Date getContractDateDisconnect() {
        return contractDateDisconnect;
    }

    public String getCodeDocumentDisconnect() {
        return codeDocumentDisconnect;
    }

    public Date getStartDate() {
        return startDate;
    }

    public String getComments() {
        return comments;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setExtCustCode(String extCustCode) {
        this.extCustCode = extCustCode;
    }

    public void setIntCustCode(String intCustCode) {
        this.intCustCode = intCustCode;
    }

    public void setExtCustName(String extCustName) {
        this.extCustName = extCustName;
    }

    public void setIntCustName(String intCustName) {
        this.intCustName = intCustName;
    }

    public void setAccInfoConnect(String accInfoConnect) {
        this.accInfoConnect = accInfoConnect;
    }

    public void setContractDateConnect(Date contractDateConnect) {
        this.contractDateConnect = contractDateConnect;
    }

    public void setCodeDocumentConnect(String codeDocumentConnect) {
        this.codeDocumentConnect = codeDocumentConnect;
    }

    public void setAccInfoDisconnect(String accInfoDisconnect) {
        this.accInfoDisconnect = accInfoDisconnect;
    }

    public void setContractDateDisconnect(Date contractDateDisconnect) {
        this.contractDateDisconnect = contractDateDisconnect;
    }

    public void setCodeDocumentDisconnect(String codeDocumentDisconnect) {
        this.codeDocumentDisconnect = codeDocumentDisconnect;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
