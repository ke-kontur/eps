
package ru.acs.fts.schemas.album.guaranteecommonaggregatetypescust;

/** 
 * �������� ����� � ��� ������
 */
public class AmountType
{
    private String amount;
    private String currencyCode;

    /** 
     * Get the 'Amount' element value. �����.
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. �����.
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'CurrencyCode' element value. ��������� ��� ������ � ������������ � ��������������� �����.
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. ��������� ��� ������ � ������������ � ��������������� �����.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
