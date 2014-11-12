
package ru.acs.fts.schemas.album.minsportrospechlic;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Сведения о производителе
 */
public class ManufacturerType extends OrganizationBaseType
{
    private AddressType manufacturerAddress;

    /** 
     * Get the 'ManufacturerAddress' element value. Адрес производителя
     * 
     * @return value
     */
    public AddressType getManufacturerAddress() {
        return manufacturerAddress;
    }

    /** 
     * Set the 'ManufacturerAddress' element value. Адрес производителя
     * 
     * @param manufacturerAddress
     */
    public void setManufacturerAddress(AddressType manufacturerAddress) {
        this.manufacturerAddress = manufacturerAddress;
    }
}
