
package ru.acs.fts.schemas.album.inforequest;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * �������� �� �����������/���. ���� (��. ����/��)
 */
public class OrganizationType extends CUOrganizationType
{
    private String orgSign;
    private String insuranceNumber;
    private LocalDate birthDate;
    private String addressSign;
    private AddressType birthPlace;

    /** 
     * Get the 'OrgSign' element value. �������: 0 - ���. ����; 1 - ��. ����
     * 
     * @return value
     */
    public String getOrgSign() {
        return orgSign;
    }

    /** 
     * Set the 'OrgSign' element value. �������: 0 - ���. ����; 1 - ��. ����
     * 
     * @param orgSign
     */
    public void setOrgSign(String orgSign) {
        this.orgSign = orgSign;
    }

    /** 
     * Get the 'InsuranceNumber' element value. ��������� ����� ��������������� �������� ����� (�����)
     * 
     * @return value
     */
    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    /** 
     * Set the 'InsuranceNumber' element value. ��������� ����� ��������������� �������� ����� (�����)
     * 
     * @param insuranceNumber
     */
    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    /** 
     * Get the 'BirthDate' element value. ���� ��������
     * 
     * @return value
     */
    public LocalDate getBirthDate() {
        return birthDate;
    }

    /** 
     * Set the 'BirthDate' element value. ���� ��������
     * 
     * @param birthDate
     */
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    /** 
     * Get the 'AddressSign' element value. ��� �����������: 0 - �� (����� ����������); 1 - �� (����� ����������)
     * 
     * @return value
     */
    public String getAddressSign() {
        return addressSign;
    }

    /** 
     * Set the 'AddressSign' element value. ��� �����������: 0 - �� (����� ����������); 1 - �� (����� ����������)
     * 
     * @param addressSign
     */
    public void setAddressSign(String addressSign) {
        this.addressSign = addressSign;
    }

    /** 
     * Get the 'BirthPlace' element value. ����� ��������
     * 
     * @return value
     */
    public AddressType getBirthPlace() {
        return birthPlace;
    }

    /** 
     * Set the 'BirthPlace' element value. ����� ��������
     * 
     * @param birthPlace
     */
    public void setBirthPlace(AddressType birthPlace) {
        this.birthPlace = birthPlace;
    }
}
