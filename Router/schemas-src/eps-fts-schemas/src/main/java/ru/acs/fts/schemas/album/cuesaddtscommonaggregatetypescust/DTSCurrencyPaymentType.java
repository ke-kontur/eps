
package ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust;

/** 
 * ����������  �� ����� ������ � ������
 */
public class DTSCurrencyPaymentType
{
    private String positionsNumber;
    private String currencyAmount;
    private String currencyCode;
    private String currencyRate;
    private String currencyQuantity;

    /** 
     * Get the 'PositionsNumber' element value. ����� ������� (����� ����� ���, � ������� ��������� ����� ��������)
     * 
     * @return value
     */
    public String getPositionsNumber() {
        return positionsNumber;
    }

    /** 
     * Set the 'PositionsNumber' element value. ����� ������� (����� ����� ���, � ������� ��������� ����� ��������)
     * 
     * @param positionsNumber
     */
    public void setPositionsNumber(String positionsNumber) {
        this.positionsNumber = positionsNumber;
    }

    /** 
     * Get the 'CurrencyAmount' element value. ����� � ������ ����� �� �������
     * 
     * @return value
     */
    public String getCurrencyAmount() {
        return currencyAmount;
    }

    /** 
     * Set the 'CurrencyAmount' element value. ����� � ������ ����� �� �������
     * 
     * @param currencyAmount
     */
    public void setCurrencyAmount(String currencyAmount) {
        this.currencyAmount = currencyAmount;
    }

    /** 
     * Get the 'CurrencyCode' element value. ����������� ��������� ��� ������ �� �������, � ������������ � ��������������� �����
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. ����������� ��������� ��� ������ �� �������, � ������������ � ��������������� �����
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'CurrencyRate' element value. ���� ������ �� �������
     * 
     * @return value
     */
    public String getCurrencyRate() {
        return currencyRate;
    }

    /** 
     * Set the 'CurrencyRate' element value. ���� ������ �� �������
     * 
     * @param currencyRate
     */
    public void setCurrencyRate(String currencyRate) {
        this.currencyRate = currencyRate;
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
}
