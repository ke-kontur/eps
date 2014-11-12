
package ru.acs.fts.schemas.album.calculationamountpayment;

/** 
 * Расчет суммы таможенных пошлин и сборов, уплаченных декларантом
 */
public class AmountDuesCalculationType
{
    private String paymentModeCode;
    private String amountDues;

    /** 
     * Get the 'PaymentModeCode' element value. Код вида платежа  по классификатору видов налогов, сборов и иных платежей, взимание которых возложено на таможенные органы
     * 
     * @return value
     */
    public String getPaymentModeCode() {
        return paymentModeCode;
    }

    /** 
     * Set the 'PaymentModeCode' element value. Код вида платежа  по классификатору видов налогов, сборов и иных платежей, взимание которых возложено на таможенные органы
     * 
     * @param paymentModeCode
     */
    public void setPaymentModeCode(String paymentModeCode) {
        this.paymentModeCode = paymentModeCode;
    }

    /** 
     * Get the 'AmountDues' element value. Сумма таможенных пошлин и сборов, уплаченных декларантом (в соответствии с гр. 47 ДТ)
     * 
     * @return value
     */
    public String getAmountDues() {
        return amountDues;
    }

    /** 
     * Set the 'AmountDues' element value. Сумма таможенных пошлин и сборов, уплаченных декларантом (в соответствии с гр. 47 ДТ)
     * 
     * @param amountDues
     */
    public void setAmountDues(String amountDues) {
        this.amountDues = amountDues;
    }
}
