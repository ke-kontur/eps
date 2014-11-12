
package ru.acs.fts.schemas.album.detailquotadatard;

import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Количественные характеристики
 */
public class QuantitativeCharactType extends SupplementaryQuantityType
{
    private String restQuota;
    private String packing;
    private String quantityPacking;
    private String regForm;
    private String statisticalCost;
    private String invoice;
    private String currencyCode;

    /** 
     * Get the 'RestQuota' element value. Остаток по квоте
     * 
     * @return value
     */
    public String getRestQuota() {
        return restQuota;
    }

    /** 
     * Set the 'RestQuota' element value. Остаток по квоте
     * 
     * @param restQuota
     */
    public void setRestQuota(String restQuota) {
        this.restQuota = restQuota;
    }

    /** 
     * Get the 'Packing' element value. Фасовка
     * 
     * @return value
     */
    public String getPacking() {
        return packing;
    }

    /** 
     * Set the 'Packing' element value. Фасовка
     * 
     * @param packing
     */
    public void setPacking(String packing) {
        this.packing = packing;
    }

    /** 
     * Get the 'QuantityPacking' element value. Количество упаковок
     * 
     * @return value
     */
    public String getQuantityPacking() {
        return quantityPacking;
    }

    /** 
     * Set the 'QuantityPacking' element value. Количество упаковок
     * 
     * @param quantityPacking
     */
    public void setQuantityPacking(String quantityPacking) {
        this.quantityPacking = quantityPacking;
    }

    /** 
     * Get the 'RegForm' element value. Форма выпуска, дозировка лекарственных средств
     * 
     * @return value
     */
    public String getRegForm() {
        return regForm;
    }

    /** 
     * Set the 'RegForm' element value. Форма выпуска, дозировка лекарственных средств
     * 
     * @param regForm
     */
    public void setRegForm(String regForm) {
        this.regForm = regForm;
    }

    /** 
     * Get the 'StatisticalCost' element value. Статистическая стоимость 
     * 
     * @return value
     */
    public String getStatisticalCost() {
        return statisticalCost;
    }

    /** 
     * Set the 'StatisticalCost' element value. Статистическая стоимость 
     * 
     * @param statisticalCost
     */
    public void setStatisticalCost(String statisticalCost) {
        this.statisticalCost = statisticalCost;
    }

    /** 
     * Get the 'Invoice' element value. Фактурная стоимость
     * 
     * @return value
     */
    public String getInvoice() {
        return invoice;
    }

    /** 
     * Set the 'Invoice' element value. Фактурная стоимость
     * 
     * @param invoice
     */
    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    /** 
     * Get the 'CurrencyCode' element value. Код валюты 
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Код валюты 
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
