
package ru.acs.fts.schemas.album.custpaymentsdk;

import org.joda.time.LocalDate;

/** 
 * Основные листы
 */
public class PrimaryListType
{
    private String totalGoodsNumber;
    private String totalSheetNumber;
    private String currencyEURO;
    private String currencyRate;
    private String currencyCode;
    private String customsRemark;
    private String protocolNumber;
    private LocalDate protocolDate;
    private String correspondenceSign;
    private String delinquencySign;
    private String delaySign;
    private String installmentSign;
    private String creditSign;
    private LocalDate modifyDate;
    private LocalDate paymentDate;
    private String numberDaysDelinquency;
    private String numberDaysDelay;
    private String numberDaysDelinquencyKTS;
    private String conformity;
    private String normalEnd;
    private String payable;
    private String outputUnauthorized;
    private String compositionProtocol;
    private String INNID;
    private String calculationKTS;
    private SignatureType customsPerson;
    private SignatureType personOTP;

    /** 
     * Get the 'TotalGoodsNumber' element value. Количество товаров.
     * 
     * @return value
     */
    public String getTotalGoodsNumber() {
        return totalGoodsNumber;
    }

    /** 
     * Set the 'TotalGoodsNumber' element value. Количество товаров.
     * 
     * @param totalGoodsNumber
     */
    public void setTotalGoodsNumber(String totalGoodsNumber) {
        this.totalGoodsNumber = totalGoodsNumber;
    }

    /** 
     * Get the 'TotalSheetNumber' element value. Количество доблистов.
     * 
     * @return value
     */
    public String getTotalSheetNumber() {
        return totalSheetNumber;
    }

    /** 
     * Set the 'TotalSheetNumber' element value. Количество доблистов.
     * 
     * @param totalSheetNumber
     */
    public void setTotalSheetNumber(String totalSheetNumber) {
        this.totalSheetNumber = totalSheetNumber;
    }

    /** 
     * Get the 'CurrencyEURO' element value. Курс ЕВРО
     * 
     * @return value
     */
    public String getCurrencyEURO() {
        return currencyEURO;
    }

    /** 
     * Set the 'CurrencyEURO' element value. Курс ЕВРО
     * 
     * @param currencyEURO
     */
    public void setCurrencyEURO(String currencyEURO) {
        this.currencyEURO = currencyEURO;
    }

    /** 
     * Get the 'CurrencyRate' element value. Курс валюты контракта
     * 
     * @return value
     */
    public String getCurrencyRate() {
        return currencyRate;
    }

    /** 
     * Set the 'CurrencyRate' element value. Курс валюты контракта
     * 
     * @param currencyRate
     */
    public void setCurrencyRate(String currencyRate) {
        this.currencyRate = currencyRate;
    }

    /** 
     * Get the 'CurrencyCode' element value. Код валюты контракта.
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Код валюты контракта.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'CustomsRemark' element value. Наличие замечаний
     * 
     * @return value
     */
    public String getCustomsRemark() {
        return customsRemark;
    }

    /** 
     * Set the 'CustomsRemark' element value. Наличие замечаний
     * 
     * @param customsRemark
     */
    public void setCustomsRemark(String customsRemark) {
        this.customsRemark = customsRemark;
    }

    /** 
     * Get the 'ProtocolNumber' element value. № протокола несоответствия
     * 
     * @return value
     */
    public String getProtocolNumber() {
        return protocolNumber;
    }

    /** 
     * Set the 'ProtocolNumber' element value. № протокола несоответствия
     * 
     * @param protocolNumber
     */
    public void setProtocolNumber(String protocolNumber) {
        this.protocolNumber = protocolNumber;
    }

    /** 
     * Get the 'ProtocolDate' element value. Дата протокола несоответствия
     * 
     * @return value
     */
    public LocalDate getProtocolDate() {
        return protocolDate;
    }

