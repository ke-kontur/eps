
package ru.acs.fts.schemas.album.actregistrationmining;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Регистрация в базе данных
 */
public class RegistrationDatabaseType
{
    private String transferMethod;
    private LocalDate dateTransfer;
    private String timeTransfer;
    private PersonSignatureType personSignature;

    /** 
     * Get the 'TransferMethod' element value. Способ передачи
     * 
     * @return value
     */
    public String getTransferMethod() {
        return transferMethod;
    }

    /** 
     * Set the 'TransferMethod' element value. Способ передачи
     * 
     * @param transferMethod
     */
    public void setTransferMethod(String transferMethod) {
        this.transferMethod = transferMethod;
    }

    /** 
     * Get the 'DateTransfer' element value. Дата передачи
     * 
     * @return value
     */
    public LocalDate getDateTransfer() {
        return dateTransfer;
    }

    /** 
     * Set the 'DateTransfer' element value. Дата передачи
     * 
     * @param dateTransfer
     */
    public void setDateTransfer(LocalDate dateTransfer) {
        this.dateTransfer = dateTransfer;
    }

    /** 
     * Get the 'TimeTransfer' element value. Время передачи
     * 
     * @return value
     */
    public String getTimeTransfer() {
        return timeTransfer;
    }

    /** 
     * Set the 'TimeTransfer' element value. Время передачи
     * 
     * @param timeTransfer
     */
    public void setTimeTransfer(String timeTransfer) {
        this.timeTransfer = timeTransfer;
    }

    /** 
     * Get the 'PersonSignature' element value. Подпись
     * 
     * @return value
     */
    public PersonSignatureType getPersonSignature() {
        return personSignature;
    }

    /** 
     * Set the 'PersonSignature' element value. Подпись
     * 
     * @param personSignature
     */
    public void setPersonSignature(PersonSignatureType personSignature) {
        this.personSignature = personSignature;
    }
}
