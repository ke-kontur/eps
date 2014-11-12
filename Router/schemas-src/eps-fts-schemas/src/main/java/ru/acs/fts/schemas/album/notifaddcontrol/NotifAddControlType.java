
package ru.acs.fts.schemas.album.notifaddcontrol;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ������� � ���������� �������������� ��������
 */
public class NotifAddControlType extends BaseDocType
{
    private LocalDate resolDate;
    private String officeName;
    private LocalDate dateLimit;
    private List<String> violationList = new ArrayList<String>();
    private LocalDate dateOut;
    private String declName;
    private List<String> foundInfoList = new ArrayList<String>();
    private List<String> causeDocumentList = new ArrayList<String>();
    private String artCauseDoc;
    private String artControl;
    private List<String> actionOutList = new ArrayList<String>();
    private String notifType;
    private GTDIDType GTDID;
    private List<CustomsCostInfType> customsCostInfList = new ArrayList<CustomsCostInfType>();
    private CustomsPersonType customsPerson;
    private AddressType address;
    private SignatureInfType receivingResolution;
    private SignatureInfType sendResolution;
    private String documentModeID;

    /** 
     * Get the 'ResolDate' element value. ���� �������
     * 
     * @return value
     */
    public LocalDate getResolDate() {
        return resolDate;
    }

    /** 
     * Set the 'ResolDate' element value. ���� �������
     * 
     * @param resolDate
     */
    public void setResolDate(LocalDate resolDate) {
        this.resolDate = resolDate;
    }

    /** 
     * Get the 'OfficeName' element value. ������������ ����������� ������
     * 
     * @return value
     */
    public String getOfficeName() {
        return officeName;
    }

    /** 
     * Set the 'OfficeName' element value. ������������ ����������� ������
     * 
     * @param officeName
     */
    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    /** 
     * Get the 'DateLimit' element value. ���� ������������� �������������� ����������.
     * 
     * @return value
     */
    public LocalDate getDateLimit() {
        return dateLimit;
    }

    /** 
     * Set the 'DateLimit' element value. ���� ������������� �������������� ����������.
     * 
     * @param dateLimit
     */
    public void setDateLimit(LocalDate dateLimit) {
        this.dateLimit = dateLimit;
    }

    /** 
     * Get the list of 'Violations' element items. ��������, ����������� �� ��, ��� ��������  ����� �������� �������������� ���� ���������� �������� ������� ������� �� ������������
     * 
     * @return list
     */
    public List<String> getViolationList() {
        return violationList;
    }

    /** 
     * Set the list of 'Violations' element items. ��������, ����������� �� ��, ��� ��������  ����� �������� �������������� ���� ���������� �������� ������� ������� �� ������������
     * 
     * @param list
     */
    public void setViolationList(List<String> list) {
        violationList = list;
    }

    /** 
     * Get the 'DateOut' element value. ���� ���������� ��������, ����������� ��� ������� ������
     * 
     * @return value
     */
    public LocalDate getDateOut() {
        return dateOut;
    }

    /** 
     * Set the 'DateOut' element value. ���� ���������� ��������, ����������� ��� ������� ������
     * 
     * @param dateOut
     */
    public void setDateOut(LocalDate dateOut) {
        this.dateOut = dateOut;
    }

    /** 
     * Get the 'DeclName' element value. ������������ ���������� (����������� �������������)
     * 
     * @return value
     */
    public String getDeclName() {
        return declName;
    }

    /** 
     * Set the 'DeclName' element value. ������������ ���������� (����������� �������������)
     * 
     * @param declName
     */
    public void setDeclName(String declName) {
        this.declName = declName;
    }

    /** 
     * Get the list of 'FoundInfo' element items. ��������, ������������ � ���� �������� ���������� �� ������
     * 
     * @return list
     */
    public List<String> getFoundInfoList() {
        return foundInfoList;
    }

    /** 
     * Set the list of 'FoundInfo' element items. ��������, ������������ � ���� �������� ���������� �� ������
     * 
     * @param list
     */
    public void setFoundInfoList(List<String> list) {
        foundInfoList = list;
    }

    /** 
     * Get the list of 'CauseDocuments' element items. ������� �������������� ����������
     * 
     * @return list
     */
    public List<String> getCauseDocumentList() {
        return causeDocumentList;
    }

