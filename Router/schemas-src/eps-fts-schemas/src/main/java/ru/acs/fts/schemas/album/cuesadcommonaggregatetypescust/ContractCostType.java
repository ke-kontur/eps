
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

/** 
 * Валюта и общая стоимость по счету. Гр. 22, 23
 */
public class ContractCostType
{
    private String contractCurrencyCode;
    private String currencyQuantity;
    private String contractCurrencyRate;
    private String totalInvoiceAmount;

    /** 
     * Get the 'ContractCurrencyCode' element value. Трехзначный буквенный в графе 22 код валюты цены договора/ платежа (оценки). По классификатору валют
     * 
     * @return value
     */
    public String getContractCurrencyCode() {
        return contractCurrencyCode;
    }

    /** 
     * Set the 'ContractCurrencyCode' element value. Трехзначный буквенный в графе 22 код валюты цены договора/ платежа (оценки). По классификатору валют
     * 
     * @param contractCurrencyCode
     */
    public void setContractCurrencyCode(String contractCurrencyCode) {
        this.contractCurrencyCode = contractCurrencyCode;
    }

    /** 
     * Get the 'CurrencyQuantity' element value. Количество единиц валюты, для которой указан курс для РБ
     * 
     * @return value
     */
    public String getCurrencyQuantity() {
        return currencyQuantity;
    }

    /** 
     * Set the 'CurrencyQuantity' element value. Количество единиц валюты, для которой указан курс для РБ
     * 
     * @param currencyQuantity
     */
    public void setCurrencyQuantity(String currencyQuantity) {
        this.currencyQuantity = currencyQuantity;
    }

    /** 
     * Get the 'ContractCurrencyRate' element value. Курс валюты цены договора/ платежа (оценки)
     * 
     * @return value
     */
    public String getContractCurrencyRate() {
        return contractCurrencyRate;
    }

    /** 
     * Set the 'ContractCurrencyRate' element value. Курс валюты цены договора/ платежа (оценки)
     * 
     * @param contractCurrencyRate
     */
    public void setContractCurrencyRate(String contractCurrencyRate) {
        this.contractCurrencyRate = contractCurrencyRate;
    }

    /** 
     * Get the 'TotalInvoiceAmount' element value. Общая стоимость товаров. Гр 22 подраздел 2
     * 
     * @return value
     */
    public String getTotalInvoiceAmount() {
        return totalInvoiceAmount;
    }

    /** 
     * Set the 'TotalInvoiceAmount' element value. Общая стоимость товаров. Гр 22 подраздел 2
     * 
     * @param totalInvoiceAmount
     */
    public void setTotalInvoiceAmount(String totalInvoiceAmount) {
        this.totalInvoiceAmount = totalInvoiceAmount;
    }
}
