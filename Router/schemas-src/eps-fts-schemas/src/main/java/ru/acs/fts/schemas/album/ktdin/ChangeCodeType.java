
package ru.acs.fts.schemas.album.ktdin;

/** 
 * Код изменений
 */
public class ChangeCodeType
{
    private String phaseChanges;
    private String basisCompilation;
    private String quantityChanges;
    private String countryChanges;
    private String TNVEDChanges;
    private String custCostChanges;
    private String customsPaymentChanges;
    private String otherChanges;

    /** 
     * Get the 'PhaseChanges' element value. Графа 45а. Элемент 1. Этап внесения изменений и (или) дополнений в сведения, указанных в ДТ
     * 
     * @return value
     */
    public String getPhaseChanges() {
        return phaseChanges;
    }

    /** 
     * Set the 'PhaseChanges' element value. Графа 45а. Элемент 1. Этап внесения изменений и (или) дополнений в сведения, указанных в ДТ
     * 
     * @param phaseChanges
     */
    public void setPhaseChanges(String phaseChanges) {
        this.phaseChanges = phaseChanges;
    }

    /** 
     * Get the 'BasisCompilation' element value. Графа 45а. Элемент 2. Обстоятельства, послужившие основанием для  внесения изменений и (или) дополнений в сведения, указанных в ДТ
     * 
     * @return value
     */
    public String getBasisCompilation() {
        return basisCompilation;
    }

    /** 
     * Set the 'BasisCompilation' element value. Графа 45а. Элемент 2. Обстоятельства, послужившие основанием для  внесения изменений и (или) дополнений в сведения, указанных в ДТ
     * 
     * @param basisCompilation
     */
    public void setBasisCompilation(String basisCompilation) {
        this.basisCompilation = basisCompilation;
    }

    /** 
     * Get the 'QuantityChanges' element value. Графа 45а. Элемент 3. Изменение и (или) дополнение сведений, указанных в ДТ, в отношении количества (веса) товаров
     * 
     * @return value
     */
    public String getQuantityChanges() {
        return quantityChanges;
    }

    /** 
     * Set the 'QuantityChanges' element value. Графа 45а. Элемент 3. Изменение и (или) дополнение сведений, указанных в ДТ, в отношении количества (веса) товаров
     * 
     * @param quantityChanges
     */
    public void setQuantityChanges(String quantityChanges) {
        this.quantityChanges = quantityChanges;
    }

    /** 
     * Get the 'CountryChanges' element value. Графа 45а. Элемент 4. Изменение и (или) дополнение сведений , указанных в ДТ, о стране происхождения товаров и (или) тарифных преференциях
     * 
     * @return value
     */
    public String getCountryChanges() {
        return countryChanges;
    }

    /** 
     * Set the 'CountryChanges' element value. Графа 45а. Элемент 4. Изменение и (или) дополнение сведений , указанных в ДТ, о стране происхождения товаров и (или) тарифных преференциях
     * 
     * @param countryChanges
     */
    public void setCountryChanges(String countryChanges) {
        this.countryChanges = countryChanges;
    }

    /** 
     * Get the 'TNVEDChanges' element value. Графа 45а. Элемент 5. Изменение сведений, указанных в ДТ,  в отношении классификационного кода товара по ТН ВЭД ТС
     * 
     * @return value
     */
    public String getTNVEDChanges() {
        return TNVEDChanges;
    }

    /** 
     * Set the 'TNVEDChanges' element value. Графа 45а. Элемент 5. Изменение сведений, указанных в ДТ,  в отношении классификационного кода товара по ТН ВЭД ТС
     * 
     * @param TNVEDChanges
     */
    public void setTNVEDChanges(String TNVEDChanges) {
        this.TNVEDChanges = TNVEDChanges;
    }

    /** 
     * Get the 'CustCostChanges' element value. Графа 45а. Элемент 6. Изменение и (или) дополнение сведений, указанных в ДТ, в отношении таможенной стоимости товаров
     * 
     * @return value
     */
    public String getCustCostChanges() {
        return custCostChanges;
    }

    /** 
     * Set the 'CustCostChanges' element value. Графа 45а. Элемент 6. Изменение и (или) дополнение сведений, указанных в ДТ, в отношении таможенной стоимости товаров
     * 
     * @param custCostChanges
     */
    public void setCustCostChanges(String custCostChanges) {
        this.custCostChanges = custCostChanges;
    }

    /** 
     * Get the 'CustomsPaymentChanges' element value. Графа 45а. Элемент 7. Изменение и (или) дополнение сведений, указанных в ДТ, в отношении исчисленных (уплаченных) таможенных, иных платежей
     * 
     * @return value
     */
    public String getCustomsPaymentChanges() {
        return customsPaymentChanges;
    }

    /** 
     * Set the 'CustomsPaymentChanges' element value. Графа 45а. Элемент 7. Изменение и (или) дополнение сведений, указанных в ДТ, в отношении исчисленных (уплаченных) таможенных, иных платежей
     * 
     * @param customsPaymentChanges
     */
    public void setCustomsPaymentChanges(String customsPaymentChanges) {
        this.customsPaymentChanges = customsPaymentChanges;
    }

    /** 
     * Get the 'OtherChanges' element value. Графа 45а. Элемент 8. Изменение и (или) дополнение иных сведений, указанных в ДТ
     * 
     * @return value
     */
    public String getOtherChanges() {
        return otherChanges;
    }

    /** 
     * Set the 'OtherChanges' element value. Графа 45а. Элемент 8. Изменение и (или) дополнение иных сведений, указанных в ДТ
     * 
     * @param otherChanges
     */
    public void setOtherChanges(String otherChanges) {
        this.otherChanges = otherChanges;
    }
}
