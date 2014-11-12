
package ru.acs.fts.schemas.album.commercialact;

/** 
 * �������� � ��������� ���������
 */
public class InvoiceCostDataType
{
    private String costAmount;
    private String costCurrencyCode;

    /** 
     * Get the 'CostAmount' element value. ���������
     * 
     * @return value
     */
    public String getCostAmount() {
        return costAmount;
    }

    /** 
     * Set the 'CostAmount' element value. ���������
     * 
     * @param costAmount
     */
    public void setCostAmount(String costAmount) {
        this.costAmount = costAmount;
    }

    /** 
     * Get the 'CostCurrencyCode' element value. ��������� ��� ������ ��������� ���������
     * 
     * @return value
     */
    public String getCostCurrencyCode() {
        return costCurrencyCode;
    }

    /** 
     * Set the 'CostCurrencyCode' element value. ��������� ��� ������ ��������� ���������
     * 
     * @param costCurrencyCode
     */
    public void setCostCurrencyCode(String costCurrencyCode) {
        this.costCurrencyCode = costCurrencyCode;
    }
}
