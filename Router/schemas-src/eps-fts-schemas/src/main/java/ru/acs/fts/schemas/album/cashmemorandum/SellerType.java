
package ru.acs.fts.schemas.album.cashmemorandum;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Продавец
 */
public class SellerType
{
    private OrganizationBaseType organisation;
    private AddressType address;

    /** 
     * Get the 'Organisation' element value. Реквизиты организации
     * 
     * @return value
     */
    public OrganizationBaseType getOrganisation() {
        return organisation;
    }

    /** 
     * Set the 'Organisation' element value. Реквизиты организации
     * 
     * @param organisation
     */
    public void setOrganisation(OrganizationBaseType organisation) {
        this.organisation = organisation;
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
