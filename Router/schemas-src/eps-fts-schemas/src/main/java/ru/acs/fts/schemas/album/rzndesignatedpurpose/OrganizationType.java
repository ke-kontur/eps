
package ru.acs.fts.schemas.album.rzndesignatedpurpose;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Сведения об организации
 */
public class OrganizationType extends CUOrganizationType
{
    private String orgSign;
    private PersonBaseType authorizedPerson;

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

    /** 
     * Get the 'AuthorizedPerson' element value. Уполномоченное лицо
     * 
     * @return value
     */
    public PersonBaseType getAuthorizedPerson() {
        return authorizedPerson;
    }

    /** 
     * Set the 'AuthorizedPerson' element value. Уполномоченное лицо
     * 
     * @param authorizedPerson
     */
    public void setAuthorizedPerson(PersonBaseType authorizedPerson) {
        this.authorizedPerson = authorizedPerson;
    }
}
