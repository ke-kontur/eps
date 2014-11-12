
package ru.acs.fts.schemas.album.pi_rwarrive;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;
import ru.acs.fts.schemas.album.priorcommonaggregatetypescust.AddressType;

/** 
 * Сведения об организации
 */
public class OrganizationType extends OrganizationBaseType
{
    private AddressType address;

    /** 
     * Get the 'Address' element value. Адрес 
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Адрес 
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}
