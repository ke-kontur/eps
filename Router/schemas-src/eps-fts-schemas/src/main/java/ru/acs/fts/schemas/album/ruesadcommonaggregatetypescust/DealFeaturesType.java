
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * Форма расчетов  и особенности сделки (гр. 28 ч.2).
 */
public class DealFeaturesType
{
    private String paymentFormCode;
    private String dealFeatureCode;
    private String dealNatureCode;
    private String paymentFeature;
    private LocalDate firstPaymentDate;
    private String firstPaymentIndicator;
    private LocalDate lastPaymentDate;
    private String lastPaymentIndicator;
    private String agreementCurrencyCode;

    /** 
     * Get the 'PaymentFormCode' element value. Код формы расчетов по сделке / договору. По Классификатору форм расчетов и особенностей сделки.
     * 
     * @return value
     */
    public String getPaymentFormCode() {
        return paymentFormCode;
    }

    /** 
     * Set the 'PaymentFormCode' element value. Код формы расчетов по сделке / договору. По Классификатору форм расчетов и особенностей сделки.
     * 
     * @param paymentFormCode
     */
    public void setPaymentFormCode(String paymentFormCode) {
        this.paymentFormCode = paymentFormCode;
    }

    /** 
     * Get the 'DealFeatureCode' element value. Код особенностей сделки (договора). По Классификатору форм расчетов и особенностей сделки.
     * 
     * @return value
     */
    public String getDealFeatureCode() {
        return dealFeatureCode;
    }

    /** 
     * Set the 'DealFeatureCode' element value. Код особенностей сделки (договора). По Классификатору форм расчетов и особенностей сделки.
     * 
     * @param dealFeatureCode
     */
    public void setDealFeatureCode(String dealFeatureCode) {
        this.dealFeatureCode = dealFeatureCode;
    }

    /** 
     * Get the 'DealNatureCode' element value. Код характера сделки с декларируемыми товарами.
     * 
     * @return value
     */
    public String getDealNatureCode() {
        return dealNatureCode;
    }

    /** 
     * Set the 'DealNatureCode' element value. Код характера сделки с декларируемыми товарами.
     * 
     * @param dealNatureCode
     */
    public void setDealNatureCode(String dealNatureCode) {
        this.dealNatureCode = dealNatureCode;
    }

    /** 
     * Get the 'PaymentFeature' element value. Код особенностей расчетов за декларируемые товары 
     * 
     * @return value
     */
    public String getPaymentFeature() {
        return paymentFeature;
    }

    /** 
     * Set the 'PaymentFeature' element value. Код особенностей расчетов за декларируемые товары 
     * 
     * @param paymentFeature
     */
    public void setPaymentFeature(String paymentFeature) {
        this.paymentFeature = paymentFeature;
    }

    /** 
     * Get the 'FirstPaymentDate' element value. Дата первого платежа за декларируемую товарную партию.
     * 
     * @return value
     */
    public LocalDate getFirstPaymentDate() {
        return firstPaymentDate;
    }

    /** 
     * Set the 'FirstPaymentDate' element value. Дата первого платежа за декларируемую товарную партию.
     * 
     * @param firstPaymentDate
     */
    public void setFirstPaymentDate(LocalDate firstPaymentDate) {
        this.firstPaymentDate = firstPaymentDate;
    }

    /** 
     * Get the 'FirstPaymentIndicator' element value. Признак срока первого платежа. 1- фактическая дата, 2- расчетный срок (дата соответствует последнему дню  указанного месяца)
     * 
     * @return value
     */
    public String getFirstPaymentIndicator() {
        return firstPaymentIndicator;
    }

    /** 
     * Set the 'FirstPaymentIndicator' element value. Признак срока первого платежа. 1- фактическая дата, 2- расчетный срок (дата соответствует последнему дню  указанного месяца)
     * 
     * @param firstPaymentIndicator
     */
    public void setFirstPaymentIndicator(String firstPaymentIndicator) {
        this.firstPaymentIndicator = firstPaymentIndicator;
    }

    /** 
     * Get the 'LastPaymentDate' element value. Дата последнего или единственного платежа за декларируемую товарную партию.
     * 
     * @return value
     */
    public LocalDate getLastPaymentDate() {
        return lastPaymentDate;
    }

    /** 
     * Set the 'LastPaymentDate' element value. Дата последнего или единственного платежа за декларируемую товарную партию.
     * 
     * @param lastPaymentDate
     */
    public void setLastPaymentDate(LocalDate lastPaymentDate) {
        this.lastPaymentDate = lastPaymentDate;
    }

    /** 
     * Get the 'LastPaymentIndicator' element value. Признак срока последнего платежа. 1- фактическая дата, 2- расчетный срок (дата соответствует последнему дню  указанного месяца)
     * 
     * @return value
     */
    public String getLastPaymentIndicator() {
        return lastPaymentIndicator;
    }

    /** 
     * Set the 'LastPaymentIndicator' element value. Признак срока последнего платежа. 1- фактическая дата, 2- расчетный срок (дата соответствует последнему дню  указанного месяца)
     * 
     * @param lastPaymentIndicator
     */
    public void setLastPaymentIndicator(String lastPaymentIndicator) {
        this.lastPaymentIndicator = lastPaymentIndicator;
    }

    /** 
     * Get the 'AgreementCurrencyCode' element value. Код клиринговой валюты по Классификатору валют (распоряжение Банка России Р-212  28.07.1997)
     * 
     * @return value
     */
    public String getAgreementCurrencyCode() {
        return agreementCurrencyCode;
    }

    /** 
     * Set the 'AgreementCurrencyCode' element value. Код клиринговой валюты по Классификатору валют (распоряжение Банка России Р-212  28.07.1997)
     * 
     * @param agreementCurrencyCode
     */
    public void setAgreementCurrencyCode(String agreementCurrencyCode) {
        this.agreementCurrencyCode = agreementCurrencyCode;
    }
}
