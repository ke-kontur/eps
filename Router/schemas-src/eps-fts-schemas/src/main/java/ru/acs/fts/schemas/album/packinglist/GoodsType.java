
package ru.acs.fts.schemas.album.packinglist;

import java.util.ArrayList;
import java.util.List;

/** 
 * Описание грузовых мест товаров
 */
public class GoodsType
{
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String goodsQuantity;
    private String placeGoodsQuantity;
    private String measureUnitQualifierName;
    private String grossWeightQuantity;
    private String netWeightQuantity;
    private String dimensions;
    private String goodsVolume;
    private String volumeUnitQualifierName;
    private String measureUnitQualifierCode;
    private String goodMarking;
    private List<PlacesGoodsQuantityType> placesQuantityList = new ArrayList<PlacesGoodsQuantityType>();
    private List<PackingInfoType> packingInfoList = new ArrayList<PackingInfoType>();

    /** 
     * Get the list of 'GoodsDescription' element items. Описание товара текстовое
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. Описание товара текстовое
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'GoodsQuantity' element value. Количество товара без указания единицы измерения 
     * 
     * @return value
     */
    public String getGoodsQuantity() {
        return goodsQuantity;
    }

    /** 
     * Set the 'GoodsQuantity' element value. Количество товара без указания единицы измерения 
     * 
     * @param goodsQuantity
     */
    public void setGoodsQuantity(String goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }

    /** 
     * Get the 'PlaceGoodsQuantity' element value. Количество товара в грузовом месте
     * 
     * @return value
     */
    public String getPlaceGoodsQuantity() {
        return placeGoodsQuantity;
    }

    /** 
     * Set the 'PlaceGoodsQuantity' element value. Количество товара в грузовом месте
     * 
     * @param placeGoodsQuantity
     */
    public void setPlaceGoodsQuantity(String placeGoodsQuantity) {
        this.placeGoodsQuantity = placeGoodsQuantity;
    }

    /** 
     * Get the 'MeasureUnitQualifierName' element value. Наименование единицы измерения товара
     * 
     * @return value
     */
    public String getMeasureUnitQualifierName() {
        return measureUnitQualifierName;
    }

    /** 
     * Set the 'MeasureUnitQualifierName' element value. Наименование единицы измерения товара
     * 
     * @param measureUnitQualifierName
     */
    public void setMeasureUnitQualifierName(String measureUnitQualifierName) {
        this.measureUnitQualifierName = measureUnitQualifierName;
    }

    /** 
     * Get the 'GrossWeightQuantity' element value. Вес товара, брутто (кг)
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. Вес товара, брутто (кг)
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }

    /** 
     * Get the 'NetWeightQuantity' element value. Вес товара, нетто (кг)
     * 
     * @return value
     */
    public String getNetWeightQuantity() {
        return netWeightQuantity;
    }

    /** 
     * Set the 'NetWeightQuantity' element value. Вес товара, нетто (кг)
     * 
     * @param netWeightQuantity
     */
    public void setNetWeightQuantity(String netWeightQuantity) {
        this.netWeightQuantity = netWeightQuantity;
    }

    /** 
     * Get the 'Dimensions' element value. Размеры товара (длина, высота, ширина)
     * 
     * @return value
     */
    public String getDimensions() {
        return dimensions;
    }

    /** 
     * Set the 'Dimensions' element value. Размеры товара (длина, высота, ширина)
     * 
     * @param dimensions
     */
    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    /** 
     * Get the 'GoodsVolume' element value. Общий объем, занимаемый перевозимым товаром без указания единиц измерения
     * 
     * @return value
     */
    public String getGoodsVolume() {
        return goodsVolume;
    }

    /** 
     * Set the 'GoodsVolume' element value. Общий объем, занимаемый перевозимым товаром без указания единиц измерения
     * 
     * @param goodsVolume
     */
    public void setGoodsVolume(String goodsVolume) {
        this.goodsVolume = goodsVolume;
    }

    /** 
     * Get the 'VolumeUnitQualifierName' element value. Название единицы измерения объема
     * 
     * @return value
     */
    public String getVolumeUnitQualifierName() {
        return volumeUnitQualifierName;
    }

    /** 
     * Set the 'VolumeUnitQualifierName' element value. Название единицы измерения объема
     * 
     * @param volumeUnitQualifierName
     */
    public void setVolumeUnitQualifierName(String volumeUnitQualifierName) {
        this.volumeUnitQualifierName = volumeUnitQualifierName;
    }

    /** 
     * Get the 'MeasureUnitQualifierCode' element value. Код единицы измерения товара
     * 
     * @return value
     */
    public String getMeasureUnitQualifierCode() {
        return measureUnitQualifierCode;
    }

    /** 
     * Set the 'MeasureUnitQualifierCode' element value. Код единицы измерения товара
     * 
     * @param measureUnitQualifierCode
     */
    public void setMeasureUnitQualifierCode(String measureUnitQualifierCode) {
        this.measureUnitQualifierCode = measureUnitQualifierCode;
    }

    /** 
     * Get the 'GoodMarking' element value. Артикул (код товара, номер по каталогу производителя) 
     * 
     * @return value
     */
    public String getGoodMarking() {
        return goodMarking;
    }

    /** 
     * Set the 'GoodMarking' element value. Артикул (код товара, номер по каталогу производителя) 
     * 
     * @param goodMarking
     */
    public void setGoodMarking(String goodMarking) {
        this.goodMarking = goodMarking;
    }

    /** 
     * Get the list of 'PlacesQuantity' element items. Количество мест по видам грузовых  мест
     * 
     * @return list
     */
    public List<PlacesGoodsQuantityType> getPlacesQuantityList() {
        return placesQuantityList;
    }

    /** 
     * Set the list of 'PlacesQuantity' element items. Количество мест по видам грузовых  мест
     * 
     * @param list
     */
    public void setPlacesQuantityList(List<PlacesGoodsQuantityType> list) {
        placesQuantityList = list;
    }

    /** 
     * Get the list of 'PackingInfo' element items. Сведения об упаковке товаров. 
     * 
     * @return list
     */
    public List<PackingInfoType> getPackingInfoList() {
        return packingInfoList;
    }

    /** 
     * Set the list of 'PackingInfo' element items. Сведения об упаковке товаров. 
     * 
     * @param list
     */
    public void setPackingInfoList(List<PackingInfoType> list) {
        packingInfoList = list;
    }
}
