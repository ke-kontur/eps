
package ru.acs.fts.schemas.album.paymentconfirmation;

/** 
 * ������
 */
public class PayingType
{
    private String paymentModeCode;
    private String CBC;
    private String amount;

    /** 
     * Get the 'PaymentModeCode' element value. ��� ���� ����������� �������
     * 
     * @return value
     */
    public String getPaymentModeCode() {
        return paymentModeCode;
    }

    /** 
     * Set the 'PaymentModeCode' element value. ��� ���� ����������� �������
     * 
     * @param paymentModeCode
     */
    public void setPaymentModeCode(String paymentModeCode) {
        this.paymentModeCode = paymentModeCode;
    }

    /** 
     * Get the 'CBC' element value. ��� ��������� ������������� (���)
     * 
     * @return value
     */
    public String getCBC() {
        return CBC;
    }

    /** 
     * Set the 'CBC' element value. ��� ��������� ������������� (���)
     * 
     * @param CBC
     */
    public void setCBC(String CBC) {
        this.CBC = CBC;
    }

    /** 
     * Get the 'Amount' element value. �����, ���������� ������
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. �����, ���������� ������
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }
}
