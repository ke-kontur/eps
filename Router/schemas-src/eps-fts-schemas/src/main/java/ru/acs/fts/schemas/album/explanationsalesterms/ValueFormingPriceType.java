
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * Известно ли покупателю, исходя из какой величины формировалась цена первоначального предложения.
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
     * Get the 'ExchangePrice' element value. Признак формирования цены первоначального предложения, исходя из биржевой цены
     * 
     * @return value
     */
    public String getExchangePrice() {
        return exchangePrice;
    }

    /** 
     * Set the 'ExchangePrice' element value. Признак формирования цены первоначального предложения, исходя из биржевой цены
     * 
     * @param exchangePrice
     */
    public void setExchangePrice(String exchangePrice) {
        this.exchangePrice = exchangePrice;
    }

    /** 
     * Get the 'PriceOtherProposals' element value. Признак формирования цены первоначального предложения, исходя из цены на товары того же класса или вида других предложений при продаже товаров на экспорт из страны производства
     * 
     * @return value
     */
    public String getPriceOtherProposals() {
        return priceOtherProposals;
    }

    /** 
     * Set the 'PriceOtherProposals' element value. Признак формирования цены первоначального предложения, исходя из цены на товары того же класса или вида других предложений при продаже товаров на экспорт из страны производства
     * 
     * @param priceOtherProposals
     */
    public void setPriceOtherProposals(String priceOtherProposals) {
        this.priceOtherProposals = priceOtherProposals;
    }

    /** 
     * Get the 'PriceOtherVendors' element value. Признак формирования цены первоначального предложения, исходя из цен на товары того же класса или вида у других продавцов при продаже товаров на экспорт из страны отправления
     * 
     * @return value
     */
    public String getPriceOtherVendors() {
        return priceOtherVendors;
    }

    /** 
     * Set the 'PriceOtherVendors' element value. Признак формирования цены первоначального предложения, исходя из цен на товары того же класса или вида у других продавцов при продаже товаров на экспорт из страны отправления
     * 
     * @param priceOtherVendors
     */
    public void setPriceOtherVendors(String priceOtherVendors) {
        this.priceOtherVendors = priceOtherVendors;
    }

    /** 
     * Get the 'CostPrice' element value. Признак формирования цены первоначального предложения, исходя из себестоимости производства
     * 
     * @return value
     */
    public String getCostPrice() {
        return costPrice;
    }

    /** 
     * Set the 'CostPrice' element value. Признак формирования цены первоначального предложения, исходя из себестоимости производства
     * 
     * @param costPrice
     */
    public void setCostPrice(String costPrice) {
        this.costPrice = costPrice;
    }

    /** 
     * Get the 'SalesDomesticMarket' element value. Признак формирования цены первоначального предложения, исходя из цены возможной реализации на внутреннем рынке Российской Федерации
     * 
     * @return value
     */
    public String getSalesDomesticMarket() {
        return salesDomesticMarket;
    }

    /** 
     * Set the 'SalesDomesticMarket' element value. Признак формирования цены первоначального предложения, исходя из цены возможной реализации на внутреннем рынке Российской Федерации
     * 
     * @param salesDomesticMarket
     */
    public void setSalesDomesticMarket(String salesDomesticMarket) {
        this.salesDomesticMarket = salesDomesticMarket;
    }

    /** 
     * Get the 'NotKnown' element value. Признак того, что способ формирования цены первоначального предложения неизвестен
     * 
     * @return value
     */
    public String getNotKnown() {
        return notKnown;
    }

    /** 
     * Set the 'NotKnown' element value. Признак того, что способ формирования цены первоначального предложения неизвестен
     * 
     * @param notKnown
     */
    public void setNotKnown(String notKnown) {
        this.notKnown = notKnown;
    }
}
