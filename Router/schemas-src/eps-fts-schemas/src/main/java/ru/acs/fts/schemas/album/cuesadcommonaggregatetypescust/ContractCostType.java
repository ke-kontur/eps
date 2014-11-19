
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

/** 
 * ������ � ����� ��������� �� �����. ��. 22, 23
 */
public class ContractCostType
{
    private String contractCurrencyCode;
    private String currencyQuantity;
    private String contractCurrencyRate;
    private String totalInvoiceAmount;

    /** 
     * Get the 'ContractCurrencyCode' element value. ����������� ��������� � ����� 22 ��� ������ ���� ��������/ ������� (������). �� �������������� �����
     * 
     * @return value
     */
    public String getContractCurrencyCode() {
        return contractCurrencyCode;
    }

    /** 
     * Set the 'ContractCurrencyCode' element value. ����������� ��������� � ����� 22 ��� ������ ���� ��������/ ������� (������). �� �������������� �����
     * 
     * @param contractCurrencyCode
     */
    public void setContractCurrencyCode(String contractCurrencyCode) {
        this.contractCurrencyCode = contractCurrencyCode;
    }

    /** 
     * Get the 'CurrencyQuantity' element value. ���������� ������ ������, ��� ������� ������ ���� ��� ��
     * 
     * @return value
     */
    public String getCurrencyQuantity() {
        return currencyQuantity;
    }

    /** 
     * Set the 'CurrencyQuantity' element value. ���������� ������ ������, ��� ������� ������ ���� ��� ��
     * 
     * @param currencyQuantity
     */
    public void setCurrencyQuantity(String currencyQuantity) {
        this.currencyQuantity = currencyQuantity;
    }

    /** 
     * Get the 'ContractCurrencyRate' element value. ���� ������ ���� ��������/ ������� (������)
     * 
     * @return value
     */
    public String getContractCurrencyRate() {
        return contractCurrencyRate;
    }

    /** 
     * Set the 'ContractCurrencyRate' element value. ���� ������ ���� ��������/ ������� (������)
     * 
     * @param contractCurrencyRate
     */
    public void setContractCurrencyRate(String contractCurrencyRate) {
        this.contractCurrencyRate = contractCurrencyRate;
    }

    /** 
     * Get the 'TotalInvoiceAmount' element value. ����� ��������� �������. �� 22 ��������� 2
     * 
     * @return value
     */
    public String getTotalInvoiceAmount() {
        return totalInvoiceAmount;
    }

    /** 
     * Set the 'TotalInvoiceAmount' element value. ����� ��������� �������. �� 22 ��������� 2
     * 
     * @param totalInvoiceAmount
     */
    public void setTotalInvoiceAmount(String totalInvoiceAmount) {
        this.totalInvoiceAmount = totalInvoiceAmount;
    }
}
