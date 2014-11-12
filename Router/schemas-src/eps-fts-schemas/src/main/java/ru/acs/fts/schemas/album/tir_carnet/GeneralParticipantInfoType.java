
package ru.acs.fts.schemas.album.tir_carnet;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Общие сведения об участнике
 */
public class GeneralParticipantInfoType extends OrganizationBaseType
{
    private AddressType address;

    /** 
     * Get the 'Address' element value.
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value.
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}
