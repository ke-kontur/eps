
package ru.acs.fts.schemas.album.certificateaccountsorgan;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * �������� � �����
 */
public class BankInfoType extends OrganizationBaseType
{
    private String BIC;

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
}
