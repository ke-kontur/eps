
package ru.acs.fts.schemas.album.notifgtdexaminationfinish;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Уведомление об окончании проверки ДТ
 */
public class NotifGTDExaminationFinishType extends BaseDocType
{
    private LocalDate examFinishDate;
    private String examFinishTime;
    private String comments;
    private CustomsPersonType customsPerson;
    private CustomsType customs;
    private GTDIDType GTDID;
    private String documentModeID;

    /** 
     * Get the 'ExamFinishDate' element value. Дата окончания проверки
     * 
     * @return value
     */
    public LocalDate getExamFinishDate() {
        return examFinishDate;
    }

    /** 
     * Set the 'ExamFinishDate' element value. Дата окончания проверки
     * 
     * @param examFinishDate
     */
    public void setExamFinishDate(LocalDate examFinishDate) {
        this.examFinishDate = examFinishDate;
    }

    /** 
     * Get the 'ExamFinishTime' element value. Время окончания проверки
     * 
     * @return value
     */
    public String getExamFinishTime() {
        return examFinishTime;
    }

    /** 
     * Set the 'ExamFinishTime' element value. Время окончания проверки
     * 
     * @param examFinishTime
     */
    public void setExamFinishTime(String examFinishTime) {
        this.examFinishTime = examFinishTime;
    }

    /** 
     * Get the 'Comments' element value. Комментарий.
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. Комментарий.
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
     * Get the 'GTDID' element value. Регистрационный номер ДТ.
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. Регистрационный номер ДТ.
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
