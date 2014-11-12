
package ru.acs.fts.schemas.album.pi_airarrive;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения о перевозимом грузе
 */
public class GoodsInfoType
{
    private String weightUnitQualifierCode;
    private String goodsVolume;
    private List<String> cargoDescriptionList = new ArrayList<String>();
    private String grossWeightQuantity;
    private PackingInfoType packingInfo;

    /** 
     * Get the 'WeightUnitQualifierCode' element value. Код измерения веса товара(килограммы или фунты)
     * 
     * @return value
     */
    public String getWeightUnitQualifierCode() {
        return weightUnitQualifierCode;
    }

    /** 
     * Set the 'WeightUnitQualifierCode' element value. Код измерения веса товара(килограммы или фунты)
     * 
     * @param weightUnitQualifierCode
     */
    public void setWeightUnitQualifierCode(String weightUnitQualifierCode) {
        this.weightUnitQualifierCode = weightUnitQualifierCode;
    }

    /** 
     * Get the 'GoodsVolume' element value. Объем товара
     * 
     * @return value
     */
    public String getGoodsVolume() {
        return goodsVolume;
    }

    /** 
     * Set the 'GoodsVolume' element value. Объем товара
     * 
     * @param goodsVolume
     */
    public void setGoodsVolume(String goodsVolume) {
        this.goodsVolume = goodsVolume;
    }

    /** 
     * Get the list of 'CargoDescription' element items. Описание груза
     * 
     * @return list
     */
    public List<String> getCargoDescriptionList() {
        return cargoDescriptionList;
    }

    /** 
     * Set the list of 'CargoDescription' element items. Описание груза
     * 
     * @param list
     */
    public void setCargoDescriptionList(List<String> list) {
        cargoDescriptionList = list;
    }

    /** 
     * Get the 'GrossWeightQuantity' element value. Вес товара брутто (кг)
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. Вес товара брутто (кг)
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }

    /** 
     * Get the 'PackingInfo' element value. Сведения об упаковке и грузовых местах
     * 
     * @return value
     */
    public PackingInfoType getPackingInfo() {
        return packingInfo;
    }

    /** 
     * Set the 'PackingInfo' element value. Сведения об упаковке и грузовых местах
     * 
     * @param packingInfo
     */
    public void setPackingInfo(PackingInfoType packingInfo) {
        this.packingInfo = packingInfo;
    }
}
