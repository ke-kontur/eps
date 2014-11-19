
package ru.acs.fts.schemas.album.notifarrivalintegrityseal;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * Уведомление о прибытии и целостности/нарушении пломб
 */
public class NotifArrivalIntegritySealType extends BaseDocType
{
    private LocalDate date;
    private String time;
    private LocalDate acceptDate;
    private String acceptTime;
    private String modificationSign;
    private CUOrganizationType economicOperator;
    private IdentifModificationType identifModification;
    private CUOrganizationType carrier;
    private String documentModeID;

    /** 
     * Get the 'Date' element value. Дата создания уведомления
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. Дата создания уведомления
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'Time' element value. Время создания уведомления
     * 
     * @return value
     */
    public String getTime() {
        return time;
    }

    /** 
     * Set the 'Time' element value. Время создания уведомления
     * 
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /** 
     * Get the 'AcceptDate' element value. Дата прибытия товаров
     * 
     * @return value
     */
    public LocalDate getAcceptDate() {
        return acceptDate;
    }

    /** 
     * Set the 'AcceptDate' element value. Дата прибытия товаров
     * 
     * @param acceptDate
     */
    public void setAcceptDate(LocalDate acceptDate) {
        this.acceptDate = acceptDate;
    }

    /** 
     * Get the 'AcceptTime' element value. Время прибытия товаров
     * 
     * @return value
     */
    public String getAcceptTime() {
        return acceptTime;
    }

    /** 
     * Set the 'AcceptTime' element value. Время прибытия товаров
     * 
     * @param acceptTime
     */
    public void setAcceptTime(String acceptTime) {
        this.acceptTime = acceptTime;
    }

    /** 
     * Get the 'ModificationSign' element value. Признак того, что средства идентификации нарушены
     * 
     * @return value
     */
    public String getModificationSign() {
        return modificationSign;
    }

    /** 
     * Set the 'ModificationSign' element value. Признак того, что средства идентификации нарушены
     * 
     * @param modificationSign
     */
    public void setModificationSign(String modificationSign) {
        this.modificationSign = modificationSign;
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
     * Get the 'IdentifModification' element value. Нарушение средств идентификации
     * 
     * @return value
     */
    public IdentifModificationType getIdentifModification() {
        return identifModification;
    }

    /** 
     * Set the 'IdentifModification' element value. Нарушение средств идентификации
     * 
     * @param identifModification
     */
    public void setIdentifModification(
            IdentifModificationType identifModification) {
        this.identifModification = identifModification;
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
