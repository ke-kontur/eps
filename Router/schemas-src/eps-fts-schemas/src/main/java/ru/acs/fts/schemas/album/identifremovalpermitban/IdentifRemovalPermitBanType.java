
package ru.acs.fts.schemas.album.identifremovalpermitban;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;

/** 
 * Разрешение/Запрет на снятие средств идентификации
 */
public class IdentifRemovalPermitBanType extends BaseDocType
{
    private LocalDate date;
    private String time;
    private String decision;
    private String documentNumber;
    private String comment;
    private CUOrganizationType economicOperator;
    private CustomsPersonType customsOfficer;
    private String documentModeID;

    /** 
     * Get the 'Date' element value. Дата принятия решения
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. Дата принятия решения
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'Time' element value. Время принятия решения
     * 
     * @return value
     */
    public String getTime() {
        return time;
    }

    /** 
     * Set the 'Time' element value. Время принятия решения
     * 
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /** 
     * Get the 'Decision' element value. Принятое решение по снятию средств идентификации: 0 - запрет; 1 - разрешение
     * 
     * @return value
     */
    public String getDecision() {
        return decision;
    }

    /** 
     * Set the 'Decision' element value. Принятое решение по снятию средств идентификации: 0 - запрет; 1 - разрешение
     * 
     * @param decision
     */
    public void setDecision(String decision) {
        this.decision = decision;
    }

    /** 
     * Get the 'DocumentNumber' element value. Номер обязательства о подаче таможенной декларации/Номер предварительной декларации на товары
     * 
     * @return value
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /** 
     * Set the 'DocumentNumber' element value. Номер обязательства о подаче таможенной декларации/Номер предварительной декларации на товары
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /** 
     * Get the 'Comment' element value. Комментарии по принятому решению
     * 
     * @return value
     */
    public String getComment() {
        return comment;
    }

    /** 
     * Set the 'Comment' element value. Комментарии по принятому решению
     * 
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
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
     * Get the 'CustomsOfficer' element value. Должностное лицо таможенного органа
     * 
     * @return value
     */
    public CustomsPersonType getCustomsOfficer() {
        return customsOfficer;
    }

    /** 
     * Set the 'CustomsOfficer' element value. Должностное лицо таможенного органа
     * 
     * @param customsOfficer
     */
    public void setCustomsOfficer(CustomsPersonType customsOfficer) {
        this.customsOfficer = customsOfficer;
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
