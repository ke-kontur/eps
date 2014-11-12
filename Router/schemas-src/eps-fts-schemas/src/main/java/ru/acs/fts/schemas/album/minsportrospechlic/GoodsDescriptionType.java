
package ru.acs.fts.schemas.album.minsportrospechlic;

import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Описание товара
 */
public class GoodsDescriptionType
{
    private String commodityName;
    private String originCountry;
    private SupplementaryQuantityType goodsQuantity;
    private SupplementaryQuantityType supplementaryGoodsQuantity;
    private ManufacturerType manufacturer;

    /** 
     * Get the 'CommodityName' element value. Описание товара
     * 
     * @return value
     */
    public String getCommodityName() {
        return commodityName;
    }

    /** 
     * Set the 'CommodityName' element value. Описание товара
     * 
     * @param commodityName
     */
    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    /** 
     * Get the 'OriginCountry' element value. Страна происхождения
     * 
     * @return value
     */
    public String getOriginCountry() {
        return originCountry;
    }

    /** 
     * Set the 'OriginCountry' element value. Страна происхождения
     * 
     * @param originCountry
     */
    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    /** 
     * Get the 'GoodsQuantity' element value. Количество товара в основной единице измерения
     * 
     * @return value
     */
    public SupplementaryQuantityType getGoodsQuantity() {
        return goodsQuantity;
    }

    /** 
     * Set the 'GoodsQuantity' element value. Количество товара в основной единице измерения
     * 
     * @param goodsQuantity
     */
    public void setGoodsQuantity(SupplementaryQuantityType goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }

    /** 
     * Get the 'SupplementaryGoodsQuantity' element value. Количество товара в дополнительной единице измерения
     * 
     * @return value
     */
    public SupplementaryQuantityType getSupplementaryGoodsQuantity() {
        return supplementaryGoodsQuantity;
    }

    /** 
     * Set the 'SupplementaryGoodsQuantity' element value. Количество товара в дополнительной единице измерения
     * 
     * @param supplementaryGoodsQuantity
     */
    public void setSupplementaryGoodsQuantity(
            SupplementaryQuantityType supplementaryGoodsQuantity) {
        this.supplementaryGoodsQuantity = supplementaryGoodsQuantity;
    }

    /** 
     * Get the 'Manufacturer' element value. Сведения о производителе
     * 
     * @return value
     */
    public ManufacturerType getManufacturer() {
        return manufacturer;
    }

    /** 
     * Set the 'Manufacturer' element value. Сведения о производителе
     * 
     * @param manufacturer
     */
    public void setManufacturer(ManufacturerType manufacturer) {
        this.manufacturer = manufacturer;
    }
}
