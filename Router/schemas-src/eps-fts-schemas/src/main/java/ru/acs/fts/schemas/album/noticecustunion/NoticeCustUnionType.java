
package ru.acs.fts.schemas.album.noticecustunion;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * �������� �� ������� ����������� ����������� �����
 */
public class NoticeCustUnionType extends BaseDocType
{
    private String uniNotificationID;
    private String destOrganizationName;
    private String destRegionCode;
    private String inspectionDateTime;
    private String passTGNumber;
    private String passKGNumber;
    private String passOGNumber;
    private String isPerformed;
    private LocalDate updateDate;
    private DocumentBaseType notification;
    private CUCustomsType notificationOrg;
    private PersonBaseType driver;
    private CUOrganizationType carrier;
    private DocumentBaseType transitPermit;
    private List<ViolationType> violationList = new ArrayList<ViolationType>();
    private TransportMeansBaseType TSInfo;
    private String documentModeID;

    /** 
     * Get the 'UniNotificationID' element value. ������������� ������ � ������� ����������� ����������� �����
     * 
     * @return value
     */
    public String getUniNotificationID() {
        return uniNotificationID;
    }

    /** 
     * Set the 'UniNotificationID' element value. ������������� ������ � ������� ����������� ����������� �����
     * 
     * @param uniNotificationID
     */
    public void setUniNotificationID(String uniNotificationID) {
        this.uniNotificationID = uniNotificationID;
    }

    /** 
     * Get the 'DestOrganizationName' element value. ����������� ����� ��� ������������� ����������� ���������� (������������)
     * 
     * @return value
     */
    public String getDestOrganizationName() {
        return destOrganizationName;
    }

    /** 
     * Set the 'DestOrganizationName' element value. ����������� ����� ��� ������������� ����������� ���������� (������������)
     * 
     * @param destOrganizationName
     */
    public void setDestOrganizationName(String destOrganizationName) {
        this.destOrganizationName = destOrganizationName;
    }

    /** 
     * Get the 'DestRegionCode' element value. ��������������� ������������ ������ ��� ������������� ����������� ���������� (��� ������)
     * 
     * @return value
     */
    public String getDestRegionCode() {
        return destRegionCode;
    }

    /** 
     * Set the 'DestRegionCode' element value. ��������������� ������������ ������ ��� ������������� ����������� ���������� (��� ������)
     * 
     * @param destRegionCode
     */
    public void setDestRegionCode(String destRegionCode) {
        this.destRegionCode = destRegionCode;
    }

    /** 
     * Get the 'InspectionDateTime' element value. ����/����� ���������� ��������
     * 
     * @return value
     */
    public String getInspectionDateTime() {
        return inspectionDateTime;
    }

    /** 
     * Set the 'InspectionDateTime' element value. ����/����� ���������� ��������
     * 
     * @param inspectionDateTime
     */
    public void setInspectionDateTime(String inspectionDateTime) {
        this.inspectionDateTime = inspectionDateTime;
    }

    /** 
     * Get the 'PassTGNumber' element value. ����� ������������ ���������� �� ��������� ������������ ������
     * 
     * @return value
     */
    public String getPassTGNumber() {
        return passTGNumber;
    }

    /** 
     * Set the 'PassTGNumber' element value. ����� ������������ ���������� �� ��������� ������������ ������
     * 
     * @param passTGNumber
     */
    public void setPassTGNumber(String passTGNumber) {
        this.passTGNumber = passTGNumber;
    }

    /** 
     * Get the 'PassKGNumber' element value. ����� ������������ ���������� �� ��������� ���������������� ������
     * 
     * @return value
     */
    public String getPassKGNumber() {
        return passKGNumber;
    }

    /** 
     * Set the 'PassKGNumber' element value. ����� ������������ ���������� �� ��������� ���������������� ������
     * 
     * @param passKGNumber
     */
    public void setPassKGNumber(String passKGNumber) {
        this.passKGNumber = passKGNumber;
    }

