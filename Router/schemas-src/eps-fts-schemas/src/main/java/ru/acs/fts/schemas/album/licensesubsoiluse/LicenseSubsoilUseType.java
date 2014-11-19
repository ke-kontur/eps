
package ru.acs.fts.schemas.album.licensesubsoiluse;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * �������� �� ����������� �������
 */
public class LicenseSubsoilUseType extends BaseDocType
{
    private String licensingAuthority;
    private List<String> aimList = new ArrayList<String>();
    private String statusArea;
    private String endDate;
    private List<String> rightSubsoilUseList = new ArrayList<String>();
    private RegistrationNumberType registrationNumber;
    private OrganizationType organizationReceiver;
    private PersonBaseType representativeOrganization;
    private AddressType locationArea;
    private VersoType verso;
    private List<PersonSignatureType> personIssuingSignatureList = new ArrayList<PersonSignatureType>();
    private PersonSignatureType superiorsSignature;
    private List<ApplicationType> applicationList = new ArrayList<ApplicationType>();
    private String documentModeID;

    /** 
     * Get the 'LicensingAuthority' element value. ������������ ������, ��������� ��������
     * 
     * @return value
     */
    public String getLicensingAuthority() {
        return licensingAuthority;
    }

    /** 
     * Set the 'LicensingAuthority' element value. ������������ ������, ��������� ��������
     * 
     * @param licensingAuthority
     */
    public void setLicensingAuthority(String licensingAuthority) {
        this.licensingAuthority = licensingAuthority;
    }

    /** 
     * Get the list of 'Aim' element items. ������� ����������� � ������ �����
     * 
     * @return list
     */
    public List<String> getAimList() {
        return aimList;
    }

    /** 
     * Set the list of 'Aim' element items. ������� ����������� � ������ �����
     * 
     * @param list
     */
    public void setAimList(List<String> list) {
        aimList = list;
    }

    /** 
     * Get the 'StatusArea' element value. ������ ������� ����: 0 - ������� ������, 1 - �������������� ������
     * 
     * @return value
     */
    public String getStatusArea() {
        return statusArea;
    }

    /** 
     * Set the 'StatusArea' element value. ������ ������� ����: 0 - ������� ������, 1 - �������������� ������
     * 
     * @param statusArea
     */
    public void setStatusArea(String statusArea) {
        this.statusArea = statusArea;
    }

    /** 
     * Get the 'EndDate' element value. ���� ��������� �������� �������� 
     * 
     * @return value
     */
    public String getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. ���� ��������� �������� �������� 
     * 
     * @param endDate
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /** 
     * Get the list of 'RightSubsoilUse' element items. ����� �� ����������� �������
     * 
     * @return list
     */
    public List<String> getRightSubsoilUseList() {
        return rightSubsoilUseList;
    }

    /** 
     * Set the list of 'RightSubsoilUse' element items. ����� �� ����������� �������
     * 
     * @param list
     */
    public void setRightSubsoilUseList(List<String> list) {
        rightSubsoilUseList = list;
    }

    /** 
     * Get the 'RegistrationNumber' element value. ��������������� ����� ��������
     * 
     * @return value
     */
    public RegistrationNumberType getRegistrationNumber() {
        return registrationNumber;
    }

    /** 
     * Set the 'RegistrationNumber' element value. ��������������� ����� ��������
     * 
     * @param registrationNumber
     */
    public void setRegistrationNumber(RegistrationNumberType registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /** 
     * Get the 'OrganizationReceiver' element value. ������� ������������������� ������������, ���������� ������ ��������
     * 
     * @return value
     */
    public OrganizationType getOrganizationReceiver() {
        return organizationReceiver;
    }

    /** 
     * Set the 'OrganizationReceiver' element value. ������� ������������������� ������������, ���������� ������ ��������
     * 
     * @param organizationReceiver
     */
    public void setOrganizationReceiver(OrganizationType organizationReceiver) {
        this.organizationReceiver = organizationReceiver;
    }

    /** 
     * Get the 'RepresentativeOrganization' element value. ����, �������������� ������� ������������������� ������������
     * 
     * @return value
     */
    public PersonBaseType getRepresentativeOrganization() {
        return representativeOrganization;
    }

    /** 
     * Set the 'RepresentativeOrganization' element value. ����, �������������� ������� ������������������� ������������
     * 
     * @param representativeOrganization
     */
    public void setRepresentativeOrganization(
            PersonBaseType representativeOrganization) {
        this.representativeOrganization = representativeOrganization;
    }

    /** 
     * Get the 'LocationArea' element value. ������������ ������� ����
     * 
     * @return value
     */
    public AddressType getLocationArea() {
        return locationArea;
    }

    /** 
     * Set the 'LocationArea' element value. ������������ ������� ����
     * 
     * @param locationArea
     */
    public void setLocationArea(AddressType locationArea) {
        this.locationArea = locationArea;
    }

    /** 
     * Get the 'Verso' element value. ��������� �������
     * 
     * @return value
     */
    public VersoType getVerso() {
        return verso;
    }

    /** 
     * Set the 'Verso' element value. ��������� �������
     * 
     * @param verso
     */
    public void setVerso(VersoType verso) {
        this.verso = verso;
    }

    /** 
     * Get the list of 'PersonIssuingSignature' element items. ������� ��������������� ���� 
     * 
     * @return list
     */
    public List<PersonSignatureType> getPersonIssuingSignatureList() {
        return personIssuingSignatureList;
    }

    /** 
     * Set the list of 'PersonIssuingSignature' element items. ������� ��������������� ���� 
     * 
     * @param list
     */
    public void setPersonIssuingSignatureList(List<PersonSignatureType> list) {
        personIssuingSignatureList = list;
    }

    /** 
     * Get the 'SuperiorsSignature' element value. ������� ������������ �����������, ����������� ��������.
     * 
     * @return value
     */
    public PersonSignatureType getSuperiorsSignature() {
        return superiorsSignature;
    }

    /** 
     * Set the 'SuperiorsSignature' element value. ������� ������������ �����������, ����������� ��������.
     * 
     * @param superiorsSignature
     */
    public void setSuperiorsSignature(PersonSignatureType superiorsSignature) {
        this.superiorsSignature = superiorsSignature;
    }

    /** 
     * Get the list of 'Application' element items. �������� � �����������, � ������� ����� ���������� � �������� ������ ���������� �������/������ ������� ����
     * 
     * @return list
     */
    public List<ApplicationType> getApplicationList() {
        return applicationList;
    }

    /** 
     * Set the list of 'Application' element items. �������� � �����������, � ������� ����� ���������� � �������� ������ ���������� �������/������ ������� ����
     * 
     * @param list
     */
    public void setApplicationList(List<ApplicationType> list) {
        applicationList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
