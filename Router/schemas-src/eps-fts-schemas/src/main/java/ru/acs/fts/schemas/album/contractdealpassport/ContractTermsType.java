
package ru.acs.fts.schemas.album.contractdealpassport;

import org.joda.time.LocalDate;

/** 
 * Общие сведения о контракте
 */
public class ContractTermsType
{
    private String number;
    private LocalDate mostLaterDate;
    private String currencyName;
    private String currencyCode;
    private String contractSum;
    private String nonContractSum;
    private LocalDate completionDate;

    /** 
     * Get the 'Number' element value. Номер контракта / "БН"
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. Номер контракта / "БН"
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the 'MostLaterDate' element value. Наиболее поздняя по сроку дата (дата подписания контракта, дата вступления его в силу, дата составления)
     * 
     * @return value
     */
    public LocalDate getMostLaterDate() {
        return mostLaterDate;
    }

    /** 
     * Set the 'MostLaterDate' element value. Наиболее поздняя по сроку дата (дата подписания контракта, дата вступления его в силу, дата составления)
     * 
     * @param mostLaterDate
     */
    public void setMostLaterDate(LocalDate mostLaterDate) {
        this.mostLaterDate = mostLaterDate;
    }

    /** 
     * Get the 'CurrencyName' element value. Наименование валюты контракта
     * 
     * @return value
     */
    public String getCurrencyName() {
        return currencyName;
    }

    /** 
     * Set the 'CurrencyName' element value. Наименование валюты контракта
     * 
     * @param currencyName
     */
    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    /** 
     * Get the 'CurrencyCode' element value. Цифровой код валюты контракта
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Цифровой код валюты контракта
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'ContractSum' element value. Общая сумма обязательства, предусмотренная контрактом
     * 
     * @return value
     */
    public String getContractSum() {
        return contractSum;
    }

    /** 
     * Set the 'ContractSum' element value. Общая сумма обязательства, предусмотренная контрактом
     * 
     * @param contractSum
     */
    public void setContractSum(String contractSum) {
        this.contractSum = contractSum;
    }

    /** 
     * Get the 'NonContractSum' element value. Cимвол "БС" (указывается в случае отсутствия информации для заполнения графы общая сумма)
     * 
     * @return value
     */
    public String getNonContractSum() {
        return nonContractSum;
    }

    /** 
     * Set the 'NonContractSum' element value. Cимвол "БС" (указывается в случае отсутствия информации для заполнения графы общая сумма)
     * 
     * @param nonContractSum
     */
    public void setNonContractSum(String nonContractSum) {
        this.nonContractSum = nonContractSum;
    }

    /** 
     * Get the 'CompletionDate' element value. Дата завершения исполнения всех обязательств по контракту
     * 
     * @return value
     */
    public LocalDate getCompletionDate() {
        return completionDate;
    }

    /** 
     * Set the 'CompletionDate' element value. Дата завершения исполнения всех обязательств по контракту
     * 
     * @param completionDate
     */
    public void setCompletionDate(LocalDate completionDate) {
        this.completionDate = completionDate;
    }
}
