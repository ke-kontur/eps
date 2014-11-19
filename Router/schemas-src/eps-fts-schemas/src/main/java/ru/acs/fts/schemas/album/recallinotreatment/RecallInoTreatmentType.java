
package ru.acs.fts.schemas.album.recallinotreatment;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * Отзыв разрешения на переработку товаров вне таможенной территории
 */
public class RecallInoTreatmentType extends BaseDocType
{
    private String permitNumber;
    private LocalDate sendDate;
    private LocalDate recallBeginDate;
    private String comments;
    private List<GovermentActType> govermentActList = new ArrayList<GovermentActType>();
    private CustomsType customs;
    private CustomsPersonType customsPerson;
    private String documentModeID;

    /** 
     * Get the 'PermitNumber' element value. Номер разрешения на переработку вне таможенной территории
     * 
     * @return value
     */
    public String getPermitNumber() {
        return permitNumber;
    }

    /** 
     * Set the 'PermitNumber' element value. Номер разрешения на переработку вне таможенной территории
     * 
     * @param permitNumber
     */
    public void setPermitNumber(String permitNumber) {
        this.permitNumber = permitNumber;
    }

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
     * Get the 'RecallBeginDate' element value. Дата вступления в силу отзыва
     * 
     * @return value
     */
    public LocalDate getRecallBeginDate() {
        return recallBeginDate;
    }

    /** 
     * Set the 'RecallBeginDate' element value. Дата вступления в силу отзыва
     * 
     * @param recallBeginDate
     */
    public void setRecallBeginDate(LocalDate recallBeginDate) {
        this.recallBeginDate = recallBeginDate;
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
     * Get the list of 'GovermentAct' element items. Акт Правительства Российской Федерации, на основании которого отзывается разрешение
     * 
     * @return list
     */
    public List<GovermentActType> getGovermentActList() {
        return govermentActList;
    }

    /** 
     * Set the list of 'GovermentAct' element items. Акт Правительства Российской Федерации, на основании которого отзывается разрешение
     * 
     * @param list
     */
    public void setGovermentActList(List<GovermentActType> list) {
        govermentActList = list;
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
