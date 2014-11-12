package ru.acs.fts.eps2.model.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * User: CAA
 * Date: 28.12.2012
 * Time: 12:00
 */

@Entity
@Table(name = "EDECL_PARTICIPANT")
public class Edecl_Participant {
    public Edecl_Participant(){

    }

    @Id
    @Column(name="PTPC_PARTICIPANTID", length =100, nullable = false)
    private String participantId;
    @Column(name="PTPC_FULLSTATEACCESSMODE", length = 1)
    private String fullStateAccessMode;
    @Column(name="PTPC_TRANSPORTADRESS", length = 100)
    private String transportAddress;
    @Column(name="PTPC_TRANSFERTYPE", length = 10)
    private String transferType;
    @Column(name="PTPC_IPSID", length = 36)
    private String ipSid;
    @Column(name="PTPC_SVHNAME", length = 150)
    private String svhName;
    @Column(name="PTPC_SVHLICNUM", length = 50)
    private String svhLicNum;
    @Column(name="PTPC_NAME", length =150, nullable = false)
    private String name;
    @Column(name="PTPC_ORGID", length =36, nullable = false)
    private String orgId;

    @Column(name="PTPC_CODEDOCUMENT", length = 18)
    private String codeDocument;
    @Column(name="PTPC_ACCESSMODE", length = 1)
    private String accessMode;
    @Column(name="PTPC_ACCINFO", length = 250)
    private String accInfo;
    @Temporal(TemporalType.DATE)
    @Column(name="PTPC_CONTRACTDATE")
    private Date contractDate;
    @Temporal(TemporalType.DATE)
    @Column(name="PTPC_STARTDATE", nullable = false, columnDefinition = "DATE DEFAULT '01.01.2005' NOT NULL")
    private Date startDate;
    @Temporal(TemporalType.DATE)
    @Column(name="PTPC_ENDDATE")
    private Date endDate;
    @Column(name="PTPC_COMMENTS", length = 250)
    private String comments;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="PTPC_CHDATETIME", length = 6)
    private Date changeDateTine;
    @Column(name="PTPC_INFBROKERID", length = 36)
    private String infBrokerId;
    @Column(name="PTPC_ADDRESS", length = 150)
    private String address;
    @Column(name="PTPC_CHANGE_ACCESS_REASON", length = 250)
    private String changeAccessReason;

    public String getParticipantId() {
        return participantId;
    }

    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }
        public String getFullStateAccessMode() {
        return fullStateAccessMode;
    }

    public void setFullStateAccessMode(String fullStateAccessMode) {
        this.fullStateAccessMode = fullStateAccessMode;
    }

    public String getTransportAddress() {
        return transportAddress;
    }

    public void setTransportAddress(String transportAddress) {
        this.transportAddress = transportAddress;
    }

    public String getTransferType() {
        return transferType;
    }

    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }

    public String getIpSid() {
        return ipSid;
    }

    public void setIpSid(String ipSid) {
        this.ipSid = ipSid;
    }

    public String getSvhName() {
        return svhName;
    }

    public void setSvhName(String svhName) {
        this.svhName = svhName;
    }

    public String getSvhLicNum() {
        return svhLicNum;
    }

    public void setSvhLicNum(String svhLicNum) {
        this.svhLicNum = svhLicNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }
    public String getCodeDocument() {
        return codeDocument;
    }

    public void setCodeDocument(String codeDocument) {
        this.codeDocument = codeDocument;
    }

    public String getAccessMode() {
        return accessMode;
    }

    public void setAccessMode(String accessMode) {
        this.accessMode = accessMode;
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getChangeDateTine() {
        return changeDateTine;
    }

    public void setChangeDateTine(Date changeDateTine) {
        this.changeDateTine = changeDateTine;
    }

    public String getInfBrokerId() {
        return infBrokerId;
    }

    public void setInfBrokerId(String infBrokerId) {
        this.infBrokerId = infBrokerId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getChangeAccessReason() {
        return changeAccessReason;
    }

    public void setChangeAccessReason(String changeAccessReason) {
        this.changeAccessReason = changeAccessReason;
    }
}
