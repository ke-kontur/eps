
package ru.acs.fts.schemas.album.oez_exportpassexpired;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;

/** 
 * Уведомление об аннулировании разрешения
 */
public class OEZExportPassExpiredType extends BaseDocType
{
    private LocalDate dateEnd;
    private PassRegNumberType passRegNumber;
    private CustomsPersonType customsPerson;
    private String documentModeID;

    /** 
     * Get the 'DateEnd' element value. Дата аннулирования
     * 
     * @return value
     */
    public LocalDate getDateEnd() {
        return dateEnd;
    }

    /** 
     * Set the 'DateEnd' element value. Дата аннулирования
     * 
     * @param dateEnd
     */
    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    /** 
     * Get the 'PassRegNumber' element value. Регистрационный номер разрешения
     * 
     * @return value
     */
    public PassRegNumberType getPassRegNumber() {
        return passRegNumber;
    }

    /** 
     * Set the 'PassRegNumber' element value. Регистрационный номер разрешения
     * 
     * @param passRegNumber
     */
    public void setPassRegNumber(PassRegNumberType passRegNumber) {
        this.passRegNumber = passRegNumber;
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
