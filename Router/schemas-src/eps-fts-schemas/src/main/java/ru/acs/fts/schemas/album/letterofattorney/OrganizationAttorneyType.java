
package ru.acs.fts.schemas.album.letterofattorney;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * �������� �� �����������
 */
public class OrganizationAttorneyType extends OrganizationType
{
    private PersonBaseType organizationPerson;

    /** 
     * Get the 'OrganizationPerson' element value. ���� ����������� - ����������
     * 
     * @return value
     */
    public PersonBaseType getOrganizationPerson() {
        return organizationPerson;
    }

    /** 
     * Set the 'OrganizationPerson' element value. ���� ����������� - ����������
     * 
     * @param organizationPerson
     */
    public void setOrganizationPerson(PersonBaseType organizationPerson) {
        this.organizationPerson = organizationPerson;
    }
}
