
package ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust;

/** 
 * Дополнительные характеристики товаров
 */
public class AdditionalGoodsDescriptionType
{
    private String manufacturer;
    private String tradeMark;
    private String goodsMark;
    private String goodsModel;
    private String goodsStandart;

    /** 
     * Get the 'Manufacturer' element value. Сведения о производителе
     * 
     * @return value
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /** 
     * Set the 'Manufacturer' element value. Сведения о производителе
     * 
     * @param manufacturer
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /** 
     * Get the 'TradeMark' element value. Тов. знак, место происхождения, объект авторского права, смежных прав, патент и т.д.
     * 
     * @return value
     */
    public String getTradeMark() {
        return tradeMark;
    }

    /** 
     * Set the 'TradeMark' element value. Тов. знак, место происхождения, объект авторского права, смежных прав, патент и т.д.
     * 
     * @param tradeMark
     */
    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    /** 
     * Get the 'GoodsMark' element value. Марка товара
     * 
     * @return value
     */
    public String getGoodsMark() {
        return goodsMark;
    }

    /** 
     * Set the 'GoodsMark' element value. Марка товара
     * 
     * @param goodsMark
     */
    public void setGoodsMark(String goodsMark) {
        this.goodsMark = goodsMark;
    }

    /** 
     * Get the 'GoodsModel' element value. Модель товара
     * 
     * @return value
     */
    public String getGoodsModel() {
        return goodsModel;
    }

    /** 
     * Set the 'GoodsModel' element value. Модель товара
     * 
     * @param goodsModel
     */
    public void setGoodsModel(String goodsModel) {
        this.goodsModel = goodsModel;
    }

    /** 
     * Get the 'GoodsStandart' element value. Стандарт (ГОСТ, ОСТ, СПП, СТО, ТУ)
     * 
     * @return value
     */
    public String getGoodsStandart() {
        return goodsStandart;
    }

    /** 
     * Set the 'GoodsStandart' element value. Стандарт (ГОСТ, ОСТ, СПП, СТО, ТУ)
     * 
     * @param goodsStandart
     */
    public void setGoodsStandart(String goodsStandart) {
        this.goodsStandart = goodsStandart;
    }
}
