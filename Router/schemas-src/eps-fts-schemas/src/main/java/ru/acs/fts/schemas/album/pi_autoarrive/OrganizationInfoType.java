
package ru.acs.fts.schemas.album.pi_autoarrive;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;
import ru.acs.fts.schemas.album.priorcommonaggregatetypescust.AddressType;

/** 
 * ���������� �� �����������
 */
public class OrganizationInfoType extends OrganizationBaseType
{
    private AddressType address;

    /** 
     * Get the 'Address' element value. �����
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. �����
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}
