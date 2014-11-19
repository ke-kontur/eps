
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * Реализация товаров на внутреннем рынке
 */
public class SaleGoodsDomesticMarketType
{
    private String finalSellingPrice;
    private String unitSellingPriceGoods;
    private String cost;
    private String profitability;
    private BuyerGoodsType buyerGoods;
    private ExcessCustomsCostType excessCustomsCost;
    private MarketPriceType marketPrice;

    /** 
     * Get the 'FinalSellingPrice' element value. Признак того, что цена реализации товара известна конечному потребителю на внутреннем рынке
     * 
     * @return value
     */
    public String getFinalSellingPrice() {
        return finalSellingPrice;
    }

    /** 
     * Set the 'FinalSellingPrice' element value. Признак того, что цена реализации товара известна конечному потребителю на внутреннем рынке
     * 
     * @param finalSellingPrice
     */
    public void setFinalSellingPrice(String finalSellingPrice) {
        this.finalSellingPrice = finalSellingPrice;
    }

    /** 
     * Get the 'UnitSellingPriceGoods' element value. Укажите цену реализации единицы товара на внутреннем рынке (в т.ч. планируемую)
     * 
     * @return value
     */
    public String getUnitSellingPriceGoods() {
        return unitSellingPriceGoods;
    }

    /** 
     * Set the 'UnitSellingPriceGoods' element value. Укажите цену реализации единицы товара на внутреннем рынке (в т.ч. планируемую)
     * 
     * @param unitSellingPriceGoods
     */
    public void setUnitSellingPriceGoods(String unitSellingPriceGoods) {
        this.unitSellingPriceGoods = unitSellingPriceGoods;
    }

    /** 
     * Get the 'Cost' element value. Укажите общий размер расходов Покупателя при реализации товаров на внутреннем рынке,которые должны быть включены в цену реализации для их покрытия
     * 
     * @return value
     */
    public String getCost() {
        return cost;
    }

    /** 
     * Set the 'Cost' element value. Укажите общий размер расходов Покупателя при реализации товаров на внутреннем рынке,которые должны быть включены в цену реализации для их покрытия
     * 
     * @param cost
     */
    public void setCost(String cost) {
        this.cost = cost;
    }

    /** 
     * Get the 'Profitability' element value. Укажите процент планируемой рентабельности сделки
     * 
     * @return value
     */
    public String getProfitability() {
        return profitability;
    }

    /** 
     * Set the 'Profitability' element value. Укажите процент планируемой рентабельности сделки
     * 
     * @param profitability
     */
    public void setProfitability(String profitability) {
        this.profitability = profitability;
    }

    /** 
     * Get the 'BuyerGoods' element value. Покупатель товаров
     * 
     * @return value
     */
    public BuyerGoodsType getBuyerGoods() {
        return buyerGoods;
    }

    /** 
     * Set the 'BuyerGoods' element value. Покупатель товаров
     * 
     * @param buyerGoods
     */
    public void setBuyerGoods(BuyerGoodsType buyerGoods) {
        this.buyerGoods = buyerGoods;
    }

    /** 
     * Get the 'ExcessCustomsCost' element value. Цена товара на внутреннем рынке Российской Федерации превышает заявленную таможенную стоимость, увеличенную на размер таможенных платежей
     * 
     * @return value
     */
    public ExcessCustomsCostType getExcessCustomsCost() {
        return excessCustomsCost;
    }

    /** 
     * Set the 'ExcessCustomsCost' element value. Цена товара на внутреннем рынке Российской Федерации превышает заявленную таможенную стоимость, увеличенную на размер таможенных платежей
     * 
     * @param excessCustomsCost
     */
    public void setExcessCustomsCost(ExcessCustomsCostType excessCustomsCost) {
        this.excessCustomsCost = excessCustomsCost;
    }

    /** 
     * Get the 'MarketPrice' element value. Известна ли Покупателю рыночная цена в Российской Федерации товаров того же класса или вида при продаже их конечному потребителю.
     * 
     * @return value
     */
    public MarketPriceType getMarketPrice() {
        return marketPrice;
    }

    /** 
     * Set the 'MarketPrice' element value. Известна ли Покупателю рыночная цена в Российской Федерации товаров того же класса или вида при продаже их конечному потребителю.
     * 
     * @param marketPrice
     */
    public void setMarketPrice(MarketPriceType marketPrice) {
        this.marketPrice = marketPrice;
    }
}
