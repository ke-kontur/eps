
package ru.acs.fts.schemas.album.conformancesertif;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Сведения о подразделениях предприятия
 */
public class SubdivisionInfoType extends OrganizationBaseType
{
    private AddressType address;

    /** 
     * Get the 'Address' element value. Юридический адрес
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Юридический адрес
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}
