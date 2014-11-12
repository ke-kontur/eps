
package ru.acs.fts.schemas.album.airwaybill;

import java.util.ArrayList;
import java.util.List;

/** 
 * Информация о грузе
 */
public class AWBGoodsInfoType
{
    private String totalPlacesQuantity;
    private String weightUnitQualifierCode;
    private String grossWeightQuantity;
    private String totalAmount;
    private List<AWBGoodsType> AWBGoodList = new ArrayList<AWBGoodsType>();

    /** 
     * Get the 'TotalPlacesQuantity' element value. Общее количество грузовых мест товара
     * 
     * @return value
     */
    public String getTotalPlacesQuantity() {
        return totalPlacesQuantity;
    }

    /** 
     * Set the 'TotalPlacesQuantity' element value. Общее количество грузовых мест товара
     * 
     * @param totalPlacesQuantity
     */
    public void setTotalPlacesQuantity(String totalPlacesQuantity) {
        this.totalPlacesQuantity = totalPlacesQuantity;
    }

    /** 
     * Get the 'WeightUnitQualifierCode' element value. Код измерения общего веса товара (килограммы или фунты)
     * 
     * @return value
     */
    public String getWeightUnitQualifierCode() {
        return weightUnitQualifierCode;
    }

    /** 
     * Set the 'WeightUnitQualifierCode' element value. Код измерения общего веса товара (килограммы или фунты)
     * 
     * @param weightUnitQualifierCode
     */
    public void setWeightUnitQualifierCode(String weightUnitQualifierCode) {
        this.weightUnitQualifierCode = weightUnitQualifierCode;
    }

    /** 
     * Get the 'GrossWeightQuantity' element value. Общий вес брутто товаров (если в описании товаров нет данных, то значение вводится вручную - иначе - сумма веса брутто по товарам)
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. Общий вес брутто товаров (если в описании товаров нет данных, то значение вводится вручную - иначе - сумма веса брутто по товарам)
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }

    /** 
     * Get the 'TotalAmount' element value. Общая сумма (22L)
     * 
     * @return value
     */
    public String getTotalAmount() {
        return totalAmount;
    }

    /** 
     * Set the 'TotalAmount' element value. Общая сумма (22L)
     * 
     * @param totalAmount
     */
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    /** 
     * Get the list of 'AWBGoods' element items. Описание грузовых мест товаров 
     * 
     * @return list
     */
    public List<AWBGoodsType> getAWBGoodList() {
        return AWBGoodList;
    }

    /** 
     * Set the list of 'AWBGoods' element items. Описание грузовых мест товаров 
     * 
     * @param list
     */
    public void setAWBGoodList(List<AWBGoodsType> list) {
        AWBGoodList = list;
    }
}
