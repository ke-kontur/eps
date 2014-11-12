
package ru.acs.fts.schemas.album.commonaggregatetypescust;

/** 
 * �������� �� �����������.  ����������� � ����������� �����
 */
public class OrganizationBackAddrType extends OrganizationType
{
    private AddressType factAddress;

    /** 
     * Get the 'FactAddress' element value. ����������� ����� �����������
     * 
     * @return value
     */
    public AddressType getFactAddress() {
        return factAddress;
    }

    /** 
     * Set the 'FactAddress' element value. ����������� ����� �����������
     * 
     * @param factAddress
     */
    public void setFactAddress(AddressType factAddress) {
        this.factAddress = factAddress;
    }
}
