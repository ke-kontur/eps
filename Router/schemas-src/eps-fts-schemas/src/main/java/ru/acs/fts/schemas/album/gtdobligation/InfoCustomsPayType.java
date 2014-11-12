
package ru.acs.fts.schemas.album.gtdobligation;

/** 
 * —ведени€ об обеспечении таможенных платежей (заполн€етс€, если произведена уплата таможенных   платежей  или требуетс€  обеспечение уплаты причитающихс€ таможенных платежей, в ином случае - не заполн€етс€)
 */
public class InfoCustomsPayType
{
    private String executeAssure;
    private String paymenSecuring;
    private String paymentSum;

    /** 
     * Get the 'ExecuteAssure' element value. ”плата причитающихс€ таможенных платежей произведена/обеспечена. ≈сли значение 1  - произведена, 0 - обеспечена
     * 
     * @return value
     */
    public String getExecuteAssure() {
        return executeAssure;
    }

    /** 
     * Set the 'ExecuteAssure' element value. ”плата причитающихс€ таможенных платежей произведена/обеспечена. ≈сли значение 1  - произведена, 0 - обеспечена
     * 
     * @param executeAssure
     */
    public void setExecuteAssure(String executeAssure) {
        this.executeAssure = executeAssure;
    }

    /** 
     * Get the 'PaymenSecuring' element value. ѕодтверждающие уплату/ обеспечение уплаты   причитающихс€ таможенных платежей документы прилагаютс€. ≈сли значение 1 -   уплату, 0 - обеспечение
     * 
     * @return value
     */
    public String getPaymenSecuring() {
        return paymenSecuring;
    }

    /** 
     * Set the 'PaymenSecuring' element value. ѕодтверждающие уплату/ обеспечение уплаты   причитающихс€ таможенных платежей документы прилагаютс€. ≈сли значение 1 -   уплату, 0 - обеспечение
     * 
     * @param paymenSecuring
     */
    public void setPaymenSecuring(String paymenSecuring) {
        this.paymenSecuring = paymenSecuring;
    }

    /** 
     * Get the 'PaymentSum' element value. —умма
     * 
     * @return value
     */
    public String getPaymentSum() {
        return paymentSum;
    }

    /** 
     * Set the 'PaymentSum' element value. —умма
     * 
     * @param paymentSum
     */
    public void setPaymentSum(String paymentSum) {
        this.paymentSum = paymentSum;
    }
}