    /** 
     * Set the 'ProtocolDate' element value. Дата протокола несоответствия
     * 
     * @param protocolDate
     */
    public void setProtocolDate(LocalDate protocolDate) {
        this.protocolDate = protocolDate;
    }

    /** 
     * Get the 'CorrespondenceSign' element value. Признак соответствия
     * 
     * @return value
     */
    public String getCorrespondenceSign() {
        return correspondenceSign;
    }

    /** 
     * Set the 'CorrespondenceSign' element value. Признак соответствия
     * 
     * @param correspondenceSign
     */
    public void setCorrespondenceSign(String correspondenceSign) {
        this.correspondenceSign = correspondenceSign;
    }

    /** 
     * Get the 'DelinquencySign' element value. Наличие просрочки
     * 
     * @return value
     */
    public String getDelinquencySign() {
        return delinquencySign;
    }

    /** 
     * Set the 'DelinquencySign' element value. Наличие просрочки
     * 
     * @param delinquencySign
     */
    public void setDelinquencySign(String delinquencySign) {
        this.delinquencySign = delinquencySign;
    }

    /** 
     * Get the 'DelaySign' element value. Наличие отсрочки
     * 
     * @return value
     */
    public String getDelaySign() {
        return delaySign;
    }

    /** 
     * Set the 'DelaySign' element value. Наличие отсрочки
     * 
     * @param delaySign
     */
    public void setDelaySign(String delaySign) {
        this.delaySign = delaySign;
    }

    /** 
     * Get the 'InstallmentSign' element value. Наличие рассрочки
     * 
     * @return value
     */
    public String getInstallmentSign() {
        return installmentSign;
    }

    /** 
     * Set the 'InstallmentSign' element value. Наличие рассрочки
     * 
     * @param installmentSign
     */
    public void setInstallmentSign(String installmentSign) {
        this.installmentSign = installmentSign;
    }

    /** 
     * Get the 'CreditSign' element value. Наличие налогового кредита
     * 
     * @return value
     */
    public String getCreditSign() {
        return creditSign;
    }

    /** 
     * Set the 'CreditSign' element value. Наличие налогового кредита
     * 
     * @param creditSign
     */
    public void setCreditSign(String creditSign) {
        this.creditSign = creditSign;
    }

    /** 
     * Get the 'ModifyDate' element value. Дата модификации
     * 
     * @return value
     */
    public LocalDate getModifyDate() {
        return modifyDate;
    }

    /** 
     * Set the 'ModifyDate' element value. Дата модификации
     * 
     * @param modifyDate
     */
    public void setModifyDate(LocalDate modifyDate) {
        this.modifyDate = modifyDate;
    }

    /** 
     * Get the 'PaymentDate' element value. Срок оплаты
     * 
     * @return value
     */
    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    /** 
     * Set the 'PaymentDate' element value. Срок оплаты
     * 
     * @param paymentDate
     */
    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    /** 
     * Get the 'NumberDaysDelinquency' element value. Количество дней просрочки
     * 
     * @return value
     */
    public String getNumberDaysDelinquency() {
        return numberDaysDelinquency;
    }

    /** 
     * Set the 'NumberDaysDelinquency' element value. Количество дней просрочки
     * 
     * @param numberDaysDelinquency
     */
    public void setNumberDaysDelinquency(String numberDaysDelinquency) {
        this.numberDaysDelinquency = numberDaysDelinquency;
    }

    /** 
     * Get the 'NumberDaysDelay' element value. Количество дней отсрочки
     * 
     * @return value
     */
    public String getNumberDaysDelay() {
        return numberDaysDelay;
    }

    /** 
     * Set the 'NumberDaysDelay' element value. Количество дней отсрочки
     * 
     * @param numberDaysDelay
     */
    public void setNumberDaysDelay(String numberDaysDelay) {
        this.numberDaysDelay = numberDaysDelay;
    }

    /** 
     * Get the 'NumberDaysDelinquencyKTS' element value. Количество дней просрочки по КТС
     * 
     * @return value
     */
    public String getNumberDaysDelinquencyKTS() {
        return numberDaysDelinquencyKTS;
    }

