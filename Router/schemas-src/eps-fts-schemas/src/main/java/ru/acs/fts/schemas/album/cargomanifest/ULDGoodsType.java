
package ru.acs.fts.schemas.album.cargomanifest;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения о контейнерах
 */
public class ULDGoodsType
{
    private String ULDType;
    private String ULDSerialNumber;
    private String ULDOwnerCode;
    private String ULDLoadIndicator;
    private String ULDComent;
    private String totalULDPlacesQuantity;
    private String weightUnitQualifierCode;
    private String grossWeightQuantity;
    private List<GoodsInfoType> ULDGoodList = new ArrayList<GoodsInfoType>();
    private ULDMoveInfoType ULDMoveInfo;
    private DTInfoType DTInfo;

    /** 
     * Get the 'ULDType' element value. Тип контейнера
     * 
     * @return value
     */
    public String getULDType() {
        return ULDType;
    }

    /** 
     * Set the 'ULDType' element value. Тип контейнера
     * 
     * @param ULDType
     */
    public void setULDType(String ULDType) {
        this.ULDType = ULDType;
    }

    /** 
     * Get the 'ULDSerialNumber' element value. Серийный номер контейнера
     * 
     * @return value
     */
    public String getULDSerialNumber() {
        return ULDSerialNumber;
    }

    /** 
     * Set the 'ULDSerialNumber' element value. Серийный номер контейнера
     * 
     * @param ULDSerialNumber
     */
    public void setULDSerialNumber(String ULDSerialNumber) {
        this.ULDSerialNumber = ULDSerialNumber;
    }

    /** 
     * Get the 'ULDOwnerCode' element value. Код владельца контейнера
     * 
     * @return value
     */
    public String getULDOwnerCode() {
        return ULDOwnerCode;
    }

    /** 
     * Set the 'ULDOwnerCode' element value. Код владельца контейнера
     * 
     * @param ULDOwnerCode
     */
    public void setULDOwnerCode(String ULDOwnerCode) {
        this.ULDOwnerCode = ULDOwnerCode;
    }

    /** 
     * Get the 'ULDLoadIndicator' element value. Признак загрузки контейнера
     * 
     * @return value
     */
    public String getULDLoadIndicator() {
        return ULDLoadIndicator;
    }

    /** 
     * Set the 'ULDLoadIndicator' element value. Признак загрузки контейнера
     * 
     * @param ULDLoadIndicator
     */
    public void setULDLoadIndicator(String ULDLoadIndicator) {
        this.ULDLoadIndicator = ULDLoadIndicator;
    }

    /** 
     * Get the 'ULDComent' element value. Примечание 
     * 
     * @return value
     */
    public String getULDComent() {
        return ULDComent;
    }

    /** 
     * Set the 'ULDComent' element value. Примечание 
     * 
     * @param ULDComent
     */
    public void setULDComent(String ULDComent) {
        this.ULDComent = ULDComent;
    }

    /** 
     * Get the 'TotalULDPlacesQuantity' element value. Общее количество мест товара в контейнере
     * 
     * @return value
     */
    public String getTotalULDPlacesQuantity() {
        return totalULDPlacesQuantity;
    }

    /** 
     * Set the 'TotalULDPlacesQuantity' element value. Общее количество мест товара в контейнере
     * 
     * @param totalULDPlacesQuantity
     */
    public void setTotalULDPlacesQuantity(String totalULDPlacesQuantity) {
        this.totalULDPlacesQuantity = totalULDPlacesQuantity;
    }

    /** 
     * Get the 'WeightUnitQualifierCode' element value. Код измерения веса товара (килограммы или фунты)
     * 
     * @return value
     */
    public String getWeightUnitQualifierCode() {
        return weightUnitQualifierCode;
    }

    /** 
     * Set the 'WeightUnitQualifierCode' element value. Код измерения веса товара (килограммы или фунты)
     * 
     * @param weightUnitQualifierCode
     */
    public void setWeightUnitQualifierCode(String weightUnitQualifierCode) {
        this.weightUnitQualifierCode = weightUnitQualifierCode;
    }

    /** 
     * Get the 'GrossWeightQuantity' element value. Общий вес товара, брутто
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. Общий вес товара, брутто
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }

    /** 
     * Get the list of 'ULDGoods' element items. Сведения о товарах в контейнере
     * 
     * @return list
     */
    public List<GoodsInfoType> getULDGoodList() {
        return ULDGoodList;
    }

    /** 
     * Set the list of 'ULDGoods' element items. Сведения о товарах в контейнере
     * 
     * @param list
     */
    public void setULDGoodList(List<GoodsInfoType> list) {
        ULDGoodList = list;
    }

    /** 
     * Get the 'ULDMoveInfo' element value. Информация о перемещении контейнера
     * 
     * @return value
     */
    public ULDMoveInfoType getULDMoveInfo() {
        return ULDMoveInfo;
    }

    /** 
     * Set the 'ULDMoveInfo' element value. Информация о перемещении контейнера
     * 
     * @param ULDMoveInfo
     */
    public void setULDMoveInfo(ULDMoveInfoType ULDMoveInfo) {
        this.ULDMoveInfo = ULDMoveInfo;
    }

    /** 
     * Get the 'DTInfo' element value. Сведения о ДТ
     * 
     * @return value
     */
    public DTInfoType getDTInfo() {
        return DTInfo;
    }

    /** 
     * Set the 'DTInfo' element value. Сведения о ДТ
     * 
     * @param DTInfo
     */
    public void setDTInfo(DTInfoType DTInfo) {
        this.DTInfo = DTInfo;
    }
}
