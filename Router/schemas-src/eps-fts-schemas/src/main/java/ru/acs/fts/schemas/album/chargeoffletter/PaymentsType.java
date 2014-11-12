
package ru.acs.fts.schemas.album.chargeoffletter;

import org.joda.time.LocalDate;

/** 
 * Платежи
 */
public class PaymentsType
{
    private String paymentModeCode;
    private String paymentAmount;
    private String paymentOrderNumber;
    private LocalDate paymentOrderDate;

    /** 
     * Get the 'PaymentModeCode' element value. Код вида платежа 
     * 
     * @return value
     */
    public String getPaymentModeCode() {
        return paymentModeCode;
    }

    /** 
     * Set the 'PaymentModeCode' element value. Код вида платежа 
     * 
     * @param paymentModeCode
     */
    public void setPaymentModeCode(String paymentModeCode) {
        this.paymentModeCode = paymentModeCode;
    }

    /** 
     * Get the 'PaymentAmount' element value. Сумма платежа
     * 
     * @return value
     */
    public String getPaymentAmount() {
        return paymentAmount;
    }

    /** 
     * Set the 'PaymentAmount' element value. Сумма платежа
     * 
     * @param paymentAmount
     */
    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    /** 
     * Get the 'PaymentOrderNumber' element value. Номер платежного поручения
     * 
     * @return value
     */
    public String getPaymentOrderNumber() {
        return paymentOrderNumber;
    }

    /** 
     * Set the 'PaymentOrderNumber' element value. Номер платежного поручения
     * 
     * @param paymentOrderNumber
     */
    public void setPaymentOrderNumber(String paymentOrderNumber) {
        this.paymentOrderNumber = paymentOrderNumber;
    }

    /** 
     * Get the 'PaymentOrderDate' element value. Дата платежного поручения
     * 
     * @return value
     */
    public LocalDate getPaymentOrderDate() {
        return paymentOrderDate;
    }

    /** 
     * Set the 'PaymentOrderDate' element value. Дата платежного поручения
     * 
     * @param paymentOrderDate
     */
    public void setPaymentOrderDate(LocalDate paymentOrderDate) {
        this.paymentOrderDate = paymentOrderDate;
    }
}
