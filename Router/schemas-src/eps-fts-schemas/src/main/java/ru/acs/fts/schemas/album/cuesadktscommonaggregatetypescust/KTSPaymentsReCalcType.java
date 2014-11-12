
package ru.acs.fts.schemas.album.cuesadktscommonaggregatetypescust;

/** 
 * ���������� ��������
 */
public class KTSPaymentsReCalcType
{
    private String paymentModeCode;
    private String paymentAmount;
    private String precedingPaymentAmount;
    private String changeAmount;
    private String paymentCurrencyCode;

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
     * Get the 'PaymentAmount' element value. ����� �������
     * 
     * @return value
     */
    public String getPaymentAmount() {
        return paymentAmount;
    }

    /** 
     * Set the 'PaymentAmount' element value. ����� �������
     * 
     * @param paymentAmount
     */
    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    /** 
     * Get the 'PrecedingPaymentAmount' element value. ���������� ����� �������
     * 
     * @return value
     */
    public String getPrecedingPaymentAmount() {
        return precedingPaymentAmount;
    }

    /** 
     * Set the 'PrecedingPaymentAmount' element value. ���������� ����� �������
     * 
     * @param precedingPaymentAmount
     */
    public void setPrecedingPaymentAmount(String precedingPaymentAmount) {
        this.precedingPaymentAmount = precedingPaymentAmount;
    }

    /** 
     * Get the 'ChangeAmount' element value. ���������
     * 
     * @return value
     */
    public String getChangeAmount() {
        return changeAmount;
    }

    /** 
     * Set the 'ChangeAmount' element value. ���������
     * 
     * @param changeAmount
     */
    public void setChangeAmount(String changeAmount) {
        this.changeAmount = changeAmount;
    }

    /** 
     * Get the 'PaymentCurrencyCode' element value. �������� ��� ������ ����� �������
     * 
     * @return value
     */
    public String getPaymentCurrencyCode() {
        return paymentCurrencyCode;
    }

    /** 
     * Set the 'PaymentCurrencyCode' element value. �������� ��� ������ ����� �������
     * 
     * @param paymentCurrencyCode
     */
    public void setPaymentCurrencyCode(String paymentCurrencyCode) {
        this.paymentCurrencyCode = paymentCurrencyCode;
    }
}
