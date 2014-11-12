
package ru.acs.fts.schemas.album.movementconfirmation;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Уведомление о фактическом ввозе/вывозе товара
 */
public class MovementConfirmationType extends BaseDocType
{
    private String docSign;
    private LocalDate movementDate;
    private String comments;
    private RegistrationNumberType registrationNumber;
    private String documentModeID;

    /** 
     * Get the 'DocSign' element value. Признак уведомления: 0 - о ввозе; 1 - об убытии товаров
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. Признак уведомления: 0 - о ввозе; 1 - об убытии товаров
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'MovementDate' element value. Дата фактического ввоза/вывоза товаров
     * 
     * @return value
     */
    public LocalDate getMovementDate() {
        return movementDate;
    }

    /** 
     * Set the 'MovementDate' element value. Дата фактического ввоза/вывоза товаров
     * 
     * @param movementDate
     */
    public void setMovementDate(LocalDate movementDate) {
        this.movementDate = movementDate;
    }

    /** 
     * Get the 'Comments' element value. Примечание
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. Примечание
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /** 
     * Get the 'RegistrationNumber' element value. Регистрационный номер уведомления о ввозе/вывозе
     * 
     * @return value
     */
    public RegistrationNumberType getRegistrationNumber() {
        return registrationNumber;
    }

    /** 
     * Set the 'RegistrationNumber' element value. Регистрационный номер уведомления о ввозе/вывозе
     * 
     * @param registrationNumber
     */
    public void setRegistrationNumber(RegistrationNumberType registrationNumber) {
        this.registrationNumber = registrationNumber;
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
