
package ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ������� ����� 
 */
public class BankMarkType
{
    private String bankName;
    private String BIC;
    private PersonSignatureType recipSign;

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
     * Get the 'RecipSign' element value. ������� �������������� �����������  
     * 
     * @return value
     */
    public PersonSignatureType getRecipSign() {
        return recipSign;
    }

    /** 
     * Set the 'RecipSign' element value. ������� �������������� �����������  
     * 
     * @param recipSign
     */
    public void setRecipSign(PersonSignatureType recipSign) {
        this.recipSign = recipSign;
    }
}
