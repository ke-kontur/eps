
package ru.acs.fts.schemas.album.tpo;

/** 
 * ������ �������
 */
public class PaymentCurrencyType
{
    private String currencyCode;
    private String currencyDollarRate;
    private String currencyEuroRate;
    private String currencyRate;

    /** 
     * Get the 'CurrencyCode' element value. ��� ������ �������
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. ��� ������ �������
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'CurrencyDollarRate' element value. ���� ������� ��� � ������ ����������� - ����� ��
     * 
     * @return value
     */
    public String getCurrencyDollarRate() {
        return currencyDollarRate;
    }

    /** 
     * Set the 'CurrencyDollarRate' element value. ���� ������� ��� � ������ ����������� - ����� ��
     * 
     * @param currencyDollarRate
     */
    public void setCurrencyDollarRate(String currencyDollarRate) {
        this.currencyDollarRate = currencyDollarRate;
    }

    /** 
     * Get the 'CurrencyEuroRate' element value. ���� ���� � ������ ����������� - ����� ��
     * 
     * @return value
     */
    public String getCurrencyEuroRate() {
        return currencyEuroRate;
    }

    /** 
     * Set the 'CurrencyEuroRate' element value. ���� ���� � ������ ����������� - ����� ��
     * 
     * @param currencyEuroRate
     */
    public void setCurrencyEuroRate(String currencyEuroRate) {
        this.currencyEuroRate = currencyEuroRate;
    }

    /** 
     * Get the 'CurrencyRate' element value. ���� ������ ������� � ������ ����������� - ����� ��
     * 
     * @return value
     */
    public String getCurrencyRate() {
        return currencyRate;
    }

    /** 
     * Set the 'CurrencyRate' element value. ���� ������ ������� � ������ ����������� - ����� ��
     * 
     * @param currencyRate
     */
    public void setCurrencyRate(String currencyRate) {
        this.currencyRate = currencyRate;
    }
}
