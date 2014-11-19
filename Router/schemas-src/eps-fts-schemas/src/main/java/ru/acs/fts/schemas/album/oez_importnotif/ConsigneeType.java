
package ru.acs.fts.schemas.album.oez_importnotif;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * ����������
 */
public class ConsigneeType extends OrganizationBaseType
{
    private AddressType address;

    /** 
     * Get the 'Address' element value. ����� ����������� / ����������� ����
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. ����� ����������� / ����������� ����
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}
