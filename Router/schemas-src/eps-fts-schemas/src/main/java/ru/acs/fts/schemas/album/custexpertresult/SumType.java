
package ru.acs.fts.schemas.album.custexpertresult;

/** 
 * �����
 */
public class SumType
{
    private String sumWords;
    private String sumNumber;
    private String currencyCode;

    /** 
     * Get the 'SumWords' element value. ����� ��������
     * 
     * @return value
     */
    public String getSumWords() {
        return sumWords;
    }

    /** 
     * Set the 'SumWords' element value. ����� ��������
     * 
     * @param sumWords
     */
    public void setSumWords(String sumWords) {
        this.sumWords = sumWords;
    }

    /** 
     * Get the 'SumNumber' element value. �����
     * 
     * @return value
     */
    public String getSumNumber() {
        return sumNumber;
    }

    /** 
     * Set the 'SumNumber' element value. �����
     * 
     * @param sumNumber
     */
    public void setSumNumber(String sumNumber) {
        this.sumNumber = sumNumber;
    }

    /** 
     * Get the 'CurrencyCode' element value. ��� ������ 
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. ��� ������ 
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
