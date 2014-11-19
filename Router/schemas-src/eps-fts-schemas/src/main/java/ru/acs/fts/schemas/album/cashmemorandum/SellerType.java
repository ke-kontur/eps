
package ru.acs.fts.schemas.album.cashmemorandum;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * ��������
 */
public class SellerType
{
    private OrganizationBaseType organisation;
    private AddressType address;

    /** 
     * Get the 'Organisation' element value. ��������� �����������
     * 
     * @return value
     */
    public OrganizationBaseType getOrganisation() {
        return organisation;
    }

    /** 
     * Set the 'Organisation' element value. ��������� �����������
     * 
     * @param organisation
     */
    public void setOrganisation(OrganizationBaseType organisation) {
        this.organisation = organisation;
    }

    /** 
     * Get the 'Address' element value. ����� �����������
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. ����� �����������
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}
