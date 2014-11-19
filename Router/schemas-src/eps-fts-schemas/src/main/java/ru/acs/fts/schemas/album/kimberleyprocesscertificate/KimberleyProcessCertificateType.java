
package ru.acs.fts.schemas.album.kimberleyprocesscertificate;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;
import ru.acs.fts.schemas.album.sertifcommonaggregatetypescust.SertifOrgBaseType;

/** 
 * ���������� �������������� �������� �� �������������� ��������� ������
 */
public class KimberleyProcessCertificateType extends BaseDocType
{
    private String BDRDID;
    private LocalDate issueDate;
    private LocalDate validityDateEnd;
    private String packageNumber;
    private String extractingCountry;
    private List<String> noteList = new ArrayList<String>();
    private CertificateOrgType certificateOrg;
    private SertifOrgBaseType exporter;
    private SertifOrgBaseType importer;
    private List<DiamonsInfoType> diamondsInfoList = new ArrayList<DiamonsInfoType>();
    private OrganizationBaseType authenticateOrg;
    private CertificateNumberType certificateNumber;
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
     * Get the 'IssueDate' element value. ���� ������ �����������
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. ���� ������ �����������
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the 'ValidityDateEnd' element value. ���� ��������� ����� �������� �����������
     * 
     * @return value
     */
    public LocalDate getValidityDateEnd() {
        return validityDateEnd;
    }

    /** 
     * Set the 'ValidityDateEnd' element value. ���� ��������� ����� �������� �����������
     * 
     * @param validityDateEnd
     */
    public void setValidityDateEnd(LocalDate validityDateEnd) {
        this.validityDateEnd = validityDateEnd;
    }

    /** 
     * Get the 'PackageNumber' element value. ����� ������� � ��������
     * 
     * @return value
     */
    public String getPackageNumber() {
        return packageNumber;
    }

    /** 
     * Set the 'PackageNumber' element value. ����� ������� � ��������
     * 
     * @param packageNumber
     */
    public void setPackageNumber(String packageNumber) {
        this.packageNumber = packageNumber;
    }

    /** 
     * Get the 'ExtractingCountry' element value. ���������� ������
     * 
     * @return value
     */
    public String getExtractingCountry() {
        return extractingCountry;
    }

    /** 
     * Set the 'ExtractingCountry' element value. ���������� ������
     * 
     * @param extractingCountry
     */
    public void setExtractingCountry(String extractingCountry) {
        this.extractingCountry = extractingCountry;
    }

    /** 
     * Get the list of 'Note' element items. �������������� �������
     * 
     * @return list
     */
    public List<String> getNoteList() {
        return noteList;
    }

    /** 
     * Set the list of 'Note' element items. �������������� �������
     * 
     * @param list
     */
    public void setNoteList(List<String> list) {
        noteList = list;
    }

    /** 
     * Get the 'CertificateOrg' element value. ����� ������������
     * 
     * @return value
     */
    public CertificateOrgType getCertificateOrg() {
        return certificateOrg;
    }

    /** 
     * Set the 'CertificateOrg' element value. ����� ������������
     * 
     * @param certificateOrg
     */
    public void setCertificateOrg(CertificateOrgType certificateOrg) {
        this.certificateOrg = certificateOrg;
    }

    /** 
     * Get the 'Exporter' element value. �������� �� ����������
     * 
     * @return value
     */
    public SertifOrgBaseType getExporter() {
        return exporter;
    }

    /** 
     * Set the 'Exporter' element value. �������� �� ����������
     * 
     * @param exporter
     */
    public void setExporter(SertifOrgBaseType exporter) {
        this.exporter = exporter;
    }

    /** 
     * Get the 'Importer' element value. �������� �� ���������
     * 
     * @return value
     */
    public SertifOrgBaseType getImporter() {
        return importer;
    }

    /** 
     * Set the 'Importer' element value. �������� �� ���������
     * 
     * @param importer
     */
    public void setImporter(SertifOrgBaseType importer) {
        this.importer = importer;
    }

    /** 
     * Get the list of 'DiamondsInfo' element items. �������� �� �������
     * 
     * @return list
     */
    public List<DiamonsInfoType> getDiamondsInfoList() {
        return diamondsInfoList;
    }

    /** 
     * Set the list of 'DiamondsInfo' element items. �������� �� �������
     * 
     * @param list
     */
    public void setDiamondsInfoList(List<DiamonsInfoType> list) {
        diamondsInfoList = list;
    }

    /** 
     * Get the 'AuthenticateOrg' element value. �����, �������������� ������������� �����������
     * 
     * @return value
     */
    public OrganizationBaseType getAuthenticateOrg() {
        return authenticateOrg;
    }

    /** 
     * Set the 'AuthenticateOrg' element value. �����, �������������� ������������� �����������
     * 
     * @param authenticateOrg
     */
    public void setAuthenticateOrg(OrganizationBaseType authenticateOrg) {
        this.authenticateOrg = authenticateOrg;
    }

    /** 
     * Get the 'CertificateNumber' element value. ���������� ����� �����������
     * 
     * @return value
     */
    public CertificateNumberType getCertificateNumber() {
        return certificateNumber;
    }

    /** 
     * Set the 'CertificateNumber' element value. ���������� ����� �����������
     * 
     * @param certificateNumber
     */
    public void setCertificateNumber(CertificateNumberType certificateNumber) {
        this.certificateNumber = certificateNumber;
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
