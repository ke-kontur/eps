
package ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust;

/** 
 * �������� � ��������� � ������
 */
public class TreatmentCurrencyCostType
{
    private String currencyCost;
    private String currencyCode;
    private String currencyRate;

    /** 
     * Get the 'CurrencyCost' element value. ���������  ������ � ������
     * 
     * @return value
     */
    public String getCurrencyCost() {
        return currencyCost;
    }

    /** 
     * Set the 'CurrencyCost' element value. ���������  ������ � ������
     * 
     * @param currencyCost
     */
    public void setCurrencyCost(String currencyCost) {
        this.currencyCost = currencyCost;
    }

    /** 
     * Get the 'CurrencyCode' element value. ��������� ��� ������
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. ��������� ��� ������
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
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
