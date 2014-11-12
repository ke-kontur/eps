
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * Отсрочка платежей гр.48
 */
public class CUDelayPaymentsType
{
    private String paymentModeCode;
    private String delayDocumentNumber;
    private LocalDate delayDocumentDate;
    private LocalDate delayDate;

    /** 
     * Get the 'PaymentModeCode' element value. Код вида таможенного платежа по классификатору видов налогов, сборов и иных платежей, взимание которых возложено на таможенные органы
     * 
     * @return value
     */
    public String getPaymentModeCode() {
        return paymentModeCode;
    }

    /** 
     * Set the 'PaymentModeCode' element value. Код вида таможенного платежа по классификатору видов налогов, сборов и иных платежей, взимание которых возложено на таможенные органы
     * 
     * @param paymentModeCode
     */
    public void setPaymentModeCode(String paymentModeCode) {
        this.paymentModeCode = paymentModeCode;
    }

    /** 
     * Get the 'DelayDocumentNumber' element value. Номер документа, на основании которого предоставлена отсрочка 
     * 
     * @return value
     */
    public String getDelayDocumentNumber() {
        return delayDocumentNumber;
    }

    /** 
     * Set the 'DelayDocumentNumber' element value. Номер документа, на основании которого предоставлена отсрочка 
     * 
     * @param delayDocumentNumber
     */
    public void setDelayDocumentNumber(String delayDocumentNumber) {
        this.delayDocumentNumber = delayDocumentNumber;
    }

    /** 
     * Get the 'DelayDocumentDate' element value. Дата документа, на основании которого предоставлена отсрочка 
     * 
     * @return value
     */
    public LocalDate getDelayDocumentDate() {
        return delayDocumentDate;
    }

    /** 
     * Set the 'DelayDocumentDate' element value. Дата документа, на основании которого предоставлена отсрочка 
     * 
     * @param delayDocumentDate
     */
    public void setDelayDocumentDate(LocalDate delayDocumentDate) {
        this.delayDocumentDate = delayDocumentDate;
    }

    /** 
     * Get the 'DelayDate' element value. Дата уплаты
     * 
     * @return value
     */
    public LocalDate getDelayDate() {
        return delayDate;
    }

    /** 
     * Set the 'DelayDate' element value. Дата уплаты
     * 
     * @param delayDate
     */
    public void setDelayDate(LocalDate delayDate) {
        this.delayDate = delayDate;
    }
}
