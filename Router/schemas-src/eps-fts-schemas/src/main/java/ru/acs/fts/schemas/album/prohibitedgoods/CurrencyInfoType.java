
package ru.acs.fts.schemas.album.prohibitedgoods;

/** 
 * ���������� � ������ � �������� ���������
 */
public class CurrencyInfoType
{
    private String amout;
    private String currencyCode;

    /** 
     * Get the 'Amout' element value. �����
     * 
     * @return value
     */
    public String getAmout() {
        return amout;
    }

    /** 
     * Set the 'Amout' element value. �����
     * 
     * @param amout
     */
    public void setAmout(String amout) {
        this.amout = amout;
    }

    /** 
     * Get the 'CurrencyCode' element value. ��� ���� ������
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. ��� ���� ������
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
