
package ru.acs.fts.schemas.album.regconfirmdocrequest;

/** 
 * Сведения об организации/физ. лице (юр. лицо/ИП)
 */
public class OrganizationType
        extends
            ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType
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
