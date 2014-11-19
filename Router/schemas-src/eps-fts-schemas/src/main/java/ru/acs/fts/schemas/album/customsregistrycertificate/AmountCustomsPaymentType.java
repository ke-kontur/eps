
package ru.acs.fts.schemas.album.customsregistrycertificate;

/** 
 * �������� �� ����������� ������ ���������� ��������
 */
public class AmountCustomsPaymentType
{
    private String paymentWayCode;
    private String amount;
    private String currency;

    /** 
     * Get the 'PaymentWayCode' element value. ��� ������� ����������� ������ ���������� �������� � ������������ � ��������������� �������� ����������� ������ ���������� ������, �������
     * 
     * @return value
     */
    public String getPaymentWayCode() {
        return paymentWayCode;
    }

    /** 
     * Set the 'PaymentWayCode' element value. ��� ������� ����������� ������ ���������� �������� � ������������ � ��������������� �������� ����������� ������ ���������� ������, �������
     * 
     * @param paymentWayCode
     */
    public void setPaymentWayCode(String paymentWayCode) {
        this.paymentWayCode = paymentWayCode;
    }

    /** 
     * Get the 'Amount' element value. ����� �����������
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. ����� �����������
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'Currency' element value. ��� ������
     * 
     * @return value
     */
    public String getCurrency() {
        return currency;
    }

    /** 
     * Set the 'Currency' element value. ��� ������
     * 
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
