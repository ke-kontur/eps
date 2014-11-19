
package ru.acs.fts.schemas.album;

/** 
 * Платеж
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:ExchangeDocuments:PayerReceipt:5.4.3" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PayingType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="PaymentModeCode"/>
 *     &lt;xs:element type="xs:string" name="Amount"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PayingType
{
    private String paymentModeCode;
    private String amount;

    /** 
     * Get the 'PaymentModeCode' element value. Код вида таможенного платежа
     * 
     * @return value
     */
    public String getPaymentModeCode() {
        return paymentModeCode;
    }

    /** 
     * Set the 'PaymentModeCode' element value. Код вида таможенного платежа
     * 
     * @param paymentModeCode
     */
    public void setPaymentModeCode(String paymentModeCode) {
        this.paymentModeCode = paymentModeCode;
    }

    /** 
     * Get the 'Amount' element value. Сумма, подлежащая уплате
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. Сумма, подлежащая уплате
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }
}
