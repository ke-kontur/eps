
package ru.acs.fts.schemas.album.notifgoodsaccepttime;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Уведомление о дате и времени принятия товаров от перевозчика 
 */
public class NotifGoodsAcceptTimeType extends BaseDocType
{
    private LocalDate date;
    private String time;
    private String precedingNotifNumber;
    private CUOrganizationType economicOperator;
    private CUOrganizationType carrier;
    private TransportType transport;
    private List<DocumentBaseType> documentList = new ArrayList<DocumentBaseType>();
    private PersonSignatureType notifPerson;
    private String documentModeID;

    /** 
     * Get the 'Date' element value. Дата принятия товаров от перевозчика 
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. Дата принятия товаров от перевозчика 
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'Time' element value. Время принятия товаров от перевозчика 
     * 
     * @return value
     */
    public String getTime() {
        return time;
    }

    /** 
     * Set the 'Time' element value. Время принятия товаров от перевозчика 
     * 
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /** 
     * Get the 'PrecedingNotifNumber' element value. Регистрационный номер исходного уведомления
     * 
     * @return value
     */
    public String getPrecedingNotifNumber() {
        return precedingNotifNumber;
    }

    /** 
     * Set the 'PrecedingNotifNumber' element value. Регистрационный номер исходного уведомления
     * 
     * @param precedingNotifNumber
     */
    public void setPrecedingNotifNumber(String precedingNotifNumber) {
        this.precedingNotifNumber = precedingNotifNumber;
    }

    /** 
     * Get the 'EconomicOperator' element value. Уполномоченный экономический оператор
     * 
     * @return value
     */
    public CUOrganizationType getEconomicOperator() {
        return economicOperator;
    }

    /** 
     * Set the 'EconomicOperator' element value. Уполномоченный экономический оператор
     * 
     * @param economicOperator
     */
    public void setEconomicOperator(CUOrganizationType economicOperator) {
        this.economicOperator = economicOperator;
    }

    /** 
     * Get the 'Carrier' element value. Перевозчик
     * 
     * @return value
     */
    public CUOrganizationType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. Перевозчик
     * 
     * @param carrier
     */
    public void setCarrier(CUOrganizationType carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the 'Transport' element value. Транспортное средство
     * 
     * @return value
     */
    public TransportType getTransport() {
        return transport;
    }

    /** 
     * Set the 'Transport' element value. Транспортное средство
     * 
     * @param transport
     */
    public void setTransport(TransportType transport) {
        this.transport = transport;
    }

    /** 
     * Get the list of 'Document' element items. Документы
     * 
     * @return list
     */
    public List<DocumentBaseType> getDocumentList() {
        return documentList;
    }

    /** 
     * Set the list of 'Document' element items. Документы
     * 
     * @param list
     */
    public void setDocumentList(List<DocumentBaseType> list) {
        documentList = list;
    }

    /** 
     * Get the 'NotifPerson' element value. ФИО лица,  составившего  уведомление о принятии товаров
     * 
     * @return value
     */
    public PersonSignatureType getNotifPerson() {
        return notifPerson;
    }

    /** 
     * Set the 'NotifPerson' element value. ФИО лица,  составившего  уведомление о принятии товаров
     * 
     * @param notifPerson
     */
    public void setNotifPerson(PersonSignatureType notifPerson) {
        this.notifPerson = notifPerson;
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
