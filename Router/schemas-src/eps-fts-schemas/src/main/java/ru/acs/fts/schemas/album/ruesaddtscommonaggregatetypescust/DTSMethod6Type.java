
package ru.acs.fts.schemas.album.ruesaddtscommonaggregatetypescust;

/** 
 * Резервный метод определения таможенной стоимости.
 */
public class DTSMethod6Type
{
    private String valueBasisCustAmountRUR;
    private String valueBasisCustAmount;
    private String currencyRate;
    private String currencyCode;
    private Method6CalculationType method6Calculation;

    /** 
     * Get the 'ValueBasisCustAmountRUR' element value. Величина основы для определения таможенной стоимости  в рублях.гр 11
     * 
     * @return value
     */
    public String getValueBasisCustAmountRUR() {
        return valueBasisCustAmountRUR;
    }

    /** 
     * Set the 'ValueBasisCustAmountRUR' element value. Величина основы для определения таможенной стоимости  в рублях.гр 11
     * 
     * @param valueBasisCustAmountRUR
     */
    public void setValueBasisCustAmountRUR(String valueBasisCustAmountRUR) {
        this.valueBasisCustAmountRUR = valueBasisCustAmountRUR;
    }

    /** 
     * Get the 'ValueBasisCustAmount' element value. Величина основы для определения таможенной стоимости в валюте. гр 11
     * 
     * @return value
     */
    public String getValueBasisCustAmount() {
        return valueBasisCustAmount;
    }

    /** 
     * Set the 'ValueBasisCustAmount' element value. Величина основы для определения таможенной стоимости в валюте. гр 11
     * 
     * @param valueBasisCustAmount
     */
    public void setValueBasisCustAmount(String valueBasisCustAmount) {
        this.valueBasisCustAmount = valueBasisCustAmount;
    }

    /** 
     * Get the 'CurrencyRate' element value. Курс пересчета
     * 
     * @return value
     */
    public String getCurrencyRate() {
        return currencyRate;
    }

    /** 
     * Set the 'CurrencyRate' element value. Курс пересчета
     * 
     * @param currencyRate
     */
    public void setCurrencyRate(String currencyRate) {
        this.currencyRate = currencyRate;
    }

    /** 
     * Get the 'CurrencyCode' element value. Код валюты
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Код валюты
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'Method6Calculation' element value. Расчет  стоимости.
     * 
     * @return value
     */
    public Method6CalculationType getMethod6Calculation() {
        return method6Calculation;
    }

    /** 
     * Set the 'Method6Calculation' element value. Расчет  стоимости.
     * 
     * @param method6Calculation
     */
    public void setMethod6Calculation(Method6CalculationType method6Calculation) {
        this.method6Calculation = method6Calculation;
    }
}
