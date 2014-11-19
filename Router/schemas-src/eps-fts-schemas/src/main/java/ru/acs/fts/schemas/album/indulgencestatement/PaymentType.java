
package ru.acs.fts.schemas.album.indulgencestatement;

import org.joda.time.LocalDate;

/** 
 * Сведения о платежах
 */
public class PaymentType
{
    private String customsPaymentModeCode;
    private LocalDate dateInf;
    private String amount;
    private String currencyCode;
    private String securityText;

    /** 
     * Get the 'CustomsPaymentModeCode' element value. Вид платежа
     * 
     * @return value
     */
    public String getCustomsPaymentModeCode() {
        return customsPaymentModeCode;
    }

    /** 
     * Set the 'CustomsPaymentModeCode' element value. Вид платежа
     * 
     * @param customsPaymentModeCode
     */
    public void setCustomsPaymentModeCode(String customsPaymentModeCode) {
        this.customsPaymentModeCode = customsPaymentModeCode;
    }

    /** 
     * Get the 'DateInf' element value. Дата, до которой запрашивается отсрочка
     * 
     * @return value
     */
    public LocalDate getDateInf() {
        return dateInf;
    }

    /** 
     * Set the 'DateInf' element value. Дата, до которой запрашивается отсрочка
     * 
     * @param dateInf
     */
    public void setDateInf(LocalDate dateInf) {
        this.dateInf = dateInf;
    }

    /** 
     * Get the 'Amount' element value. Сумма, по которой запрашивается отсрочка (в валюте цены по контракту)
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. Сумма, по которой запрашивается отсрочка (в валюте цены по контракту)
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'CurrencyCode' element value. Код валюты платежа
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Код валюты платежа
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'SecurityText' element value. Форма обеспечения уплаты таможенных платежей по предоставленным отсрочкам
     * 
     * @return value
     */
    public String getSecurityText() {
        return securityText;
    }

    /** 
     * Set the 'SecurityText' element value. Форма обеспечения уплаты таможенных платежей по предоставленным отсрочкам
     * 
     * @param securityText
     */
    public void setSecurityText(String securityText) {
        this.securityText = securityText;
    }
}
