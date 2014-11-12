
package ru.acs.fts.schemas.album.commercialact;

/** 
 * Сведения о фактурной стоимости
 */
public class InvoiceCostDataType
{
    private String costAmount;
    private String costCurrencyCode;

    /** 
     * Get the 'CostAmount' element value. Стоимость
     * 
     * @return value
     */
    public String getCostAmount() {
        return costAmount;
    }

    /** 
     * Set the 'CostAmount' element value. Стоимость
     * 
     * @param costAmount
     */
    public void setCostAmount(String costAmount) {
        this.costAmount = costAmount;
    }

    /** 
     * Get the 'CostCurrencyCode' element value. Буквенный код валюты фактурной стоимости
     * 
     * @return value
     */
    public String getCostCurrencyCode() {
        return costCurrencyCode;
    }

    /** 
     * Set the 'CostCurrencyCode' element value. Буквенный код валюты фактурной стоимости
     * 
     * @param costCurrencyCode
     */
    public void setCostCurrencyCode(String costCurrencyCode) {
        this.costCurrencyCode = costCurrencyCode;
    }
}
