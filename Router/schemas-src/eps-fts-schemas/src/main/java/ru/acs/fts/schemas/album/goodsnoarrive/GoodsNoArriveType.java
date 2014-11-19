
package ru.acs.fts.schemas.album.goodsnoarrive;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * Уведомление  о непоступлении товарной партии
 */
public class GoodsNoArriveType extends BaseDocType
{
    private String resNumber;
    private LocalDate resDate;
    private String reqNumber;
    private LocalDate reqDate;
    private CustomsType customs;
    private CustomsPersonType customsPerson;
    private CUOrganizationType consignee;
    private GoodsShipmentType goodsShipment;
    private String documentModeID;

    /** 
     * Get the 'ResNumber' element value. Номер уведомления
     * 
     * @return value
     */
    public String getResNumber() {
        return resNumber;
    }

    /** 
     * Set the 'ResNumber' element value. Номер уведомления
     * 
     * @param resNumber
     */
    public void setResNumber(String resNumber) {
        this.resNumber = resNumber;
    }

    /** 
     * Get the 'ResDate' element value. Дата уведомления
     * 
     * @return value
     */
    public LocalDate getResDate() {
        return resDate;
    }

    /** 
     * Set the 'ResDate' element value. Дата уведомления
     * 
     * @param resDate
     */
    public void setResDate(LocalDate resDate) {
        this.resDate = resDate;
    }

    /** 
     * Get the 'ReqNumber' element value. Номер входящего запроса.
     * 
     * @return value
     */
    public String getReqNumber() {
        return reqNumber;
    }

    /** 
     * Set the 'ReqNumber' element value. Номер входящего запроса.
     * 
     * @param reqNumber
     */
    public void setReqNumber(String reqNumber) {
        this.reqNumber = reqNumber;
    }

    /** 
     * Get the 'ReqDate' element value. Дата входящего запроса.
     * 
     * @return value
     */
    public LocalDate getReqDate() {
        return reqDate;
    }

    /** 
     * Set the 'ReqDate' element value. Дата входящего запроса.
     * 
     * @param reqDate
     */
    public void setReqDate(LocalDate reqDate) {
        this.reqDate = reqDate;
    }

    /** 
     * Get the 'Customs' element value. Код и наименование таможенного органа
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Код и наименование таможенного органа
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'Consignee' element value. Грузополоучатель
     * 
     * @return value
     */
    public CUOrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. Грузополоучатель
     * 
     * @param consignee
     */
    public void setConsignee(CUOrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'GoodsShipment' element value. Товарная партия
     * 
     * @return value
     */
    public GoodsShipmentType getGoodsShipment() {
        return goodsShipment;
    }

    /** 
     * Set the 'GoodsShipment' element value. Товарная партия
     * 
     * @param goodsShipment
     */
    public void setGoodsShipment(GoodsShipmentType goodsShipment) {
        this.goodsShipment = goodsShipment;
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
