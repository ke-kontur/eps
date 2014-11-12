
package ru.acs.fts.schemas.album.staticform;

import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Сведения о товарах
 */
public class GoodsInfoType
{
    private String custCostCurrencyCode;
    private String goodsTNVEDCode;
    private String goodsDescription;
    private String netWeightQuantity;
    private String invoicedCost;
    private String statisticalCostRUB;
    private String statisticalCostUSD;
    private CountryInfoType originCountry;
    private SupplementaryQuantityType supplementaryQuantity;

    /** 
     * Get the 'CustCostCurrencyCode' element value. Код валюты цены товара в соответствии с Классификатором валют.
     * 
     * @return value
     */
    public String getCustCostCurrencyCode() {
        return custCostCurrencyCode;
    }

    /** 
     * Set the 'CustCostCurrencyCode' element value. Код валюты цены товара в соответствии с Классификатором валют.
     * 
     * @param custCostCurrencyCode
     */
    public void setCustCostCurrencyCode(String custCostCurrencyCode) {
        this.custCostCurrencyCode = custCostCurrencyCode;
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
     * Get the 'GoodsDescription' element value. Наименование (торговое, коммерческое или иное традиционное наименование) товаров.
     * 
     * @return value
     */
    public String getGoodsDescription() {
        return goodsDescription;
    }

    /** 
     * Set the 'GoodsDescription' element value. Наименование (торговое, коммерческое или иное традиционное наименование) товаров.
     * 
     * @param goodsDescription
     */
    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription;
    }

    /** 
     * Get the 'NetWeightQuantity' element value. Вес товара, нетто (кг).
     * 
     * @return value
     */
    public String getNetWeightQuantity() {
        return netWeightQuantity;
    }

    /** 
     * Set the 'NetWeightQuantity' element value. Вес товара, нетто (кг).
     * 
     * @param netWeightQuantity
     */
    public void setNetWeightQuantity(String netWeightQuantity) {
        this.netWeightQuantity = netWeightQuantity;
    }

    /** 
     * Get the 'InvoicedCost' element value. Цена товара.
     * 
     * @return value
     */
    public String getInvoicedCost() {
        return invoicedCost;
    }

    /** 
     * Set the 'InvoicedCost' element value. Цена товара.
     * 
     * @param invoicedCost
     */
    public void setInvoicedCost(String invoicedCost) {
        this.invoicedCost = invoicedCost;
    }

    /** 
     * Get the 'StatisticalCostRUB' element value. Статистическая стоимость (в рублях)
     * 
     * @return value
     */
    public String getStatisticalCostRUB() {
        return statisticalCostRUB;
    }

    /** 
     * Set the 'StatisticalCostRUB' element value. Статистическая стоимость (в рублях)
     * 
     * @param statisticalCostRUB
     */
    public void setStatisticalCostRUB(String statisticalCostRUB) {
        this.statisticalCostRUB = statisticalCostRUB;
    }

    /** 
     * Get the 'StatisticalCostUSD' element value. Статистическая стоимость (в долларах США)
     * 
     * @return value
     */
    public String getStatisticalCostUSD() {
        return statisticalCostUSD;
    }

    /** 
     * Set the 'StatisticalCostUSD' element value. Статистическая стоимость (в долларах США)
     * 
     * @param statisticalCostUSD
     */
    public void setStatisticalCostUSD(String statisticalCostUSD) {
        this.statisticalCostUSD = statisticalCostUSD;
    }

    /** 
     * Get the 'OriginCountry' element value. Страна происхождения
     * 
     * @return value
     */
    public CountryInfoType getOriginCountry() {
        return originCountry;
    }

    /** 
     * Set the 'OriginCountry' element value. Страна происхождения
     * 
     * @param originCountry
     */
    public void setOriginCountry(CountryInfoType originCountry) {
        this.originCountry = originCountry;
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
}
