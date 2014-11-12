
package ru.acs.fts.schemas.album.paymentdocument;

/** 
 * Платежи
 */
public class PaymentType
{
    private String paymentModeCode;
    private String amountRUB;
    private String amount;

    /** 
     * Get the 'PaymentModeCode' element value. Код вида платежа в соответствии с Классификатором  видов налогов, сборов и иных платежей, взимание которых возложено на таможенные органы
     * 
     * @return value
     */
    public String getPaymentModeCode() {
        return paymentModeCode;
    }

    /** 
     * Set the 'PaymentModeCode' element value. Код вида платежа в соответствии с Классификатором  видов налогов, сборов и иных платежей, взимание которых возложено на таможенные органы
     * 
     * @param paymentModeCode
     */
    public void setPaymentModeCode(String paymentModeCode) {
        this.paymentModeCode = paymentModeCode;
    }

    /** 
     * Get the 'AmountRUB' element value. ДУ/ДТ: - сумма платежа, фактически уплаченная (взысканная) по предшествующей ДТ (в валюте Российской Федерации); ДУ/ТПО: - сумма таможенных платежей, фактически уплаченная по предшествующему ТПО (в валюте Российской Федерации); ДУ/ТР: - сумма денежного залога, внесенная по предшествующей ТР
     * 
     * @return value
     */
    public String getAmountRUB() {
        return amountRUB;
    }

    /** 
     * Set the 'AmountRUB' element value. ДУ/ДТ: - сумма платежа, фактически уплаченная (взысканная) по предшествующей ДТ (в валюте Российской Федерации); ДУ/ТПО: - сумма таможенных платежей, фактически уплаченная по предшествующему ТПО (в валюте Российской Федерации); ДУ/ТР: - сумма денежного залога, внесенная по предшествующей ТР
     * 
     * @param amountRUB
     */
    public void setAmountRUB(String amountRUB) {
        this.amountRUB = amountRUB;
    }

    /** 
     * Get the 'Amount' element value. ДУ/ДТ: - сумма платежа, зачтенная в счет уплаты по текущей ДТ; ДУ/ТПО: - сумма платеже, зачтенная в счет уплаты таможенных платежей по текущему ТПО; ДУ/ТР: - сумма, учитываемая в качестве денежного залога по текущей ТР
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. ДУ/ДТ: - сумма платежа, зачтенная в счет уплаты по текущей ДТ; ДУ/ТПО: - сумма платеже, зачтенная в счет уплаты таможенных платежей по текущему ТПО; ДУ/ТР: - сумма, учитываемая в качестве денежного залога по текущей ТР
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }
}
