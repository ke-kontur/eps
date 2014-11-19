
package ru.acs.fts.schemas.album.ownershiptransferdoc;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Информация об организации
 */
public class OrganizationInfoType extends OrganizationBaseType
{
    private AddressType address;

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
