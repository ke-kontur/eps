
package ru.acs.fts.schemas.album.rejectreqoperation;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * Отказ в запрашиваемых действиях
 */
public class RejectReqOperationType extends BaseDocType
{
    private String rejectNumber;
    private LocalDate rejectDate;
    private String rejectTime;
    private String reqNumber;
    private LocalDate reqDate;
    private List<String> rejectReasonList = new ArrayList<String>();
    private String comments;
    private CustomsPersonType customsPerson;
    private CustomsType customs;
    private String documentModeID;

    /** 
     * Get the 'RejectNumber' element value. Исходящий номер документа
     * 
     * @return value
     */
    public String getRejectNumber() {
        return rejectNumber;
    }

    /** 
     * Set the 'RejectNumber' element value. Исходящий номер документа
     * 
     * @param rejectNumber
     */
    public void setRejectNumber(String rejectNumber) {
        this.rejectNumber = rejectNumber;
    }

    /** 
     * Get the 'RejectDate' element value. Дата создания документа
     * 
     * @return value
     */
    public LocalDate getRejectDate() {
        return rejectDate;
    }

    /** 
     * Set the 'RejectDate' element value. Дата создания документа
     * 
     * @param rejectDate
     */
    public void setRejectDate(LocalDate rejectDate) {
        this.rejectDate = rejectDate;
    }

    /** 
     * Get the 'RejectTime' element value. Время создания документа
     * 
     * @return value
     */
    public String getRejectTime() {
        return rejectTime;
    }

    /** 
     * Set the 'RejectTime' element value. Время создания документа
     * 
     * @param rejectTime
     */
    public void setRejectTime(String rejectTime) {
        this.rejectTime = rejectTime;
    }

    /** 
     * Get the 'ReqNumber' element value. Номер запроса от декларанта
     * 
     * @return value
     */
    public String getReqNumber() {
        return reqNumber;
    }

    /** 
     * Set the 'ReqNumber' element value. Номер запроса от декларанта
     * 
     * @param reqNumber
     */
    public void setReqNumber(String reqNumber) {
        this.reqNumber = reqNumber;
    }

    /** 
     * Get the 'ReqDate' element value. Дата запроса от декларанта
     * 
     * @return value
     */
    public LocalDate getReqDate() {
        return reqDate;
    }

    /** 
     * Set the 'ReqDate' element value. Дата запроса от декларанта
     * 
     * @param reqDate
     */
    public void setReqDate(LocalDate reqDate) {
        this.reqDate = reqDate;
    }

    /** 
     * Get the list of 'RejectReason' element items. Причина отказа
     * 
     * @return list
     */
    public List<String> getRejectReasonList() {
        return rejectReasonList;
    }

    /** 
     * Set the list of 'RejectReason' element items. Причина отказа
     * 
     * @param list
     */
    public void setRejectReasonList(List<String> list) {
        rejectReasonList = list;
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
