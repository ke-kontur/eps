
package ru.acs.fts.schemas.album.certificateaccountsorgan;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Сведения о банке
 */
public class BankInfoType extends OrganizationBaseType
{
    private String BIC;

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
}
