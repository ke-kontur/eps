
package ru.acs.fts.schemas.album.represappliccustomsmark;

/** 
 * ���������� �������, ���������� ������
 */
public class CustomsDutiesType
{
    private String duties;
    private String taxes;
    private String currencyCode;

    /** 
     * Get the 'Duties' element value. ���������� �������, ������
     * 
     * @return value
     */
    public String getDuties() {
        return duties;
    }

    /** 
     * Set the 'Duties' element value. ���������� �������, ������
     * 
     * @param duties
     */
    public void setDuties(String duties) {
        this.duties = duties;
    }

    /** 
     * Get the 'Taxes' element value. ���������� �����
     * 
     * @return value
     */
    public String getTaxes() {
        return taxes;
    }

    /** 
     * Set the 'Taxes' element value. ���������� �����
     * 
     * @param taxes
     */
    public void setTaxes(String taxes) {
        this.taxes = taxes;
    }

    /** 
     * Get the 'CurrencyCode' element value. ��� ������ ����������� �������
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. ��� ������ ����������� �������
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
