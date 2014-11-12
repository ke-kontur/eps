
package ru.acs.fts.schemas.album.actregistrationmining;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ����������� � ���� ������
 */
public class RegistrationDatabaseType
{
    private String transferMethod;
    private LocalDate dateTransfer;
    private String timeTransfer;
    private PersonSignatureType personSignature;

    /** 
     * Get the 'TransferMethod' element value. ������ ��������
     * 
     * @return value
     */
    public String getTransferMethod() {
        return transferMethod;
    }

    /** 
     * Set the 'TransferMethod' element value. ������ ��������
     * 
     * @param transferMethod
     */
    public void setTransferMethod(String transferMethod) {
        this.transferMethod = transferMethod;
    }

    /** 
     * Get the 'DateTransfer' element value. ���� ��������
     * 
     * @return value
     */
    public LocalDate getDateTransfer() {
        return dateTransfer;
    }

    /** 
     * Set the 'DateTransfer' element value. ���� ��������
     * 
     * @param dateTransfer
     */
    public void setDateTransfer(LocalDate dateTransfer) {
        this.dateTransfer = dateTransfer;
    }

    /** 
     * Get the 'TimeTransfer' element value. ����� ��������
     * 
     * @return value
     */
    public String getTimeTransfer() {
        return timeTransfer;
    }

    /** 
     * Set the 'TimeTransfer' element value. ����� ��������
     * 
     * @param timeTransfer
     */
    public void setTimeTransfer(String timeTransfer) {
        this.timeTransfer = timeTransfer;
    }

    /** 
     * Get the 'PersonSignature' element value. �������
     * 
     * @return value
     */
    public PersonSignatureType getPersonSignature() {
        return personSignature;
    }

    /** 
     * Set the 'PersonSignature' element value. �������
     * 
     * @param personSignature
     */
    public void setPersonSignature(PersonSignatureType personSignature) {
        this.personSignature = personSignature;
    }
}
