
package ru.acs.fts.schemas.album.applicationstore;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * ��������� �� �������
 */
public class ApplicationStoreType extends BaseDocType
{
    private LocalDate documentDate;
    private String moveDirection;
    private String customsModeCode;
    private String goalAction;
    private String ethnicityFlag;
    private OrganizationBaseType declarant;
    private OrganizationBaseType carrier;
    private TransportInformType transportInfom;
    private StoreInfromType storeInform;
    private PersonBaseType person;
    private CommentsType comments;
    private List<DocumentBaseType> presentedDocList = new ArrayList<DocumentBaseType>();
    private OrganizationBaseType consigneeInfo;
    private GTDIDType GTDID;
    private GTDIDType regNumer;
    private String documentModeID;

    /** 
     * Get the 'DocumentDate' element value. ���� ����������� ���������
     * 
     * @return value
     */
    public LocalDate getDocumentDate() {
        return documentDate;
    }

    /** 
     * Set the 'DocumentDate' element value. ���� ����������� ���������
     * 
     * @param documentDate
     */
    public void setDocumentDate(LocalDate documentDate) {
        this.documentDate = documentDate;
    }

    /** 
     * Get the 'MoveDirection' element value. ����������� �����������
     * 
     * @return value
     */
    public String getMoveDirection() {
        return moveDirection;
    }

    /** 
     * Set the 'MoveDirection' element value. ����������� �����������
     * 
     * @param moveDirection
     */
    public void setMoveDirection(String moveDirection) {
        this.moveDirection = moveDirection;
    }

    /** 
     * Get the 'CustomsModeCode' element value. ��� ����������� ������
     * 
     * @return value
     */
    public String getCustomsModeCode() {
        return customsModeCode;
    }

    /** 
     * Set the 'CustomsModeCode' element value. ��� ����������� ������
     * 
     * @param customsModeCode
     */
    public void setCustomsModeCode(String customsModeCode) {
        this.customsModeCode = customsModeCode;
    }

    /** 
     * Get the 'GoalAction' element value. ���� ����������� ��������: "1" - ����, "2" - �����, "3" - ��������, "4" - ��������.
     * 
     * @return value
     */
    public String getGoalAction() {
        return goalAction;
    }

    /** 
     * Set the 'GoalAction' element value. ���� ����������� ��������: "1" - ����, "2" - �����, "3" - ��������, "4" - ��������.
     * 
     * @param goalAction
     */
    public void setGoalAction(String goalAction) {
        this.goalAction = goalAction;
    }

    /** 
     * Get the 'EthnicityFlag' element value. ������������ �������������� ��������: 0 - �����������; 1 - ����������
     * 
     * @return value
     */
    public String getEthnicityFlag() {
        return ethnicityFlag;
    }

    /** 
     * Set the 'EthnicityFlag' element value. ������������ �������������� ��������: 0 - �����������; 1 - ����������
     * 
     * @param ethnicityFlag
     */
    public void setEthnicityFlag(String ethnicityFlag) {
        this.ethnicityFlag = ethnicityFlag;
    }

    /** 
     * Get the 'Declarant' element value. �������� � ����������
     * 
     * @return value
     */
    public OrganizationBaseType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. �������� � ����������
     * 
     * @param declarant
     */
    public void setDeclarant(OrganizationBaseType declarant) {
        this.declarant = declarant;
    }

    /** 
     * Get the 'Carrier' element value. �������� � �����������
     * 
     * @return value
     */
    public OrganizationBaseType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. �������� � �����������
     * 
     * @param carrier
     */
    public void setCarrier(OrganizationBaseType carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the 'TransportInfom' element value. �������� � ����������
     * 
     * @return value
     */
    public TransportInformType getTransportInfom() {
        return transportInfom;
    }

    /** 
     * Set the 'TransportInfom' element value. �������� � ����������
     * 
     * @param transportInfom
     */
    public void setTransportInfom(TransportInformType transportInfom) {
        this.transportInfom = transportInfom;
    }

    /** 
     * Get the 'StoreInform' element value. �������� � ��������
     * 
     * @return value
     */
    public StoreInfromType getStoreInform() {
        return storeInform;
    }

    /** 
     * Set the 'StoreInform' element value. �������� � ��������
     * 
     * @param storeInform
     */
    public void setStoreInform(StoreInfromType storeInform) {
        this.storeInform = storeInform;
    }

    /** 
     * Get the 'Person' element value. ������� ���� ������������ ���������.
     * 
     * @return value
     */
    public PersonBaseType getPerson() {
        return person;
    }

    /** 
     * Set the 'Person' element value. ������� ���� ������������ ���������.
     * 
     * @param person
     */
    public void setPerson(PersonBaseType person) {
        this.person = person;
    }

    /** 
     * Get the 'Comments' element value. �����������
     * 
     * @return value
     */
    public CommentsType getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. �����������
     * 
     * @param comments
     */
    public void setComments(CommentsType comments) {
        this.comments = comments;
    }

    /** 
     * Get the list of 'PresentedDoc' element items. �������������� ���������
     * 
     * @return list
     */
    public List<DocumentBaseType> getPresentedDocList() {
        return presentedDocList;
    }

    /** 
     * Set the list of 'PresentedDoc' element items. �������������� ���������
     * 
     * @param list
     */
    public void setPresentedDocList(List<DocumentBaseType> list) {
        presentedDocList = list;
    }

    /** 
     * Get the 'ConsigneeInfo' element value. �������� � ����, �������� ���������� �������
     * 
     * @return value
     */
    public OrganizationBaseType getConsigneeInfo() {
        return consigneeInfo;
    }

    /** 
     * Set the 'ConsigneeInfo' element value. �������� � ����, �������� ���������� �������
     * 
     * @param consigneeInfo
     */
    public void setConsigneeInfo(OrganizationBaseType consigneeInfo) {
        this.consigneeInfo = consigneeInfo;
    }

    /** 
     * Get the 'GTDID' element value. ��������������� ����� ���������� ����������
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. ��������������� ����� ���������� ����������
     * 
     * @param GTDID
     */
    public void setGTDID(GTDIDType GTDID) {
        this.GTDID = GTDID;
    }

    /** 
     * Get the 'RegNumer' element value. ��������������� ����� ���������
     * 
     * @return value
     */
    public GTDIDType getRegNumer() {
        return regNumer;
    }

    /** 
     * Set the 'RegNumer' element value. ��������������� ����� ���������
     * 
     * @param regNumer
     */
    public void setRegNumer(GTDIDType regNumer) {
        this.regNumer = regNumer;
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
