
package ru.acs.fts.schemas.album.generaldeclaration;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * ���������� �� ������
 */
public class AgentType
{
    private String name;
    private String phone;
    private AddressType postalAddress;

    /** 
     * Get the 'Name' element value. ������������ ����������� ��� ������� ����������� ����
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. ������������ ����������� ��� ������� ����������� ����
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'Phone' element value. ����� ��������.
     * 
     * @return value
     */
    public String getPhone() {
        return phone;
    }

    /** 
     * Set the 'Phone' element value. ����� ��������.
     * 
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /** 
     * Get the 'PostalAddress' element value. �������� ������ ��������� (����� �������� �������� ���������������)
     * 
     * @return value
     */
    public AddressType getPostalAddress() {
        return postalAddress;
    }

    /** 
     * Set the 'PostalAddress' element value. �������� ������ ��������� (����� �������� �������� ���������������)
     * 
     * @param postalAddress
     */
    public void setPostalAddress(AddressType postalAddress) {
        this.postalAddress = postalAddress;
    }
}
