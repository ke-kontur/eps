
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * �������� �� ���������� �������� ���� � ���������� ��������� ������� ���� �� ������ ��� ���� ��� ������� �� ��������� �����������.
 */
public class MarketPriceType
{
    private String value;
    private String valueMarketPrice;
    private String currencyMarketPrice;

    /** 
     * Get the 'Value' element value. ���� �������� ����: true ��� 1 - ��; false ��� 0 - ���
     * 
     * @return value
     */
    public String getValue() {
        return value;
    }

    /** 
     * Set the 'Value' element value. ���� �������� ����: true ��� 1 - ��; false ��� 0 - ���
     * 
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /** 
     * Get the 'ValueMarketPrice' element value. �������� ���� � ���������� ��������� ������� ���� �� ������ ��� ���� ��� ������� �� ��������� �����������(��������)
     * 
     * @return value
     */
    public String getValueMarketPrice() {
        return valueMarketPrice;
    }

    /** 
     * Set the 'ValueMarketPrice' element value. �������� ���� � ���������� ��������� ������� ���� �� ������ ��� ���� ��� ������� �� ��������� �����������(��������)
     * 
     * @param valueMarketPrice
     */
    public void setValueMarketPrice(String valueMarketPrice) {
        this.valueMarketPrice = valueMarketPrice;
    }

    /** 
     * Get the 'CurrencyMarketPrice' element value. ������ �������� ���� � ���������� ��������� ������� ���� �� ������ ��� ���� ��� ������� �� ��������� �����������.
     * 
     * @return value
     */
    public String getCurrencyMarketPrice() {
        return currencyMarketPrice;
    }

    /** 
     * Set the 'CurrencyMarketPrice' element value. ������ �������� ���� � ���������� ��������� ������� ���� �� ������ ��� ���� ��� ������� �� ��������� �����������.
     * 
     * @param currencyMarketPrice
     */
    public void setCurrencyMarketPrice(String currencyMarketPrice) {
        this.currencyMarketPrice = currencyMarketPrice;
    }
}
