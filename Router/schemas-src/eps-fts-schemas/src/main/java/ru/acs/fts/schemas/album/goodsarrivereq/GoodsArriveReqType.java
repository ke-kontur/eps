
package ru.acs.fts.schemas.album.goodsarrivereq;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Запрос о прибытии товарной партии
 */
public class GoodsArriveReqType extends BaseDocType
{
    private String reqNumber;
    private LocalDate reqDate;
    private CustomsType customs;
    private CustomsPersonType customsPerson;
    private CUOrganizationType consignee;
    private GoodsShipmentType goodsShipment;
    private CUOrganizationType consignor;
    private GTDIDType GTDID;
    private String documentModeID;

    /** 
     * Get the 'ReqNumber' element value. Номер запроса.
     * 
     * @return value
     */
    public String getReqNumber() {
        return reqNumber;
    }

    /** 
     * Set the 'ReqNumber' element value. Номер запроса.
     * 
     * @param reqNumber
     */
    public void setReqNumber(String reqNumber) {
        this.reqNumber = reqNumber;
    }

    /** 
     * Get the 'ReqDate' element value. Дата запроса.
     * 
     * @return value
     */
    public LocalDate getReqDate() {
        return reqDate;
    }

    /** 
     * Set the 'ReqDate' element value. Дата запроса.
     * 
     * @param reqDate
     */
    public void setReqDate(LocalDate reqDate) {
        this.reqDate = reqDate;
    }

    /** 
     * Get the 'Customs' element value. Таможенный орган
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Таможенный орган
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
     * Get the 'Consignee' element value. Грузополучатель
     * 
     * @return value
     */
    public CUOrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. Грузополучатель
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
     * Get the 'Consignor' element value. Грузоотправитель
     * 
     * @return value
     */
    public CUOrganizationType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. Грузоотправитель
     * 
     * @param consignor
     */
    public void setConsignor(CUOrganizationType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'GTDID' element value. Регистрационный номер ДТ
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. Регистрационный номер ДТ
     * 
     * @param GTDID
     */
    public void setGTDID(GTDIDType GTDID) {
        this.GTDID = GTDID;
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
