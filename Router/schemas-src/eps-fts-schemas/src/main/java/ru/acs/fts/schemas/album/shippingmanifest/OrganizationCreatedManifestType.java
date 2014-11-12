
package ru.acs.fts.schemas.album.shippingmanifest;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * �����������, �������� ������� ���� 
 */
public class OrganizationCreatedManifestType
{
    private String phoneNumber;
    private OrganizationBaseType organization;
    private AddressType address;

    /** 
     * Get the 'PhoneNumber' element value. ������� ����������� 
     * 
     * @return value
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /** 
     * Set the 'PhoneNumber' element value. ������� ����������� 
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /** 
     * Get the 'Organization' element value. ��������� �����������, �������� ������� ���� 
     * 
     * @return value
     */
    public OrganizationBaseType getOrganization() {
        return organization;
    }

    /** 
     * Set the 'Organization' element value. ��������� �����������, �������� ������� ���� 
     * 
     * @param organization
     */
    public void setOrganization(OrganizationBaseType organization) {
        this.organization = organization;
    }

    /** 
     * Get the 'Address' element value. ����� ����������� 
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. ����� ����������� 
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}
