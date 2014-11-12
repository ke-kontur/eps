
package ru.acs.fts.schemas.album.minpromlicence;

/** 
 * Стоимость
 */
public class CostType
{
    private String contractCurrencyCode;
    private String contractCurrencyName;
    private String currencyCost;
    private String statCost;

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
     * Get the 'ContractCurrencyName' element value. Наименование валюты
     * 
     * @return value
     */
    public String getContractCurrencyName() {
        return contractCurrencyName;
    }

    /** 
     * Set the 'ContractCurrencyName' element value. Наименование валюты
     * 
     * @param contractCurrencyName
     */
    public void setContractCurrencyName(String contractCurrencyName) {
        this.contractCurrencyName = contractCurrencyName;
    }

    /** 
     * Get the 'CurrencyCost' element value. Cтоимость
     * 
     * @return value
     */
    public String getCurrencyCost() {
        return currencyCost;
    }

    /** 
     * Set the 'CurrencyCost' element value. Cтоимость
     * 
     * @param currencyCost
     */
    public void setCurrencyCost(String currencyCost) {
        this.currencyCost = currencyCost;
    }

    /** 
     * Get the 'StatCost' element value. Статистическая стоимость товара (USD)
     * 
     * @return value
     */
    public String getStatCost() {
        return statCost;
    }

    /** 
     * Set the 'StatCost' element value. Статистическая стоимость товара (USD)
     * 
     * @param statCost
     */
    public void setStatCost(String statCost) {
        this.statCost = statCost;
    }
}