    /** 
     * Set the list of 'CauseDocuments' element items. ������� �������������� ����������
     * 
     * @param list
     */
    public void setCauseDocumentList(List<String> list) {
        causeDocumentList = list;
    }

    /** 
     * Get the 'ArtCauseDoc' element value. ������, �� ������� ��������� ������������ ���������
     * 
     * @return value
     */
    public String getArtCauseDoc() {
        return artCauseDoc;
    }

    /** 
     * Set the 'ArtCauseDoc' element value. ������, �� ������� ��������� ������������ ���������
     * 
     * @param artCauseDoc
     */
    public void setArtCauseDoc(String artCauseDoc) {
        this.artCauseDoc = artCauseDoc;
    }

    /** 
     * Get the 'ArtControl' element value. ������ � ������������, � ������� ����������, ��� � ���� �������� ���������� �� ������ ����������.
     * 
     * @return value
     */
    public String getArtControl() {
        return artControl;
    }

    /** 
     * Set the 'ArtControl' element value. ������ � ������������, � ������� ����������, ��� � ���� �������� ���������� �� ������ ����������.
     * 
     * @param artControl
     */
    public void setArtControl(String artControl) {
        this.artControl = artControl;
    }

    /** 
     * Get the list of 'ActionOut' element items. �������� ����������� ��� ������� ������
     * 
     * @return list
     */
    public List<String> getActionOutList() {
        return actionOutList;
    }

    /** 
     * Set the list of 'ActionOut' element items. �������� ����������� ��� ������� ������
     * 
     * @param list
     */
    public void setActionOutList(List<String> list) {
        actionOutList = list;
    }

    /** 
     * Get the 'NotifType' element value. ��� �������: 1 - ������� � ���������� �������������� �������� ��� ���������� ���������; 2- ������� � ���������� �������������� �������� ��� ������������� �� ���� �����; 3 - ������� � ���������� �������������� �������� ��� ����������� ������ �������������
     * 
     * @return value
     */
    public String getNotifType() {
        return notifType;
    }

    /** 
     * Set the 'NotifType' element value. ��� �������: 1 - ������� � ���������� �������������� �������� ��� ���������� ���������; 2- ������� � ���������� �������������� �������� ��� ������������� �� ���� �����; 3 - ������� � ���������� �������������� �������� ��� ����������� ������ �������������
     * 
     * @param notifType
     */
    public void setNotifType(String notifType) {
        this.notifType = notifType;
    }

    /** 
     * Get the 'GTDID' element value. ��������������� �����  ��.
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. ��������������� �����  ��.
     * 
     * @param GTDID
     */
    public void setGTDID(GTDIDType GTDID) {
        this.GTDID = GTDID;
    }

    /** 
     * Get the list of 'CustomsCostInf' element items. ��������, ��������� �������������
     * 
     * @return list
     */
    public List<CustomsCostInfType> getCustomsCostInfList() {
        return customsCostInfList;
    }

    /** 
     * Set the list of 'CustomsCostInf' element items. ��������, ��������� �������������
     * 
     * @param list
     */
    public void setCustomsCostInfList(List<CustomsCostInfType> list) {
        customsCostInfList = list;
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
     * Get the 'Address' element value. ����� ����������� �������
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. ����� ����������� �������
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }

    /** 
     * Get the 'ReceivingResolution' element value. ��������� �������
     * 
     * @return value
     */
    public SignatureInfType getReceivingResolution() {
        return receivingResolution;
    }

    /** 
     * Set the 'ReceivingResolution' element value. ��������� �������
     * 
     * @param receivingResolution
     */
    public void setReceivingResolution(SignatureInfType receivingResolution) {
        this.receivingResolution = receivingResolution;
    }

    /** 
     * Get the 'SendResolution' element value. ����������� �������
     * 
     * @return value
     */
    public SignatureInfType getSendResolution() {
        return sendResolution;
    }

    /** 
     * Set the 'SendResolution' element value. ����������� �������
     * 
     * @param sendResolution
     */
    public void setSendResolution(SignatureInfType sendResolution) {
        this.sendResolution = sendResolution;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������.
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������.
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
