
package ru.acs.fts.schemas.album.minsportrospechlic;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * �������� � �������������
 */
public class ManufacturerType extends OrganizationBaseType
{
    private AddressType manufacturerAddress;

    /** 
     * Get the 'ManufacturerAddress' element value. ����� �������������
     * 
     * @return value
     */
    public AddressType getManufacturerAddress() {
        return manufacturerAddress;
    }

    /** 
     * Set the 'ManufacturerAddress' element value. ����� �������������
     * 
     * @param manufacturerAddress
     */
    public void setManufacturerAddress(AddressType manufacturerAddress) {
        this.manufacturerAddress = manufacturerAddress;
    }
}
