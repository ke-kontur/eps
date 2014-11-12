
package ru.acs.fts.schemas.album.shippingspecification;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Отгрузочная спецификация
 */
public class ShippingSpecificationType extends BaseDocType
{
    private DocumentBaseType specification;
    private DocumentBaseType activitiesAgreement;
    private OrganizationBaseType sender;
    private OrganizationBaseType receiver;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private String documentModeID;

    /** 
     * Get the 'Specification' element value. Номер и дата спецификации
     * 
     * @return value
     */
    public DocumentBaseType getSpecification() {
        return specification;
    }

    /** 
     * Set the 'Specification' element value. Номер и дата спецификации
     * 
     * @param specification
     */
    public void setSpecification(DocumentBaseType specification) {
        this.specification = specification;
    }

    /** 
     * Get the 'ActivitiesAgreement' element value. Сведения о договоре внешнеэкономической сделки
     * 
     * @return value
     */
    public DocumentBaseType getActivitiesAgreement() {
        return activitiesAgreement;
    }

    /** 
     * Set the 'ActivitiesAgreement' element value. Сведения о договоре внешнеэкономической сделки
     * 
     * @param activitiesAgreement
     */
    public void setActivitiesAgreement(DocumentBaseType activitiesAgreement) {
        this.activitiesAgreement = activitiesAgreement;
    }

    /** 
     * Get the 'Sender' element value. Продавец/отправитель
     * 
     * @return value
     */
    public OrganizationBaseType getSender() {
        return sender;
    }

    /** 
     * Set the 'Sender' element value. Продавец/отправитель
     * 
     * @param sender
     */
    public void setSender(OrganizationBaseType sender) {
        this.sender = sender;
    }

    /** 
     * Get the 'Receiver' element value. Покупатель/получатель
     * 
     * @return value
     */
    public OrganizationBaseType getReceiver() {
        return receiver;
    }

    /** 
     * Set the 'Receiver' element value. Покупатель/получатель
     * 
     * @param receiver
     */
    public void setReceiver(OrganizationBaseType receiver) {
        this.receiver = receiver;
    }

    /** 
     * Get the list of 'Goods' element items. Товар отгрузочной спецификации
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. Товар отгрузочной спецификации
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
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
