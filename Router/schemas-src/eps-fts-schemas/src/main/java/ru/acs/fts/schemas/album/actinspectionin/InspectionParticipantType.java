
package ru.acs.fts.schemas.album.actinspectionin;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AuthoritesDocumentType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;

/** 
 * ����, �������������� ��� �������� (�������)
 */
public class InspectionParticipantType extends PersonInfType
{
    private String status;
    private LocalDate ATDRecriveDate;
    private String ATDReceiveTime;
    private String recordNumber;
    private String reason;
    private String job;
    private String ATDReceiveCopy;
    private String addresseeMPO;
    private IdentityCardType identityCard;
    private AddressType address;
    private AuthoritesDocumentType authoritesDocument;

    /** 
     * Get the 'Status' element value. ������ ��� ��������� ����, ��������������� ��� �������� (�������): 3 - ��������� (���� ����, �������������� � ��������� �������, ���� �������������); 4 - �������; 5 - �������; 6 - �������� �������� �����
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' element value. ������ ��� ��������� ����, ��������������� ��� �������� (�������): 3 - ��������� (���� ����, �������������� � ��������� �������, ���� �������������); 4 - �������; 5 - �������; 6 - �������� �������� �����
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** 
     * Get the 'ATDRecriveDate' element value. ���� ��������� ������� ���������� �� ����
     * 
     * @return value
     */
    public LocalDate getATDRecriveDate() {
        return ATDRecriveDate;
    }

    /** 
     * Set the 'ATDRecriveDate' element value. ���� ��������� ������� ���������� �� ����
     * 
     * @param ATDRecriveDate
     */
    public void setATDRecriveDate(LocalDate ATDRecriveDate) {
        this.ATDRecriveDate = ATDRecriveDate;
    }

    /** 
     * Get the 'ATDReceiveTime' element value. ����� ��������� ������� ����������
     * 
     * @return value
     */
    public String getATDReceiveTime() {
        return ATDReceiveTime;
    }

    /** 
     * Set the 'ATDReceiveTime' element value. ����� ��������� ������� ����������
     * 
     * @param ATDReceiveTime
     */
    public void setATDReceiveTime(String ATDReceiveTime) {
        this.ATDReceiveTime = ATDReceiveTime;
    }

    /** 
     * Get the 'RecordNumber' element value. ���������� ����� ������ � ������� ��
     * 
     * @return value
     */
    public String getRecordNumber() {
        return recordNumber;
    }

    /** 
     * Set the 'RecordNumber' element value. ���������� ����� ������ � ������� ��
     * 
     * @param recordNumber
     */
    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }

    /** 
     * Get the 'Reason' element value. ������� ���������� ����������� �������� � ���������� ���������� ��� ����� ����, ����������� ������������ � ��������� ������� (������������ �������), ���� �� ��������������
     * 
     * @return value
     */
    public String getReason() {
        return reason;
    }

    /** 
     * Set the 'Reason' element value. ������� ���������� ����������� �������� � ���������� ���������� ��� ����� ����, ����������� ������������ � ��������� ������� (������������ �������), ���� �� ��������������
     * 
     * @param reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /** 
     * Get the 'Job' element value. ����� ������
     * 
     * @return value
     */
    public String getJob() {
        return job;
    }

    /** 
     * Set the 'Job' element value. ����� ������
     * 
     * @param job
     */
    public void setJob(String job) {
        this.job = job;
    }

    /** 
     * Get the 'ATDReceiveCopy' element value. �������, �������������� ���� ��������� ������� ���������� ���  �������������� ���������� ��� ����, ��������������� � ��������� ������� 0 - �� �������� 1 - ��������
     * 
     * @return value
     */
    public String getATDReceiveCopy() {
        return ATDReceiveCopy;
    }

    /** 
     * Set the 'ATDReceiveCopy' element value. �������, �������������� ���� ��������� ������� ���������� ���  �������������� ���������� ��� ����, ��������������� � ��������� ������� 0 - �� �������� 1 - ��������
     * 
     * @param ATDReceiveCopy
     */
    public void setATDReceiveCopy(String ATDReceiveCopy) {
        this.ATDReceiveCopy = ATDReceiveCopy;
    }

    /** 
     * Get the 'AddresseeMPO' element value. ����� ���, � ������� ��������� ������ ���(�), � ����� ����, ����������� ������������ � ��������� �������
     * 
     * @return value
     */
    public String getAddresseeMPO() {
        return addresseeMPO;
    }

    /** 
     * Set the 'AddresseeMPO' element value. ����� ���, � ������� ��������� ������ ���(�), � ����� ����, ����������� ������������ � ��������� �������
     * 
     * @param addresseeMPO
     */
    public void setAddresseeMPO(String addresseeMPO) {
        this.addresseeMPO = addresseeMPO;
    }

    /** 
     * Get the 'IdentityCard' element value. ��������, �������������� ��������
     * 
     * @return value
     */
    public IdentityCardType getIdentityCard() {
        return identityCard;
    }

    /** 
     * Set the 'IdentityCard' element value. ��������, �������������� ��������
     * 
     * @param identityCard
     */
    public void setIdentityCard(IdentityCardType identityCard) {
        this.identityCard = identityCard;
    }

    /** 
     * Get the 'Address' element value. ����� ��������������� ��������
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. ����� ��������������� ��������
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }

    /** 
     * Get the 'AuthoritesDocument' element value. ��������, �������������� ����������. 
     * 
     * @return value
     */
    public AuthoritesDocumentType getAuthoritesDocument() {
        return authoritesDocument;
    }

    /** 
     * Set the 'AuthoritesDocument' element value. ��������, �������������� ����������. 
     * 
     * @param authoritesDocument
     */
    public void setAuthoritesDocument(AuthoritesDocumentType authoritesDocument) {
        this.authoritesDocument = authoritesDocument;
    }
}
