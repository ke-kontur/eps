
package ru.acs.fts.schemas.album.detailquotadatard;

/** 
 * �������� � �������� (����������)
 */
public class OrganizationInfoType
{
    private String organizationName;
    private String address;

    /** 
     * Get the 'OrganizationName' element value. ������������ 
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. ������������ 
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'Address' element value. ����� 
     * 
     * @return value
     */
    public String getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. ����� 
     * 
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }
}
