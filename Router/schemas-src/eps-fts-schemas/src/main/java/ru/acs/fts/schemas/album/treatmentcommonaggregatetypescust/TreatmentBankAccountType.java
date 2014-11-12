
package ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust;

/** 
 * Сведения о счете
 */
public class TreatmentBankAccountType
{
    private String bankAccount;
    private String bankAccountDescription;

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
}
