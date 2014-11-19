
package ru.acs.fts.schemas.album.notifgtdexaminationstart;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * Уведомление о начале проверки ДТ.
 */
public class NotifGTDExaminationStartType extends BaseDocType
{
    private LocalDate controlStartDate;
    private String controlStartTime;
    private String comments;
    private CustomsPersonType customsPerson;
    private CustomsType customs;
    private DocIDType docID;
    private String documentModeID;

    /** 
     * Get the 'ControlStartDate' element value. Дата начала проверки
     * 
     * @return value
     */
    public LocalDate getControlStartDate() {
        return controlStartDate;
    }

    /** 
     * Set the 'ControlStartDate' element value. Дата начала проверки
     * 
     * @param controlStartDate
     */
    public void setControlStartDate(LocalDate controlStartDate) {
        this.controlStartDate = controlStartDate;
    }

    /** 
     * Get the 'ControlStartTime' element value. Время начала проверки
     * 
     * @return value
     */
    public String getControlStartTime() {
        return controlStartTime;
    }

    /** 
     * Set the 'ControlStartTime' element value. Время начала проверки
     * 
     * @param controlStartTime
     */
    public void setControlStartTime(String controlStartTime) {
        this.controlStartTime = controlStartTime;
    }

    /** 
     * Get the 'Comments' element value. Комментарий
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. Комментарий
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
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
     * Get the 'DocID' element value. Регистрационный номер документа
     * 
     * @return value
     */
    public DocIDType getDocID() {
        return docID;
    }

    /** 
     * Set the 'DocID' element value. Регистрационный номер документа
     * 
     * @param docID
     */
    public void setDocID(DocIDType docID) {
        this.docID = docID;
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
