
package ru.acs.fts.schemas.album.prolongationnotif;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Уведомление о продлении срока выпуска товаров
 */
public class ProlongationNotifType extends BaseDocType
{
    private LocalDate notifDate;
    private String notifTime;
    private LocalDate prolongDate;
    private String reasons;
    private String comments;
    private GTDIDType regNumberDT;
    private CustomsPersonType customsPerson;
    private CustomsType customs;
    private String documentModeID;

    /** 
     * Get the 'NotifDate' element value. Дата уведомления
     * 
     * @return value
     */
    public LocalDate getNotifDate() {
        return notifDate;
    }

    /** 
     * Set the 'NotifDate' element value. Дата уведомления
     * 
     * @param notifDate
     */
    public void setNotifDate(LocalDate notifDate) {
        this.notifDate = notifDate;
    }

    /** 
     * Get the 'NotifTime' element value. Время уведомления
     * 
     * @return value
     */
    public String getNotifTime() {
        return notifTime;
    }

    /** 
     * Set the 'NotifTime' element value. Время уведомления
     * 
     * @param notifTime
     */
    public void setNotifTime(String notifTime) {
        this.notifTime = notifTime;
    }

    /** 
     * Get the 'ProlongDate' element value. Дата, до которой продлевается срок
     * 
     * @return value
     */
    public LocalDate getProlongDate() {
        return prolongDate;
    }

    /** 
     * Set the 'ProlongDate' element value. Дата, до которой продлевается срок
     * 
     * @param prolongDate
     */
    public void setProlongDate(LocalDate prolongDate) {
        this.prolongDate = prolongDate;
    }

    /** 
     * Get the 'Reasons' element value. Основание продления срока
     * 
     * @return value
     */
    public String getReasons() {
        return reasons;
    }

    /** 
     * Set the 'Reasons' element value. Основание продления срока
     * 
     * @param reasons
     */
    public void setReasons(String reasons) {
        this.reasons = reasons;
    }

    /** 
     * Get the 'Comments' element value. Комментарии
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. Комментарии
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /** 
     * Get the 'RegNumberDT' element value. Регистрационный номер ДТ
     * 
     * @return value
     */
    public GTDIDType getRegNumberDT() {
        return regNumberDT;
    }

    /** 
     * Set the 'RegNumberDT' element value. Регистрационный номер ДТ
     * 
     * @param regNumberDT
     */
    public void setRegNumberDT(GTDIDType regNumberDT) {
        this.regNumberDT = regNumberDT;
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
     * Get the 'Customs' element value. Сведения о таможенном органе
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Сведения о таможенном органе
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
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
