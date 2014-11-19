
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DeliveryTermsRUType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Описание поставки товаров. Для РФ
 */
public class SupplyInformationsType
{
    private String originCountryName;
    private String customsCost;
    private String contractCurrencyCode;
    private DeliveryTermsRUType deliveryTerms;
    private List<SupplementaryQuantityType> goodsQuantityList = new ArrayList<SupplementaryQuantityType>();
    private SupplyConsignorType supplyConsignor;
    private SupplyConsigneeType supplyConsignee;

    /** 
     * Get the 'OriginCountryName' element value. Страна происхождения
     * 
     * @return value
     */
    public String getOriginCountryName() {
        return originCountryName;
    }

    /** 
     * Set the 'OriginCountryName' element value. Страна происхождения
     * 
     * @param originCountryName
     */
    public void setOriginCountryName(String originCountryName) {
        this.originCountryName = originCountryName;
    }

    /** 
     * Get the 'CustomsCost' element value. Условная таможенная стоимость
     * 
     * @return value
     */
    public String getCustomsCost() {
        return customsCost;
    }

    /** 
     * Set the 'CustomsCost' element value. Условная таможенная стоимость
     * 
     * @param customsCost
     */
    public void setCustomsCost(String customsCost) {
        this.customsCost = customsCost;
    }

    /** 
     * Get the 'ContractCurrencyCode' element value. Код валюты
     * 
     * @return value
     */
    public String getContractCurrencyCode() {
        return contractCurrencyCode;
    }

    /** 
     * Set the 'ContractCurrencyCode' element value. Код валюты
     * 
     * @param contractCurrencyCode
     */
    public void setContractCurrencyCode(String contractCurrencyCode) {
        this.contractCurrencyCode = contractCurrencyCode;
    }

    /** 
     * Get the 'DeliveryTerms' element value. Условия поставки.
     * 
     * @return value
     */
    public DeliveryTermsRUType getDeliveryTerms() {
        return deliveryTerms;
    }

    /** 
     * Set the 'DeliveryTerms' element value. Условия поставки.
     * 
     * @param deliveryTerms
     */
    public void setDeliveryTerms(DeliveryTermsRUType deliveryTerms) {
        this.deliveryTerms = deliveryTerms;
    }

    /** 
     * Get the list of 'GoodsQuantity' element items. Количество товара в единицах измерения.
     * 
     * @return list
     */
    public List<SupplementaryQuantityType> getGoodsQuantityList() {
        return goodsQuantityList;
    }

    /** 
     * Set the list of 'GoodsQuantity' element items. Количество товара в единицах измерения.
     * 
     * @param list
     */
    public void setGoodsQuantityList(List<SupplementaryQuantityType> list) {
        goodsQuantityList = list;
    }

    /** 
     * Get the 'SupplyConsignor' element value. Отправитель поставки.
     * 
     * @return value
     */
    public SupplyConsignorType getSupplyConsignor() {
        return supplyConsignor;
    }

    /** 
     * Set the 'SupplyConsignor' element value. Отправитель поставки.
     * 
     * @param supplyConsignor
     */
    public void setSupplyConsignor(SupplyConsignorType supplyConsignor) {
        this.supplyConsignor = supplyConsignor;
    }

    /** 
     * Get the 'SupplyConsignee' element value. Получатель поставки.
     * 
     * @return value
     */
    public SupplyConsigneeType getSupplyConsignee() {
        return supplyConsignee;
    }

    /** 
     * Set the 'SupplyConsignee' element value. Получатель поставки.
     * 
     * @param supplyConsignee
     */
    public void setSupplyConsignee(SupplyConsigneeType supplyConsignee) {
        this.supplyConsignee = supplyConsignee;
    }
}
