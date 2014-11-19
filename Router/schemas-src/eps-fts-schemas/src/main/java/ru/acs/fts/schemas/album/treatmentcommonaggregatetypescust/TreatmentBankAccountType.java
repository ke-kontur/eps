
package ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust;

/** 
 * �������� � �����
 */
public class TreatmentBankAccountType
{
    private String bankAccount;
    private String bankAccountDescription;

    /** 
     * Get the 'BankAccount' element value. ����� ����������� �����
     * 
     * @return value
     */
    public String getBankAccount() {
        return bankAccount;
    }

    /** 
     * Set the 'BankAccount' element value. ����� ����������� �����
     * 
     * @param bankAccount
     */
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    /** 
     * Get the 'BankAccountDescription' element value. �������� ���� �����: ���������, ��������,...
     * 
     * @return value
     */
    public String getBankAccountDescription() {
        return bankAccountDescription;
    }

    /** 
     * Set the 'BankAccountDescription' element value. �������� ���� �����: ���������, ��������,...
     * 
     * @param bankAccountDescription
     */
    public void setBankAccountDescription(String bankAccountDescription) {
        this.bankAccountDescription = bankAccountDescription;
    }
}
