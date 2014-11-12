
package ru.acs.fts.schemas.album.minsportrospechlic;

import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * �������� ������
 */
public class GoodsDescriptionType
{
    private String commodityName;
    private String originCountry;
    private SupplementaryQuantityType goodsQuantity;
    private SupplementaryQuantityType supplementaryGoodsQuantity;
    private ManufacturerType manufacturer;

    /** 
     * Get the 'CommodityName' element value. �������� ������
     * 
     * @return value
     */
    public String getCommodityName() {
        return commodityName;
    }

    /** 
     * Set the 'CommodityName' element value. �������� ������
     * 
     * @param commodityName
     */
    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    /** 
     * Get the 'OriginCountry' element value. ������ �������������
     * 
     * @return value
     */
    public String getOriginCountry() {
        return originCountry;
    }

    /** 
     * Set the 'OriginCountry' element value. ������ �������������
     * 
     * @param originCountry
     */
    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    /** 
     * Get the 'GoodsQuantity' element value. ���������� ������ � �������� ������� ���������
     * 
     * @return value
     */
    public SupplementaryQuantityType getGoodsQuantity() {
        return goodsQuantity;
    }

    /** 
     * Set the 'GoodsQuantity' element value. ���������� ������ � �������� ������� ���������
     * 
     * @param goodsQuantity
     */
    public void setGoodsQuantity(SupplementaryQuantityType goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }

    /** 
     * Get the 'SupplementaryGoodsQuantity' element value. ���������� ������ � �������������� ������� ���������
     * 
     * @return value
     */
    public SupplementaryQuantityType getSupplementaryGoodsQuantity() {
        return supplementaryGoodsQuantity;
    }

    /** 
     * Set the 'SupplementaryGoodsQuantity' element value. ���������� ������ � �������������� ������� ���������
     * 
     * @param supplementaryGoodsQuantity
     */
    public void setSupplementaryGoodsQuantity(
            SupplementaryQuantityType supplementaryGoodsQuantity) {
        this.supplementaryGoodsQuantity = supplementaryGoodsQuantity;
    }

    /** 
     * Get the 'Manufacturer' element value. �������� � �������������
     * 
     * @return value
     */
    public ManufacturerType getManufacturer() {
        return manufacturer;
    }

    /** 
     * Set the 'Manufacturer' element value. �������� � �������������
     * 
     * @param manufacturer
     */
    public void setManufacturer(ManufacturerType manufacturer) {
        this.manufacturer = manufacturer;
    }
}
