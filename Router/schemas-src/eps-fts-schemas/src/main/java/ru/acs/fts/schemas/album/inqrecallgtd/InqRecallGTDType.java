
package ru.acs.fts.schemas.album.inqrecallgtd;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * Обращение об отзыве декларации
 */
public class InqRecallGTDType extends BaseDocType
{
    private LocalDate sendDate;
    private String sendTime;
    private List<String> recallReasonList = new ArrayList<String>();
    private OrganizationType applicant;
    private GTDIDType GTDNumber;
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
     * Get the 'SendTime' element value. Время направления
     * 
     * @return value
     */
    public String getSendTime() {
        return sendTime;
    }

    /** 
     * Set the 'SendTime' element value. Время направления
     * 
     * @param sendTime
     */
    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    /** 
     * Get the list of 'RecallReason' element items. Причина отзыва
     * 
     * @return list
     */
    public List<String> getRecallReasonList() {
        return recallReasonList;
    }

    /** 
     * Set the list of 'RecallReason' element items. Причина отзыва
     * 
     * @param list
     */
    public void setRecallReasonList(List<String> list) {
        recallReasonList = list;
    }

    /** 
     * Get the 'Applicant' element value. Сведения о заявителе
     * 
     * @return value
     */
    public OrganizationType getApplicant() {
        return applicant;
    }

    /** 
     * Set the 'Applicant' element value. Сведения о заявителе
     * 
     * @param applicant
     */
    public void setApplicant(OrganizationType applicant) {
        this.applicant = applicant;
    }

    /** 
     * Get the 'GTDNumber' element value. Справочный номер ДТ
     * 
     * @return value
     */
    public GTDIDType getGTDNumber() {
        return GTDNumber;
    }

    /** 
     * Set the 'GTDNumber' element value. Справочный номер ДТ
     * 
     * @param GTDNumber
     */
    public void setGTDNumber(GTDIDType GTDNumber) {
        this.GTDNumber = GTDNumber;
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
