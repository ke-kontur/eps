
package ru.acs.fts.schemas.album.declchangedecision;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;

/** 
 * ���������� �����
 */
public class CustomsType extends CUCustomsType
{
    private AddressType address;
    private AddressType postalAddress;

    /** 
     * Get the 'Address' element value. ����������� �����
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. ����������� �����
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }

    /** 
     * Get the 'PostalAddress' element value. �������� ����� (����������� � ������ ������� ��������� ������ �� ������������)
     * 
     * @return value
     */
    public AddressType getPostalAddress() {
        return postalAddress;
    }

    /** 
     * Set the 'PostalAddress' element value. �������� ����� (����������� � ������ ������� ��������� ������ �� ������������)
     * 
     * @param postalAddress
     */
    public void setPostalAddress(AddressType postalAddress) {
        this.postalAddress = postalAddress;
    }
}
