
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * Гарантия
 */
public class CUGuaranteeType
{
    private String paymentWayCode;
    private String amount;
    private String documentNumber;
    private LocalDate documentDate;
    private String UNP;
    private String BIC;

    /** 
     * Get the 'PaymentWayCode' element value. Код способов обеспечения уплаты в соответствии с классификатором способов обеспечения уплаты таможенных пошлин, налогов
     * 
     * @return value
     */
    public String getPaymentWayCode() {
        return paymentWayCode;
    }

    /** 
     * Set the 'PaymentWayCode' element value. Код способов обеспечения уплаты в соответствии с классификатором способов обеспечения уплаты таможенных пошлин, налогов
     * 
     * @param paymentWayCode
     */
    public void setPaymentWayCode(String paymentWayCode) {
        this.paymentWayCode = paymentWayCode;
    }

    /** 
     * Get the 'Amount' element value. Сумма
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. Сумма
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'DocumentNumber' element value. Номер документа
     * 
     * @return value
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /** 
     * Set the 'DocumentNumber' element value. Номер документа
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /** 
     * Get the 'DocumentDate' element value. Дата документа
     * 
     * @return value
     */
    public LocalDate getDocumentDate() {
        return documentDate;
    }

    /** 
     * Set the 'DocumentDate' element value. Дата документа
     * 
     * @param documentDate
     */
    public void setDocumentDate(LocalDate documentDate) {
        this.documentDate = documentDate;
    }

    /** 
     * Get the 'UNP' element value. Учетный номер плательщика (УНП)
     * 
     * @return value
     */
    public String getUNP() {
        return UNP;
    }

    /** 
     * Set the 'UNP' element value. Учетный номер плательщика (УНП)
     * 
     * @param UNP
     */
    public void setUNP(String UNP) {
        this.UNP = UNP;
    }

    /** 
     * Get the 'BIC' element value. Банковский идентификационный код или небанковский идентификационный код кредитно-финансовой организации
     * 
     * @return value
     */
    public String getBIC() {
        return BIC;
    }

    /** 
     * Set the 'BIC' element value. Банковский идентификационный код или небанковский идентификационный код кредитно-финансовой организации
     * 
     * @param BIC
     */
    public void setBIC(String BIC) {
        this.BIC = BIC;
    }
}
