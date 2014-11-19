
package ru.acs.fts.schemas.album.legalentityinfo;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ������� �������� �� ��. ����/�������� �� ����� ����������� � ��������� ������ �� ����� ���������� �� ������������� �������������/������� � ��. ����
 */
public class LegalEntityInfoType extends BaseDocType
{
    private String docSign;
    private String resultCode;
    private LocalDate formDate;
    private BaseDetailsType baseDetails;
    private List<AuthorizedOrgType> authorizedOrgList = new ArrayList<AuthorizedOrgType>();
    private RegInfoType taxRegInfo;
    private RegInfoType pensionServiceReg;
    private RegInfoType insuranceServiceReg;
    private List<LicenseType> licenseList = new ArrayList<LicenseType>();
    private List<RecordDescriptionType> recordDescriptionList = new ArrayList<RecordDescriptionType>();
    private String documentModeID;

    /** 
     * Get the 'DocSign' element value. ������� ���������: 1 - ������� �������� �� ��. ����; 2 - �������� �� ����� ����������� � ��������� ������ �� ����� ���������� �� ������������� �������������; 3 - ������� � ��. ����
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. ������� ���������: 1 - ������� �������� �� ��. ����; 2 - �������� �� ����� ����������� � ��������� ������ �� ����� ���������� �� ������������� �������������; 3 - ������� � ��. ����
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'ResultCode' element value. ��� ���������
     * 
     * @return value
     */
    public String getResultCode() {
        return resultCode;
    }

    /** 
     * Set the 'ResultCode' element value. ��� ���������
     * 
     * @param resultCode
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /** 
     * Get the 'FormDate' element value. ���� ������������ �������� �� ����� � ��������� ������������ ����
     * 
     * @return value
     */
    public LocalDate getFormDate() {
        return formDate;
    }

    /** 
     * Set the 'FormDate' element value. ���� ������������ �������� �� ����� � ��������� ������������ ����
     * 
     * @param formDate
     */
    public void setFormDate(LocalDate formDate) {
        this.formDate = formDate;
    }

    /** 
     * Get the 'BaseDetails' element value. �������� �  ����������� ����
     * 
     * @return value
     */
    public BaseDetailsType getBaseDetails() {
        return baseDetails;
    }

    /** 
     * Set the 'BaseDetails' element value. �������� �  ����������� ����
     * 
     * @param baseDetails
     */
    public void setBaseDetails(BaseDetailsType baseDetails) {
        this.baseDetails = baseDetails;
    }

    /** 
     * Get the list of 'AuthorizedOrg' element items. �������� � ����, ������� ����� ��� ������������ ����������� �� ����� ������������ ����
     * 
     * @return list
     */
    public List<AuthorizedOrgType> getAuthorizedOrgList() {
        return authorizedOrgList;
    }

    /** 
     * Set the list of 'AuthorizedOrg' element items. �������� � ����, ������� ����� ��� ������������ ����������� �� ����� ������������ ����
     * 
     * @param list
     */
    public void setAuthorizedOrgList(List<AuthorizedOrgType> list) {
        authorizedOrgList = list;
    }

    /** 
     * Get the 'TaxRegInfo' element value. �������� �� ����� � ��������� ������
     * 
     * @return value
     */
    public RegInfoType getTaxRegInfo() {
        return taxRegInfo;
    }

    /** 
     * Set the 'TaxRegInfo' element value. �������� �� ����� � ��������� ������
     * 
     * @param taxRegInfo
     */
    public void setTaxRegInfo(RegInfoType taxRegInfo) {
        this.taxRegInfo = taxRegInfo;
    }

    /** 
     * Get the 'PensionServiceReg' element value. �������� � ����������� ������������ ���� � �������� ������������ � ��������������� ������ ����������� ����� ��
     * 
     * @return value
     */
    public RegInfoType getPensionServiceReg() {
        return pensionServiceReg;
    }

    /** 
     * Set the 'PensionServiceReg' element value. �������� � ����������� ������������ ���� � �������� ������������ � ��������������� ������ ����������� ����� ��
     * 
     * @param pensionServiceReg
     */
    public void setPensionServiceReg(RegInfoType pensionServiceReg) {
        this.pensionServiceReg = pensionServiceReg;
    }

    /** 
     * Get the 'InsuranceServiceReg' element value. �������� � ����������� ������������ ���� � �������� ������������ � �������������� ������ ����� ����������� ����������� ��
     * 
     * @return value
     */
    public RegInfoType getInsuranceServiceReg() {
        return insuranceServiceReg;
    }

    /** 
     * Set the 'InsuranceServiceReg' element value. �������� � ����������� ������������ ���� � �������� ������������ � �������������� ������ ����� ����������� ����������� ��
     * 
     * @param insuranceServiceReg
     */
    public void setInsuranceServiceReg(RegInfoType insuranceServiceReg) {
        this.insuranceServiceReg = insuranceServiceReg;
    }

    /** 
     * Get the list of 'License' element items. �������� � ��������
     * 
     * @return list
     */
    public List<LicenseType> getLicenseList() {
        return licenseList;
    }

    /** 
     * Set the list of 'License' element items. �������� � ��������
     * 
     * @param list
     */
    public void setLicenseList(List<LicenseType> list) {
        licenseList = list;
    }

    /** 
     * Get the list of 'RecordDescription' element items. �������� � �������, ��������� � �����
     * 
     * @return list
     */
    public List<RecordDescriptionType> getRecordDescriptionList() {
        return recordDescriptionList;
    }

    /** 
     * Set the list of 'RecordDescription' element items. �������� � �������, ��������� � �����
     * 
     * @param list
     */
    public void setRecordDescriptionList(List<RecordDescriptionType> list) {
        recordDescriptionList = list;
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
