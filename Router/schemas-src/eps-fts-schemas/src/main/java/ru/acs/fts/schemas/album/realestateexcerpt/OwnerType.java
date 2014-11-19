
package ru.acs.fts.schemas.album.realestateexcerpt;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;

/** 
 * �������� ������� ����������� ���������
 */
public class OwnerType extends CUOrganizationType
{
    private String orgSign;
    private LocalDate birthDate;
    private String insuranceNumber;
    private LocalDate regDate;
    private List<String> previousNameList = new ArrayList<String>();
    private String governanceCode;
    private String regCountry;
    private String regNum;
    private String ID;
    private String contactInfo;
    private String egrpID;
    private String agentKind;
    private AddressType factAddress;
    private List<IdentityCardType> previousIdentityDocList = new ArrayList<IdentityCardType>();
    private List<PresentedDocsType> presentedDocList = new ArrayList<PresentedDocsType>();

    /** 
     * Get the 'OrgSign' element value. �������: 1 - ���. ����; 2 - ��. ���� ; 3 - ����� ��������������� ������ ��� ����� �������� ��������������; 4 - ����������� ��. ����
     * 
     * @return value
     */
    public String getOrgSign() {
        return orgSign;
    }

    /** 
     * Set the 'OrgSign' element value. �������: 1 - ���. ����; 2 - ��. ���� ; 3 - ����� ��������������� ������ ��� ����� �������� ��������������; 4 - ����������� ��. ����
     * 
     * @param orgSign
     */
    public void setOrgSign(String orgSign) {
        this.orgSign = orgSign;
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
     * Get the 'RegDate' element value. ���� ��������������� �����������
     * 
     * @return value
     */
    public LocalDate getRegDate() {
        return regDate;
    }

    /** 
     * Set the 'RegDate' element value. ���� ��������������� �����������
     * 
     * @param regDate
     */
    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    /** 
     * Get the list of 'PreviousName' element items. ���������� ������������
     * 
     * @return list
     */
    public List<String> getPreviousNameList() {
        return previousNameList;
    }

    /** 
     * Set the list of 'PreviousName' element items. ���������� ������������
     * 
     * @param list
     */
    public void setPreviousNameList(List<String> list) {
        previousNameList = list;
    }

    /** 
     * Get the 'GovernanceCode' element value. ��� ������ ��������������� ������ ��� ������ �������� ��������������
     * 
     * @return value
     */
    public String getGovernanceCode() {
        return governanceCode;
    }

    /** 
     * Set the 'GovernanceCode' element value. ��� ������ ��������������� ������ ��� ������ �������� ��������������
     * 
     * @param governanceCode
     */
    public void setGovernanceCode(String governanceCode) {
        this.governanceCode = governanceCode;
    }

    /** 
     * Get the 'RegCountry' element value. ������ �����������
     * 
     * @return value
     */
    public String getRegCountry() {
        return regCountry;
    }

    /** 
     * Set the 'RegCountry' element value. ������ �����������
     * 
     * @param regCountry
     */
    public void setRegCountry(String regCountry) {
        this.regCountry = regCountry;
    }

    /** 
     * Get the 'RegNum' element value. ����� �����������
     * 
     * @return value
     */
    public String getRegNum() {
        return regNum;
    }

    /** 
     * Set the 'RegNum' element value. ����� �����������
     * 
     * @param regNum
     */
    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    /** 
     * Get the 'ID' element value. ���������� �������������
     * 
     * @return value
     */
    public String getID() {
        return ID;
    }

    /** 
     * Set the 'ID' element value. ���������� �������������
     * 
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /** 
     * Get the 'ContactInfo' element value. ���������� ����������
     * 
     * @return value
     */
    public String getContactInfo() {
        return contactInfo;
    }

    /** 
     * Set the 'ContactInfo' element value. ���������� ����������
     * 
     * @param contactInfo
     */
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    /** 
     * Get the 'EgrpID' element value. ������������� � ���� ������ ����
     * 
     * @return value
     */
    public String getEgrpID() {
        return egrpID;
    }

    /** 
     * Set the 'EgrpID' element value. ������������� � ���� ������ ����
     * 
     * @param egrpID
     */
    public void setEgrpID(String egrpID) {
        this.egrpID = egrpID;
    }

    /** 
     * Get the 'AgentKind' element value. ��� �����������������
     * 
     * @return value
     */
    public String getAgentKind() {
        return agentKind;
    }

    /** 
     * Set the 'AgentKind' element value. ��� �����������������
     * 
     * @param agentKind
     */
    public void setAgentKind(String agentKind) {
        this.agentKind = agentKind;
    }

    /** 
     * Get the 'FactAddress' element value. ����� ����������������� ���������� �������� / ������������������ ����� ��������
     * 
     * @return value
     */
    public AddressType getFactAddress() {
        return factAddress;
    }

    /** 
     * Set the 'FactAddress' element value. ����� ����������������� ���������� �������� / ������������������ ����� ��������
     * 
     * @param factAddress
     */
    public void setFactAddress(AddressType factAddress) {
        this.factAddress = factAddress;
    }

    /** 
     * Get the list of 'PreviousIdentityDocs' element items. ���������� ��������� ������������� ��������
     * 
     * @return list
     */
    public List<IdentityCardType> getPreviousIdentityDocList() {
        return previousIdentityDocList;
    }

    /** 
     * Set the list of 'PreviousIdentityDocs' element items. ���������� ��������� ������������� ��������
     * 
     * @param list
     */
    public void setPreviousIdentityDocList(List<IdentityCardType> list) {
        previousIdentityDocList = list;
    }

    /** 
     * Get the list of 'PresentedDocs' element items. �������������� ���������
     * 
     * @return list
     */
    public List<PresentedDocsType> getPresentedDocList() {
        return presentedDocList;
    }

    /** 
     * Set the list of 'PresentedDocs' element items. �������������� ���������
     * 
     * @param list
     */
    public void setPresentedDocList(List<PresentedDocsType> list) {
        presentedDocList = list;
    }
}
