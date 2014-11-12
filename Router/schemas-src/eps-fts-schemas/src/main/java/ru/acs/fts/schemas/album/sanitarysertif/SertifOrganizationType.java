
package ru.acs.fts.schemas.album.sanitarysertif;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * �������� �� ������ ������������
 */
public class SertifOrganizationType
{
    private String organizationName;
    private AddressType postalAddress;

    /** 
     * Get the 'OrganizationName' element value. ������������ ������ ������������
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. ������������ ������ ������������
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'PostalAddress' element value.
     * 
     * @return value
     */
    public AddressType getPostalAddress() {
        return postalAddress;
    }

    /** 
     * Set the 'PostalAddress' element value.
     * 
     * @param postalAddress
     */
    public void setPostalAddress(AddressType postalAddress) {
        this.postalAddress = postalAddress;
    }
}
