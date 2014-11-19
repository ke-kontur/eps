
package ru.acs.fts.schemas.album.paymenttransactionreport;

import ru.acs.fts.schemas.album.cardcommonaggregatetypes.OrganizationBaseType;

/** 
 * ���������� �� �����������
 */
public class OrganizationInfoType extends OrganizationBaseType
{
    private String account;
    private String bankName;
    private String BIC;
    private String bankAccount;

    /** 
     * Get the 'Account' element value. ����� �����
     * 
     * @return value
     */
    public String getAccount() {
        return account;
    }

    /** 
     * Set the 'Account' element value. ����� �����
     * 
     * @param account
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /** 
     * Get the 'BankName' element value. ������������ �����
     * 
     * @return value
     */
    public String getBankName() {
        return bankName;
    }

    /** 
     * Set the 'BankName' element value. ������������ �����
     * 
     * @param bankName
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /** 
     * Get the 'BIC' element value. ��� �����
     * 
     * @return value
     */
    public String getBIC() {
        return BIC;
    }

    /** 
     * Set the 'BIC' element value. ��� �����
     * 
     * @param BIC
     */
    public void setBIC(String BIC) {
        this.BIC = BIC;
    }

    /** 
     * Get the 'BankAccount' element value. ����������������� ���� �����
     * 
     * @return value
     */
    public String getBankAccount() {
        return bankAccount;
    }

    /** 
     * Set the 'BankAccount' element value. ����������������� ���� �����
     * 
     * @param bankAccount
     */
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }
}
