
package ru.acs.fts.schemas.album.paymentdocument;

import org.joda.time.LocalDate;

/** 
 * ДУ - суммы излишней уплаты, снятые с учета
 */
public class ExcessPaymentAmountType
{
    private String BCC;
    private String paymentModeCode;
    private String amount;
    private LocalDate dateDrawdown;
    private String deregistrationSign;

    /** 
     * Get the 'BCC' element value. Код бюджетной классификации (КБК) согласно Классификатору  видов налогов, сборов и иных платежей, взимание которых возложено на таможенные органы.
     * 
     * @return value
     */
    public String getBCC() {
        return BCC;
    }

    /** 
     * Set the 'BCC' element value. Код бюджетной классификации (КБК) согласно Классификатору  видов налогов, сборов и иных платежей, взимание которых возложено на таможенные органы.
     * 
     * @param BCC
     */
    public void setBCC(String BCC) {
        this.BCC = BCC;
    }

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
     * Get the 'Amount' element value. Сумма излишней уплаты таможенных платежей, снятой с учета в связи с её возвратом на расчетный счет плательщика, зачетом на лицевой счет плательщика или в счет погашения задолженности по уплате таможенных платежей либо отражения в составе прочих неналоговых доходов федерального бюджета как невостребованной
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. Сумма излишней уплаты таможенных платежей, снятой с учета в связи с её возвратом на расчетный счет плательщика, зачетом на лицевой счет плательщика или в счет погашения задолженности по уплате таможенных платежей либо отражения в составе прочих неналоговых доходов федерального бюджета как невостребованной
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'DateDrawdown' element value. Дата снятия с учета - дата решения на возврат/зачет денежных средств или дата акта о выявлении невостребованных денежных средств
     * 
     * @return value
     */
    public LocalDate getDateDrawdown() {
        return dateDrawdown;
    }

    /** 
     * Set the 'DateDrawdown' element value. Дата снятия с учета - дата решения на возврат/зачет денежных средств или дата акта о выявлении невостребованных денежных средств
     * 
     * @param dateDrawdown
     */
    public void setDateDrawdown(LocalDate dateDrawdown) {
        this.dateDrawdown = dateDrawdown;
    }

    /** 
     * Get the 'DeregistrationSign' element value. Признак снятия с учета: "1" - возврат на расчетный счет плательщика; "2" - зачет на лицевой счет плательщика; "3" - зачет в счет погашения задолженности по уплате таможенных платежей; "4" - отражение в составе прочих неналоговых доходов федерального бюджета как невостребованной.
     * 
     * @return value
     */
    public String getDeregistrationSign() {
        return deregistrationSign;
    }

    /** 
     * Set the 'DeregistrationSign' element value. Признак снятия с учета: "1" - возврат на расчетный счет плательщика; "2" - зачет на лицевой счет плательщика; "3" - зачет в счет погашения задолженности по уплате таможенных платежей; "4" - отражение в составе прочих неналоговых доходов федерального бюджета как невостребованной.
     * 
     * @param deregistrationSign
     */
    public void setDeregistrationSign(String deregistrationSign) {
        this.deregistrationSign = deregistrationSign;
    }
}
