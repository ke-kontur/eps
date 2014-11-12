
package ru.acs.fts.schemas.album.letterofattorney;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Сведения об организации
 */
public class OrganizationAttorneyType extends OrganizationType
{
    private PersonBaseType organizationPerson;

    /** 
     * Get the 'OrganizationPerson' element value. Лицо организации - доверителя
     * 
     * @return value
     */
    public PersonBaseType getOrganizationPerson() {
        return organizationPerson;
    }

    /** 
     * Set the 'OrganizationPerson' element value. Лицо организации - доверителя
     * 
     * @param organizationPerson
     */
    public void setOrganizationPerson(PersonBaseType organizationPerson) {
        this.organizationPerson = organizationPerson;
    }
}
