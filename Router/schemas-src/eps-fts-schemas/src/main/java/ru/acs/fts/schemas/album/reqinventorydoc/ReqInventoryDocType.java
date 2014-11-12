
package ru.acs.fts.schemas.album.reqinventorydoc;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Запрос о представлении электронных документов
 */
public class ReqInventoryDocType extends BaseDocType
{
    private String requestNumber;
    private LocalDate sendDate;
    private String sendTime;
    private LocalDate requestDate;
    private String requestTime;
    private LocalDate dateLimit;
    private String applicationSourceSystemID;
    private String applicationID;
    private String docSign;
    private List<CommunicationType> communicationList = new ArrayList<CommunicationType>();
    private List<RequestedDocType> requestedDocList = new ArrayList<RequestedDocType>();
    private CustomsPersonType customsPerson;
    private CustomsType customs;
    private GTDIDType GTDNumber;
    private OEZRegistrationNumberType OEZRegistrationNumber;
    private String documentModeID;

    /** 
     * Get the 'RequestNumber' element value. Порядковый номер запроса по ДТ о представлении дополнительных документов
     * 
     * @return value
     */
    public String getRequestNumber() {
        return requestNumber;
    }

    /** 
     * Set the 'RequestNumber' element value. Порядковый номер запроса по ДТ о представлении дополнительных документов
     * 
     * @param requestNumber
     */
    public void setRequestNumber(String requestNumber) {
        this.requestNumber = requestNumber;
    }

    /** 
     * Get the 'SendDate' element value. Дата направления запроса
     * 
     * @return value
     */
    public LocalDate getSendDate() {
        return sendDate;
    }

    /** 
     * Set the 'SendDate' element value. Дата направления запроса
     * 
     * @param sendDate
     */
    public void setSendDate(LocalDate sendDate) {
        this.sendDate = sendDate;
    }

    /** 
     * Get the 'SendTime' element value. Время направления запроса
     * 
     * @return value
     */
    public String getSendTime() {
        return sendTime;
    }

    /** 
     * Set the 'SendTime' element value. Время направления запроса
     * 
     * @param sendTime
     */
    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
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
     * Get the 'RequestTime' element value. Время формирования запроса
     * 
     * @return value
     */
    public String getRequestTime() {
        return requestTime;
    }

    /** 
     * Set the 'RequestTime' element value. Время формирования запроса
     * 
     * @param requestTime
     */
    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
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
     * Get the 'ApplicationSourceSystemID' element value. Идентификатор заявления на ЕПГУ
     * 
     * @return value
     */
    public String getApplicationSourceSystemID() {
        return applicationSourceSystemID;
    }

    /** 
     * Set the 'ApplicationSourceSystemID' element value. Идентификатор заявления на ЕПГУ
     * 
     * @param applicationSourceSystemID
     */
    public void setApplicationSourceSystemID(String applicationSourceSystemID) {
        this.applicationSourceSystemID = applicationSourceSystemID;
    }

    /** 
     * Get the 'ApplicationID' element value. Идентификатор заявки в АПС "Электронные Госуслуги-2"
     * 
     * @return value
     */
    public String getApplicationID() {
        return applicationID;
    }

    /** 
     * Set the 'ApplicationID' element value. Идентификатор заявки в АПС "Электронные Госуслуги-2"
     * 
     * @param applicationID
     */
    public void setApplicationID(String applicationID) {
        this.applicationID = applicationID;
    }

    /** 
     * Get the 'DocSign' element value. Запрос о представлении недостающих документов и сведений: 1 - в случае подачи заявления на уничтожение; 0 - иное
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. Запрос о представлении недостающих документов и сведений: 1 - в случае подачи заявления на уничтожение; 0 - иное
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
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
     * Get the 'OEZ_RegistrationNumber' element value. Регистрационный номер уведомления о ввозе/вывозе товаров на территорию ОЭЗ/Заявления на уничтожение
     * 
     * @return value
     */
    public OEZRegistrationNumberType getOEZRegistrationNumber() {
        return OEZRegistrationNumber;
    }

    /** 
     * Set the 'OEZ_RegistrationNumber' element value. Регистрационный номер уведомления о ввозе/вывозе товаров на территорию ОЭЗ/Заявления на уничтожение
     * 
     * @param OEZRegistrationNumber
     */
    public void setOEZRegistrationNumber(
            OEZRegistrationNumberType OEZRegistrationNumber) {
        this.OEZRegistrationNumber = OEZRegistrationNumber;
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
