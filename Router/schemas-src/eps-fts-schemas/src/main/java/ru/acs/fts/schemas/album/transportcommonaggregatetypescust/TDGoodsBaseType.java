
package ru.acs.fts.schemas.album.transportcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportGoodsBaseType;
import ru.acs.fts.schemas.album.cutransportcommonaggregatetypescust.TRPackingInfoType;

/** 
 * Базовый класс для описания товаров в транзитных документах
 */
public class TDGoodsBaseType extends TransportGoodsBaseType
{
    private String goodsNumeric;
    private String goodsTNVEDCode;
    private String supplementaryGoodsQuantity;
    private String grossWeightQuantity;
    private String supplementaryMeasureUnitCode;
    private String invoicedCost;
    private String originCountryCode;
    private String documentKind;
    private String precedingDocumentNumber;
    private List<TRPackingInfoType> placesInfoList = new ArrayList<TRPackingInfoType>();
    private List<TRPackingInfoType> packingInfoList = new ArrayList<TRPackingInfoType>();

    /** 
     * Get the 'GoodsNumeric' element value. Номер товара по списку
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. Номер товара по списку
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }

    /** 
     * Get the 'GoodsTNVEDCode' element value. Код товара по ТН ВЭД ТС
     * 
     * @return value
     */
    public String getGoodsTNVEDCode() {
        return goodsTNVEDCode;
    }

    /** 
     * Set the 'GoodsTNVEDCode' element value. Код товара по ТН ВЭД ТС
     * 
     * @param goodsTNVEDCode
     */
    public void setGoodsTNVEDCode(String goodsTNVEDCode) {
        this.goodsTNVEDCode = goodsTNVEDCode;
    }

    /** 
     * Get the 'SupplementaryGoodsQuantity' element value. Кол-во товара (в дополнительной единице измерения)
     * 
     * @return value
     */
    public String getSupplementaryGoodsQuantity() {
        return supplementaryGoodsQuantity;
    }

    /** 
     * Set the 'SupplementaryGoodsQuantity' element value. Кол-во товара (в дополнительной единице измерения)
     * 
     * @param supplementaryGoodsQuantity
     */
    public void setSupplementaryGoodsQuantity(String supplementaryGoodsQuantity) {
        this.supplementaryGoodsQuantity = supplementaryGoodsQuantity;
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
     * Get the 'SupplementaryMeasureUnitCode' element value. Код дополнительной единицы измерения
     * 
     * @return value
     */
    public String getSupplementaryMeasureUnitCode() {
        return supplementaryMeasureUnitCode;
    }

    /** 
     * Set the 'SupplementaryMeasureUnitCode' element value. Код дополнительной единицы измерения
     * 
     * @param supplementaryMeasureUnitCode
     */
    public void setSupplementaryMeasureUnitCode(
            String supplementaryMeasureUnitCode) {
        this.supplementaryMeasureUnitCode = supplementaryMeasureUnitCode;
    }

    /** 
     * Get the 'InvoicedCost' element value. Фактурная стоимость
     * 
     * @return value
     */
    public String getInvoicedCost() {
        return invoicedCost;
    }

    /** 
     * Set the 'InvoicedCost' element value. Фактурная стоимость
     * 
     * @param invoicedCost
     */
    public void setInvoicedCost(String invoicedCost) {
        this.invoicedCost = invoicedCost;
    }

    /** 
     * Get the 'OriginCountryCode' element value. Код страны происхождения товара
     * 
     * @return value
     */
    public String getOriginCountryCode() {
        return originCountryCode;
    }

    /** 
     * Set the 'OriginCountryCode' element value. Код страны происхождения товара
     * 
     * @param originCountryCode
     */
    public void setOriginCountryCode(String originCountryCode) {
        this.originCountryCode = originCountryCode;
    }

    /** 
     * Get the 'DocumentKind' element value. Тип документа
     * 
     * @return value
     */
    public String getDocumentKind() {
        return documentKind;
    }

    /** 
     * Set the 'DocumentKind' element value. Тип документа
     * 
     * @param documentKind
     */
    public void setDocumentKind(String documentKind) {
        this.documentKind = documentKind;
    }

    /** 
     * Get the 'PrecedingDocumentNumber' element value. Номер предшествующего документа
     * 
     * @return value
     */
    public String getPrecedingDocumentNumber() {
        return precedingDocumentNumber;
    }

    /** 
     * Set the 'PrecedingDocumentNumber' element value. Номер предшествующего документа
     * 
     * @param precedingDocumentNumber
     */
    public void setPrecedingDocumentNumber(String precedingDocumentNumber) {
        this.precedingDocumentNumber = precedingDocumentNumber;
    }

    /** 
     * Get the list of 'PlacesInfo' element items. Сведения о грузовых местах
     * 
     * @return list
     */
    public List<TRPackingInfoType> getPlacesInfoList() {
        return placesInfoList;
    }

    /** 
     * Set the list of 'PlacesInfo' element items. Сведения о грузовых местах
     * 
     * @param list
     */
    public void setPlacesInfoList(List<TRPackingInfoType> list) {
        placesInfoList = list;
    }

    /** 
     * Get the list of 'PackingInfo' element items.  Сведения об упаковке товаров
     * 
     * @return list
     */
    public List<TRPackingInfoType> getPackingInfoList() {
        return packingInfoList;
    }

    /** 
     * Set the list of 'PackingInfo' element items.  Сведения об упаковке товаров
     * 
     * @param list
     */
    public void setPackingInfoList(List<TRPackingInfoType> list) {
        packingInfoList = list;
    }
}
