
package ru.acs.fts.schemas.album.reqinotreatmentdocs;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * Требование на предоставление электронного документа, указанного в описи, прилагаемой к заявлению на переработку товаров вне таможенной территории
 */
public class ReqInoTreatmentDocsType extends BaseDocType
{
    private LocalDate sendDate;
    private LocalDate requestDate;
    private LocalDate dateLimit;
    private CustomsType customs;
    private CustomsPersonType customsPerson;
    private List<RequestedDocType> requestedDocList = new ArrayList<RequestedDocType>();
    private List<CommunicationType> communicationList = new ArrayList<CommunicationType>();
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
     * Get the 'RequestDate' element value. Дата формирования запроса
     * 
     * @return value
     */
    public LocalDate getRequestDate() {
        return requestDate;
    }

    /** 
     * Set the 'RequestDate' element value. Дата формирования запроса
     * 
     * @param requestDate
     */
    public void setRequestDate(LocalDate requestDate) {
        this.requestDate = requestDate;
    }

    /** 
     * Get the 'DateLimit' element value. Срок предоставления документов
     * 
     * @return value
     */
    public LocalDate getDateLimit() {
        return dateLimit;
    }

    /** 
     * Set the 'DateLimit' element value. Срок предоставления документов
     * 
     * @param dateLimit
     */
    public void setDateLimit(LocalDate dateLimit) {
        this.dateLimit = dateLimit;
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
     * Get the list of 'RequestedDoc' element items. Запрашиваемый документ
     * 
     * @return list
     */
    public List<RequestedDocType> getRequestedDocList() {
        return requestedDocList;
    }

    /** 
     * Set the list of 'RequestedDoc' element items. Запрашиваемый документ
     * 
     * @param list
     */
    public void setRequestedDocList(List<RequestedDocType> list) {
        requestedDocList = list;
    }

    /** 
     * Get the list of 'Communication' element items. Средство связи
     * 
     * @return list
     */
    public List<CommunicationType> getCommunicationList() {
        return communicationList;
    }

    /** 
     * Set the list of 'Communication' element items. Средство связи
     * 
     * @param list
     */
    public void setCommunicationList(List<CommunicationType> list) {
        communicationList = list;
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
