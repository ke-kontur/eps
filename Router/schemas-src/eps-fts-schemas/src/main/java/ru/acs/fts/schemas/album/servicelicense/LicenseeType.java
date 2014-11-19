
package ru.acs.fts.schemas.album.servicelicense;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * Лицензиат/Сертифицируемое лицо
 */
public class LicenseeType extends OrganizationType
{
    private String orgSign;

    /** 
     * Get the 'OrgSign' element value. Признак: 0 - физ. лицо; 1 - юр. лицо
     * 
     * @return value
     */
    public String getOrgSign() {
        return orgSign;
    }

    /** 
     * Set the 'OrgSign' element value. Признак: 0 - физ. лицо; 1 - юр. лицо
     * 
     * @param orgSign
     */
    public void setOrgSign(String orgSign) {
        this.orgSign = orgSign;
    }
}
