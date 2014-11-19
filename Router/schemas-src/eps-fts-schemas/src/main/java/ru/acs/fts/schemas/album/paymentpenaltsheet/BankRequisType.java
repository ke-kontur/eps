
package ru.acs.fts.schemas.album.paymentpenaltsheet;

/** 
 * ��������� �����
 */
public class BankRequisType
{
    private String bankName;
    private String BIC;
    private String correspAccount;
    private String bankPlace;
    private String personalAccount;

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
     * Get the 'BIC' element value. ���
     * 
     * @return value
     */
    public String getBIC() {
        return BIC;
    }

    /** 
     * Set the 'BIC' element value. ���
     * 
     * @param BIC
     */
    public void setBIC(String BIC) {
        this.BIC = BIC;
    }

    /** 
     * Get the 'CorrespAccount' element value. ����� ������������������ ����� (��������)
     * 
     * @return value
     */
    public String getCorrespAccount() {
        return correspAccount;
    }

    /** 
     * Set the 'CorrespAccount' element value. ����� ������������������ ����� (��������)
     * 
     * @param correspAccount
     */
    public void setCorrespAccount(String correspAccount) {
        this.correspAccount = correspAccount;
    }

    /** 
     * Get the 'BankPlace' element value. ��������������� �����
     * 
     * @return value
     */
    public String getBankPlace() {
        return bankPlace;
    }

    /** 
     * Set the 'BankPlace' element value. ��������������� �����
     * 
     * @param bankPlace
     */
    public void setBankPlace(String bankPlace) {
        this.bankPlace = bankPlace;
    }

    /** 
     * Get the 'PersonalAccount' element value. ������� ���� �������
     * 
     * @return value
     */
    public String getPersonalAccount() {
        return personalAccount;
    }

    /** 
     * Set the 'PersonalAccount' element value. ������� ���� �������
     * 
     * @param personalAccount
     */
    public void setPersonalAccount(String personalAccount) {
        this.personalAccount = personalAccount;
    }
}
