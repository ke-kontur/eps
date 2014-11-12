
package ru.acs.fts.schemas.album.notifgoodswharrive;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Уведомление о поступлении товаров на СВХ
 */
public class NotifGoodsWhArriveType extends BaseDocType
{
    private LocalDate notifDate;
    private String notifTime;
    private CustomsType customs;
    private CustomsPersonType customsPerson;
    private GTDIDType GTDID;
    private GoodsLocationType goodsLocation;
    private String documentModeID;

    /** 
     * Get the 'NotifDate' element value. Дата формирования уведомления
     * 
     * @return value
     */
    public LocalDate getNotifDate() {
        return notifDate;
    }

    /** 
     * Set the 'NotifDate' element value. Дата формирования уведомления
     * 
     * @param notifDate
     */
    public void setNotifDate(LocalDate notifDate) {
        this.notifDate = notifDate;
    }

    /** 
     * Get the 'NotifTime' element value. Время формирования уведомления
     * 
     * @return value
     */
    public String getNotifTime() {
        return notifTime;
    }

    /** 
     * Set the 'NotifTime' element value. Время формирования уведомления
     * 
     * @param notifTime
     */
    public void setNotifTime(String notifTime) {
        this.notifTime = notifTime;
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
     * Get the 'GTDID' element value. Номер ДТ
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. Номер ДТ
     * 
     * @param GTDID
     */
    public void setGTDID(GTDIDType GTDID) {
        this.GTDID = GTDID;
    }

    /** 
     * Get the 'GoodsLocation' element value. Местонахождение товара
     * 
     * @return value
     */
    public GoodsLocationType getGoodsLocation() {
        return goodsLocation;
    }

    /** 
     * Set the 'GoodsLocation' element value. Местонахождение товара
     * 
     * @param goodsLocation
     */
    public void setGoodsLocation(GoodsLocationType goodsLocation) {
        this.goodsLocation = goodsLocation;
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
