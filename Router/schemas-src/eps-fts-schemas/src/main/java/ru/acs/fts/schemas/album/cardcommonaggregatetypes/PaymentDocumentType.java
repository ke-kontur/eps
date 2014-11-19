
package ru.acs.fts.schemas.album.cardcommonaggregatetypes;

import org.joda.time.LocalDate;

/** 
 * Платёжный документ
 */
public class PaymentDocumentType
{
    private String paymentModeCode;
    private String paymentDocumentNumber;
    private LocalDate paymentDocumentDate;
    private String totalAmount;
    private String writtenoffAmount;
    private String paymentCurrencyCode;
    private String writtenoffAmountCurrencyCode;
    private String returnSign;
    private String INNID;
    private String KPPCode;

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
     * Get the 'PaymentDocumentNumber' element value. Номер платежного документа
     * 
     * @return value
     */
    public String getPaymentDocumentNumber() {
        return paymentDocumentNumber;
    }

    /** 
     * Set the 'PaymentDocumentNumber' element value. Номер платежного документа
     * 
     * @param paymentDocumentNumber
     */
    public void setPaymentDocumentNumber(String paymentDocumentNumber) {
        this.paymentDocumentNumber = paymentDocumentNumber;
    }

    /** 
     * Get the 'PaymentDocumentDate' element value. Дата платежного документа
     * 
     * @return value
     */
    public LocalDate getPaymentDocumentDate() {
        return paymentDocumentDate;
    }

    /** 
     * Set the 'PaymentDocumentDate' element value. Дата платежного документа
     * 
     * @param paymentDocumentDate
     */
    public void setPaymentDocumentDate(LocalDate paymentDocumentDate) {
        this.paymentDocumentDate = paymentDocumentDate;
    }

    /** 
     * Get the 'TotalAmount' element value. Общая сумма по платежному документу
     * 
     * @return value
     */
    public String getTotalAmount() {
        return totalAmount;
    }

    /** 
     * Set the 'TotalAmount' element value. Общая сумма по платежному документу
     * 
     * @param totalAmount
     */
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    /** 
     * Get the 'WrittenoffAmount' element value. Списываемая сумма по платежному документу
     * 
     * @return value
     */
    public String getWrittenoffAmount() {
        return writtenoffAmount;
    }

    /** 
     * Set the 'WrittenoffAmount' element value. Списываемая сумма по платежному документу
     * 
     * @param writtenoffAmount
     */
    public void setWrittenoffAmount(String writtenoffAmount) {
        this.writtenoffAmount = writtenoffAmount;
    }

    /** 
     * Get the 'PaymentCurrencyCode' element value. Цифровой код валюты суммы платежа / обеспечения
     * 
     * @return value
     */
    public String getPaymentCurrencyCode() {
        return paymentCurrencyCode;
    }

    /** 
     * Set the 'PaymentCurrencyCode' element value. Цифровой код валюты суммы платежа / обеспечения
     * 
     * @param paymentCurrencyCode
     */
    public void setPaymentCurrencyCode(String paymentCurrencyCode) {
        this.paymentCurrencyCode = paymentCurrencyCode;
    }

    /** 
     * Get the 'WrittenoffAmountCurrencyCode' element value. Код валюты списываемой суммы по платежному документу
     * 
     * @return value
     */
    public String getWrittenoffAmountCurrencyCode() {
        return writtenoffAmountCurrencyCode;
    }

    /** 
     * Set the 'WrittenoffAmountCurrencyCode' element value. Код валюты списываемой суммы по платежному документу
     * 
     * @param writtenoffAmountCurrencyCode
     */
    public void setWrittenoffAmountCurrencyCode(
            String writtenoffAmountCurrencyCode) {
        this.writtenoffAmountCurrencyCode = writtenoffAmountCurrencyCode;
    }

    /** 
     * Get the 'ReturnSign' element value. Признак возврата денежных средств
     * 
     * @return value
     */
    public String getReturnSign() {
        return returnSign;
    }

    /** 
     * Set the 'ReturnSign' element value. Признак возврата денежных средств
     * 
     * @param returnSign
     */
    public void setReturnSign(String returnSign) {
        this.returnSign = returnSign;
    }

    /** 
     * Get the 'INNID' element value. Индивидуальный номер налогоплательщика плательщика
     * 
     * @return value
     */
    public String getINNID() {
        return INNID;
    }

    /** 
     * Set the 'INNID' element value. Индивидуальный номер налогоплательщика плательщика
     * 
     * @param INNID
     */
    public void setINNID(String INNID) {
        this.INNID = INNID;
    }

    /** 
     * Get the 'KPPCode' element value. Код причины постановки на налоговый учет плательщика
     * 
     * @return value
     */
    public String getKPPCode() {
        return KPPCode;
    }

    /** 
     * Set the 'KPPCode' element value. Код причины постановки на налоговый учет плательщика
     * 
     * @param KPPCode
     */
    public void setKPPCode(String KPPCode) {
        this.KPPCode = KPPCode;
    }
}
