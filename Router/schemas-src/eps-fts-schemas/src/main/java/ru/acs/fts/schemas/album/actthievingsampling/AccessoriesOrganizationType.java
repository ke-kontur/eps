
package ru.acs.fts.schemas.album.actthievingsampling;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * �����������, �������  ����������� ��������. 
 */
public class AccessoriesOrganizationType
{
    private OrganizationBaseType organization;
    private AddressType legalAddress;
    private PersonSignatureType organizationPerson;

    /** 
     * Get the 'Organization' element value. �������� � �����������
     * 
     * @return value
     */
    public OrganizationBaseType getOrganization() {
        return organization;
    }

    /** 
     * Set the 'Organization' element value. �������� � �����������
     * 
     * @param organization
     */
    public void setOrganization(OrganizationBaseType organization) {
        this.organization = organization;
    }

    /** 
     * Get the 'LegalAddress' element value. ����������� ����� �����������
     * 
     * @return value
     */
    public AddressType getLegalAddress() {
        return legalAddress;
    }

    /** 
     * Set the 'LegalAddress' element value. ����������� ����� �����������
     * 
     * @param legalAddress
     */
    public void setLegalAddress(AddressType legalAddress) {
        this.legalAddress = legalAddress;
    }

    /** 
     * Get the 'OrganizationPerson' element value. ����������� �����������.
     * 
     * @return value
     */
    public PersonSignatureType getOrganizationPerson() {
        return organizationPerson;
    }

    /** 
     * Set the 'OrganizationPerson' element value. ����������� �����������.
     * 
     * @param organizationPerson
     */
    public void setOrganizationPerson(PersonSignatureType organizationPerson) {
        this.organizationPerson = organizationPerson;
    }
}
