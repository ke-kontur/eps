
package ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Сведения о товарах счета-фактуры
 */
public class RussianInvoiceGoodsType
{
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String goodMarking;
    private String goodsCode;
    private String supplementaryQualifierName;
    private String goodsQuantity;
    private String measureUnitQualifierName;
    private String goodsPrice;
    private String goodsCost;
    private String exise;
    private String taxRate;
    private String taxSum;
    private String totalCost;
    private String originCountryCode;
    private String originA3CountryCode;
    private GTDIDType GTDID;
    private AdditionalGoodsDescriptionType additionalGoodsDescription;

    /** 
     * Get the list of 'GoodsDescription' element items. Описание поставляемого товара (услуги)
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. Описание поставляемого товара (услуги)
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'GoodMarking' element value. Артикул товара
     * 
     * @return value
     */
    public String getGoodMarking() {
        return goodMarking;
    }

    /** 
     * Set the 'GoodMarking' element value. Артикул товара
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
     * Get the 'GoodsQuantity' element value. Количество товара, услуг исходя из принятых единиц измерения
     * 
     * @return value
     */
    public String getGoodsQuantity() {
        return goodsQuantity;
    }

    /** 
     * Set the 'GoodsQuantity' element value. Количество товара, услуг исходя из принятых единиц измерения
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
     * Get the 'GoodsPrice' element value. Цена товара/услуги
     * 
     * @return value
     */
    public String getGoodsPrice() {
        return goodsPrice;
    }

    /** 
     * Set the 'GoodsPrice' element value. Цена товара/услуги
     * 
     * @param goodsPrice
     */
    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    /** 
     * Get the 'GoodsCost' element value. Стоимость всего количества поставляемого (отгруженного) по счету - проформе товара (выполненных работ, оказанных услуг) без налога
     * 
     * @return value
     */
    public String getGoodsCost() {
        return goodsCost;
    }

    /** 
     * Set the 'GoodsCost' element value. Стоимость всего количества поставляемого (отгруженного) по счету - проформе товара (выполненных работ, оказанных услуг) без налога
     * 
     * @param goodsCost
     */
    public void setGoodsCost(String goodsCost) {
        this.goodsCost = goodsCost;
    }

    /** 
     * Get the 'Exise' element value. Cумма акциза по подакцизным товарам
     * 
     * @return value
     */
    public String getExise() {
        return exise;
    }

    /** 
     * Set the 'Exise' element value. Cумма акциза по подакцизным товарам
     * 
     * @param exise
     */
    public void setExise(String exise) {
        this.exise = exise;
    }

    /** 
     * Get the 'TaxRate' element value. Налоговая ставка
     * 
     * @return value
     */
    public String getTaxRate() {
        return taxRate;
    }

    /** 
     * Set the 'TaxRate' element value. Налоговая ставка
     * 
     * @param taxRate
     */
    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate;
    }

    /** 
     * Get the 'TaxSum' element value. Cумма налога, предъявляемая покупателю товаров (работ, услуг), определяемая исходя из применяемых налоговых ставок
     * 
     * @return value
     */
    public String getTaxSum() {
        return taxSum;
    }

    /** 
     * Set the 'TaxSum' element value. Cумма налога, предъявляемая покупателю товаров (работ, услуг), определяемая исходя из применяемых налоговых ставок
     * 
     * @param taxSum
     */
    public void setTaxSum(String taxSum) {
        this.taxSum = taxSum;
    }

    /** 
     * Get the 'TotalCost' element value. Cтоимость всего количества поставляемых (отгруженных) по счету-проформе товаров (выполненных работ, оказанных услуг) с учетом суммы налога
     * 
     * @return value
     */
    public String getTotalCost() {
        return totalCost;
    }

    /** 
     * Set the 'TotalCost' element value. Cтоимость всего количества поставляемых (отгруженных) по счету-проформе товаров (выполненных работ, оказанных услуг) с учетом суммы налога
     * 
     * @param totalCost
     */
    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
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
     * Get the 'OriginA3CountryCode' element value. Буквенный код страны происхождения, указываются в отношении товаров, страной происхождения которых не является Российская Федерация. 
     * 
     * @return value
     */
    public String getOriginA3CountryCode() {
        return originA3CountryCode;
    }

    /** 
     * Set the 'OriginA3CountryCode' element value. Буквенный код страны происхождения, указываются в отношении товаров, страной происхождения которых не является Российская Федерация. 
     * 
     * @param originA3CountryCode
     */
    public void setOriginA3CountryCode(String originA3CountryCode) {
        this.originA3CountryCode = originA3CountryCode;
    }

    /** 
     * Get the 'GTDID' element value. Номер ДТ
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. Номер ДТ
     * 
     * @param GTDID
     */
    public void setGTDID(GTDIDType GTDID) {
        this.GTDID = GTDID;
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
