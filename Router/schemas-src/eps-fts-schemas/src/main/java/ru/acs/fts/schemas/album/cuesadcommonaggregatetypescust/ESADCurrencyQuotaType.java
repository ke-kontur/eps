
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

/** 
 * �������� �� ������� ����� � �������� ���������. ����������� � ������, ���� ����� ����������� � �������� ���������
 */
public class ESADCurrencyQuotaType
{
    private String quotaCurrencyQuantity;
    private String quotaCurrencyCode;
    private String quotaCurrencyName;

    /** 
     * Get the 'QuotaCurrencyQuantity' element value. ������� ����� � ������
     * 
     * @return value
     */
    public String getQuotaCurrencyQuantity() {
        return quotaCurrencyQuantity;
    }

    /** 
     * Set the 'QuotaCurrencyQuantity' element value. ������� ����� � ������
     * 
     * @param quotaCurrencyQuantity
     */
    public void setQuotaCurrencyQuantity(String quotaCurrencyQuantity) {
        this.quotaCurrencyQuantity = quotaCurrencyQuantity;
    }

    /** 
     * Get the 'QuotaCurrencyCode' element value. �������� ��� ������ ����� � ������������ � ��������������� ����� �����
     * 
     * @return value
     */
    public String getQuotaCurrencyCode() {
        return quotaCurrencyCode;
    }

    /** 
     * Set the 'QuotaCurrencyCode' element value. �������� ��� ������ ����� � ������������ � ��������������� ����� �����
     * 
     * @param quotaCurrencyCode
     */
    public void setQuotaCurrencyCode(String quotaCurrencyCode) {
        this.quotaCurrencyCode = quotaCurrencyCode;
    }

    /** 
     * Get the 'QuotaCurrencyName' element value. ������������ ������ �����
     * 
     * @return value
     */
    public String getQuotaCurrencyName() {
        return quotaCurrencyName;
    }

    /** 
     * Set the 'QuotaCurrencyName' element value. ������������ ������ �����
     * 
     * @param quotaCurrencyName
     */
    public void setQuotaCurrencyName(String quotaCurrencyName) {
        this.quotaCurrencyName = quotaCurrencyName;
    }
}
