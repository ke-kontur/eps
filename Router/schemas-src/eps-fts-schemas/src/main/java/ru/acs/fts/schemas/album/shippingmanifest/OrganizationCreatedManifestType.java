
package ru.acs.fts.schemas.album.shippingmanifest;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Организация, выдавшая путевой лист 
 */
public class OrganizationCreatedManifestType
{
    private String phoneNumber;
    private OrganizationBaseType organization;
    private AddressType address;

    /** 
     * Get the 'PhoneNumber' element value. Телефон организации 
     * 
     * @return value
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /** 
     * Set the 'PhoneNumber' element value. Телефон организации 
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /** 
     * Get the 'Organization' element value. Реквизиты организации, выдавшей путевой лист 
     * 
     * @return value
     */
    public OrganizationBaseType getOrganization() {
        return organization;
    }

    /** 
     * Set the 'Organization' element value. Реквизиты организации, выдавшей путевой лист 
     * 
     * @param organization
     */
    public void setOrganization(OrganizationBaseType organization) {
        this.organization = organization;
    }

    /** 
     * Get the 'Address' element value. Адрес организации 
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Адрес организации 
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}
