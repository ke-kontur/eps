
package ru.acs.fts.schemas.album.airshoppingwaybill;

/** 
 * ������ ������ �����
 */
public class RateListCurrencyType
{
    private String currencyName;
    private String currency;
    private String currencyRate;

    /** 
     * Get the 'CurrencyName' element value. ������������ ������
     * 
     * @return value
     */
    public String getCurrencyName() {
        return currencyName;
    }

    /** 
     * Set the 'CurrencyName' element value. ������������ ������
     * 
     * @param currencyName
     */
    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    /** 
     * Get the 'Currency' element value. ������
     * 
     * @return value
     */
    public String getCurrency() {
        return currency;
    }

    /** 
     * Set the 'Currency' element value. ������
     * 
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /** 
     * Get the 'CurrencyRate' element value. ���� ������
     * 
     * @return value
     */
    public String getCurrencyRate() {
        return currencyRate;
    }

    /** 
     * Set the 'CurrencyRate' element value. ���� ������
     * 
     * @param currencyRate
     */
    public void setCurrencyRate(String currencyRate) {
        this.currencyRate = currencyRate;
    }
}
