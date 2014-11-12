
package ru.acs.fts.schemas.album.paymentconfirmation;

/** 
 * ������
 */
public class PaymentType
{
    private String paymentKind;
    private String cardNumber;

    /** 
     * Get the 'PaymentKind' element value. ��� ������: 1 - �����, 0 - ��������
     * 
     * @return value
     */
    public String getPaymentKind() {
        return paymentKind;
    }

    /** 
     * Set the 'PaymentKind' element value. ��� ������: 1 - �����, 0 - ��������
     * 
     * @param paymentKind
     */
    public void setPaymentKind(String paymentKind) {
        this.paymentKind = paymentKind;
    }

    /** 
     * Get the 'CardNumber' element value. ����� �����
     * 
     * @return value
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /** 
     * Set the 'CardNumber' element value. ����� �����
     * 
     * @param cardNumber
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
