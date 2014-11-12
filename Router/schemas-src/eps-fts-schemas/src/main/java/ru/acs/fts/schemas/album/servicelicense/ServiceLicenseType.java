
package ru.acs.fts.schemas.album.servicelicense;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * �������� �� �������� �� ������������� ��������� ��������� ����������� ������ � ���������� ��� ��. ���/�� ������� ������������ �� ������������ � ������ ����������� �������, � ��� ����� ����������� ������� �������� ����������/� ������� �������� �� ����� ������������� ��������� ������������/�� ������� �������� �� ������������ �� ���������� ���������� ������ �����������, ������� ����������� ������� ������/�� ������������� ������� � ������������� ������������� ������������� ���������
 */
public class ServiceLicenseType extends BaseDocType
{
    private String docSign;
    private String decisionNum;
    private LocalDate decisionDate;
    private AuthorityOrgType authorityOrg;
    private LicenseType license;
    private LicenseeType licensee;
    private PersonBaseType authorizedPerson;
    private List<ServiceDescriptionType> serviceDescriptionList = new ArrayList<ServiceDescriptionType>();
    private List<AddressType> servicePlaceList = new ArrayList<AddressType>();
    private String documentModeID;

    /** 
     * Get the 'DocSign' element value. ��������: 1 - �� �������� �� ������������� ��������� ��������� ����������� ������ � ���������� ��� ��. ���; 2 - �� ������� ������������ �� ������������ � ������ ����������� �������, � ��� ����� ����������� ������� �������� ����������; 3 - � ������� �������� �� ����� ������������� ��������� ������������; 4 - �� ������� �������� �� ������������ �� ���������� ���������� ������ �����������, ������� ����������� ������� ������; 5 - �� ������������� ������� � ������������� ������������� ������������� ���������
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. ��������: 1 - �� �������� �� ������������� ��������� ��������� ����������� ������ � ���������� ��� ��. ���; 2 - �� ������� ������������ �� ������������ � ������ ����������� �������, � ��� ����� ����������� ������� �������� ����������; 3 - � ������� �������� �� ����� ������������� ��������� ������������; 4 - �� ������� �������� �� ������������ �� ���������� ���������� ������ �����������, ������� ����������� ������� ������; 5 - �� ������������� ������� � ������������� ������������� ������������� ���������
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'DecisionNum' element value. ����� �������
     * 
     * @return value
     */
    public String getDecisionNum() {
        return decisionNum;
    }

    /** 
     * Set the 'DecisionNum' element value. ����� �������
     * 
     * @param decisionNum
     */
    public void setDecisionNum(String decisionNum) {
        this.decisionNum = decisionNum;
    }

    /** 
     * Get the 'DecisionDate' element value. ���� �������
     * 
     * @return value
     */
    public LocalDate getDecisionDate() {
        return decisionDate;
    }

    /** 
     * Set the 'DecisionDate' element value. ���� �������
     * 
     * @param decisionDate
     */
    public void setDecisionDate(LocalDate decisionDate) {
        this.decisionDate = decisionDate;
    }

    /** 
     * Get the 'AuthorityOrg' element value. ����� ������
     * 
     * @return value
     */
    public AuthorityOrgType getAuthorityOrg() {
        return authorityOrg;
    }

    /** 
     * Set the 'AuthorityOrg' element value. ����� ������
     * 
     * @param authorityOrg
     */
    public void setAuthorityOrg(AuthorityOrgType authorityOrg) {
        this.authorityOrg = authorityOrg;
    }

    /** 
     * Get the 'License' element value. �������� � ��������/�����������
     * 
     * @return value
     */
    public LicenseType getLicense() {
        return license;
    }

    /** 
     * Set the 'License' element value. �������� � ��������/�����������
     * 
     * @param license
     */
    public void setLicense(LicenseType license) {
        this.license = license;
    }

    /** 
     * Get the 'Licensee' element value. ���������/��������������� ����
     * 
     * @return value
     */
    public LicenseeType getLicensee() {
        return licensee;
    }

    /** 
     * Set the 'Licensee' element value. ���������/��������������� ����
     * 
     * @param licensee
     */
    public void setLicensee(LicenseeType licensee) {
        this.licensee = licensee;
    }

    /** 
     * Get the 'AuthorizedPerson' element value. �������������� ����
     * 
     * @return value
     */
    public PersonBaseType getAuthorizedPerson() {
        return authorizedPerson;
    }

    /** 
     * Set the 'AuthorizedPerson' element value. �������������� ����
     * 
     * @param authorizedPerson
     */
    public void setAuthorizedPerson(PersonBaseType authorizedPerson) {
        this.authorizedPerson = authorizedPerson;
    }

    /** 
     * Get the list of 'ServiceDescription' element items. �������� ������������
     * 
     * @return list
     */
    public List<ServiceDescriptionType> getServiceDescriptionList() {
        return serviceDescriptionList;
    }

    /** 
     * Set the list of 'ServiceDescription' element items. �������� ������������
     * 
     * @param list
     */
    public void setServiceDescriptionList(List<ServiceDescriptionType> list) {
        serviceDescriptionList = list;
    }

    /** 
     * Get the list of 'ServicePlace' element items. ����� ������������� ������������
     * 
     * @return list
     */
    public List<AddressType> getServicePlaceList() {
        return servicePlaceList;
    }

    /** 
     * Set the list of 'ServicePlace' element items. ����� ������������� ������������
     * 
     * @param list
     */
    public void setServicePlaceList(List<AddressType> list) {
        servicePlaceList = list;
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
