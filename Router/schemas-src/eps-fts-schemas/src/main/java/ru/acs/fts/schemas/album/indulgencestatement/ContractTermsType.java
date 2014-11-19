
package ru.acs.fts.schemas.album.indulgencestatement;

import org.joda.time.LocalDate;

/** 
 * ������� ���������
 */
public class ContractTermsType
{
    private LocalDate lastDate;
    private String currencyCode;

    /** 
     * Get the 'LastDate' element value. ���� ��������� �������� �� ���������
     * 
     * @return value
     */
    public LocalDate getLastDate() {
        return lastDate;
    }

    /** 
     * Set the 'LastDate' element value. ���� ��������� �������� �� ���������
     * 
     * @param lastDate
     */
    public void setLastDate(LocalDate lastDate) {
        this.lastDate = lastDate;
    }

    /** 
     * Get the 'CurrencyCode' element value. ��� ������ ���������
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. ��� ������ ���������
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