    /** 
     * Set the 'NumberDaysDelinquencyKTS' element value. Количество дней просрочки по КТС
     * 
     * @param numberDaysDelinquencyKTS
     */
    public void setNumberDaysDelinquencyKTS(String numberDaysDelinquencyKTS) {
        this.numberDaysDelinquencyKTS = numberDaysDelinquencyKTS;
    }

    /** 
     * Get the 'Conformity' element value. Соответствие
     * 
     * @return value
     */
    public String getConformity() {
        return conformity;
    }

    /** 
     * Set the 'Conformity' element value. Соответствие
     * 
     * @param conformity
     */
    public void setConformity(String conformity) {
        this.conformity = conformity;
    }

    /** 
     * Get the 'NormalEnd' element value. Нормальное завершение
     * 
     * @return value
     */
    public String getNormalEnd() {
        return normalEnd;
    }

    /** 
     * Set the 'NormalEnd' element value. Нормальное завершение
     * 
     * @param normalEnd
     */
    public void setNormalEnd(String normalEnd) {
        this.normalEnd = normalEnd;
    }

    /** 
     * Get the 'Payable' element value. Подлежит оплате до..
     * 
     * @return value
     */
    public String getPayable() {
        return payable;
    }

    /** 
     * Set the 'Payable' element value. Подлежит оплате до..
     * 
     * @param payable
     */
    public void setPayable(String payable) {
        this.payable = payable;
    }

    /** 
     * Get the 'OutputUnauthorized' element value. Выпуск запрещен
     * 
     * @return value
     */
    public String getOutputUnauthorized() {
        return outputUnauthorized;
    }

    /** 
     * Set the 'OutputUnauthorized' element value. Выпуск запрещен
     * 
     * @param outputUnauthorized
     */
    public void setOutputUnauthorized(String outputUnauthorized) {
        this.outputUnauthorized = outputUnauthorized;
    }

    /** 
     * Get the 'CompositionProtocol' element value. Составление протокола
     * 
     * @return value
     */
    public String getCompositionProtocol() {
        return compositionProtocol;
    }

    /** 
     * Set the 'CompositionProtocol' element value. Составление протокола
     * 
     * @param compositionProtocol
     */
    public void setCompositionProtocol(String compositionProtocol) {
        this.compositionProtocol = compositionProtocol;
    }

    /** 
     * Get the 'INNID' element value. Индивидуальный номер налогоплательщика плательщика
     * 
     * @return value
     */
    public String getINNID() {
        return INNID;
    }

    /** 
     * Set the 'INNID' element value. Индивидуальный номер налогоплательщика плательщика
     * 
     * @param INNID
     */
    public void setINNID(String INNID) {
        this.INNID = INNID;
    }

    /** 
     * Get the 'CalculationKTS' element value. Расчет по КТС
     * 
     * @return value
     */
    public String getCalculationKTS() {
        return calculationKTS;
    }

    /** 
     * Set the 'CalculationKTS' element value. Расчет по КТС
     * 
     * @param calculationKTS
     */
    public void setCalculationKTS(String calculationKTS) {
        this.calculationKTS = calculationKTS;
    }

    /** 
     * Get the 'CustomsPerson' element value. ФИО,ЛНП  сотрудника составившего ДК
     * 
     * @return value
     */
    public SignatureType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. ФИО,ЛНП  сотрудника составившего ДК
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(SignatureType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'PersonOTP' element value. ФИО,ЛНП сотрудника ОТП
     * 
     * @return value
     */
    public SignatureType getPersonOTP() {
        return personOTP;
    }

    /** 
     * Set the 'PersonOTP' element value. ФИО,ЛНП сотрудника ОТП
     * 
     * @param personOTP
     */
    public void setPersonOTP(SignatureType personOTP) {
        this.personOTP = personOTP;
    }
}
