
package ru.acs.fts.schemas.album.notifinspectionend;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Уведомление о завершении фактического контроля товаров
 */
public class NotifInspectionEndType extends BaseDocType
{
    private LocalDate inspectionEndDate;
    private String inspectionEndTime;
    private String MPONumber;
    private String comments;
    private PersonSignatureType customsPerson;
    private CustomsType customs;
    private String documentModeID;

    /** 
     * Get the 'InspectionEndDate' element value. Дата завершения фактического контроля 
     * 
     * @return value
     */
    public LocalDate getInspectionEndDate() {
        return inspectionEndDate;
    }

    /** 
     * Set the 'InspectionEndDate' element value. Дата завершения фактического контроля 
     * 
     * @param inspectionEndDate
     */
    public void setInspectionEndDate(LocalDate inspectionEndDate) {
        this.inspectionEndDate = inspectionEndDate;
    }

    /** 
     * Get the 'InspectionEndTime' element value. Время завершения фактического контроля 
     * 
     * @return value
     */
    public String getInspectionEndTime() {
        return inspectionEndTime;
    }

    /** 
     * Set the 'InspectionEndTime' element value. Время завершения фактического контроля 
     * 
     * @param inspectionEndTime
     */
    public void setInspectionEndTime(String inspectionEndTime) {
        this.inspectionEndTime = inspectionEndTime;
    }

    /** 
     * Get the 'MPO_Number' element value. Номер МПО
     * 
     * @return value
     */
    public String getMPONumber() {
        return MPONumber;
    }

    /** 
     * Set the 'MPO_Number' element value. Номер МПО
     * 
     * @param MPONumber
     */
    public void setMPONumber(String MPONumber) {
        this.MPONumber = MPONumber;
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
     * Get the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @return value
     */
    public PersonSignatureType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(PersonSignatureType customsPerson) {
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
