
package ru.acs.fts.schemas.album.dealpassport;

/** 
 * ����� �������� � ���������
 */
public class ContractTermsType extends TermsType
{
    private String amount;
    private String currencyCode;
    private String WS;
    private String currencyName;

    /** 
     * Get the 'Amount' element value. ����� ����� ������
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. ����� ����� ������
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'CurrencyCode' element value. ��� ������ ��������� (����)
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. ��� ������ ��������� (����)
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'WS' element value. 1 - "��� �����"
     * 
     * @return value
     */
    public String getWS() {
        return WS;
    }

    /** 
     * Set the 'WS' element value. 1 - "��� �����"
     * 
     * @param WS
     */
    public void setWS(String WS) {
        this.WS = WS;
    }

    /** 
     * Get the 'CurrencyName' element value. ������� ������������ ������ ���������
     * 
     * @return value
     */
    public String getCurrencyName() {
        return currencyName;
    }

    /** 
     * Set the 'CurrencyName' element value. ������� ������������ ������ ���������
     * 
     * @param currencyName
     */
    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }
}
