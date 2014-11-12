
package ru.acs.fts.schemas.album.bartertransactionpasport;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Реквизиты и условия договора по Бартеру
 */
public class BarterContractTermsType
{
    private String amount;
    private String currencyCode;
    private String paymentModeCode;
    private String dueDateCode;
    private LocalDate lastDate;
    private DocumentBaseType contract;
    private List<DocumentBaseType> changeContractList = new ArrayList<DocumentBaseType>();

    /** 
     * Get the 'Amount' element value. Общая сумма договора
     * 
     * @return value
     */
    public String getAmount() {
        return amount;
    }

    /** 
     * Set the 'Amount' element value. Общая сумма договора
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /** 
     * Get the 'CurrencyCode' element value. Код валюты договора
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Код валюты договора
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'PaymentModeCode' element value. Код применяемой формы расчетов по договора
     * 
     * @return value
     */
    public String getPaymentModeCode() {
        return paymentModeCode;
    }

    /** 
     * Set the 'PaymentModeCode' element value. Код применяемой формы расчетов по договора
     * 
     * @param paymentModeCode
     */
    public void setPaymentModeCode(String paymentModeCode) {
        this.paymentModeCode = paymentModeCode;
    }

    /** 
     * Get the 'DueDateCode' element value. Код расчетного срока ввоза (таможенного оформления) на таможенную территорию Российской Федерации
     * 
     * @return value
     */
    public String getDueDateCode() {
        return dueDateCode;
    }

    /** 
     * Set the 'DueDateCode' element value. Код расчетного срока ввоза (таможенного оформления) на таможенную территорию Российской Федерации
     * 
     * @param dueDateCode
     */
    public void setDueDateCode(String dueDateCode) {
        this.dueDateCode = dueDateCode;
    }

    /** 
     * Get the 'LastDate' element value. Последняя дата
     * 
     * @return value
     */
    public LocalDate getLastDate() {
        return lastDate;
    }

    /** 
     * Set the 'LastDate' element value. Последняя дата
     * 
     * @param lastDate
     */
    public void setLastDate(LocalDate lastDate) {
        this.lastDate = lastDate;
    }

    /** 
     * Get the 'Contract' element value. Дата и номер контракта
     * 
     * @return value
     */
    public DocumentBaseType getContract() {
        return contract;
    }

    /** 
     * Set the 'Contract' element value. Дата и номер контракта
     * 
     * @param contract
     */
    public void setContract(DocumentBaseType contract) {
        this.contract = contract;
    }

    /** 
     * Get the list of 'ChangeContract' element items. Номера и даты изменений/дополнений к контракту
     * 
     * @return list
     */
    public List<DocumentBaseType> getChangeContractList() {
        return changeContractList;
    }

    /** 
     * Set the list of 'ChangeContract' element items. Номера и даты изменений/дополнений к контракту
     * 
     * @param list
     */
    public void setChangeContractList(List<DocumentBaseType> list) {
        changeContractList = list;
    }
}
