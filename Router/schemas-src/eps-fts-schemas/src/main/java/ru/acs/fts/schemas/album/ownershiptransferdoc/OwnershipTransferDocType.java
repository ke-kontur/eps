
package ru.acs.fts.schemas.album.ownershiptransferdoc;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Сведения о документах, подтверждающих передачу прав на объекты интеллектуальной собственности.
 */
public class OwnershipTransferDocType extends BaseDocType
{
    private String regCertifNum;
    private LocalDate regExpiretionDate;
    private String movementDirection;
    private List<String> descriptionList = new ArrayList<String>();
    private String transportationMethod;
    private OrganizationBaseType rightHolder;
    private OrganizationBaseType goodsOwner;
    private OwnershipDocInfoType ownershipDocInfo;
    private List<GoodsInfoType> goodsInfoList = new ArrayList<GoodsInfoType>();
    private OrganizationInfoType sender;
    private OrganizationInfoType recipient;
    private String documentModeID;

    /** 
     * Get the 'RegCertifNum' element value. Номер свидетельства о регистрации объекта интеллектуальной собственности
     * 
     * @return value
     */
    public String getRegCertifNum() {
        return regCertifNum;
    }

    /** 
     * Set the 'RegCertifNum' element value. Номер свидетельства о регистрации объекта интеллектуальной собственности
     * 
     * @param regCertifNum
     */
    public void setRegCertifNum(String regCertifNum) {
        this.regCertifNum = regCertifNum;
    }

    /** 
     * Get the 'RegExpiretionDate' element value. Срок действия регистрации
     * 
     * @return value
     */
    public LocalDate getRegExpiretionDate() {
        return regExpiretionDate;
    }

    /** 
     * Set the 'RegExpiretionDate' element value. Срок действия регистрации
     * 
     * @param regExpiretionDate
     */
    public void setRegExpiretionDate(LocalDate regExpiretionDate) {
        this.regExpiretionDate = regExpiretionDate;
    }

    /** 
     * Get the 'MovementDirection' element value. Направление перемещения по договору
     * 
     * @return value
     */
    public String getMovementDirection() {
        return movementDirection;
    }

    /** 
     * Set the 'MovementDirection' element value. Направление перемещения по договору
     * 
     * @param movementDirection
     */
    public void setMovementDirection(String movementDirection) {
        this.movementDirection = movementDirection;
    }

    /** 
     * Get the list of 'Description' element items. Описание
     * 
     * @return list
     */
    public List<String> getDescriptionList() {
        return descriptionList;
    }

    /** 
     * Set the list of 'Description' element items. Описание
     * 
     * @param list
     */
    public void setDescriptionList(List<String> list) {
        descriptionList = list;
    }

    /** 
     * Get the 'TransportationMethod' element value. Способ транспортировки по договору
     * 
     * @return value
     */
    public String getTransportationMethod() {
        return transportationMethod;
    }

    /** 
     * Set the 'TransportationMethod' element value. Способ транспортировки по договору
     * 
     * @param transportationMethod
     */
    public void setTransportationMethod(String transportationMethod) {
        this.transportationMethod = transportationMethod;
    }

    /** 
     * Get the 'RightHolder' element value. Сведения о правообладателе
     * 
     * @return value
     */
    public OrganizationBaseType getRightHolder() {
        return rightHolder;
    }

    /** 
     * Set the 'RightHolder' element value. Сведения о правообладателе
     * 
     * @param rightHolder
     */
    public void setRightHolder(OrganizationBaseType rightHolder) {
        this.rightHolder = rightHolder;
    }

    /** 
     * Get the 'GoodsOwner' element value. Сведения о владельце товара
     * 
     * @return value
     */
    public OrganizationBaseType getGoodsOwner() {
        return goodsOwner;
    }

    /** 
     * Set the 'GoodsOwner' element value. Сведения о владельце товара
     * 
     * @param goodsOwner
     */
    public void setGoodsOwner(OrganizationBaseType goodsOwner) {
        this.goodsOwner = goodsOwner;
    }

    /** 
     * Get the 'OwnershipDocInfo' element value. Информация о документах, подтверждающих право собственности
     * 
     * @return value
     */
    public OwnershipDocInfoType getOwnershipDocInfo() {
        return ownershipDocInfo;
    }

    /** 
     * Set the 'OwnershipDocInfo' element value. Информация о документах, подтверждающих право собственности
     * 
     * @param ownershipDocInfo
     */
    public void setOwnershipDocInfo(OwnershipDocInfoType ownershipDocInfo) {
        this.ownershipDocInfo = ownershipDocInfo;
    }

    /** 
     * Get the list of 'GoodsInfo' element items. Сведения о товаре
     * 
     * @return list
     */
    public List<GoodsInfoType> getGoodsInfoList() {
        return goodsInfoList;
    }

    /** 
     * Set the list of 'GoodsInfo' element items. Сведения о товаре
     * 
     * @param list
     */
    public void setGoodsInfoList(List<GoodsInfoType> list) {
        goodsInfoList = list;
    }

    /** 
     * Get the 'Sender' element value. Отправитель по договору
     * 
     * @return value
     */
    public OrganizationInfoType getSender() {
        return sender;
    }

    /** 
     * Set the 'Sender' element value. Отправитель по договору
     * 
     * @param sender
     */
    public void setSender(OrganizationInfoType sender) {
        this.sender = sender;
    }

    /** 
     * Get the 'Recipient' element value. Получатель по договору
     * 
     * @return value
     */
    public OrganizationInfoType getRecipient() {
        return recipient;
    }

    /** 
     * Set the 'Recipient' element value. Получатель по договору
     * 
     * @param recipient
     */
    public void setRecipient(OrganizationInfoType recipient) {
        this.recipient = recipient;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
