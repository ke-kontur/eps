
package ru.acs.fts.schemas.album.resolutioncommissionexportcontrol;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * ����������� ����
 */
public class JuridicalPersonType extends OrganizationBaseType
{
    private List<AddressType> addressList = new ArrayList<AddressType>();

    /** 
     * Get the list of 'Address' element items. ����� ������������ ����
     * 
     * @return list
     */
    public List<AddressType> getAddressList() {
        return addressList;
    }

    /** 
     * Set the list of 'Address' element items. ����� ������������ ����
     * 
     * @param list
     */
    public void setAddressList(List<AddressType> list) {
        addressList = list;
    }
}
