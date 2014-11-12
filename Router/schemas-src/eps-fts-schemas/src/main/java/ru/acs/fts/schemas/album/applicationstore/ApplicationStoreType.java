
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
 * Заявление на припасы
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
     * Get the 'DocumentDate' element value. Дата составления документа
     * 
     * @return value
     */
    public LocalDate getDocumentDate() {
        return documentDate;
    }

    /** 
     * Set the 'DocumentDate' element value. Дата составления документа
     * 
     * @param documentDate
     */
    public void setDocumentDate(LocalDate documentDate) {
        this.documentDate = documentDate;
    }

    /** 
     * Get the 'MoveDirection' element value. Направление перемещения
     * 
     * @return value
     */
    public String getMoveDirection() {
        return moveDirection;
    }

    /** 
     * Set the 'MoveDirection' element value. Направление перемещения
     * 
     * @param moveDirection
     */
    public void setMoveDirection(String moveDirection) {
        this.moveDirection = moveDirection;
    }

    /** 
     * Get the 'CustomsModeCode' element value. Код таможенного режима
     * 
     * @return value
     */
    public String getCustomsModeCode() {
        return customsModeCode;
    }

    /** 
     * Set the 'CustomsModeCode' element value. Код таможенного режима
     * 
     * @param customsModeCode
     */
    public void setCustomsModeCode(String customsModeCode) {
        this.customsModeCode = customsModeCode;
    }

    /** 
     * Get the 'GoalAction' element value. Цель перемещения припасов: "1" - ввоз, "2" - вывоз, "3" - выгрузка, "4" - передача.
     * 
     * @return value
     */
    public String getGoalAction() {
        return goalAction;
    }

    /** 
     * Set the 'GoalAction' element value. Цель перемещения припасов: "1" - ввоз, "2" - вывоз, "3" - выгрузка, "4" - передача.
     * 
     * @param goalAction
     */
    public void setGoalAction(String goalAction) {
        this.goalAction = goalAction;
    }

    /** 
     * Get the 'EthnicityFlag' element value. Национальная принадлежность припасов: 0 - иностранное; 1 - российское
     * 
     * @return value
     */
    public String getEthnicityFlag() {
        return ethnicityFlag;
    }

    /** 
     * Set the 'EthnicityFlag' element value. Национальная принадлежность припасов: 0 - иностранное; 1 - российское
     * 
     * @param ethnicityFlag
     */
    public void setEthnicityFlag(String ethnicityFlag) {
        this.ethnicityFlag = ethnicityFlag;
    }

    /** 
     * Get the 'Declarant' element value. Сведения о декларанте
     * 
     * @return value
     */
    public OrganizationBaseType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. Сведения о декларанте
     * 
     * @param declarant
     */
    public void setDeclarant(OrganizationBaseType declarant) {
        this.declarant = declarant;
    }

    /** 
     * Get the 'Carrier' element value. Сведения о перевозчике
     * 
     * @return value
     */
    public OrganizationBaseType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. Сведения о перевозчике
     * 
     * @param carrier
     */
    public void setCarrier(OrganizationBaseType carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the 'TransportInfom' element value. Сведения о транспорте
     * 
     * @return value
     */
    public TransportInformType getTransportInfom() {
        return transportInfom;
    }

    /** 
     * Set the 'TransportInfom' element value. Сведения о транспорте
     * 
     * @param transportInfom
     */
    public void setTransportInfom(TransportInformType transportInfom) {
        this.transportInfom = transportInfom;
    }

    /** 
     * Get the 'StoreInform' element value. Сведения о припасах
     * 
     * @return value
     */
    public StoreInfromType getStoreInform() {
        return storeInform;
    }

    /** 
     * Set the 'StoreInform' element value. Сведения о припасах
     * 
     * @param storeInform
     */
    public void setStoreInform(StoreInfromType storeInform) {
        this.storeInform = storeInform;
    }

    /** 
     * Get the 'Person' element value. Подпись лица составившего заявление.
     * 
     * @return value
     */
    public PersonBaseType getPerson() {
        return person;
    }

    /** 
     * Set the 'Person' element value. Подпись лица составившего заявление.
     * 
     * @param person
     */
    public void setPerson(PersonBaseType person) {
        this.person = person;
    }

    /** 
     * Get the 'Comments' element value. Комментарии
     * 
     * @return value
     */
    public CommentsType getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. Комментарии
     * 
     * @param comments
     */
    public void setComments(CommentsType comments) {
        this.comments = comments;
    }

    /** 
     * Get the list of 'PresentedDoc' element items. Дополнительные документы
     * 
     * @return list
     */
    public List<DocumentBaseType> getPresentedDocList() {
        return presentedDocList;
    }

    /** 
     * Set the list of 'PresentedDoc' element items. Дополнительные документы
     * 
     * @param list
     */
    public void setPresentedDocList(List<DocumentBaseType> list) {
        presentedDocList = list;
    }

    /** 
     * Get the 'ConsigneeInfo' element value. Сведения о лице, которому передаются припасы
     * 
     * @return value
     */
    public OrganizationBaseType getConsigneeInfo() {
        return consigneeInfo;
    }

    /** 
     * Set the 'ConsigneeInfo' element value. Сведения о лице, которому передаются припасы
     * 
     * @param consigneeInfo
     */
    public void setConsigneeInfo(OrganizationBaseType consigneeInfo) {
        this.consigneeInfo = consigneeInfo;
    }

    /** 
     * Get the 'GTDID' element value. Регистрационный номер таможенной декларации
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. Регистрационный номер таможенной декларации
     * 
     * @param GTDID
     */
    public void setGTDID(GTDIDType GTDID) {
        this.GTDID = GTDID;
    }

    /** 
     * Get the 'RegNumer' element value. Регистрационный номер заявления
     * 
     * @return value
     */
    public GTDIDType getRegNumer() {
        return regNumer;
    }

    /** 
     * Set the 'RegNumer' element value. Регистрационный номер заявления
     * 
     * @param regNumer
     */
    public void setRegNumer(GTDIDType regNumer) {
        this.regNumer = regNumer;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
