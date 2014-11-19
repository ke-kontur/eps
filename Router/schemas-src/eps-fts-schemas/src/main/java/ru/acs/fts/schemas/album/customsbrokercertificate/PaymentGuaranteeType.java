
package ru.acs.fts.schemas.album.customsbrokercertificate;

/** 
 * ����������� ������ ���������� ��������
 */
public class PaymentGuaranteeType
{
    private String paymentModeCode;
    private String paymentMode;
    private String paymentAmount;

    /** 
     * Get the 'PaymentModeCode' element value. ��� ���� ����������� ������� �� �������������� ����� �������, ������ � ���� ��������, �������� ������� ��������� �� ���������� ������.
     * 
     * @return value
     */
    public String getPaymentModeCode() {
        return paymentModeCode;
    }

    /** 
     * Set the 'PaymentModeCode' element value. ��� ���� ����������� ������� �� �������������� ����� �������, ������ � ���� ��������, �������� ������� ��������� �� ���������� ������.
     * 
     * @param paymentModeCode
     */
    public void setPaymentModeCode(String paymentModeCode) {
        this.paymentModeCode = paymentModeCode;
    }

    /** 
     * Get the 'PaymentMode' element value. ����� ����������� ������ ���������� �������� (����� ���������, ���������� ��������, �������� �����, ��������������, ������� �����������)
     * 
     * @return value
     */
    public String getPaymentMode() {
        return paymentMode;
    }

    /** 
     * Set the 'PaymentMode' element value. ����� ����������� ������ ���������� �������� (����� ���������, ���������� ��������, �������� �����, ��������������, ������� �����������)
     * 
     * @param paymentMode
     */
    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    /** 
     * Get the 'PaymentAmount' element value. ����� �����������
     * 
     * @return value
     */
    public String getPaymentAmount() {
        return paymentAmount;
    }

    /** 
     * Set the 'PaymentAmount' element value. ����� �����������
     * 
     * @param paymentAmount
     */
    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
}
