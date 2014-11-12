
package ru.acs.fts.schemas.album.preliminarytnvedcode;

/** 
 * Характеристика товара
 */
public class GoodsInformationType
{
    private String goodsMark;
    private String goodsMarking;
    private String goodsStandard;
    private String goodsSort;
    private String woodSortiment;
    private String woodKind;
    private String dimensions;

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
     * Get the 'WoodSortiment' element value. Наименование сортимента (для лесоматериалов товарной позиции 4403)
     * 
     * @return value
     */
    public String getWoodSortiment() {
        return woodSortiment;
    }

    /** 
     * Set the 'WoodSortiment' element value. Наименование сортимента (для лесоматериалов товарной позиции 4403)
     * 
     * @param woodSortiment
     */
    public void setWoodSortiment(String woodSortiment) {
        this.woodSortiment = woodSortiment;
    }

    /** 
     * Get the 'WoodKind' element value. Порода древесины
     * 
     * @return value
     */
    public String getWoodKind() {
        return woodKind;
    }

    /** 
     * Set the 'WoodKind' element value. Порода древесины
     * 
     * @param woodKind
     */
    public void setWoodKind(String woodKind) {
        this.woodKind = woodKind;
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
}
