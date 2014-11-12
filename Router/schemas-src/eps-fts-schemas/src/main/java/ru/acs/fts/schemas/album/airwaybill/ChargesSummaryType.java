
package ru.acs.fts.schemas.album.airwaybill;

/** 
 * Суммы по платежам
 */
public class ChargesSummaryType
{
    private String paymentCode;
    private String totalAmount;
    private ChargesInfoType totalWeightCharge;
    private ChargesInfoType valuationCharge;
    private ChargesInfoType taxes;
    private ChargesInfoType totalAgentCharges;
    private ChargesInfoType totalCarrierCharges;

    /** 
     * Get the 'PaymentCode' element value. Идентификатор
     * 
     * @return value
     */
    public String getPaymentCode() {
        return paymentCode;
    }

    /** 
     * Set the 'PaymentCode' element value. Идентификатор
     * 
     * @param paymentCode
     */
    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
    }

    /** 
     * Get the 'TotalAmount' element value. Общая сумма
     * 
     * @return value
     */
    public String getTotalAmount() {
        return totalAmount;
    }

    /** 
     * Set the 'TotalAmount' element value. Общая сумма
     * 
     * @param totalAmount
     */
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    /** 
     * Get the 'TotalWeightCharge' element value. Общая оплата по весу
     * 
     * @return value
     */
    public ChargesInfoType getTotalWeightCharge() {
        return totalWeightCharge;
    }

    /** 
     * Set the 'TotalWeightCharge' element value. Общая оплата по весу
     * 
     * @param totalWeightCharge
     */
    public void setTotalWeightCharge(ChargesInfoType totalWeightCharge) {
        this.totalWeightCharge = totalWeightCharge;
    }

    /** 
     * Get the 'ValuationCharge' element value. Плата по объявленной стоимости
     * 
     * @return value
     */
    public ChargesInfoType getValuationCharge() {
        return valuationCharge;
    }

    /** 
     * Set the 'ValuationCharge' element value. Плата по объявленной стоимости
     * 
     * @param valuationCharge
     */
    public void setValuationCharge(ChargesInfoType valuationCharge) {
        this.valuationCharge = valuationCharge;
    }

    /** 
     * Get the 'Taxes' element value. Налоги
     * 
     * @return value
     */
    public ChargesInfoType getTaxes() {
        return taxes;
    }

    /** 
     * Set the 'Taxes' element value. Налоги
     * 
     * @param taxes
     */
    public void setTaxes(ChargesInfoType taxes) {
        this.taxes = taxes;
    }

    /** 
     * Get the 'TotalAgentCharges' element value. Прочие сборы в пользу  агента
     * 
     * @return value
     */
    public ChargesInfoType getTotalAgentCharges() {
        return totalAgentCharges;
    }

    /** 
     * Set the 'TotalAgentCharges' element value. Прочие сборы в пользу  агента
     * 
     * @param totalAgentCharges
     */
    public void setTotalAgentCharges(ChargesInfoType totalAgentCharges) {
        this.totalAgentCharges = totalAgentCharges;
    }

    /** 
     * Get the 'TotalCarrierCharges' element value. Сборы в пользу перевозчика
     * 
     * @return value
     */
    public ChargesInfoType getTotalCarrierCharges() {
        return totalCarrierCharges;
    }

    /** 
     * Set the 'TotalCarrierCharges' element value. Сборы в пользу перевозчика
     * 
     * @param totalCarrierCharges
     */
    public void setTotalCarrierCharges(ChargesInfoType totalCarrierCharges) {
        this.totalCarrierCharges = totalCarrierCharges;
    }
}
