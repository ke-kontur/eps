
package ru.acs.fts.schemas.album.minpromlicence;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * ���������� � ����������/��������
 */
public class DealerType extends OrganizationBaseType
{
    private AddressType dealerAddress;

    /** 
     * Get the 'DealerAddress' element value. ����� ����������/��������
     * 
     * @return value
     */
    public AddressType getDealerAddress() {
        return dealerAddress;
    }

    /** 
     * Set the 'DealerAddress' element value. ����� ����������/��������
     * 
     * @param dealerAddress
     */
    public void setDealerAddress(AddressType dealerAddress) {
        this.dealerAddress = dealerAddress;
    }
}
