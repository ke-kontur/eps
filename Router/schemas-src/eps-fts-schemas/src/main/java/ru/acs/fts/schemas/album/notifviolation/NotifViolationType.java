
package ru.acs.fts.schemas.album.notifviolation;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * ����������� � ������������ ������� ������� �������, ���������� � �� ������������ ���������� �������� � ����������, ���������� � ���� �������� ��
 */
public class NotifViolationType extends BaseDocType
{
    private String violationNimber;
    private String violationTime;
    private LocalDate violationDate;
    private String notifLawArticle;
    private String comments;
    private String notificationRequest;
    private CustomsPersonType customsPerson;
    private List<ViolationInfoType> violationInfoList = new ArrayList<ViolationInfoType>();
    private List<InstructionType> instructionList = new ArrayList<InstructionType>();
    private CustomsType customs;
    private OrganizationType applicant;
    private GTDIDType GTDNUmber;
    private String documentModeID;

    /** 
     * Get the 'ViolationNimber' element value. ��������� ����� �����������/����������
     * 
     * @return value
     */
    public String getViolationNimber() {
        return violationNimber;
    }

    /** 
     * Set the 'ViolationNimber' element value. ��������� ����� �����������/����������
     * 
     * @param violationNimber
     */
    public void setViolationNimber(String violationNimber) {
        this.violationNimber = violationNimber;
    }

    /** 
     * Get the 'ViolationTime' element value. ����� �������� �����������/����������
     * 
     * @return value
     */
    public String getViolationTime() {
        return violationTime;
    }

    /** 
     * Set the 'ViolationTime' element value. ����� �������� �����������/����������
     * 
     * @param violationTime
     */
    public void setViolationTime(String violationTime) {
        this.violationTime = violationTime;
    }

    /** 
     * Get the 'ViolationDate' element value. ����  �������� �����������/����������
     * 
     * @return value
     */
    public LocalDate getViolationDate() {
        return violationDate;
    }

    /** 
     * Set the 'ViolationDate' element value. ����  �������� �����������/����������
     * 
     * @param violationDate
     */
    public void setViolationDate(LocalDate violationDate) {
        this.violationDate = violationDate;
    }

    /** 
     * Get the 'NotifLawArticle' element value. ������ �� ��, ������ ����������� ����� � ������� � ���, � ������������ � �������� ������������ ���������� � ��������� (��������������)
     * 
     * @return value
     */
    public String getNotifLawArticle() {
        return notifLawArticle;
    }

    /** 
     * Set the 'NotifLawArticle' element value. ������ �� ��, ������ ����������� ����� � ������� � ���, � ������������ � �������� ������������ ���������� � ��������� (��������������)
     * 
     * @param notifLawArticle
     */
    public void setNotifLawArticle(String notifLawArticle) {
        this.notifLawArticle = notifLawArticle;
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
     * Get the 'NotificationRequest' element value. ��� ���������: 0 - ����������, 1 - �����������
     * 
     * @return value
     */
    public String getNotificationRequest() {
        return notificationRequest;
    }

    /** 
     * Set the 'NotificationRequest' element value. ��� ���������: 0 - ����������, 1 - �����������
     * 
     * @param notificationRequest
     */
    public void setNotificationRequest(String notificationRequest) {
        this.notificationRequest = notificationRequest;
    }

    /** 
     * Get the 'CustomsPerson' element value. ����������� ���� ����������� ������
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. ����������� ���� ����������� ������
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the list of 'ViolationInfo' element items. �������� ���������� ��������� � ��������������.
     * 
     * @return list
     */
    public List<ViolationInfoType> getViolationInfoList() {
        return violationInfoList;
    }

    /** 
     * Set the list of 'ViolationInfo' element items. �������� ���������� ��������� � ��������������.
     * 
     * @param list
     */
    public void setViolationInfoList(List<ViolationInfoType> list) {
        violationInfoList = list;
    }

    /** 
     * Get the list of 'Instruction' element items. �������� ��������, ����������� ��� ���������� ���������� ��������� � ��������������.���������� �������������� ����������, ������������� �������� � �������� �� ����� ������� ��������������.
     * 
     * @return list
     */
    public List<InstructionType> getInstructionList() {
        return instructionList;
    }

    /** 
     * Set the list of 'Instruction' element items. �������� ��������, ����������� ��� ���������� ���������� ��������� � ��������������.���������� �������������� ����������, ������������� �������� � �������� �� ����� ������� ��������������.
     * 
     * @param list
     */
    public void setInstructionList(List<InstructionType> list) {
        instructionList = list;
    }

    /** 
     * Get the 'Customs' element value. ���������� �����.
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. ���������� �����.
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'Applicant' element value. ���������� � ���������� (������������, ��� ��� ���������� ���)
     * 
     * @return value
     */
    public OrganizationType getApplicant() {
        return applicant;
    }

    /** 
     * Set the 'Applicant' element value. ���������� � ���������� (������������, ��� ��� ���������� ���)
     * 
     * @param applicant
     */
    public void setApplicant(OrganizationType applicant) {
        this.applicant = applicant;
    }

    /** 
     * Get the 'GTDNUmber' element value. ���������� ����� ��.
     * 
     * @return value
     */
    public GTDIDType getGTDNUmber() {
        return GTDNUmber;
    }

    /** 
     * Set the 'GTDNUmber' element value. ���������� ����� ��.
     * 
     * @param GTDNUmber
     */
    public void setGTDNUmber(GTDIDType GTDNUmber) {
        this.GTDNUmber = GTDNUmber;
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
