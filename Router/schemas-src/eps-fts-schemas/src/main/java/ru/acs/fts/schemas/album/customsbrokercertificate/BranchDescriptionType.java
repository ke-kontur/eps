
package ru.acs.fts.schemas.album.customsbrokercertificate;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * �������� �� ������������ �������������.
 */
public class BranchDescriptionType
{
    private String organizationName;
    private String KPP;
    private AddressType address;

    /** 
     * Get the 'OrganizationName' element value. ������������ ������������� �������������.
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. ������������ ������������� �������������.
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'KPP' element value. ��� (��� ������� ���������� �� ����) ������������� �������������.
     * 
     * @return value
     */
    public String getKPP() {
        return KPP;
    }

    /** 
     * Set the 'KPP' element value. ��� (��� ������� ���������� �� ����) ������������� �������������.
     * 
     * @param KPP
     */
    public void setKPP(String KPP) {
        this.KPP = KPP;
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
