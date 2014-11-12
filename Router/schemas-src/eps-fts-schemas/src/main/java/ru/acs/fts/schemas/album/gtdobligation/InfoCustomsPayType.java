
package ru.acs.fts.schemas.album.gtdobligation;

/** 
 * �������� �� ����������� ���������� �������� (�����������, ���� ����������� ������ ����������   ��������  ��� ���������  ����������� ������ ������������� ���������� ��������, � ���� ������ - �� �����������)
 */
public class InfoCustomsPayType
{
    private String executeAssure;
    private String paymenSecuring;
    private String paymentSum;

    /** 
     * Get the 'ExecuteAssure' element value. ������ ������������� ���������� �������� �����������/����������. ���� �������� 1  - �����������, 0 - ����������
     * 
     * @return value
     */
    public String getExecuteAssure() {
        return executeAssure;
    }

    /** 
     * Set the 'ExecuteAssure' element value. ������ ������������� ���������� �������� �����������/����������. ���� �������� 1  - �����������, 0 - ����������
     * 
     * @param executeAssure
     */
    public void setExecuteAssure(String executeAssure) {
        this.executeAssure = executeAssure;
    }

    /** 
     * Get the 'PaymenSecuring' element value. �������������� ������/ ����������� ������   ������������� ���������� �������� ��������� �����������. ���� �������� 1 -   ������, 0 - �����������
     * 
     * @return value
     */
    public String getPaymenSecuring() {
        return paymenSecuring;
    }

    /** 
     * Set the 'PaymenSecuring' element value. �������������� ������/ ����������� ������   ������������� ���������� �������� ��������� �����������. ���� �������� 1 -   ������, 0 - �����������
     * 
     * @param paymenSecuring
     */
    public void setPaymenSecuring(String paymenSecuring) {
        this.paymenSecuring = paymenSecuring;
    }

    /** 
     * Get the 'PaymentSum' element value. �����
     * 
     * @return value
     */
    public String getPaymentSum() {
        return paymentSum;
    }

    /** 
     * Set the 'PaymentSum' element value. �����
     * 
     * @param paymentSum
     */
    public void setPaymentSum(String paymentSum) {
        this.paymentSum = paymentSum;
    }
}
