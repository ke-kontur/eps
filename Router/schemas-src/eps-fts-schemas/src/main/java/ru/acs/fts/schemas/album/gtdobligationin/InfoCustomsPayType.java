
package ru.acs.fts.schemas.album.gtdobligationin;

/** 
 * Сведения об обеспечении таможенных платежей (заполняется, если произведена уплата таможенных   платежей  или требуется  обеспечение уплаты причитающихся таможенных платежей, в ином случае - не заполняется)
 */
public class InfoCustomsPayType
{
    private String executeAssure;
    private String paymenSecuring;
    private String paymentSum;

    /** 
     * Get the 'ExecuteAssure' element value. Уплата причитающихся таможенных платежей произведена/обеспечена. Если значение 1  - произведена, 0 - обеспечена
     * 
     * @return value
     */
    public String getExecuteAssure() {
        return executeAssure;
    }

    /** 
     * Set the 'ExecuteAssure' element value. Уплата причитающихся таможенных платежей произведена/обеспечена. Если значение 1  - произведена, 0 - обеспечена
     * 
     * @param executeAssure
     */
    public void setExecuteAssure(String executeAssure) {
        this.executeAssure = executeAssure;
    }

    /** 
     * Get the 'PaymenSecuring' element value. Подтверждающие уплату/ обеспечение уплаты   причитающихся таможенных платежей документы прилагаются. Если значение 1 -   уплату, 0 - обеспечение
     * 
     * @return value
     */
    public String getPaymenSecuring() {
        return paymenSecuring;
    }

    /** 
     * Set the 'PaymenSecuring' element value. Подтверждающие уплату/ обеспечение уплаты   причитающихся таможенных платежей документы прилагаются. Если значение 1 -   уплату, 0 - обеспечение
     * 
     * @param paymenSecuring
     */
    public void setPaymenSecuring(String paymenSecuring) {
        this.paymenSecuring = paymenSecuring;
    }

    /** 
     * Get the 'PaymentSum' element value. Сумма
     * 
     * @return value
     */
    public String getPaymentSum() {
        return paymentSum;
    }

    /** 
     * Set the 'PaymentSum' element value. Сумма
     * 
     * @param paymentSum
     */
    public void setPaymentSum(String paymentSum) {
        this.paymentSum = paymentSum;
    }
}
