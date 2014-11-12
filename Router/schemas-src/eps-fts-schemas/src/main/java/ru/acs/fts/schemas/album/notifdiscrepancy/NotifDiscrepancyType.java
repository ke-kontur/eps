
package ru.acs.fts.schemas.album.notifdiscrepancy;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Информация о несоответствии сведений, заявленных в таможенной декларации, сведениям, полученным в результате применения дополнительных форм таможенного контроля (досмотр, осмотр)
 */
public class NotifDiscrepancyType extends BaseDocType
{
    private String sendDate;
    private String comments;
    private List<SourceOfInformationType> sourceOfInformationList = new ArrayList<SourceOfInformationType>();
    private CustomsPersonType customsPerson;
    private CustomsType customs;
    private GTDIDType GTDNumber;
    private String documentModeID;

    /** 
     * Get the 'SendDate' element value. Дата/время создания уведомления
     * 
     * @return value
     */
    public String getSendDate() {
        return sendDate;
    }

    /** 
     * Set the 'SendDate' element value. Дата/время создания уведомления
     * 
     * @param sendDate
     */
    public void setSendDate(String sendDate) {
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
     * Get the list of 'SourceOfInformation' element items. Информация о несоответствии сведений (номера, даты актов осмотра, досмотра)
     * 
     * @return list
     */
    public List<SourceOfInformationType> getSourceOfInformationList() {
        return sourceOfInformationList;
    }

    /** 
     * Set the list of 'SourceOfInformation' element items. Информация о несоответствии сведений (номера, даты актов осмотра, досмотра)
     * 
     * @param list
     */
    public void setSourceOfInformationList(List<SourceOfInformationType> list) {
        sourceOfInformationList = list;
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
     * Get the 'Customs' element value. Таможенный орган.
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Таможенный орган.
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'GTDNumber' element value. Справочный номер ДТ.
     * 
     * @return value
     */
    public GTDIDType getGTDNumber() {
        return GTDNumber;
    }

    /** 
     * Set the 'GTDNumber' element value. Справочный номер ДТ.
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
