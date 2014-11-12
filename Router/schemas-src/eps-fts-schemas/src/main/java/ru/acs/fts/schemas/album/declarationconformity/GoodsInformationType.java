
package ru.acs.fts.schemas.album.declarationconformity;

/** 
 * Характеристика товара
 */
public class GoodsInformationType
{
    private String tradeMark;
    private String goodsMark;
    private String goodsMarking;
    private String goodsStandard;
    private String goodsSort;
    private String dimensions;
    private String goodsKind;

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
     * Get the 'GoodsMark' element value. Марка (модель) товара
     * 
     * @return value
     */
    public String getGoodsMark() {
        return goodsMark;
    }

    /** 
     * Set the 'GoodsMark' element value. Марка (модель) товара
     * 
     * @param goodsMark
     */
    public void setGoodsMark(String goodsMark) {
        this.goodsMark = goodsMark;
    }

    /** 
     * Get the 'GoodsMarking' element value. Артикул товара
     * 
     * @return value
     */
    public String getGoodsMarking() {
        return goodsMarking;
    }

    /** 
     * Set the 'GoodsMarking' element value. Артикул товара
     * 
     * @param goodsMarking
     */
    public void setGoodsMarking(String goodsMarking) {
        this.goodsMarking = goodsMarking;
    }

    /** 
     * Get the 'GoodsStandard' element value. Стандарт (ГОСТ, ОСТ, СПП, СТО, ТУ)
     * 
     * @return value
     */
    public String getGoodsStandard() {
        return goodsStandard;
    }

    /** 
     * Set the 'GoodsStandard' element value. Стандарт (ГОСТ, ОСТ, СПП, СТО, ТУ)
     * 
     * @param goodsStandard
     */
    public void setGoodsStandard(String goodsStandard) {
        this.goodsStandard = goodsStandard;
    }

    /** 
     * Get the 'GoodsSort' element value. Сорт / Сорт или группа сортов (для лесо- и пиломатериалов)
     * 
     * @return value
     */
    public String getGoodsSort() {
        return goodsSort;
    }

    /** 
     * Set the 'GoodsSort' element value. Сорт / Сорт или группа сортов (для лесо- и пиломатериалов)
     * 
     * @param goodsSort
     */
    public void setGoodsSort(String goodsSort) {
        this.goodsSort = goodsSort;
    }

    /** 
     * Get the 'Dimensions' element value. Размеры
     * 
     * @return value
     */
    public String getDimensions() {
        return dimensions;
    }

    /** 
     * Set the 'Dimensions' element value. Размеры
     * 
     * @param dimensions
     */
    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    /** 
     * Get the 'GoodsKind' element value. Вид товара
     * 
     * @return value
     */
    public String getGoodsKind() {
        return goodsKind;
    }

    /** 
     * Set the 'GoodsKind' element value. Вид товара
     * 
     * @param goodsKind
     */
    public void setGoodsKind(String goodsKind) {
        this.goodsKind = goodsKind;
    }
}
