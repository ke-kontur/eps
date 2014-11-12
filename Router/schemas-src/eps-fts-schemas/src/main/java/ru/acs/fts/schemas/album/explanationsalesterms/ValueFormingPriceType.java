
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * �������� �� ����������, ������ �� ����� �������� ������������� ���� ��������������� �����������.
 */
public class ValueFormingPriceType
{
    private String exchangePrice;
    private String priceOtherProposals;
    private String priceOtherVendors;
    private String costPrice;
    private String salesDomesticMarket;
    private String notKnown;

    /** 
     * Get the 'ExchangePrice' element value. ������� ������������ ���� ��������������� �����������, ������ �� �������� ����
     * 
     * @return value
     */
    public String getExchangePrice() {
        return exchangePrice;
    }

    /** 
     * Set the 'ExchangePrice' element value. ������� ������������ ���� ��������������� �����������, ������ �� �������� ����
     * 
     * @param exchangePrice
     */
    public void setExchangePrice(String exchangePrice) {
        this.exchangePrice = exchangePrice;
    }

    /** 
     * Get the 'PriceOtherProposals' element value. ������� ������������ ���� ��������������� �����������, ������ �� ���� �� ������ ���� �� ������ ��� ���� ������ ����������� ��� ������� ������� �� ������� �� ������ ������������
     * 
     * @return value
     */
    public String getPriceOtherProposals() {
        return priceOtherProposals;
    }

    /** 
     * Set the 'PriceOtherProposals' element value. ������� ������������ ���� ��������������� �����������, ������ �� ���� �� ������ ���� �� ������ ��� ���� ������ ����������� ��� ������� ������� �� ������� �� ������ ������������
     * 
     * @param priceOtherProposals
     */
    public void setPriceOtherProposals(String priceOtherProposals) {
        this.priceOtherProposals = priceOtherProposals;
    }

    /** 
     * Get the 'PriceOtherVendors' element value. ������� ������������ ���� ��������������� �����������, ������ �� ��� �� ������ ���� �� ������ ��� ���� � ������ ��������� ��� ������� ������� �� ������� �� ������ �����������
     * 
     * @return value
     */
    public String getPriceOtherVendors() {
        return priceOtherVendors;
    }

    /** 
     * Set the 'PriceOtherVendors' element value. ������� ������������ ���� ��������������� �����������, ������ �� ��� �� ������ ���� �� ������ ��� ���� � ������ ��������� ��� ������� ������� �� ������� �� ������ �����������
     * 
     * @param priceOtherVendors
     */
    public void setPriceOtherVendors(String priceOtherVendors) {
        this.priceOtherVendors = priceOtherVendors;
    }

    /** 
     * Get the 'CostPrice' element value. ������� ������������ ���� ��������������� �����������, ������ �� ������������� ������������
     * 
     * @return value
     */
    public String getCostPrice() {
        return costPrice;
    }

    /** 
     * Set the 'CostPrice' element value. ������� ������������ ���� ��������������� �����������, ������ �� ������������� ������������
     * 
     * @param costPrice
     */
    public void setCostPrice(String costPrice) {
        this.costPrice = costPrice;
    }

    /** 
     * Get the 'SalesDomesticMarket' element value. ������� ������������ ���� ��������������� �����������, ������ �� ���� ��������� ���������� �� ���������� ����� ���������� ���������
     * 
     * @return value
     */
    public String getSalesDomesticMarket() {
        return salesDomesticMarket;
    }

    /** 
     * Set the 'SalesDomesticMarket' element value. ������� ������������ ���� ��������������� �����������, ������ �� ���� ��������� ���������� �� ���������� ����� ���������� ���������
     * 
     * @param salesDomesticMarket
     */
    public void setSalesDomesticMarket(String salesDomesticMarket) {
        this.salesDomesticMarket = salesDomesticMarket;
    }

    /** 
     * Get the 'NotKnown' element value. ������� ����, ��� ������ ������������ ���� ��������������� ����������� ����������
     * 
     * @return value
     */
    public String getNotKnown() {
        return notKnown;
    }

    /** 
     * Set the 'NotKnown' element value. ������� ����, ��� ������ ������������ ���� ��������������� ����������� ����������
     * 
     * @param notKnown
     */
    public void setNotKnown(String notKnown) {
        this.notKnown = notKnown;
    }
}
