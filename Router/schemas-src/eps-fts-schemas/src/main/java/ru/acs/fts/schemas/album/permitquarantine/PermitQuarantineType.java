
package ru.acs.fts.schemas.album.permitquarantine;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GoodsBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ��������� ����������� ����������
 */
public class PermitQuarantineType extends BaseDocType
{
    private String nameSubject;
    private String registrationNumber;
    private LocalDate issueDate;
    private LocalDate expirationDate;
    private String senderCountry;
    private List<String> additionalRequirementList = new ArrayList<String>();
    private String listProhibitedGoods;
    private String nameCheckpoint;
    private List<String> transportationRouteList = new ArrayList<String>();
    private List<String> actionCheckpointList = new ArrayList<String>();
    private List<GoodsBaseType> goodList = new ArrayList<GoodsBaseType>();
    private OrganizationType declarantInfo;
    private PersonSignatureType issuePerson;
    private DocumentBaseType applicationInfo;
    private String documentModeID;

    /** 
     * Get the 'NameSubject' element value. ������������ ��������
     * 
     * @return value
     */
    public String getNameSubject() {
        return nameSubject;
    }

    /** 
     * Set the 'NameSubject' element value. ������������ ��������
     * 
     * @param nameSubject
     */
    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    /** 
     * Get the 'RegistrationNumber' element value. ��������������� �����
     * 
     * @return value
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /** 
     * Set the 'RegistrationNumber' element value. ��������������� �����
     * 
     * @param registrationNumber
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /** 
     * Get the 'IssueDate' element value. ���� ������
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. ���� ������
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the 'ExpirationDate' element value. ���� ��������� �������� �����������
     * 
     * @return value
     */
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    /** 
     * Set the 'ExpirationDate' element value. ���� ��������� �������� �����������
     * 
     * @param expirationDate
     */
    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    /** 
     * Get the 'SenderCountry' element value. ������������ ������- �����������
     * 
     * @return value
     */
    public String getSenderCountry() {
        return senderCountry;
    }

    /** 
     * Set the 'SenderCountry' element value. ������������ ������- �����������
     * 
     * @param senderCountry
     */
    public void setSenderCountry(String senderCountry) {
        this.senderCountry = senderCountry;
    }

    /** 
     * Get the list of 'AdditionalRequirements' element items. �������������� ����������
     * 
     * @return list
     */
    public List<String> getAdditionalRequirementList() {
        return additionalRequirementList;
    }

    /** 
     * Set the list of 'AdditionalRequirements' element items. �������������� ����������
     * 
     * @param list
     */
    public void setAdditionalRequirementList(List<String> list) {
        additionalRequirementList = list;
    }

    /** 
     * Get the 'ListProhibitedGoods' element value. �������� ����������� �������
     * 
     * @return value
     */
    public String getListProhibitedGoods() {
        return listProhibitedGoods;
    }

    /** 
     * Set the 'ListProhibitedGoods' element value. �������� ����������� �������
     * 
     * @param listProhibitedGoods
     */
    public void setListProhibitedGoods(String listProhibitedGoods) {
        this.listProhibitedGoods = listProhibitedGoods;
    }

    /** 
     * Get the 'NameCheckpoint' element value. ������������ ������� ��������, ����� ������� �������������� ���� ���������
     * 
     * @return value
     */
    public String getNameCheckpoint() {
        return nameCheckpoint;
    }

    /** 
     * Set the 'NameCheckpoint' element value. ������������ ������� ��������, ����� ������� �������������� ���� ���������
     * 
     * @param nameCheckpoint
     */
    public void setNameCheckpoint(String nameCheckpoint) {
        this.nameCheckpoint = nameCheckpoint;
    }

    /** 
     * Get the list of 'TransportationRoute' element items. ������� ��������� �� ����� ����������
     * 
     * @return list
     */
    public List<String> getTransportationRouteList() {
        return transportationRouteList;
    }

    /** 
     * Set the list of 'TransportationRoute' element items. ������� ��������� �� ����� ����������
     * 
     * @param list
     */
    public void setTransportationRouteList(List<String> list) {
        transportationRouteList = list;
    }

    /** 
     * Get the list of 'ActionCheckpoint' element items. ����������� �������������� �����������, ������� ������ ���� ��������� � ������� �������� ����� ��������������� ������� �� � �� ����� ����������
     * 
     * @return list
     */
    public List<String> getActionCheckpointList() {
        return actionCheckpointList;
    }

    /** 
     * Set the list of 'ActionCheckpoint' element items. ����������� �������������� �����������, ������� ������ ���� ��������� � ������� �������� ����� ��������������� ������� �� � �� ����� ����������
     * 
     * @param list
     */
    public void setActionCheckpointList(List<String> list) {
        actionCheckpointList = list;
    }

    /** 
     * Get the list of 'Goods' element items. �������� ������.
     * 
     * @return list
     */
    public List<GoodsBaseType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. �������� ������.
     * 
     * @param list
     */
    public void setGoodList(List<GoodsBaseType> list) {
        goodList = list;
    }

    /** 
     * Get the 'DeclarantInfo' element value. �������� � ����, �������� �������� ����������
     * 
     * @return value
     */
    public OrganizationType getDeclarantInfo() {
        return declarantInfo;
    }

    /** 
     * Set the 'DeclarantInfo' element value. �������� � ����, �������� �������� ����������
     * 
     * @param declarantInfo
     */
    public void setDeclarantInfo(OrganizationType declarantInfo) {
        this.declarantInfo = declarantInfo;
    }

    /** 
     * Get the 'IssuePerson' element value. ������� ����, ������������ ����������
     * 
     * @return value
     */
    public PersonSignatureType getIssuePerson() {
        return issuePerson;
    }

    /** 
     * Set the 'IssuePerson' element value. ������� ����, ������������ ����������
     * 
     * @param issuePerson
     */
    public void setIssuePerson(PersonSignatureType issuePerson) {
        this.issuePerson = issuePerson;
    }

    /** 
     * Get the 'ApplicationInfo' element value. �������� � ������, �� ��������� ������� ���� ������ ����������
     * 
     * @return value
     */
    public DocumentBaseType getApplicationInfo() {
        return applicationInfo;
    }

    /** 
     * Set the 'ApplicationInfo' element value. �������� � ������, �� ��������� ������� ���� ������ ����������
     * 
     * @param applicationInfo
     */
    public void setApplicationInfo(DocumentBaseType applicationInfo) {
        this.applicationInfo = applicationInfo;
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
