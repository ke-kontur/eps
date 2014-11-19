
package ru.acs.fts.schemas.album.sertifst2form;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Сведения о товарах
 */
public class GoodsType
{
    private String goodsNumeric;
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String goodsQuantity;
    private String measureUnitQualifierCode;
    private String supplementaryGoodsQuantity;
    private String supplementaryMeasureUnitQualifierCode;
    private String goodsPlacesQuantity;
    private String placesDescription;
    private String originCriterionCode;
    private String grossWeightQuantity;
    private String netWeightQuantity;
    private List<DocumentBaseType> goodsInvoiceList = new ArrayList<DocumentBaseType>();

    /** 
     * Get the 'GoodsNumeric' element value. Порядковый номер товара
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. Порядковый номер товара
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }

    /** 
     * Get the list of 'GoodsDescription' element items. Описание товара текстовое (коммерческое наименование товара, его модель, марка, модификация, артикул, другие данные, позволяющие провести однозначную идентификацию товара с заявленным для целей таможенного оформления)
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. Описание товара текстовое (коммерческое наименование товара, его модель, марка, модификация, артикул, другие данные, позволяющие провести однозначную идентификацию товара с заявленным для целей таможенного оформления)
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'GoodsQuantity' element value. Количество товара
     * 
     * @return value
     */
    public String getGoodsQuantity() {
        return goodsQuantity;
    }

    /** 
     * Set the 'GoodsQuantity' element value. Количество товара
     * 
     * @param goodsQuantity
     */
    public void setGoodsQuantity(String goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }

    /** 
     * Get the 'MeasureUnitQualifierCode' element value. Единица измерения товара
     * 
     * @return value
     */
    public String getMeasureUnitQualifierCode() {
        return measureUnitQualifierCode;
    }

    /** 
     * Set the 'MeasureUnitQualifierCode' element value. Единица измерения товара
     * 
     * @param measureUnitQualifierCode
     */
    public void setMeasureUnitQualifierCode(String measureUnitQualifierCode) {
        this.measureUnitQualifierCode = measureUnitQualifierCode;
    }

    /** 
     * Get the 'SupplementaryGoodsQuantity' element value. Количество товара в дополнительных единицах измерения
     * 
     * @return value
     */
    public String getSupplementaryGoodsQuantity() {
        return supplementaryGoodsQuantity;
    }

    /** 
     * Set the 'SupplementaryGoodsQuantity' element value. Количество товара в дополнительных единицах измерения
     * 
     * @param supplementaryGoodsQuantity
     */
    public void setSupplementaryGoodsQuantity(String supplementaryGoodsQuantity) {
        this.supplementaryGoodsQuantity = supplementaryGoodsQuantity;
    }

    /** 
     * Get the 'SupplementaryMeasureUnitQualifierCode' element value. Дополнительная единица измерения товара
     * 
     * @return value
     */
    public String getSupplementaryMeasureUnitQualifierCode() {
        return supplementaryMeasureUnitQualifierCode;
    }

    /** 
     * Set the 'SupplementaryMeasureUnitQualifierCode' element value. Дополнительная единица измерения товара
     * 
     * @param supplementaryMeasureUnitQualifierCode
     */
    public void setSupplementaryMeasureUnitQualifierCode(
            String supplementaryMeasureUnitQualifierCode) {
        this.supplementaryMeasureUnitQualifierCode = supplementaryMeasureUnitQualifierCode;
    }

    /** 
     * Get the 'GoodsPlacesQuantity' element value. Количество мест товара
     * 
     * @return value
     */
    public String getGoodsPlacesQuantity() {
        return goodsPlacesQuantity;
    }

    /** 
     * Set the 'GoodsPlacesQuantity' element value. Количество мест товара
     * 
     * @param goodsPlacesQuantity
     */
    public void setGoodsPlacesQuantity(String goodsPlacesQuantity) {
        this.goodsPlacesQuantity = goodsPlacesQuantity;
    }

    /** 
     * Get the 'PlacesDescription' element value. Описание вида грузовых мест (коробок, упаковок, паллет и т.д.)
     * 
     * @return value
     */
    public String getPlacesDescription() {
        return placesDescription;
    }

    /** 
     * Set the 'PlacesDescription' element value. Описание вида грузовых мест (коробок, упаковок, паллет и т.д.)
     * 
     * @param placesDescription
     */
    public void setPlacesDescription(String placesDescription) {
        this.placesDescription = placesDescription;
    }

    /** 
     * Get the 'OriginCriterionCode' element value. Критерий происхождения
     * 
     * @return value
     */
    public String getOriginCriterionCode() {
        return originCriterionCode;
    }

    /** 
     * Set the 'OriginCriterionCode' element value. Критерий происхождения
     * 
     * @param originCriterionCode
     */
    public void setOriginCriterionCode(String originCriterionCode) {
        this.originCriterionCode = originCriterionCode;
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
     * Get the list of 'GoodsInvoice' element items. Счет-фактура или другой документ, отражающий финансово-количественные параметры товара  (с привязкой к товару)
     * 
     * @return list
     */
    public List<DocumentBaseType> getGoodsInvoiceList() {
        return goodsInvoiceList;
    }

    /** 
     * Set the list of 'GoodsInvoice' element items. Счет-фактура или другой документ, отражающий финансово-количественные параметры товара  (с привязкой к товару)
     * 
     * @param list
     */
    public void setGoodsInvoiceList(List<DocumentBaseType> list) {
        goodsInvoiceList = list;
    }
}
