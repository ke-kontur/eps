
package ru.acs.fts.schemas.admin.orgdbupdate;

import java.math.BigDecimal;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

/** 
 * ����������  � ������  �����������
 */
public class PtpcInfoType
{
    private String participantID;
    private String PTPCName;
    private BigDecimal accessModeFlag;
    private String fullStateAccessFlag;
    private String transportAddress;
    private String transferType;
    private String comments;
    private LocalDate startDate;
    private LocalDate endDate;
    private String brokerID;
    private String IPSID;
    private DateTime chDateTime;
    private String address;
    private String ghangeAccessReason;
    private String password;
    private BigDecimal SVXSign;
    private String SVXID;
    private DocumentGroundConnectionType groundConnectionPtpc;

    /** 
     * Get the 'ParticipantID' element value. ������������� ����� ����������
     * 
     * @return value
     */
    public String getParticipantID() {
        return participantID;
    }

    /** 
     * Set the 'ParticipantID' element value. ������������� ����� ����������
     * 
     * @param participantID
     */
    public void setParticipantID(String participantID) {
        this.participantID = participantID;
    }

    /** 
     * Get the 'PTPC_Name' element value. ������������  �����  �����������
     * 
     * @return value
     */
    public String getPTPCName() {
        return PTPCName;
    }

    /** 
     * Set the 'PTPC_Name' element value. ������������  �����  �����������
     * 
     * @param PTPCName
     */
    public void setPTPCName(String PTPCName) {
        this.PTPCName = PTPCName;
    }

    /** 
     * Get the 'AccessModeFlag' element value. �������  �������
     * 
     * @return value
     */
    public BigDecimal getAccessModeFlag() {
        return accessModeFlag;
    }

    /** 
     * Set the 'AccessModeFlag' element value. �������  �������
     * 
     * @param accessModeFlag
     */
    public void setAccessModeFlag(BigDecimal accessModeFlag) {
        this.accessModeFlag = accessModeFlag;
    }

    /** 
     * Get the 'FullStateAccessFlag' element value. ������� ������������ �������� ���������  ���������  ���������
     * 
     * @return value
     */
    public String getFullStateAccessFlag() {
        return fullStateAccessFlag;
    }

    /** 
     * Set the 'FullStateAccessFlag' element value. ������� ������������ �������� ���������  ���������  ���������
     * 
     * @param fullStateAccessFlag
     */
    public void setFullStateAccessFlag(String fullStateAccessFlag) {
        this.fullStateAccessFlag = fullStateAccessFlag;
    }

    /** 
     * Get the 'TransportAddress' element value. ������������  �����
     * 
     * @return value
     */
    public String getTransportAddress() {
        return transportAddress;
    }

    /** 
     * Set the 'TransportAddress' element value. ������������  �����
     * 
     * @param transportAddress
     */
    public void setTransportAddress(String transportAddress) {
        this.transportAddress = transportAddress;
    }

    /** 
     * Get the 'TransferType' element value. ��� ��������  ��������� (XML/ZIP)
     * 
     * @return value
     */
    public String getTransferType() {
        return transferType;
    }

    /** 
     * Set the 'TransferType' element value. ��� ��������  ��������� (XML/ZIP)
     * 
     * @param transferType
     */
    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }

    /** 
     * Get the 'Comments' element value. �����������
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. �����������
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /** 
     * Get the 'StartDate' element value. ���� ������ ��������  �������  ������
     * 
     * @return value
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /** 
     * Set the 'StartDate' element value. ���� ������ ��������  �������  ������
     * 
     * @param startDate
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /** 
     * Get the 'EndDate' element value. ����  ��������� ��������  �������  ������
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. ����  ��������� ��������  �������  ������
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /** 
     * Get the 'BrokerID' element value. ������������� ��������������� �������
     * 
     * @return value
     */
    public String getBrokerID() {
        return brokerID;
    }

    /** 
     * Set the 'BrokerID' element value. ������������� ��������������� �������
     * 
     * @param brokerID
     */
    public void setBrokerID(String brokerID) {
        this.brokerID = brokerID;
    }

    /** 
     * Get the 'IPSID' element value. ������������� ��� ���
     * 
     * @return value
     */
    public String getIPSID() {
        return IPSID;
    }

    /** 
     * Set the 'IPSID' element value. ������������� ��� ���
     * 
     * @param IPSID
     */
    public void setIPSID(String IPSID) {
        this.IPSID = IPSID;
    }

    /** 
     * Get the 'ChDateTime' element value. ����/����� ���������� ��������� ������
     * 
     * @return value
     */
    public DateTime getChDateTime() {
        return chDateTime;
    }

    /** 
     * Set the 'ChDateTime' element value. ����/����� ���������� ��������� ������
     * 
     * @param chDateTime
     */
    public void setChDateTime(DateTime chDateTime) {
        this.chDateTime = chDateTime;
    }

    /** 
     * Get the 'Address' element value. ����� ����� �����������
     * 
     * @return value
     */
    public String getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. ����� ����� �����������
     * 
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /** 
     * Get the 'GhangeAccessReason' element value. ����������� ��� ��������� �������� ������� ������� ������
     * 
     * @return value
     */
    public String getGhangeAccessReason() {
        return ghangeAccessReason;
    }

    /** 
     * Set the 'GhangeAccessReason' element value. ����������� ��� ��������� �������� ������� ������� ������
     * 
     * @param ghangeAccessReason
     */
    public void setGhangeAccessReason(String ghangeAccessReason) {
        this.ghangeAccessReason = ghangeAccessReason;
    }

    /** 
     * Get the 'Password' element value. ������ ��������� �����
     * 
     * @return value
     */
    public String getPassword() {
        return password;
    }

    /** 
     * Set the 'Password' element value. ������ ��������� �����
     * 
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /** 
     * Get the 'SVXSign' element value. ������� ���.
     * 
     * @return value
     */
    public BigDecimal getSVXSign() {
        return SVXSign;
    }

    /** 
     * Set the 'SVXSign' element value. ������� ���.
     * 
     * @param SVXSign
     */
    public void setSVXSign(BigDecimal SVXSign) {
        this.SVXSign = SVXSign;
    }

    /** 
     * Get the 'SVXID' element value. ������������� �� ����������� ������������ � ��������� � ������ ���������� ���
     * 
     * @return value
     */
    public String getSVXID() {
        return SVXID;
    }

    /** 
     * Set the 'SVXID' element value. ������������� �� ����������� ������������ � ��������� � ������ ���������� ���
     * 
     * @param SVXID
     */
    public void setSVXID(String SVXID) {
        this.SVXID = SVXID;
    }

    /** 
     * Get the 'GroundConnectionPtpc' element value. ��������� ��� ����������� ����� 
     * 
     * @return value
     */
    public DocumentGroundConnectionType getGroundConnectionPtpc() {
        return groundConnectionPtpc;
    }

    /** 
     * Set the 'GroundConnectionPtpc' element value. ��������� ��� ����������� ����� 
     * 
     * @param groundConnectionPtpc
     */
    public void setGroundConnectionPtpc(
            DocumentGroundConnectionType groundConnectionPtpc) {
        this.groundConnectionPtpc = groundConnectionPtpc;
    }
}