    /** 
     * Get the 'PassOGNumber' element value. ����� ������������ ���������� �� ��������� ������� ������
     * 
     * @return value
     */
    public String getPassOGNumber() {
        return passOGNumber;
    }

    /** 
     * Set the 'PassOGNumber' element value. ����� ������������ ���������� �� ��������� ������� ������
     * 
     * @param passOGNumber
     */
    public void setPassOGNumber(String passOGNumber) {
        this.passOGNumber = passOGNumber;
    }

    /** 
     * Get the 'IsPerformed' element value. ������� �� ���������� ���� ���������, ������������� ���� ����������
     * 
     * @return value
     */
    public String getIsPerformed() {
        return isPerformed;
    }

    /** 
     * Set the 'IsPerformed' element value. ������� �� ���������� ���� ���������, ������������� ���� ����������
     * 
     * @param isPerformed
     */
    public void setIsPerformed(String isPerformed) {
        this.isPerformed = isPerformed;
    }

    /** 
     * Get the 'UpdateDate' element value. ���� ����������
     * 
     * @return value
     */
    public LocalDate getUpdateDate() {
        return updateDate;
    }

    /** 
     * Set the 'UpdateDate' element value. ���� ����������
     * 
     * @param updateDate
     */
    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    /** 
     * Get the 'Notification' element value. �����������
     * 
     * @return value
     */
    public DocumentBaseType getNotification() {
        return notification;
    }

    /** 
     * Set the 'Notification' element value. �����������
     * 
     * @param notification
     */
    public void setNotification(DocumentBaseType notification) {
        this.notification = notification;
    }

    /** 
     * Get the 'NotificationOrg' element value. �����������, ����������� �������� (������������ ������������ ������, ��� ������ ����� ���������� ��������)
     * 
     * @return value
     */
    public CUCustomsType getNotificationOrg() {
        return notificationOrg;
    }

    /** 
     * Set the 'NotificationOrg' element value. �����������, ����������� �������� (������������ ������������ ������, ��� ������ ����� ���������� ��������)
     * 
     * @param notificationOrg
     */
    public void setNotificationOrg(CUCustomsType notificationOrg) {
        this.notificationOrg = notificationOrg;
    }

    /** 
     * Get the 'Driver' element value. ��������
     * 
     * @return value
     */
    public PersonBaseType getDriver() {
        return driver;
    }

    /** 
     * Set the 'Driver' element value. ��������
     * 
     * @param driver
     */
    public void setDriver(PersonBaseType driver) {
        this.driver = driver;
    }

    /** 
     * Get the 'Carrier' element value. ����������
     * 
     * @return value
     */
    public CUOrganizationType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. ����������
     * 
     * @param carrier
     */
    public void setCarrier(CUOrganizationType carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the 'TransitPermit' element value. ���������� �� �������
     * 
     * @return value
     */
    public DocumentBaseType getTransitPermit() {
        return transitPermit;
    }

    /** 
     * Set the 'TransitPermit' element value. ���������� �� �������
     * 
     * @param transitPermit
     */
    public void setTransitPermit(DocumentBaseType transitPermit) {
        this.transitPermit = transitPermit;
    }

    /** 
     * Get the list of 'Violation' element items. ���������� ���������
     * 
     * @return list
     */
    public List<ViolationType> getViolationList() {
        return violationList;
    }

    /** 
     * Set the list of 'Violation' element items. ���������� ���������
     * 
     * @param list
     */
    public void setViolationList(List<ViolationType> list) {
        violationList = list;
    }

    /** 
     * Get the 'TSInfo' element value. ��������������� ������ ��
     * 
     * @return value
     */
    public TransportMeansBaseType getTSInfo() {
        return TSInfo;
    }

    /** 
     * Set the 'TSInfo' element value. ��������������� ������ ��
     * 
     * @param TSInfo
     */
    public void setTSInfo(TransportMeansBaseType TSInfo) {
        this.TSInfo = TSInfo;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
