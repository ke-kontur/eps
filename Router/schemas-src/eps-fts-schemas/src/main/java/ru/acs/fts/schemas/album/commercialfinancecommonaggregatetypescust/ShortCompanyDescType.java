
package ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * �������� � ����� �����������
 */
public class ShortCompanyDescType
{
    private String name;
    private AddressType address;

    /** 
     * Get the 'Name' element value. ������������
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. ������������
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'Address' element value. �����.
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. �����.
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}
