
package ru.acs.fts.schemas.album.stopgoodsdec;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * ��������������� (���������, �������������)
 */
public class RightPersonType
{
    private String name;
    private AddressType postalAddress;

    /** 
     * Get the 'Name' element value. ��� ��������������� (�������������)
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. ��� ��������������� (�������������)
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'PostalAddress' element value. �������� ����� ��������������� (����������, �������������)
     * 
     * @return value
     */
    public AddressType getPostalAddress() {
        return postalAddress;
    }

    /** 
     * Set the 'PostalAddress' element value. �������� ����� ��������������� (����������, �������������)
     * 
     * @param postalAddress
     */
    public void setPostalAddress(AddressType postalAddress) {
        this.postalAddress = postalAddress;
    }
}
