
package ru.acs.fts.schemas.admin.udcustlistupdate;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.admin.intexchcommonaggregatetypescust.BaseDocType;

/** 
 * Справочник таможенных органов
 */
public class UDCustListUpdateType extends BaseDocType
{
    private DateTime createDateTime;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<String> commentList = new ArrayList<String>();
    private String recID;
    private DocumentGroundType documentGroundConnect;
    private CustomsType customsOut;
    private CustomsType customsIn;
    private DocumentGroundType documentGroundDisconnect;
    private String documentModeID;

    /** 
     * Get the 'CreateDateTime' element value. Дата  и время  создания  выгрузки
     * 
     * @return value
     */
    public DateTime getCreateDateTime() {
        return createDateTime;
    }

    /** 
     * Set the 'CreateDateTime' element value. Дата  и время  создания  выгрузки
     * 
     * @param createDateTime
     */
    public void setCreateDateTime(DateTime createDateTime) {
        this.createDateTime = createDateTime;
    }

    /** 
     * Get the 'StartDate' element value. Дата начала действия
     * 
     * @return value
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /** 
     * Set the 'StartDate' element value. Дата начала действия
     * 
     * @param startDate
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /** 
     * Get the 'EndDate' element value. Дата окончание действия
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. Дата окончание действия
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /** 
     * Get the list of 'Comments' element items. Комментарии
     * 
     * @return list
     */
    public List<String> getCommentList() {
        return commentList;
    }

    /** 
     * Set the list of 'Comments' element items. Комментарии
     * 
     * @param list
     */
    public void setCommentList(List<String> list) {
        commentList = list;
    }

    /** 
     * Get the 'RecID' element value. Идентификатор записи
     * 
     * @return value
     */
    public String getRecID() {
        return recID;
    }

    /** 
     * Set the 'RecID' element value. Идентификатор записи
     * 
     * @param recID
     */
    public void setRecID(String recID) {
        this.recID = recID;
    }

    /** 
     * Get the 'DocumentGroundConnect' element value. Основание для подключения
     * 
     * @return value
     */
    public DocumentGroundType getDocumentGroundConnect() {
        return documentGroundConnect;
    }

    /** 
     * Set the 'DocumentGroundConnect' element value. Основание для подключения
     * 
     * @param documentGroundConnect
     */
    public void setDocumentGroundConnect(
            DocumentGroundType documentGroundConnect) {
        this.documentGroundConnect = documentGroundConnect;
    }

    /** 
     * Get the 'CustomsOut' element value. Внешний таможенный пост
     * 
     * @return value
     */
    public CustomsType getCustomsOut() {
        return customsOut;
    }

    /** 
     * Set the 'CustomsOut' element value. Внешний таможенный пост
     * 
     * @param customsOut
     */
    public void setCustomsOut(CustomsType customsOut) {
        this.customsOut = customsOut;
    }

    /** 
     * Get the 'CustomsIn' element value. Внутренний таможенный пост
     * 
     * @return value
     */
    public CustomsType getCustomsIn() {
        return customsIn;
    }

    /** 
     * Set the 'CustomsIn' element value. Внутренний таможенный пост
     * 
     * @param customsIn
     */
    public void setCustomsIn(CustomsType customsIn) {
        this.customsIn = customsIn;
    }

    /** 
     * Get the 'DocumentGroundDisconnect' element value. Основание для  исключения
     * 
     * @return value
     */
    public DocumentGroundType getDocumentGroundDisconnect() {
        return documentGroundDisconnect;
    }

    /** 
     * Set the 'DocumentGroundDisconnect' element value. Основание для  исключения
     * 
     * @param documentGroundDisconnect
     */
    public void setDocumentGroundDisconnect(
            DocumentGroundType documentGroundDisconnect) {
        this.documentGroundDisconnect = documentGroundDisconnect;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
