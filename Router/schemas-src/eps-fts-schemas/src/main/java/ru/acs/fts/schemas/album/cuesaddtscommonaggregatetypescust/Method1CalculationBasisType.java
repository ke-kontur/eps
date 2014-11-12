
package ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust;

/** 
 * Основа расчета таможенной стоимости по методу 1. Гр. А (11, 12)
 */
public class Method1CalculationBasisType
{
    private String dealCurrencyAmount;
    private String dealCurrencyCode;
    private String dealNationalAmount;
    private String dealCurrencyRate;
    private String currencyQuantity;
    private String indirectNationalPayment;
    private String indirectCurrencyCode;
    private String indirectCurrencyRate;
    private String indirectCurrencyQuantity;
    private String basisNationalAmount;

    /** 
     * Get the 'DealCurrencyAmount' element value. Цена, фактически уплаченная или подлежащая уплате в валюте счета. гр11a
     * 
     * @return value
     */
    public String getDealCurrencyAmount() {
        return dealCurrencyAmount;
    }

    /** 
     * Set the 'DealCurrencyAmount' element value. Цена, фактически уплаченная или подлежащая уплате в валюте счета. гр11a
     * 
     * @param dealCurrencyAmount
     */
    public void setDealCurrencyAmount(String dealCurrencyAmount) {
        this.dealCurrencyAmount = dealCurrencyAmount;
    }

    /** 
     * Get the 'DealCurrencyCode' element value. Трехзначный буквенный код валюты счета, в соответствии с классификатором валют 
     * 
     * @return value
     */
    public String getDealCurrencyCode() {
        return dealCurrencyCode;
    }

    /** 
     * Set the 'DealCurrencyCode' element value. Трехзначный буквенный код валюты счета, в соответствии с классификатором валют 
     * 
     * @param dealCurrencyCode
     */
    public void setDealCurrencyCode(String dealCurrencyCode) {
        this.dealCurrencyCode = dealCurrencyCode;
    }

    /** 
     * Get the 'DealNationalAmount' element value. Цена сделки в национальной валюте
     * 
     * @return value
     */
    public String getDealNationalAmount() {
        return dealNationalAmount;
    }

    /** 
     * Set the 'DealNationalAmount' element value. Цена сделки в национальной валюте
     * 
     * @param dealNationalAmount
     */
    public void setDealNationalAmount(String dealNationalAmount) {
        this.dealNationalAmount = dealNationalAmount;
    }

    /** 
     * Get the 'DealCurrencyRate' element value. Курс пересчета
     * 
     * @return value
     */
    public String getDealCurrencyRate() {
        return dealCurrencyRate;
    }

    /** 
     * Set the 'DealCurrencyRate' element value. Курс пересчета
     * 
     * @param dealCurrencyRate
     */
    public void setDealCurrencyRate(String dealCurrencyRate) {
        this.dealCurrencyRate = dealCurrencyRate;
    }

    /** 
     * Get the 'CurrencyQuantity' element value. Количество единиц валюты, для которой указан курс для РБ
     * 
     * @return value
     */
    public String getCurrencyQuantity() {
        return currencyQuantity;
    }

    /** 
     * Set the 'CurrencyQuantity' element value. Количество единиц валюты, для которой указан курс для РБ
     * 
     * @param currencyQuantity
     */
    public void setCurrencyQuantity(String currencyQuantity) {
        this.currencyQuantity = currencyQuantity;
    }

    /** 
     * Get the 'IndirectNationalPayment' element value. Косвенные платежи в национальной валюте. 11б
     * 
     * @return value
     */
    public String getIndirectNationalPayment() {
        return indirectNationalPayment;
    }

    /** 
     * Set the 'IndirectNationalPayment' element value. Косвенные платежи в национальной валюте. 11б
     * 
     * @param indirectNationalPayment
     */
    public void setIndirectNationalPayment(String indirectNationalPayment) {
        this.indirectNationalPayment = indirectNationalPayment;
    }

    /** 
     * Get the 'IndirectCurrencyCode' element value. Трехзначный буквенный код валюты косвенных платежей, в соответствии с классификатором валют
     * 
     * @return value
     */
    public String getIndirectCurrencyCode() {
        return indirectCurrencyCode;
    }

    /** 
     * Set the 'IndirectCurrencyCode' element value. Трехзначный буквенный код валюты косвенных платежей, в соответствии с классификатором валют
     * 
     * @param indirectCurrencyCode
     */
    public void setIndirectCurrencyCode(String indirectCurrencyCode) {
        this.indirectCurrencyCode = indirectCurrencyCode;
    }

    /** 
     * Get the 'IndirectCurrencyRate' element value. Курс пересчета
     * 
     * @return value
     */
    public String getIndirectCurrencyRate() {
        return indirectCurrencyRate;
    }

    /** 
     * Set the 'IndirectCurrencyRate' element value. Курс пересчета
     * 
     * @param indirectCurrencyRate
     */
    public void setIndirectCurrencyRate(String indirectCurrencyRate) {
        this.indirectCurrencyRate = indirectCurrencyRate;
    }

    /** 
     * Get the 'IndirectCurrencyQuantity' element value. Количество единиц валюты, для которой указан курс для РБ
     * 
     * @return value
     */
    public String getIndirectCurrencyQuantity() {
        return indirectCurrencyQuantity;
    }

    /** 
     * Set the 'IndirectCurrencyQuantity' element value. Количество единиц валюты, для которой указан курс для РБ
     * 
     * @param indirectCurrencyQuantity
     */
    public void setIndirectCurrencyQuantity(String indirectCurrencyQuantity) {
        this.indirectCurrencyQuantity = indirectCurrencyQuantity;
    }

    /** 
     * Get the 'BasisNationalAmount' element value. Итого гр. А в национальной валюте. гр 12
     * 
     * @return value
     */
    public String getBasisNationalAmount() {
        return basisNationalAmount;
    }

    /** 
     * Set the 'BasisNationalAmount' element value. Итого гр. А в национальной валюте. гр 12
     * 
     * @param basisNationalAmount
     */
    public void setBasisNationalAmount(String basisNationalAmount) {
        this.basisNationalAmount = basisNationalAmount;
    }
}
