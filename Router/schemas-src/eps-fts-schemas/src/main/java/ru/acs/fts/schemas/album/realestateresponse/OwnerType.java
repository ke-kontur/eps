
package ru.acs.fts.schemas.album.realestateresponse;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * ���������������
 */
public class OwnerType extends OrganizationBaseType
{
    private String orgSign;
    private String subjectCode;
    private LocalDate birthDate;
    private String birthPlace;
    private String insuranceNumber;
    private String citizen;
    private String sex;
    private String codeOPF;
    private String regCountry;
    private LocalDate regDate;
    private String agencyRegistration;
    private String email;
    private String regNum;
    private String codeOKATO;
    private AddressType regAddress;
    private AddressType factLocation;
    private IdentityCardType identityCard;

    /** 
     * Get the 'OrgSign' element value. �������: 1 - ���. ����; 2 - ��. ����; 3 - ������� ���������� �����
     * 
     * @return value
     */
    public String getOrgSign() {
        return orgSign;
    }

    /** 
     * Set the 'OrgSign' element value. �������: 1 - ���. ����; 2 - ��. ����; 3 - ������� ���������� �����
     * 
     * @param orgSign
     */
    public void setOrgSign(String orgSign) {
        this.orgSign = orgSign;
    }

    /** 
     * Get the 'SubjectCode' element value. ������� ��������������
     * 
     * @return value
     */
    public String getSubjectCode() {
        return subjectCode;
    }

    /** 
     * Set the 'SubjectCode' element value. ������� ��������������
     * 
     * @param subjectCode
     */
    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
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
     * Get the 'BirthPlace' element value. ����� ��������
     * 
     * @return value
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    /** 
     * Set the 'BirthPlace' element value. ����� ��������
     * 
     * @param birthPlace
     */
    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    /** 
     * Get the 'InsuranceNumber' element value. �����
     * 
     * @return value
     */
    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    /** 
     * Set the 'InsuranceNumber' element value. �����
     * 
     * @param insuranceNumber
     */
    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    /** 
     * Get the 'Citizen' element value. �����������
     * 
     * @return value
     */
    public String getCitizen() {
        return citizen;
    }

    /** 
     * Set the 'Citizen' element value. �����������
     * 
     * @param citizen
     */
    public void setCitizen(String citizen) {
        this.citizen = citizen;
    }

    /** 
     * Get the 'Sex' element value. ���
     * 
     * @return value
     */
    public String getSex() {
        return sex;
    }

    /** 
     * Set the 'Sex' element value. ���
     * 
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /** 
     * Get the 'CodeOPF' element value. ��� ���
     * 
     * @return value
     */
    public String getCodeOPF() {
        return codeOPF;
    }

    /** 
     * Set the 'CodeOPF' element value. ��� ���
     * 
     * @param codeOPF
     */
    public void setCodeOPF(String codeOPF) {
        this.codeOPF = codeOPF;
    }

    /** 
     * Get the 'RegCountry' element value. ������ ����������� (������������)
     * 
     * @return value
     */
    public String getRegCountry() {
        return regCountry;
    }

    /** 
     * Set the 'RegCountry' element value. ������ ����������� (������������)
     * 
     * @param regCountry
     */
    public void setRegCountry(String regCountry) {
        this.regCountry = regCountry;
    }

    /** 
     * Get the 'RegDate' element value. ���� ��������������� ����������� (���� ����������� � ������ ����������� (������������)) 
     * 
     * @return value
     */
    public LocalDate getRegDate() {
        return regDate;
    }

    /** 
     * Set the 'RegDate' element value. ���� ��������������� ����������� (���� ����������� � ������ ����������� (������������)) 
     * 
     * @param regDate
     */
    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    /** 
     * Get the 'AgencyRegistration' element value. ����� ����������� (������������ ��������������� ������)
     * 
     * @return value
     */
    public String getAgencyRegistration() {
        return agencyRegistration;
    }

    /** 
     * Set the 'AgencyRegistration' element value. ����� ����������� (������������ ��������������� ������)
     * 
     * @param agencyRegistration
     */
    public void setAgencyRegistration(String agencyRegistration) {
        this.agencyRegistration = agencyRegistration;
    }

    /** 
     * Get the 'Email' element value. ����� ����������� �����
     * 
     * @return value
     */
    public String getEmail() {
        return email;
    }

    /** 
     * Set the 'Email' element value. ����� ����������� �����
     * 
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /** 
     * Get the 'RegNum' element value. ����� ��������������� ������
     * 
     * @return value
     */
    public String getRegNum() {
        return regNum;
    }

    /** 
     * Set the 'RegNum' element value. ����� ��������������� ������
     * 
     * @param regNum
     */
    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    /** 
     * Get the 'CodeOKATO' element value. ��� �����
     * 
     * @return value
     */
    public String getCodeOKATO() {
        return codeOKATO;
    }

    /** 
     * Set the 'CodeOKATO' element value. ��� �����
     * 
     * @param codeOKATO
     */
    public void setCodeOKATO(String codeOKATO) {
        this.codeOKATO = codeOKATO;
    }

    /** 
     * Get the 'RegAddress' element value. ������������������ ����� ��������
     * 
     * @return value
     */
    public AddressType getRegAddress() {
        return regAddress;
    }

    /** 
     * Set the 'RegAddress' element value. ������������������ ����� ��������
     * 
     * @param regAddress
     */
    public void setRegAddress(AddressType regAddress) {
        this.regAddress = regAddress;
    }

    /** 
     * Get the 'FactLocation' element value. ����������� ����� ��������
     * 
     * @return value
     */
    public AddressType getFactLocation() {
        return factLocation;
    }

    /** 
     * Set the 'FactLocation' element value. ����������� ����� ��������
     * 
     * @param factLocation
     */
    public void setFactLocation(AddressType factLocation) {
        this.factLocation = factLocation;
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
