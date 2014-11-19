
package ru.acs.fts.schemas.album.permissionextraction;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ���������� �� ������ (�����) ������ ������������� ��������
 */
public class PermissionExtractionType extends BaseDocType
{
    private String regNumber;
    private String groundsIssuing;
    private LocalDate dateIssued;
    private String nameManagement;
    private String kindFishing;
    private UserInfoType userInfo;
    private List<ConditionsExtractionType> conditionsExtractionList = new ArrayList<ConditionsExtractionType>();
    private PersonBaseType personResponsibleProduction;
    private PersonBaseType personResponsiblePerforming;
    private PersonSignatureType personSignature;
    private String documentModeID;

    /** 
     * Get the 'RegNumber' element value. ��������������� ����� ����������
     * 
     * @return value
     */
    public String getRegNumber() {
        return regNumber;
    }

    /** 
     * Set the 'RegNumber' element value. ��������������� ����� ����������
     * 
     * @param regNumber
     */
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    /** 
     * Get the 'GroundsIssuing' element value. ��������� ��� ������ ����������
     * 
     * @return value
     */
    public String getGroundsIssuing() {
        return groundsIssuing;
    }

    /** 
     * Set the 'GroundsIssuing' element value. ��������� ��� ������ ����������
     * 
     * @param groundsIssuing
     */
    public void setGroundsIssuing(String groundsIssuing) {
        this.groundsIssuing = groundsIssuing;
    }

    /** 
     * Get the 'DateIssued' element value. ���� ������ ����������
     * 
     * @return value
     */
    public LocalDate getDateIssued() {
        return dateIssued;
    }

    /** 
     * Set the 'DateIssued' element value. ���� ������ ����������
     * 
     * @param dateIssued
     */
    public void setDateIssued(LocalDate dateIssued) {
        this.dateIssued = dateIssued;
    }

    /** 
     * Get the 'NameManagement' element value. ������������ ����������
     * 
     * @return value
     */
    public String getNameManagement() {
        return nameManagement;
    }

    /** 
     * Set the 'NameManagement' element value. ������������ ����������
     * 
     * @param nameManagement
     */
    public void setNameManagement(String nameManagement) {
        this.nameManagement = nameManagement;
    }

    /** 
     * Get the 'KindFishing' element value. ��� �����������
     * 
     * @return value
     */
    public String getKindFishing() {
        return kindFishing;
    }

    /** 
     * Set the 'KindFishing' element value. ��� �����������
     * 
     * @param kindFishing
     */
    public void setKindFishing(String kindFishing) {
        this.kindFishing = kindFishing;
    }

    /** 
     * Get the 'UserInfo' element value. �������� � ������������, �������������� ����������� ������������� � ����������� �����������
     * 
     * @return value
     */
    public UserInfoType getUserInfo() {
        return userInfo;
    }

    /** 
     * Set the 'UserInfo' element value. �������� � ������������, �������������� ����������� ������������� � ����������� �����������
     * 
     * @param userInfo
     */
    public void setUserInfo(UserInfoType userInfo) {
        this.userInfo = userInfo;
    }

    /** 
     * Get the list of 'ConditionsExtraction' element items. ������� ������ (������) ������ ������������� ��������
     * 
     * @return list
     */
    public List<ConditionsExtractionType> getConditionsExtractionList() {
        return conditionsExtractionList;
    }

    /** 
     * Set the list of 'ConditionsExtraction' element items. ������� ������ (������) ������ ������������� ��������
     * 
     * @param list
     */
    public void setConditionsExtractionList(List<ConditionsExtractionType> list) {
        conditionsExtractionList = list;
    }

    /** 
     * Get the 'PersonResponsibleProduction' element value. ����, ������������� �� ������ (�����) ������ �����������
     * 
     * @return value
     */
    public PersonBaseType getPersonResponsibleProduction() {
        return personResponsibleProduction;
    }

    /** 
     * Set the 'PersonResponsibleProduction' element value. ����, ������������� �� ������ (�����) ������ �����������
     * 
     * @param personResponsibleProduction
     */
    public void setPersonResponsibleProduction(
            PersonBaseType personResponsibleProduction) {
        this.personResponsibleProduction = personResponsibleProduction;
    }

    /** 
     * Get the 'PersonResponsiblePerforming' element value. ����, ������������� �� ���������� ��������� (�����) ������
     * 
     * @return value
     */
    public PersonBaseType getPersonResponsiblePerforming() {
        return personResponsiblePerforming;
    }

    /** 
     * Set the 'PersonResponsiblePerforming' element value. ����, ������������� �� ���������� ��������� (�����) ������
     * 
     * @param personResponsiblePerforming
     */
    public void setPersonResponsiblePerforming(
            PersonBaseType personResponsiblePerforming) {
        this.personResponsiblePerforming = personResponsiblePerforming;
    }

    /** 
     * Get the 'PersonSignature' element value. ������� ���� ��������� ����������
     * 
     * @return value
     */
    public PersonSignatureType getPersonSignature() {
        return personSignature;
    }

    /** 
     * Set the 'PersonSignature' element value. ������� ���� ��������� ����������
     * 
     * @param personSignature
     */
    public void setPersonSignature(PersonSignatureType personSignature) {
        this.personSignature = personSignature;
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
