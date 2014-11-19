
package ru.acs.fts.schemas.album.paymentconfirmation;

/** 
 * Оплата
 */
public class PaymentType
{
    private String paymentKind;
    private String cardNumber;

    /** 
     * Get the 'PaymentKind' element value. Вид оплаты: 1 - карта, 0 - наличные
     * 
     * @return value
     */
    public String getPaymentKind() {
        return paymentKind;
    }

    /** 
     * Set the 'PaymentKind' element value. Вид оплаты: 1 - карта, 0 - наличные
     * 
     * @param paymentKind
     */
    public void setPaymentKind(String paymentKind) {
        this.paymentKind = paymentKind;
    }

    /** 
     * Get the 'CardNumber' element value. Номер карты
     * 
     * @return value
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /** 
     * Set the 'CardNumber' element value. Номер карты
     * 
     * @param cardNumber
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
