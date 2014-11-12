
package ru.acs.fts.schemas.album.paymentdocument;

/** 
 * ДУ - незавершенные расчеты
 */
public class OutstandingBalancesType
{
    private String BCC;
    private String paymentModeCode;
    private String deptAmount;
    private String overpayment;

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
     * Get the 'DeptAmount' element value. Сумма задолженности
     * 
     * @return value
     */
    public String getDeptAmount() {
        return deptAmount;
    }

    /** 
     * Set the 'DeptAmount' element value. Сумма задолженности
     * 
     * @param deptAmount
     */
    public void setDeptAmount(String deptAmount) {
        this.deptAmount = deptAmount;
    }

    /** 
     * Get the 'Overpayment' element value. Сумма переплаты 
     * 
     * @return value
     */
    public String getOverpayment() {
        return overpayment;
    }

    /** 
     * Set the 'Overpayment' element value. Сумма переплаты 
     * 
     * @param overpayment
     */
    public void setOverpayment(String overpayment) {
        this.overpayment = overpayment;
    }
}
