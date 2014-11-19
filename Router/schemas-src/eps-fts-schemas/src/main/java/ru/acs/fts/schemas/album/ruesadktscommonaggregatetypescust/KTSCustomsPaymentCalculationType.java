
package ru.acs.fts.schemas.album.ruesadktscommonaggregatetypescust;

import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.CustomsPaymentCalculationType;

/** 
 * КТС. Исчисление таможенных платежей.
 */
public class KTSCustomsPaymentCalculationType
        extends
            CustomsPaymentCalculationType
{
    private String precedingPaymentAmount;
    private String changeAmount;
    private String precedingPaymentCurrencyCode;

    /** 
     * Get the 'PrecedingPaymentAmount' element value. Предыдущая сумма платежа
     * 
     * @return value
     */
    public String getPrecedingPaymentAmount() {
        return precedingPaymentAmount;
    }

    /** 
     * Set the 'PrecedingPaymentAmount' element value. Предыдущая сумма платежа
     * 
     * @param precedingPaymentAmount
     */
    public void setPrecedingPaymentAmount(String precedingPaymentAmount) {
        this.precedingPaymentAmount = precedingPaymentAmount;
    }

    /** 
     * Get the 'ChangeAmount' element value. Изменение (в рублях)
     * 
     * @return value
     */
    public String getChangeAmount() {
        return changeAmount;
    }

    /** 
     * Set the 'ChangeAmount' element value. Изменение (в рублях)
     * 
     * @param changeAmount
     */
    public void setChangeAmount(String changeAmount) {
        this.changeAmount = changeAmount;
    }

    /** 
     * Get the 'PrecedingPaymentCurrencyCode' element value. Код валюты предыдущей суммы платежа
     * 
     * @return value
     */
    public String getPrecedingPaymentCurrencyCode() {
        return precedingPaymentCurrencyCode;
    }

    /** 
     * Set the 'PrecedingPaymentCurrencyCode' element value. Код валюты предыдущей суммы платежа
     * 
     * @param precedingPaymentCurrencyCode
     */
    public void setPrecedingPaymentCurrencyCode(
            String precedingPaymentCurrencyCode) {
        this.precedingPaymentCurrencyCode = precedingPaymentCurrencyCode;
    }
}
