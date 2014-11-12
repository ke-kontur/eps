
package ru.acs.fts.schemas.album.calculationamountpayment;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.GoodsGroupDescriptionType;

/** 
 * Сведения о товаре
 */
public class DescriptionGoodsType
{
    private String goodsTNVEDCode;
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String netWeightQuantity;
    private String customsCost;
    private String originCountryName;
    private String countryCode;
    private String position;
    private String allQuantityGoods;
    private String sourceInformation;
    private String reasonCalculationPayment;
    private String totalCustomsPayment;
    private String totalCustomsDues;
    private String totalPaymentGoods;
    private List<CalculationType> calculationList = new ArrayList<CalculationType>();
    private List<GoodsGroupDescriptionType> goodsGroupDescriptionList = new ArrayList<GoodsGroupDescriptionType>();
    private List<AmountDuesCalculationType> amountDuesCalculationList = new ArrayList<AmountDuesCalculationType>();

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
     * Get the list of 'GoodsDescription' element items. Наименование (торговое, коммерческое или иное традиционное наименование) товаров
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. Наименование (торговое, коммерческое или иное традиционное наименование) товаров
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
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
     * Get the 'CustomsCost' element value. Корректировка/таможенная стоимость товара
     * 
     * @return value
     */
    public String getCustomsCost() {
        return customsCost;
    }

    /** 
     * Set the 'CustomsCost' element value. Корректировка/таможенная стоимость товара
     * 
     * @param customsCost
     */
    public void setCustomsCost(String customsCost) {
        this.customsCost = customsCost;
    }

    /** 
     * Get the 'OriginCountryName' element value. Краткое наименование страны происхождения / экономического союза.
     * 
     * @return value
     */
    public String getOriginCountryName() {
        return originCountryName;
    }

    /** 
     * Set the 'OriginCountryName' element value. Краткое наименование страны происхождения / экономического союза.
     * 
     * @param originCountryName
     */
    public void setOriginCountryName(String originCountryName) {
        this.originCountryName = originCountryName;
    }

    /** 
     * Get the 'CountryCode' element value. Кода страны происхождения.
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. Кода страны происхождения.
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'Position' element value. Порядковый номер товара, в отношении которого производится расчет размера обеспечения уплаты таможенных платежей
     * 
     * @return value
     */
    public String getPosition() {
        return position;
    }

    /** 
     * Set the 'Position' element value. Порядковый номер товара, в отношении которого производится расчет размера обеспечения уплаты таможенных платежей
     * 
     * @param position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /** 
     * Get the 'AllQuantityGoods' element value. Общее количество товаров
     * 
     * @return value
     */
    public String getAllQuantityGoods() {
        return allQuantityGoods;
    }

    /** 
     * Set the 'AllQuantityGoods' element value. Общее количество товаров
     * 
     * @param allQuantityGoods
     */
    public void setAllQuantityGoods(String allQuantityGoods) {
        this.allQuantityGoods = allQuantityGoods;
    }

    /** 
     * Get the 'SourceInformation' element value. Источники информации
     * 
     * @return value
     */
    public String getSourceInformation() {
        return sourceInformation;
    }

    /** 
     * Set the 'SourceInformation' element value. Источники информации
     * 
     * @param sourceInformation
     */
    public void setSourceInformation(String sourceInformation) {
        this.sourceInformation = sourceInformation;
    }

    /** 
     * Get the 'ReasonCalculationPayment' element value. Основа для расчета размера обеспечения (в рублях)
     * 
     * @return value
     */
    public String getReasonCalculationPayment() {
        return reasonCalculationPayment;
    }

    /** 
     * Set the 'ReasonCalculationPayment' element value. Основа для расчета размера обеспечения (в рублях)
     * 
     * @param reasonCalculationPayment
     */
    public void setReasonCalculationPayment(String reasonCalculationPayment) {
        this.reasonCalculationPayment = reasonCalculationPayment;
    }

    /** 
     * Get the 'TotalCustomsPayment' element value. Итоговый размер обеспечения уплаты таможенных платежей.
     * 
     * @return value
     */
    public String getTotalCustomsPayment() {
        return totalCustomsPayment;
    }

    /** 
     * Set the 'TotalCustomsPayment' element value. Итоговый размер обеспечения уплаты таможенных платежей.
     * 
     * @param totalCustomsPayment
     */
    public void setTotalCustomsPayment(String totalCustomsPayment) {
        this.totalCustomsPayment = totalCustomsPayment;
    }

    /** 
     * Get the 'TotalCustomsDues' element value. Итоговую сумму таможенных пошлин и сборов
     * 
     * @return value
     */
    public String getTotalCustomsDues() {
        return totalCustomsDues;
    }

    /** 
     * Set the 'TotalCustomsDues' element value. Итоговую сумму таможенных пошлин и сборов
     * 
     * @param totalCustomsDues
     */
    public void setTotalCustomsDues(String totalCustomsDues) {
        this.totalCustomsDues = totalCustomsDues;
    }

    /** 
     * Get the 'TotalPaymentGoods' element value. Итоговый размер обеспечения уплаты таможенных платежей в отношении данного товара
     * 
     * @return value
     */
    public String getTotalPaymentGoods() {
        return totalPaymentGoods;
    }

    /** 
     * Set the 'TotalPaymentGoods' element value. Итоговый размер обеспечения уплаты таможенных платежей в отношении данного товара
     * 
     * @param totalPaymentGoods
     */
    public void setTotalPaymentGoods(String totalPaymentGoods) {
        this.totalPaymentGoods = totalPaymentGoods;
    }

    /** 
     * Get the list of 'Calculation' element items. Расчет размера обеспечения
     * 
     * @return list
     */
    public List<CalculationType> getCalculationList() {
        return calculationList;
    }

    /** 
     * Set the list of 'Calculation' element items. Расчет размера обеспечения
     * 
     * @param list
     */
    public void setCalculationList(List<CalculationType> list) {
        calculationList = list;
    }

    /** 
     * Get the list of 'GoodsGroupDescription' element items. Описание и характеристика товаров / Описание группы товаров одного наименования с отличающимися от других групп характеристиками
     * 
     * @return list
     */
    public List<GoodsGroupDescriptionType> getGoodsGroupDescriptionList() {
        return goodsGroupDescriptionList;
    }

    /** 
     * Set the list of 'GoodsGroupDescription' element items. Описание и характеристика товаров / Описание группы товаров одного наименования с отличающимися от других групп характеристиками
     * 
     * @param list
     */
    public void setGoodsGroupDescriptionList(
            List<GoodsGroupDescriptionType> list) {
        goodsGroupDescriptionList = list;
    }

    /** 
     * Get the list of 'AmountDuesCalculation' element items. Расчет суммы таможенных пошлин и сборов, уплаченных декларантом
     * 
     * @return list
     */
    public List<AmountDuesCalculationType> getAmountDuesCalculationList() {
        return amountDuesCalculationList;
    }

    /** 
     * Set the list of 'AmountDuesCalculation' element items. Расчет суммы таможенных пошлин и сборов, уплаченных декларантом
     * 
     * @param list
     */
    public void setAmountDuesCalculationList(
            List<AmountDuesCalculationType> list) {
        amountDuesCalculationList = list;
    }
}
