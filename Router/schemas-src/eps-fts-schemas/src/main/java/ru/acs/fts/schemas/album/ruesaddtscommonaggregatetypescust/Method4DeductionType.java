
package ru.acs.fts.schemas.album.ruesaddtscommonaggregatetypescust;

/** 
 * Вычеты сумм, которые вошли в раздел А гр. Б (12-17)
 */
public class Method4DeductionType
{
    private String extraCharge;
    private String russiansTaxPayment;
    private String russianTransportCharge;
    private String russianProcessingCost;
    private String russianAnyCarge;
    private String totalDeductionAmount;

    /** 
     * Get the 'ExtraCharge' element value. Прибыль, комиссионные, торговые и иные подобные наценки (12)
     * 
     * @return value
     */
    public String getExtraCharge() {
        return extraCharge;
    }

    /** 
     * Set the 'ExtraCharge' element value. Прибыль, комиссионные, торговые и иные подобные наценки (12)
     * 
     * @param extraCharge
     */
    public void setExtraCharge(String extraCharge) {
        this.extraCharge = extraCharge;
    }

    /** 
     * Get the 'RussiansTaxPayment' element value. Ввозные таможенные пошлины, налоги, сборы и иные платежи в пользу государства, подлежащие уплате в Российской Федерации. 13.
     * 
     * @return value
     */
    public String getRussiansTaxPayment() {
        return russiansTaxPayment;
    }

    /** 
     * Set the 'RussiansTaxPayment' element value. Ввозные таможенные пошлины, налоги, сборы и иные платежи в пользу государства, подлежащие уплате в Российской Федерации. 13.
     * 
     * @param russiansTaxPayment
     */
    public void setRussiansTaxPayment(String russiansTaxPayment) {
        this.russiansTaxPayment = russiansTaxPayment;
    }

    /** 
     * Get the 'RussianTransportCharge' element value. Расходы по транспортировке и иные накладные расходы после ввоза товаров в Российскую Федерацию. 14
     * 
     * @return value
     */
    public String getRussianTransportCharge() {
        return russianTransportCharge;
    }

    /** 
     * Set the 'RussianTransportCharge' element value. Расходы по транспортировке и иные накладные расходы после ввоза товаров в Российскую Федерацию. 14
     * 
     * @param russianTransportCharge
     */
    public void setRussianTransportCharge(String russianTransportCharge) {
        this.russianTransportCharge = russianTransportCharge;
    }

    /** 
     * Get the 'RussianProcessingCost' element value. Стоимость переработки товаров в Российской Федерации. 15
     * 
     * @return value
     */
    public String getRussianProcessingCost() {
        return russianProcessingCost;
    }

    /** 
     * Set the 'RussianProcessingCost' element value. Стоимость переработки товаров в Российской Федерации. 15
     * 
     * @param russianProcessingCost
     */
    public void setRussianProcessingCost(String russianProcessingCost) {
        this.russianProcessingCost = russianProcessingCost;
    }

    /** 
     * Get the 'RussianAnyCarge' element value. Прочие расходы, включенные в цену продажи в Российской Федерации. 16
     * 
     * @return value
     */
    public String getRussianAnyCarge() {
        return russianAnyCarge;
    }

    /** 
     * Set the 'RussianAnyCarge' element value. Прочие расходы, включенные в цену продажи в Российской Федерации. 16
     * 
     * @param russianAnyCarge
     */
    public void setRussianAnyCarge(String russianAnyCarge) {
        this.russianAnyCarge = russianAnyCarge;
    }

    /** 
     * Get the 'TotalDeductionAmount' element value. Итого сумма вычетов. 17
     * 
     * @return value
     */
    public String getTotalDeductionAmount() {
        return totalDeductionAmount;
    }

    /** 
     * Set the 'TotalDeductionAmount' element value. Итого сумма вычетов. 17
     * 
     * @param totalDeductionAmount
     */
    public void setTotalDeductionAmount(String totalDeductionAmount) {
        this.totalDeductionAmount = totalDeductionAmount;
    }
}
