
package ru.acs.fts.schemas.album.detailquotadatard;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * �������� �� ������������ ���������
 */
public class DetailQuotaDataRDType extends BaseDocType
{
    private String BDRDID;
    private String documentNumber;
    private LocalDate issueDate;
    private String conNumber;
    private LocalDate conDateSignature;
    private String licenseKind;
    private String documentCode;
    private String quotaCategoryCode;
    private LocalDate licenseTerm;
    private String movement;
    private String licenseStatus;
    private LocalDate licenseStatusDate;
    private LocalDate datePlacement;
    private String licenseStatusCode;
    private CustomsType customsOriginalLicense;
    private List<CustomsType> customsCopyLicenseList = new ArrayList<CustomsType>();
    private List<PaperCarrierType> paperCarrierList = new ArrayList<PaperCarrierType>();
    private OwnersLicenseType ownersLicense;
    private OrganizationInfoType organizationInfo;
    private List<GoodsInfoType> goodsInfoList = new ArrayList<GoodsInfoType>();
    private PersonSignatureType agencyIssuedDoc;
    private String documentModeID;

    /** 
     * Get the 'BDRDID' element value. ���������� ����� �� �� ��
     * 
     * @return value
     */
    public String getBDRDID() {
        return BDRDID;
    }

    /** 
     * Set the 'BDRDID' element value. ���������� ����� �� �� ��
     * 
     * @param BDRDID
     */
    public void setBDRDID(String BDRDID) {
        this.BDRDID = BDRDID;
    }

    /** 
     * Get the 'DocumentNumber' element value. ����� ���������
     * 
     * @return value
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /** 
     * Set the 'DocumentNumber' element value. ����� ���������
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /** 
     * Get the 'IssueDate' element value. ���� ������ ���������
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. ���� ������ ���������
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the 'ConNumber' element value. ����� ���������
     * 
     * @return value
     */
    public String getConNumber() {
        return conNumber;
    }

    /** 
     * Set the 'ConNumber' element value. ����� ���������
     * 
     * @param conNumber
     */
    public void setConNumber(String conNumber) {
        this.conNumber = conNumber;
    }

    /** 
     * Get the 'ConDateSignature' element value. ���� ���������� ���������
     * 
     * @return value
     */
    public LocalDate getConDateSignature() {
        return conDateSignature;
    }

    /** 
     * Set the 'ConDateSignature' element value. ���� ���������� ���������
     * 
     * @param conDateSignature
     */
    public void setConDateSignature(LocalDate conDateSignature) {
        this.conDateSignature = conDateSignature;
    }

    /** 
     * Get the 'LicenseKind' element value. ��� ��������
     * 
     * @return value
     */
    public String getLicenseKind() {
        return licenseKind;
    }

    /** 
     * Set the 'LicenseKind' element value. ��� ��������
     * 
     * @param licenseKind
     */
    public void setLicenseKind(String licenseKind) {
        this.licenseKind = licenseKind;
    }

    /** 
     * Get the 'DocumentCode' element value. ��� ���� ���������
     * 
     * @return value
     */
    public String getDocumentCode() {
        return documentCode;
    }

    /** 
     * Set the 'DocumentCode' element value. ��� ���� ���������
     * 
     * @param documentCode
     */
    public void setDocumentCode(String documentCode) {
        this.documentCode = documentCode;
    }

    /** 
     * Get the 'QuotaCategoryCode' element value. ��� ��������� �����
     * 
     * @return value
     */
    public String getQuotaCategoryCode() {
        return quotaCategoryCode;
    }

    /** 
     * Set the 'QuotaCategoryCode' element value. ��� ��������� �����
     * 
     * @param quotaCategoryCode
     */
    public void setQuotaCategoryCode(String quotaCategoryCode) {
        this.quotaCategoryCode = quotaCategoryCode;
    }

    /** 
     * Get the 'LicenseTerm' element value. ���� �������� ��������
     * 
     * @return value
     */
    public LocalDate getLicenseTerm() {
        return licenseTerm;
    }

    /** 
     * Set the 'LicenseTerm' element value. ���� �������� ��������
     * 
     * @param licenseTerm
     */
    public void setLicenseTerm(LocalDate licenseTerm) {
        this.licenseTerm = licenseTerm;
    }

    /** 
     * Get the 'Movement' element value. ����������� �����������
     * 
     * @return value
     */
    public String getMovement() {
        return movement;
    }

    /** 
     * Set the 'Movement' element value. ����������� �����������
     * 
     * @param movement
     */
    public void setMovement(String movement) {
        this.movement = movement;
    }

    /** 
     * Get the 'LicenseStatus' element value. ������ ��������
     * 
     * @return value
     */
    public String getLicenseStatus() {
        return licenseStatus;
    }

    /** 
     * Set the 'LicenseStatus' element value. ������ ��������
     * 
     * @param licenseStatus
     */
    public void setLicenseStatus(String licenseStatus) {
        this.licenseStatus = licenseStatus;
    }

