
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Описание функционального блока или компоненты
 */
public class ComponentDescriptionType
{
    private String goodsTNVEDCode;
    private String KGWeight;
    private String invoicedCost;
    private String invoiceCurrencyCode;
    private SupplementaryQuantityType supplementaryQuantity;

    /** 
     * Get the 'GoodsTNVEDCode' element value. Код  по ТН ВЭД ТС
     * 
     * @return value
     */
    public String getGoodsTNVEDCode() {
        return goodsTNVEDCode;
    }

    /** 
     * Set the 'GoodsTNVEDCode' element value. Код  по ТН ВЭД ТС
     * 
     * @param goodsTNVEDCode
     */
    public void setGoodsTNVEDCode(String goodsTNVEDCode) {
        this.goodsTNVEDCode = goodsTNVEDCode;
    }

    /** 
     * Get the 'KGWeight' element value. Количество в кг
     * 
     * @return value
     */
    public String getKGWeight() {
        return KGWeight;
    }

    /** 
     * Set the 'KGWeight' element value. Количество в кг
     * 
     * @param KGWeight
     */
    public void setKGWeight(String KGWeight) {
        this.KGWeight = KGWeight;
    }

    /** 
     * Get the 'InvoicedCost' element value.  Цена товара /Фактурная стоимость
     * 
     * @return value
     */
    public String getInvoicedCost() {
        return invoicedCost;
    }

    /** 
     * Set the 'InvoicedCost' element value.  Цена товара /Фактурная стоимость
     * 
     * @param invoicedCost
     */
    public void setInvoicedCost(String invoicedCost) {
        this.invoicedCost = invoicedCost;
    }

    /** 
     * Get the 'InvoiceCurrencyCode' element value. Буквенный код валюты фактурной стоимости
     * 
     * @return value
     */
    public String getInvoiceCurrencyCode() {
        return invoiceCurrencyCode;
    }

    /** 
     * Set the 'InvoiceCurrencyCode' element value. Буквенный код валюты фактурной стоимости
     * 
     * @param invoiceCurrencyCode
     */
    public void setInvoiceCurrencyCode(String invoiceCurrencyCode) {
        this.invoiceCurrencyCode = invoiceCurrencyCode;
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
