
package ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Отметки банка 
 */
public class BankMarkType
{
    private String bankName;
    private String BIC;
    private PersonSignatureType recipSign;

    /** 
     * Get the 'BankName' element value. Наименование банка
     * 
     * @return value
     */
    public String getBankName() {
        return bankName;
    }

    /** 
     * Set the 'BankName' element value. Наименование банка
     * 
     * @param bankName
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /** 
     * Get the 'BIC' element value. БИК
     * 
     * @return value
     */
    public String getBIC() {
        return BIC;
    }

    /** 
     * Set the 'BIC' element value. БИК
     * 
     * @param BIC
     */
    public void setBIC(String BIC) {
        this.BIC = BIC;
    }

    /** 
     * Get the 'RecipSign' element value. Подпись ответственного исполнителя  
     * 
     * @return value
     */
    public PersonSignatureType getRecipSign() {
        return recipSign;
    }

    /** 
     * Set the 'RecipSign' element value. Подпись ответственного исполнителя  
     * 
     * @param recipSign
     */
    public void setRecipSign(PersonSignatureType recipSign) {
        this.recipSign = recipSign;
    }
}
