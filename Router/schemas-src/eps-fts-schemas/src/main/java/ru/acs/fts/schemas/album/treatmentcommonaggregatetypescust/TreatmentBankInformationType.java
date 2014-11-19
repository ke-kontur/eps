
package ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Переработка товаров - банковские сведения
 */
public class TreatmentBankInformationType
{
    private String bankName;
    private String bankOKPO;
    private String bankMFO;
    private List<TreatmentBankAccountType> bankAccountList = new ArrayList<TreatmentBankAccountType>();

    /** 
     * Get the 'BankName' element value. Название банка
     * 
     * @return value
     */
    public String getBankName() {
        return bankName;
    }

    /** 
     * Set the 'BankName' element value. Название банка
     * 
     * @param bankName
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /** 
     * Get the 'BankOKPO' element value. ОКПО банка
     * 
     * @return value
     */
    public String getBankOKPO() {
        return bankOKPO;
    }

    /** 
     * Set the 'BankOKPO' element value. ОКПО банка
     * 
     * @param bankOKPO
     */
    public void setBankOKPO(String bankOKPO) {
        this.bankOKPO = bankOKPO;
    }

    /** 
     * Get the 'BankMFO' element value. МФО банка
     * 
     * @return value
     */
    public String getBankMFO() {
        return bankMFO;
    }

    /** 
     * Set the 'BankMFO' element value. МФО банка
     * 
     * @param bankMFO
     */
    public void setBankMFO(String bankMFO) {
        this.bankMFO = bankMFO;
    }

    /** 
     * Get the list of 'BankAccount' element items. Сведения о счете
     * 
     * @return list
     */
    public List<TreatmentBankAccountType> getBankAccountList() {
        return bankAccountList;
    }

    /** 
     * Set the list of 'BankAccount' element items. Сведения о счете
     * 
     * @param list
     */
    public void setBankAccountList(List<TreatmentBankAccountType> list) {
        bankAccountList = list;
    }
}
