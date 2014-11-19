
package ru.acs.fts.schemas.album.calculationamountpayment;

/** 
 * ������ ����� ���������� ������ � ������, ���������� �����������
 */
public class AmountDuesCalculationType
{
    private String paymentModeCode;
    private String amountDues;

    /** 
     * Get the 'PaymentModeCode' element value. ��� ���� �������  �� �������������� ����� �������, ������ � ���� ��������, �������� ������� ��������� �� ���������� ������
     * 
     * @return value
     */
    public String getPaymentModeCode() {
        return paymentModeCode;
    }

    /** 
     * Set the 'PaymentModeCode' element value. ��� ���� �������  �� �������������� ����� �������, ������ � ���� ��������, �������� ������� ��������� �� ���������� ������
     * 
     * @param paymentModeCode
     */
    public void setPaymentModeCode(String paymentModeCode) {
        this.paymentModeCode = paymentModeCode;
    }

    /** 
     * Get the 'AmountDues' element value. ����� ���������� ������ � ������, ���������� ����������� (� ������������ � ��. 47 ��)
     * 
     * @return value
     */
    public String getAmountDues() {
        return amountDues;
    }

    /** 
     * Set the 'AmountDues' element value. ����� ���������� ������ � ������, ���������� ����������� (� ������������ � ��. 47 ��)
     * 
     * @param amountDues
     */
    public void setAmountDues(String amountDues) {
        this.amountDues = amountDues;
    }
}
