
package ru.acs.fts.schemas.album;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Платежный документ
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:ExchangeDocuments:PaymentConfirmDocs:5.4.5" xmlns:ns1="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PaymentDocumentType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:DocumentBaseType">
 *       &lt;xs:sequence>
 *         &lt;xs:element type="xs:string" name="Amount"/>
 *         &lt;xs:element type="xs:string" name="TotalAmount"/>
 *         &lt;xs:element type="xs:string" name="PaymentMethodCode" minOccurs="0"/>
 *         &lt;xs:element type="xs:string" name="CurrencyCode" minOccurs="0"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PaymentDocumentType extends DocumentBaseType
{
    private String amount;
    private String totalAmount;
    private String paymentMethodCode;
    private String currencyCode;

    /** 
     * Get the 'Amount' element value. Сумма подлежащих к уплате платежей
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. Сумма подлежащих к уплате платежей
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'TotalAmount' element value. Исходная сумма платежного документа
     * 
     * @return value
     */
    public String getTotalAmount() {
        return totalAmount;
    }

    /** 
     * Set the 'TotalAmount' element value. Исходная сумма платежного документа
     * 
     * @param totalAmount
     */
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    /** 
     * Get the 'PaymentMethodCode' element value. Способ платежа в соответствии с классификатором способов и особенностей уплаты таможенных и иных платежей
     * 
     * @return value
     */
    public String getPaymentMethodCode() {
        return paymentMethodCode;
    }

    /** 
     * Set the 'PaymentMethodCode' element value. Способ платежа в соответствии с классификатором способов и особенностей уплаты таможенных и иных платежей
     * 
     * @param paymentMethodCode
     */
    public void setPaymentMethodCode(String paymentMethodCode) {
        this.paymentMethodCode = paymentMethodCode;
    }

    /** 
     * Get the 'CurrencyCode' element value. Код  валюты
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Код  валюты
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
