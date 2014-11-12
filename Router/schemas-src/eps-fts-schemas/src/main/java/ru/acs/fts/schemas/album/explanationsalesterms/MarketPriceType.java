
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * Известна ли Покупателю рыночная цена в Российской Федерации товаров того же класса или вида при продаже их конечному потребителю.
 */
public class MarketPriceType
{
    private String value;
    private String valueMarketPrice;
    private String currencyMarketPrice;

    /** 
     * Get the 'Value' element value. Если значение поля: true или 1 - да; false или 0 - нет
     * 
     * @return value
     */
    public String getValue() {
        return value;
    }

    /** 
     * Set the 'Value' element value. Если значение поля: true или 1 - да; false или 0 - нет
     * 
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /** 
     * Get the 'ValueMarketPrice' element value. Рыночная цена в Российской Федерации товаров того же класса или вида при продаже их конечному потребителю(величина)
     * 
     * @return value
     */
    public String getValueMarketPrice() {
        return valueMarketPrice;
    }

    /** 
     * Set the 'ValueMarketPrice' element value. Рыночная цена в Российской Федерации товаров того же класса или вида при продаже их конечному потребителю(величина)
     * 
     * @param valueMarketPrice
     */
    public void setValueMarketPrice(String valueMarketPrice) {
        this.valueMarketPrice = valueMarketPrice;
    }

    /** 
     * Get the 'CurrencyMarketPrice' element value. Валюта рыночной цены в Российской Федерации товаров того же класса или вида при продаже их конечному потребителю.
     * 
     * @return value
     */
    public String getCurrencyMarketPrice() {
        return currencyMarketPrice;
    }

    /** 
     * Set the 'CurrencyMarketPrice' element value. Валюта рыночной цены в Российской Федерации товаров того же класса или вида при продаже их конечному потребителю.
     * 
     * @param currencyMarketPrice
     */
    public void setCurrencyMarketPrice(String currencyMarketPrice) {
        this.currencyMarketPrice = currencyMarketPrice;
    }
}
