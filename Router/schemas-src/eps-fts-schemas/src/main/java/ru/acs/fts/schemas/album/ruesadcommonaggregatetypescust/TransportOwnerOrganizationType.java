
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * �������� �� - ����������� ����.
 */
public class TransportOwnerOrganizationType extends OrganizationBaseType
{
    private String OKPO;
    private AddressType address;

    /** 
     * Get the 'OKPO' element value. ��� ���� ���������.
     * 
     * @return value
     */
    public String getOKPO() {
        return OKPO;
    }

    /** 
     * Set the 'OKPO' element value. ��� ���� ���������.
     * 
     * @param OKPO
     */
    public void setOKPO(String OKPO) {
        this.OKPO = OKPO;
    }

    /** 
     * Get the 'Address' element value. ����� �����������.
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. ����� �����������.
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}
