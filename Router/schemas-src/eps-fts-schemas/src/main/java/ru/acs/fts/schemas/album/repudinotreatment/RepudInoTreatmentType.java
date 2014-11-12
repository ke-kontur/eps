
package ru.acs.fts.schemas.album.repudinotreatment;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * Отказ в выдаче разрешения на переработку товаров вне таможенной территории
 */
public class RepudInoTreatmentType extends BaseDocType
{
    private LocalDate sendDate;
    private String comments;
    private String number;
    private LocalDate date;
    private List<RepudReasonType> repudReasonList = new ArrayList<RepudReasonType>();
    private CustomsType customs;
    private CustomsPersonType customsPerson;
    private String documentModeID;

    /** 
     * Get the 'SendDate' element value. Дата направления
     * 
     * @return value
     */
    public LocalDate getSendDate() {
        return sendDate;
    }

    /** 
     * Set the 'SendDate' element value. Дата направления
     * 
     * @param sendDate
     */
    public void setSendDate(LocalDate sendDate) {
        this.sendDate = sendDate;
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
     * Get the 'Number' element value. Номер официального письма таможни
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. Номер официального письма таможни
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the 'Date' element value. Дата выхода официального письма таможни
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. Дата выхода официального письма таможни
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the list of 'RepudReason' element items. Причины отказа
     * 
     * @return list
     */
    public List<RepudReasonType> getRepudReasonList() {
        return repudReasonList;
    }

    /** 
     * Set the list of 'RepudReason' element items. Причины отказа
     * 
     * @param list
     */
    public void setRepudReasonList(List<RepudReasonType> list) {
        repudReasonList = list;
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
