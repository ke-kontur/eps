
package ru.acs.fts.schemas.album.fsvtsteklicense;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * �������� ����� ������/�� ���� (�����) ������� � ����������, ���������� ����������� ��������
 */
public class FsVtsTekLicenseType extends BaseDocType
{
    private String BDRDID;
    private String countryDeparture;
    private String countryOrigin;
    private String countryEndUse;
    private String lisenceIssue;
    private String additionalInfo;
    private String contractCurrency;
    private LicenseType license;
    private LicenseOwnerType licenseOwner;
    private DocumentBaseType contractDetails;
    private GoodsDescriptionType goodsDescription;
    private PersonBaseType authorizedPerson;
    private String documentModeID;

    /** 
     * Get the 'BDRDID' element value. ������������� ��������� �� �� ��
     * 
     * @return value
     */
    public String getBDRDID() {
        return BDRDID;
    }

    /** 
     * Set the 'BDRDID' element value. ������������� ��������� �� �� ��
     * 
     * @param BDRDID
     */
    public void setBDRDID(String BDRDID) {
        this.BDRDID = BDRDID;
    }

    /** 
     * Get the 'CountryDeparture' element value. ������ �����������/���������� (��������/����������)
     * 
     * @return value
     */
    public String getCountryDeparture() {
        return countryDeparture;
    }

    /** 
     * Set the 'CountryDeparture' element value. ������ �����������/���������� (��������/����������)
     * 
     * @param countryDeparture
     */
    public void setCountryDeparture(String countryDeparture) {
        this.countryDeparture = countryDeparture;
    }

    /** 
     * Get the 'CountryOrigin' element value. ������ �������������
     * 
     * @return value
     */
    public String getCountryOrigin() {
        return countryOrigin;
    }

    /** 
     * Set the 'CountryOrigin' element value. ������ �������������
     * 
     * @param countryOrigin
     */
    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }

    /** 
     * Get the 'CountryEndUse' element value. ������ ��������� �������������
     * 
     * @return value
     */
    public String getCountryEndUse() {
        return countryEndUse;
    }

    /** 
     * Set the 'CountryEndUse' element value. ������ ��������� �������������
     * 
     * @param countryEndUse
     */
    public void setCountryEndUse(String countryEndUse) {
        this.countryEndUse = countryEndUse;
    }

    /** 
     * Get the 'LisenceIssue' element value. ��������� ��� ������ ��������
     * 
     * @return value
     */
    public String getLisenceIssue() {
        return lisenceIssue;
    }

    /** 
     * Set the 'LisenceIssue' element value. ��������� ��� ������ ��������
     * 
     * @param lisenceIssue
     */
    public void setLisenceIssue(String lisenceIssue) {
        this.lisenceIssue = lisenceIssue;
    }

    /** 
     * Get the 'AdditionalInfo' element value. �������������� ����������
     * 
     * @return value
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /** 
     * Set the 'AdditionalInfo' element value. �������������� ����������
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /** 
     * Get the 'ContractCurrency' element value. ������ ���������
     * 
     * @return value
     */
    public String getContractCurrency() {
        return contractCurrency;
    }

    /** 
     * Set the 'ContractCurrency' element value. ������ ���������
     * 
     * @param contractCurrency
     */
    public void setContractCurrency(String contractCurrency) {
        this.contractCurrency = contractCurrency;
    }

    /** 
     * Get the 'License' element value. �������� � ��������
     * 
     * @return value
     */
    public LicenseType getLicense() {
        return license;
    }

    /** 
     * Set the 'License' element value. �������� � ��������
     * 
     * @param license
     */
    public void setLicense(LicenseType license) {
        this.license = license;
    }

    /** 
     * Get the 'LicenseOwner' element value. �������� � ��������� ��������
     * 
     * @return value
     */
    public LicenseOwnerType getLicenseOwner() {
        return licenseOwner;
    }

    /** 
     * Set the 'LicenseOwner' element value. �������� � ��������� ��������
     * 
     * @param licenseOwner
     */
    public void setLicenseOwner(LicenseOwnerType licenseOwner) {
        this.licenseOwner = licenseOwner;
    }

    /** 
     * Get the 'ContractDetails' element value. ��������� ���������
     * 
     * @return value
     */
    public DocumentBaseType getContractDetails() {
        return contractDetails;
    }

    /** 
     * Set the 'ContractDetails' element value. ��������� ���������
     * 
     * @param contractDetails
     */
    public void setContractDetails(DocumentBaseType contractDetails) {
        this.contractDetails = contractDetails;
    }

    /** 
     * Get the 'GoodsDescription' element value. �������� � �������
     * 
     * @return value
     */
    public GoodsDescriptionType getGoodsDescription() {
        return goodsDescription;
    }

    /** 
     * Set the 'GoodsDescription' element value. �������� � �������
     * 
     * @param goodsDescription
     */
    public void setGoodsDescription(GoodsDescriptionType goodsDescription) {
        this.goodsDescription = goodsDescription;
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
