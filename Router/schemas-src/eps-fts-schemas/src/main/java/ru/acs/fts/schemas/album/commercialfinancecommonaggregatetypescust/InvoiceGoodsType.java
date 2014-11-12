
package ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения о товарах инвойса
 */
public class InvoiceGoodsType
{
    private String goodMarking;
    private String goodsCode;
    private String supplementaryQualifierName;
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String goodsQuantity;
    private String measureUnitQualifierName;
    private String grossWeightQuantity;
    private String netWeightQuantity;
    private String price;
    private String totalCost;
    private String discount;
    private String discountPercentage;
    private String originCountryCode;
    private String serviceCharges;
    private String transportCharges;
    private List<OtherChargesType> otherChargeList = new ArrayList<OtherChargesType>();
    private AdditionalGoodsDescriptionType additionalGoodsDescription;

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
     * Get the 'GoodsCode' element value. Код товара по ТН ВЭД ТС
     * 
     * @return value
     */
    public String getGoodsCode() {
        return goodsCode;
    }

    /** 
     * Set the 'GoodsCode' element value. Код товара по ТН ВЭД ТС
     * 
     * @param goodsCode
     */
    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    /** 
     * Get the 'SupplementaryQualifierName' element value. Название дополнительной единицы измерения при возможности ее указания
     * 
     * @return value
     */
    public String getSupplementaryQualifierName() {
        return supplementaryQualifierName;
    }

    /** 
     * Set the 'SupplementaryQualifierName' element value. Название дополнительной единицы измерения при возможности ее указания
     * 
     * @param supplementaryQualifierName
     */
    public void setSupplementaryQualifierName(String supplementaryQualifierName) {
        this.supplementaryQualifierName = supplementaryQualifierName;
    }

    /** 
     * Get the list of 'GoodsDescription' element items. Описание товара текстовое (содержит название марок, моделей товаров и/или их индивидуальные номера - приказ ГТК РФ от 13.05.03 №500)
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. Описание товара текстовое (содержит название марок, моделей товаров и/или их индивидуальные номера - приказ ГТК РФ от 13.05.03 №500)
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'GoodsQuantity' element value. Количество товара, услуг без указания единицы измерения 
     * 
     * @return value
     */
    public String getGoodsQuantity() {
        return goodsQuantity;
    }

    /** 
     * Set the 'GoodsQuantity' element value. Количество товара, услуг без указания единицы измерения 
     * 
     * @param goodsQuantity
     */
    public void setGoodsQuantity(String goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }

    /** 
     * Get the 'MeasureUnitQualifierName' element value. Название единицы измерения при возможности ее указания
     * 
     * @return value
     */
    public String getMeasureUnitQualifierName() {
        return measureUnitQualifierName;
    }

    /** 
     * Set the 'MeasureUnitQualifierName' element value. Название единицы измерения при возможности ее указания
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
     * Get the 'Price' element value. Цена товара/услуги
     * 
     * @return value
     */
    public String getPrice() {
        return price;
    }

    /** 
     * Set the 'Price' element value. Цена товара/услуги
     * 
     * @param price
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /** 
     * Get the 'TotalCost' element value. Стоимость всего количества поставляемого (отгруженного) по счету - фактуре товара (выполненных работ, оказанных услуг) без налога
     * 
     * @return value
     */
    public String getTotalCost() {
        return totalCost;
    }

    /** 
     * Set the 'TotalCost' element value. Стоимость всего количества поставляемого (отгруженного) по счету - фактуре товара (выполненных работ, оказанных услуг) без налога
     * 
     * @param totalCost
     */
    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    /** 
     * Get the 'Discount' element value. Cумма скидки
     * 
     * @return value
     */
    public String getDiscount() {
        return discount;
    }

    /** 
     * Set the 'Discount' element value. Cумма скидки
     * 
     * @param discount
     */
    public void setDiscount(String discount) {
        this.discount = discount;
    }

    /** 
     * Get the 'DiscountPercentage' element value. Сумма скидки, %
     * 
     * @return value
     */
    public String getDiscountPercentage() {
        return discountPercentage;
    }

    /** 
     * Set the 'DiscountPercentage' element value. Сумма скидки, %
     * 
     * @param discountPercentage
     */
    public void setDiscountPercentage(String discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    /** 
     * Get the 'OriginCountryCode' element value. Код страны происхождения, указываются в отношении товаров, страной происхождения которых не является Российская Федерация. 
     * 
     * @return value
     */
    public String getOriginCountryCode() {
        return originCountryCode;
    }

    /** 
     * Set the 'OriginCountryCode' element value. Код страны происхождения, указываются в отношении товаров, страной происхождения которых не является Российская Федерация. 
     * 
     * @param originCountryCode
     */
    public void setOriginCountryCode(String originCountryCode) {
        this.originCountryCode = originCountryCode;
    }

    /** 
     * Get the 'ServiceCharges' element value. Вычеты (расходы на строительство, возведение, сборку, монтаж, обслуживание или оказание технического содействия, производимые после прибытия на Таможенную территорию ТС)
     * 
     * @return value
     */
    public String getServiceCharges() {
        return serviceCharges;
    }

    /** 
     * Set the 'ServiceCharges' element value. Вычеты (расходы на строительство, возведение, сборку, монтаж, обслуживание или оказание технического содействия, производимые после прибытия на Таможенную территорию ТС)
     * 
     * @param serviceCharges
     */
    public void setServiceCharges(String serviceCharges) {
        this.serviceCharges = serviceCharges;
    }

    /** 
     * Get the 'TransportCharges' element value. Вычеты (расходы по перевозке (транспортировке) товаров после их прибытия на таможенную территорию ТС)
     * 
     * @return value
     */
    public String getTransportCharges() {
        return transportCharges;
    }

    /** 
     * Set the 'TransportCharges' element value. Вычеты (расходы по перевозке (транспортировке) товаров после их прибытия на таможенную территорию ТС)
     * 
     * @param transportCharges
     */
    public void setTransportCharges(String transportCharges) {
        this.transportCharges = transportCharges;
    }

    /** 
     * Get the list of 'OtherCharges' element items. Информация о прочих расходах
     * 
     * @return list
     */
    public List<OtherChargesType> getOtherChargeList() {
        return otherChargeList;
    }

    /** 
     * Set the list of 'OtherCharges' element items. Информация о прочих расходах
     * 
     * @param list
     */
    public void setOtherChargeList(List<OtherChargesType> list) {
        otherChargeList = list;
    }

    /** 
     * Get the 'AdditionalGoodsDescription' element value. Дополнительные характеристики товаров
     * 
     * @return value
     */
    public AdditionalGoodsDescriptionType getAdditionalGoodsDescription() {
        return additionalGoodsDescription;
    }

    /** 
     * Set the 'AdditionalGoodsDescription' element value. Дополнительные характеристики товаров
     * 
     * @param additionalGoodsDescription
     */
    public void setAdditionalGoodsDescription(
            AdditionalGoodsDescriptionType additionalGoodsDescription) {
        this.additionalGoodsDescription = additionalGoodsDescription;
    }
}
