
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

/** 
 * ����������� ��� ��� �������� ����������������
 */
public class ConsignorType
{
    private String countryCode;
    private String organizationName;
    private WHAddressType address;

    /** 
     * Get the 'CountryCode' element value. �������� ��� ������ �����������  (�� ����������� ����)
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. �������� ��� ������ �����������  (�� ����������� ����)
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'OrganizationName' element value. ������������ ����������� / ��� ����������� ����
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. ������������ ����������� / ��� ����������� ����
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
    public WHAddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. �����
     * 
     * @param address
     */
    public void setAddress(WHAddressType address) {
        this.address = address;
    }
}
