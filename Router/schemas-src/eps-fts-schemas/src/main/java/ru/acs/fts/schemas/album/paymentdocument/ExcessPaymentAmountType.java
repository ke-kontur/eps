
package ru.acs.fts.schemas.album.paymentdocument;

import org.joda.time.LocalDate;

/** 
 * �� - ����� �������� ������, ������ � �����
 */
public class ExcessPaymentAmountType
{
    private String BCC;
    private String paymentModeCode;
    private String amount;
    private LocalDate dateDrawdown;
    private String deregistrationSign;

    /** 
     * Get the 'BCC' element value. ��� ��������� ������������� (���) �������� ��������������  ����� �������, ������ � ���� ��������, �������� ������� ��������� �� ���������� ������.
     * 
     * @return value
     */
    public String getBCC() {
        return BCC;
    }

    /** 
     * Set the 'BCC' element value. ��� ��������� ������������� (���) �������� ��������������  ����� �������, ������ � ���� ��������, �������� ������� ��������� �� ���������� ������.
     * 
     * @param BCC
     */
    public void setBCC(String BCC) {
        this.BCC = BCC;
    }

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
     * Get the 'Amount' element value. ����� �������� ������ ���������� ��������, ������ � ����� � ����� � � ��������� �� ��������� ���� �����������, ������� �� ������� ���� ����������� ��� � ���� ��������� ������������� �� ������ ���������� �������� ���� ��������� � ������� ������ ����������� ������� ������������ ������� ��� ����������������
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. ����� �������� ������ ���������� ��������, ������ � ����� � ����� � � ��������� �� ��������� ���� �����������, ������� �� ������� ���� ����������� ��� � ���� ��������� ������������� �� ������ ���������� �������� ���� ��������� � ������� ������ ����������� ������� ������������ ������� ��� ����������������
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'DateDrawdown' element value. ���� ������ � ����� - ���� ������� �� �������/����� �������� ������� ��� ���� ���� � ��������� ���������������� �������� �������
     * 
     * @return value
     */
    public LocalDate getDateDrawdown() {
        return dateDrawdown;
    }

    /** 
     * Set the 'DateDrawdown' element value. ���� ������ � ����� - ���� ������� �� �������/����� �������� ������� ��� ���� ���� � ��������� ���������������� �������� �������
     * 
     * @param dateDrawdown
     */
    public void setDateDrawdown(LocalDate dateDrawdown) {
        this.dateDrawdown = dateDrawdown;
    }

    /** 
     * Get the 'DeregistrationSign' element value. ������� ������ � �����: "1" - ������� �� ��������� ���� �����������; "2" - ����� �� ������� ���� �����������; "3" - ����� � ���� ��������� ������������� �� ������ ���������� ��������; "4" - ��������� � ������� ������ ����������� ������� ������������ ������� ��� ����������������.
     * 
     * @return value
     */
    public String getDeregistrationSign() {
        return deregistrationSign;
    }

    /** 
     * Set the 'DeregistrationSign' element value. ������� ������ � �����: "1" - ������� �� ��������� ���� �����������; "2" - ����� �� ������� ���� �����������; "3" - ����� � ���� ��������� ������������� �� ������ ���������� ��������; "4" - ��������� � ������� ������ ����������� ������� ������������ ������� ��� ����������������.
     * 
     * @param deregistrationSign
     */
    public void setDeregistrationSign(String deregistrationSign) {
        this.deregistrationSign = deregistrationSign;
    }
}
