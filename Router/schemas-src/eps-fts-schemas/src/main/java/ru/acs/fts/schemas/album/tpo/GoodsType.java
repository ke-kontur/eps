
package ru.acs.fts.schemas.album.tpo;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Описание товара
 */
public class GoodsType
{
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String goodsTNVEDCode;
    private String goodsWeight;
    private String cost;
    private String dollarCost;
    private String euroCost;
    private String additionalInformation;
    private String originCountryCode;
    private SupplementaryQuantityType supplementaryQuantity;
    private List<PaymentInfoType> paymentInfoList = new ArrayList<PaymentInfoType>();
    private List<AutomobileInfoType> automobileInfoList = new ArrayList<AutomobileInfoType>();

    /** 
     * Get the list of 'GoodsDescription' element items. Наименование товара
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. Наименование товара
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
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
     * Get the 'GoodsWeight' element value. Вес товара, кг
     * 
     * @return value
     */
    public String getGoodsWeight() {
        return goodsWeight;
    }

    /** 
     * Set the 'GoodsWeight' element value. Вес товара, кг
     * 
     * @param goodsWeight
     */
    public void setGoodsWeight(String goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    /** 
     * Get the 'Cost' element value. Стоимость в валюте платежа
     * 
     * @return value
     */
    public String getCost() {
        return cost;
    }

    /** 
     * Set the 'Cost' element value. Стоимость в валюте платежа
     * 
     * @param cost
     */
    public void setCost(String cost) {
        this.cost = cost;
    }

    /** 
     * Get the 'DollarCost' element value. Стоимость в долларах США
     * 
     * @return value
     */
    public String getDollarCost() {
        return dollarCost;
    }

    /** 
     * Set the 'DollarCost' element value. Стоимость в долларах США
     * 
     * @param dollarCost
     */
    public void setDollarCost(String dollarCost) {
        this.dollarCost = dollarCost;
    }

    /** 
     * Get the 'EuroCost' element value. Стоимость в евро
     * 
     * @return value
     */
    public String getEuroCost() {
        return euroCost;
    }

    /** 
     * Set the 'EuroCost' element value. Стоимость в евро
     * 
     * @param euroCost
     */
    public void setEuroCost(String euroCost) {
        this.euroCost = euroCost;
    }

    /** 
     * Get the 'AdditionalInformation' element value. Дополнительная информация
     * 
     * @return value
     */
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    /** 
     * Set the 'AdditionalInformation' element value. Дополнительная информация
     * 
     * @param additionalInformation
     */
    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    /** 
     * Get the 'OriginCountryCode' element value. Код страны происхождения по классификатору стран мира
     * 
     * @return value
     */
    public String getOriginCountryCode() {
        return originCountryCode;
    }

    /** 
     * Set the 'OriginCountryCode' element value. Код страны происхождения по классификатору стран мира
     * 
     * @param originCountryCode
     */
    public void setOriginCountryCode(String originCountryCode) {
        this.originCountryCode = originCountryCode;
    }

    /** 
     * Get the 'SupplementaryQuantity' element value. Количество в дополнительной единице измерения
     * 
     * @return value
     */
    public SupplementaryQuantityType getSupplementaryQuantity() {
        return supplementaryQuantity;
    }

    /** 
     * Set the 'SupplementaryQuantity' element value. Количество в дополнительной единице измерения
     * 
     * @param supplementaryQuantity
     */
    public void setSupplementaryQuantity(
            SupplementaryQuantityType supplementaryQuantity) {
        this.supplementaryQuantity = supplementaryQuantity;
    }

    /** 
     * Get the list of 'PaymentInfo' element items. Сведения о платеже
     * 
     * @return list
     */
    public List<PaymentInfoType> getPaymentInfoList() {
        return paymentInfoList;
    }

    /** 
     * Set the list of 'PaymentInfo' element items. Сведения о платеже
     * 
     * @param list
     */
    public void setPaymentInfoList(List<PaymentInfoType> list) {
        paymentInfoList = list;
    }

    /** 
     * Get the list of 'AutomobileInfo' element items. Данные об автомобиле
     * 
     * @return list
     */
    public List<AutomobileInfoType> getAutomobileInfoList() {
        return automobileInfoList;
    }

    /** 
     * Set the list of 'AutomobileInfo' element items. Данные об автомобиле
     * 
     * @param list
     */
    public void setAutomobileInfoList(List<AutomobileInfoType> list) {
        automobileInfoList = list;
    }
}
