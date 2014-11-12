
package ru.acs.fts.schemas.album.exportdiamondscertificate;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ���������� ������ �������������� ��������� �������
 */
public class ExportDiamondsCertificateType extends BaseDocType
{
    private String BDRDID;
    private LocalDate issueDate;
    private List<String> noteList = new ArrayList<String>();
    private LocalDate expiryDate;
    private OrganizationInfoType exporterInfo;
    private OrganizationInfoType recipient;
    private DocumentBaseType contractInfo;
    private CustomsPersonType customsControler;
    private DiamondsInfoType diamondsInfo;
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
     * Get the 'ExpiryDate' element value. ���� �������� �����������
     * 
     * @return value
     */
    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    /** 
     * Set the 'ExpiryDate' element value. ���� �������� �����������
     * 
     * @param expiryDate
     */
    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    /** 
     * Get the 'ExporterInfo' element value. �������� � �����������-����������
     * 
     * @return value
     */
    public OrganizationInfoType getExporterInfo() {
        return exporterInfo;
    }

    /** 
     * Set the 'ExporterInfo' element value. �������� � �����������-����������
     * 
     * @param exporterInfo
     */
    public void setExporterInfo(OrganizationInfoType exporterInfo) {
        this.exporterInfo = exporterInfo;
    }

    /** 
     * Get the 'Recipient' element value. �������� � ����������
     * 
     * @return value
     */
    public OrganizationInfoType getRecipient() {
        return recipient;
    }

    /** 
     * Set the 'Recipient' element value. �������� � ����������
     * 
     * @param recipient
     */
    public void setRecipient(OrganizationInfoType recipient) {
        this.recipient = recipient;
    }

    /** 
     * Get the 'ContractInfo' element value. ��������
     * 
     * @return value
     */
    public DocumentBaseType getContractInfo() {
        return contractInfo;
    }

    /** 
     * Set the 'ContractInfo' element value. ��������
     * 
     * @param contractInfo
     */
    public void setContractInfo(DocumentBaseType contractInfo) {
        this.contractInfo = contractInfo;
    }

    /** 
     * Get the 'CustomsControler' element value. ��������������� ���������
     * 
     * @return value
     */
    public CustomsPersonType getCustomsControler() {
        return customsControler;
    }

    /** 
     * Set the 'CustomsControler' element value. ��������������� ���������
     * 
     * @param customsControler
     */
    public void setCustomsControler(CustomsPersonType customsControler) {
        this.customsControler = customsControler;
    }

    /** 
     * Get the 'DiamondsInfo' element value. �������� �� �������������� �������
     * 
     * @return value
     */
    public DiamondsInfoType getDiamondsInfo() {
        return diamondsInfo;
    }

    /** 
     * Set the 'DiamondsInfo' element value. �������� �� �������������� �������
     * 
     * @param diamondsInfo
     */
    public void setDiamondsInfo(DiamondsInfoType diamondsInfo) {
        this.diamondsInfo = diamondsInfo;
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
