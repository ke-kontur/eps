
package ru.acs.fts.schemas.album.permitdelaydocs;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Разрешение представления документов в установленный срок
 */
public class PermitDelayDocsType extends BaseDocType
{
    private LocalDate sendDate;
    private String sendTime;
    private String comments;
    private List<DelayedDocsType> delayedDocList = new ArrayList<DelayedDocsType>();
    private CustomsType customs;
    private CustomsPersonType customsPerson;
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
     * Get the list of 'DelayedDocs' element items. Решение по документам
     * 
     * @return list
     */
    public List<DelayedDocsType> getDelayedDocList() {
        return delayedDocList;
    }

    /** 
     * Set the list of 'DelayedDocs' element items. Решение по документам
     * 
     * @param list
     */
    public void setDelayedDocList(List<DelayedDocsType> list) {
        delayedDocList = list;
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