    /** 
     * Get the 'LicenseStatusDate' element value. ���� ��������� ������� ��������
     * 
     * @return value
     */
    public LocalDate getLicenseStatusDate() {
        return licenseStatusDate;
    }

    /** 
     * Set the 'LicenseStatusDate' element value. ���� ��������� ������� ��������
     * 
     * @param licenseStatusDate
     */
    public void setLicenseStatusDate(LocalDate licenseStatusDate) {
        this.licenseStatusDate = licenseStatusDate;
    }

    /** 
     * Get the 'DatePlacement' element value. ���� ��������� � �� ��
     * 
     * @return value
     */
    public LocalDate getDatePlacement() {
        return datePlacement;
    }

    /** 
     * Set the 'DatePlacement' element value. ���� ��������� � �� ��
     * 
     * @param datePlacement
     */
    public void setDatePlacement(LocalDate datePlacement) {
        this.datePlacement = datePlacement;
    }

    /** 
     * Get the 'LicenseStatusCode' element value. ��� ������ ��������
     * 
     * @return value
     */
    public String getLicenseStatusCode() {
        return licenseStatusCode;
    }

    /** 
     * Set the 'LicenseStatusCode' element value. ��� ������ ��������
     * 
     * @param licenseStatusCode
     */
    public void setLicenseStatusCode(String licenseStatusCode) {
        this.licenseStatusCode = licenseStatusCode;
    }

    /** 
     * Get the 'CustomsOriginalLicense' element value. ����������� ������ (��������� ��������)
     * 
     * @return value
     */
    public CustomsType getCustomsOriginalLicense() {
        return customsOriginalLicense;
    }

    /** 
     * Set the 'CustomsOriginalLicense' element value. ����������� ������ (��������� ��������)
     * 
     * @param customsOriginalLicense
     */
    public void setCustomsOriginalLicense(CustomsType customsOriginalLicense) {
        this.customsOriginalLicense = customsOriginalLicense;
    }

    /** 
     * Get the list of 'CustomsCopyLicense' element items. ����������� ������ (����� ��������)
     * 
     * @return list
     */
    public List<CustomsType> getCustomsCopyLicenseList() {
        return customsCopyLicenseList;
    }

    /** 
     * Set the list of 'CustomsCopyLicense' element items. ����������� ������ (����� ��������)
     * 
     * @param list
     */
    public void setCustomsCopyLicenseList(List<CustomsType> list) {
        customsCopyLicenseList = list;
    }

    /** 
     * Get the list of 'PaperCarrier' element items. �������� � �������� ���������
     * 
     * @return list
     */
    public List<PaperCarrierType> getPaperCarrierList() {
        return paperCarrierList;
    }

    /** 
     * Set the list of 'PaperCarrier' element items. �������� � �������� ���������
     * 
     * @param list
     */
    public void setPaperCarrierList(List<PaperCarrierType> list) {
        paperCarrierList = list;
    }

    /** 
     * Get the 'OwnersLicense' element value. �������� � ��������� ��������
     * 
     * @return value
     */
    public OwnersLicenseType getOwnersLicense() {
        return ownersLicense;
    }

    /** 
     * Set the 'OwnersLicense' element value. �������� � ��������� ��������
     * 
     * @param ownersLicense
     */
    public void setOwnersLicense(OwnersLicenseType ownersLicense) {
        this.ownersLicense = ownersLicense;
    }

    /** 
     * Get the 'OrganizationInfo' element value. �������� � �������� (����������)
     * 
     * @return value
     */
    public OrganizationInfoType getOrganizationInfo() {
        return organizationInfo;
    }

    /** 
     * Set the 'OrganizationInfo' element value. �������� � �������� (����������)
     * 
     * @param organizationInfo
     */
    public void setOrganizationInfo(OrganizationInfoType organizationInfo) {
        this.organizationInfo = organizationInfo;
    }

    /** 
     * Get the list of 'GoodsInfo' element items. �������� � ������
     * 
     * @return list
     */
    public List<GoodsInfoType> getGoodsInfoList() {
        return goodsInfoList;
    }

    /** 
     * Set the list of 'GoodsInfo' element items. �������� � ������
     * 
     * @param list
     */
    public void setGoodsInfoList(List<GoodsInfoType> list) {
        goodsInfoList = list;
    }

    /** 
     * Get the 'AgencyIssuedDoc' element value. �������� � ���������, �������� ��������
     * 
     * @return value
     */
    public PersonSignatureType getAgencyIssuedDoc() {
        return agencyIssuedDoc;
    }

    /** 
     * Set the 'AgencyIssuedDoc' element value. �������� � ���������, �������� ��������
     * 
     * @param agencyIssuedDoc
     */
    public void setAgencyIssuedDoc(PersonSignatureType agencyIssuedDoc) {
        this.agencyIssuedDoc = agencyIssuedDoc;
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
