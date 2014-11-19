
package ru.acs.fts.schemas.album.paymentdocument;

/** 
 * �� - ������������� �������
 */
public class OutstandingBalancesType
{
    private String BCC;
    private String paymentModeCode;
    private String deptAmount;
    private String overpayment;

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
     * Get the 'DeptAmount' element value. ����� �������������
     * 
     * @return value
     */
    public String getDeptAmount() {
        return deptAmount;
    }

    /** 
     * Set the 'DeptAmount' element value. ����� �������������
     * 
     * @param deptAmount
     */
    public void setDeptAmount(String deptAmount) {
        this.deptAmount = deptAmount;
    }

    /** 
     * Get the 'Overpayment' element value. ����� ��������� 
     * 
     * @return value
     */
    public String getOverpayment() {
        return overpayment;
    }

    /** 
     * Set the 'Overpayment' element value. ����� ��������� 
     * 
     * @param overpayment
     */
    public void setOverpayment(String overpayment) {
        this.overpayment = overpayment;
    }
}
