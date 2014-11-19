
package ru.acs.fts.schemas.album.airwaybill;

/** 
 * ������
 */
public class ChargesInfoType
{
    private String paymentCode;
    private String amount;

    /** 
     * Get the 'PaymentCode' element value. ������������� �������
     * 
     * @return value
     */
    public String getPaymentCode() {
        return paymentCode;
    }

    /** 
     * Set the 'PaymentCode' element value. ������������� �������
     * 
     * @param paymentCode
     */
    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
    }

    /** 
     * Get the 'Amount' element value. ����� �������
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. ����� �������
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }
}
