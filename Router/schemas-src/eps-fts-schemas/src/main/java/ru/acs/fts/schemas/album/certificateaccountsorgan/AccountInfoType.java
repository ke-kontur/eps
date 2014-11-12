
package ru.acs.fts.schemas.album.certificateaccountsorgan;

import org.joda.time.LocalDate;

/** 
 * Сведения о счетах
 */
public class AccountInfoType
{
    private String bankAccount;
    private String bankAccountDescription;
    private String currencyCode;
    private LocalDate startDate;
    private LocalDate endDate;

    /** 
     * Get the 'BankAccount' element value. Номер банковского счета
     * 
     * @return value
     */
    public String getBankAccount() {
        return bankAccount;
    }

    /** 
     * Set the 'BankAccount' element value. Номер банковского счета
     * 
     * @param bankAccount
     */
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    /** 
     * Get the 'BankAccountDescription' element value. Описание типа счета: расчетный, валютный,...
     * 
     * @return value
     */
    public String getBankAccountDescription() {
        return bankAccountDescription;
    }

    /** 
     * Set the 'BankAccountDescription' element value. Описание типа счета: расчетный, валютный,...
     * 
     * @param bankAccountDescription
     */
    public void setBankAccountDescription(String bankAccountDescription) {
        this.bankAccountDescription = bankAccountDescription;
    }

    /** 
     * Get the 'CurrencyCode' element value. Код валюты.
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Код валюты.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'StartDate' element value. Дата открытия
     * 
     * @return value
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /** 
     * Set the 'StartDate' element value. Дата открытия
     * 
     * @param startDate
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /** 
     * Get the 'EndDate' element value. Дата закрытия
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. Дата закрытия
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
