
package ru.acs.fts.schemas.album.tpo;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения о платеже
 */
public class PaymentInfoType
{
    private String paymentModeCode;
    private String paymentName;
    private String taxBase;
    private String rate;
    private String amount;
    private String taxBaseQualifierCode;
    private String rateQualifierCode;
    private List<PaymentDetailsType> paymentDetailList = new ArrayList<PaymentDetailsType>();

    /** 
     * Get the 'PaymentModeCode' element value. Код вида платежа в соответствии с Классификатором видов таможенных и иных платежей
     * 
     * @return value
     */
    public String getPaymentModeCode() {
        return paymentModeCode;
    }

    /** 
     * Set the 'PaymentModeCode' element value. Код вида платежа в соответствии с Классификатором видов таможенных и иных платежей
     * 
     * @param paymentModeCode
     */
    public void setPaymentModeCode(String paymentModeCode) {
        this.paymentModeCode = paymentModeCode;
    }

    /** 
     * Get the 'PaymentName' element value. Наименование платежа
     * 
     * @return value
     */
    public String getPaymentName() {
        return paymentName;
    }

    /** 
     * Set the 'PaymentName' element value. Наименование платежа
     * 
     * @param paymentName
     */
    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }

    /** 
     * Get the 'TaxBase' element value. Основа начисления
     * 
     * @return value
     */
    public String getTaxBase() {
        return taxBase;
    }

    /** 
     * Set the 'TaxBase' element value. Основа начисления
     * 
     * @param taxBase
     */
    public void setTaxBase(String taxBase) {
        this.taxBase = taxBase;
    }

    /** 
     * Get the 'Rate' element value. Ставка
     * 
     * @return value
     */
    public String getRate() {
        return rate;
    }

    /** 
     * Set the 'Rate' element value. Ставка
     * 
     * @param rate
     */
    public void setRate(String rate) {
        this.rate = rate;
    }

    /** 
     * Get the 'Amount' element value. Исчисленная сумма
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. Исчисленная сумма
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'TaxBaseQualifierCode' element value. Единица основы начисления платежа
     * 
     * @return value
     */
    public String getTaxBaseQualifierCode() {
        return taxBaseQualifierCode;
    }

    /** 
     * Set the 'TaxBaseQualifierCode' element value. Единица основы начисления платежа
     * 
     * @param taxBaseQualifierCode
     */
    public void setTaxBaseQualifierCode(String taxBaseQualifierCode) {
        this.taxBaseQualifierCode = taxBaseQualifierCode;
    }

    /** 
     * Get the 'RateQualifierCode' element value. Код единицы измерения ставки
     * 
     * @return value
     */
    public String getRateQualifierCode() {
        return rateQualifierCode;
    }

    /** 
     * Set the 'RateQualifierCode' element value. Код единицы измерения ставки
     * 
     * @param rateQualifierCode
     */
    public void setRateQualifierCode(String rateQualifierCode) {
        this.rateQualifierCode = rateQualifierCode;
    }

    /** 
     * Get the list of 'PaymentDetails' element items. Подробности уплаты
     * 
     * @return list
     */
    public List<PaymentDetailsType> getPaymentDetailList() {
        return paymentDetailList;
    }

    /** 
     * Set the list of 'PaymentDetails' element items. Подробности уплаты
     * 
     * @param list
     */
    public void setPaymentDetailList(List<PaymentDetailsType> list) {
        paymentDetailList = list;
    }
}
