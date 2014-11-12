
package ru.acs.fts.schemas.album.oez_report;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * �������� � ���� ��� �� �����������
 */
public class CompanyType
{
    private String residentLicenseNumber;
    private OrganizationBaseType organisation;
    private AddressType address;
    private IdentityCardType identityCard;

    /** 
     * Get the 'ResidentLicenseNumber' element value. ����� ������������� � ����������� ��������� ���
     * 
     * @return value
     */
    public String getResidentLicenseNumber() {
        return residentLicenseNumber;
    }

    /** 
     * Set the 'ResidentLicenseNumber' element value. ����� ������������� � ����������� ��������� ���
     * 
     * @param residentLicenseNumber
     */
    public void setResidentLicenseNumber(String residentLicenseNumber) {
        this.residentLicenseNumber = residentLicenseNumber;
    }

    /** 
     * Get the 'Organisation' element value. ��������� �����������
     * 
     * @return value
     */
    public OrganizationBaseType getOrganisation() {
        return organisation;
    }

    /** 
     * Set the 'Organisation' element value. ��������� �����������
     * 
     * @param organisation
     */
    public void setOrganisation(OrganizationBaseType organisation) {
        this.organisation = organisation;
    }

    /** 
     * Get the 'Address' element value. ����� �����������
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. ����� �����������
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }

    /** 
     * Get the 'IdentityCard' element value. ��������, �������������� ��������
     * 
     * @return value
     */
    public IdentityCardType getIdentityCard() {
        return identityCard;
    }

    /** 
     * Set the 'IdentityCard' element value. ��������, �������������� ��������
     * 
     * @param identityCard
     */
    public void setIdentityCard(IdentityCardType identityCard) {
        this.identityCard = identityCard;
    }
}
