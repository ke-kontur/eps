
package ru.acs.fts.schemas.album.paymentdocument;

/** 
 * �������
 */
public class PaymentType
{
    private String paymentModeCode;
    private String amountRUB;
    private String amount;

    /** 
     * Get the 'PaymentModeCode' element value. ��� ���� ������� � ������������ � ���������������  ����� �������, ������ � ���� ��������, �������� ������� ��������� �� ���������� ������
     * 
     * @return value
     */
    public String getPaymentModeCode() {
        return paymentModeCode;
    }

    /** 
     * Set the 'PaymentModeCode' element value. ��� ���� ������� � ������������ � ���������������  ����� �������, ������ � ���� ��������, �������� ������� ��������� �� ���������� ������
     * 
     * @param paymentModeCode
     */
    public void setPaymentModeCode(String paymentModeCode) {
        this.paymentModeCode = paymentModeCode;
    }

    /** 
     * Get the 'AmountRUB' element value. ��/��: - ����� �������, ���������� ���������� (����������) �� �������������� �� (� ������ ���������� ���������); ��/���: - ����� ���������� ��������, ���������� ���������� �� ��������������� ��� (� ������ ���������� ���������); ��/��: - ����� ��������� ������, ��������� �� �������������� ��
     * 
     * @return value
     */
    public String getAmountRUB() {
        return amountRUB;
    }

    /** 
     * Set the 'AmountRUB' element value. ��/��: - ����� �������, ���������� ���������� (����������) �� �������������� �� (� ������ ���������� ���������); ��/���: - ����� ���������� ��������, ���������� ���������� �� ��������������� ��� (� ������ ���������� ���������); ��/��: - ����� ��������� ������, ��������� �� �������������� ��
     * 
     * @param amountRUB
     */
    public void setAmountRUB(String amountRUB) {
        this.amountRUB = amountRUB;
    }

    /** 
     * Get the 'Amount' element value. ��/��: - ����� �������, ��������� � ���� ������ �� ������� ��; ��/���: - ����� �������, ��������� � ���� ������ ���������� �������� �� �������� ���; ��/��: - �����, ����������� � �������� ��������� ������ �� ������� ��
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. ��/��: - ����� �������, ��������� � ���� ������ �� ������� ��; ��/���: - ����� �������, ��������� � ���� ������ ���������� �������� �� �������� ���; ��/��: - �����, ����������� � �������� ��������� ������ �� ������� ��
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }
}
