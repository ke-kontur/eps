
package ru.acs.fts.schemas.album.minpromlicence;

/** 
 * ���������
 */
public class CostType
{
    private String contractCurrencyCode;
    private String contractCurrencyName;
    private String currencyCost;
    private String statCost;

    /** 
     * Get the 'ContractCurrencyCode' element value. ��� ������
     * 
     * @return value
     */
    public String getContractCurrencyCode() {
        return contractCurrencyCode;
    }

    /** 
     * Set the 'ContractCurrencyCode' element value. ��� ������
     * 
     * @param contractCurrencyCode
     */
    public void setContractCurrencyCode(String contractCurrencyCode) {
        this.contractCurrencyCode = contractCurrencyCode;
    }

    /** 
     * Get the 'ContractCurrencyName' element value. ������������ ������
     * 
     * @return value
     */
    public String getContractCurrencyName() {
        return contractCurrencyName;
    }

    /** 
     * Set the 'ContractCurrencyName' element value. ������������ ������
     * 
     * @param contractCurrencyName
     */
    public void setContractCurrencyName(String contractCurrencyName) {
        this.contractCurrencyName = contractCurrencyName;
    }

    /** 
     * Get the 'CurrencyCost' element value. C��������
     * 
     * @return value
     */
    public String getCurrencyCost() {
        return currencyCost;
    }

    /** 
     * Set the 'CurrencyCost' element value. C��������
     * 
     * @param currencyCost
     */
    public void setCurrencyCost(String currencyCost) {
        this.currencyCost = currencyCost;
    }

    /** 
     * Get the 'StatCost' element value. �������������� ��������� ������ (USD)
     * 
     * @return value
     */
    public String getStatCost() {
        return statCost;
    }

    /** 
     * Set the 'StatCost' element value. �������������� ��������� ������ (USD)
     * 
     * @param statCost
     */
    public void setStatCost(String statCost) {
        this.statCost = statCost;
    }
}
