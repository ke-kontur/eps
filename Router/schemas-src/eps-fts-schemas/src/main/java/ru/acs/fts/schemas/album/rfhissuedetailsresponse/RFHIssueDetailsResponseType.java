
package ru.acs.fts.schemas.album.rfhissuedetailsresponse;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * ������ � ����������� ����� (���������)
 */
public class RFHIssueDetailsResponseType extends BaseDocType
{
    private String BDRDID;
    private String sign;
    private String specialTerms;
    private String exportQuota;
    private String applicationNumber;
    private String personSignedDocument;
    private PermissionType permission;
    private CUOrganizationType exporter;
    private CUOrganizationType importer;
    private GoodsDescriptionType goodsDescription;
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
     * Get the 'Sign' element value. �������: 1- ��, 2 - ��, 3 - ���������, 4 - �����������
     * 
     * @return value
     */
    public String getSign() {
        return sign;
    }

    /** 
     * Set the 'Sign' element value. �������: 1- ��, 2 - ��, 3 - ���������, 4 - �����������
     * 
     * @param sign
     */
    public void setSign(String sign) {
        this.sign = sign;
    }

    /** 
     * Get the 'SpecialTerms' element value. ������ �������
     * 
     * @return value
     */
    public String getSpecialTerms() {
        return specialTerms;
    }

    /** 
     * Set the 'SpecialTerms' element value. ������ �������
     * 
     * @param specialTerms
     */
    public void setSpecialTerms(String specialTerms) {
        this.specialTerms = specialTerms;
    }

    /** 
     * Get the 'ExportQuota' element value. ���������� �����
     * 
     * @return value
     */
    public String getExportQuota() {
        return exportQuota;
    }

    /** 
     * Set the 'ExportQuota' element value. ���������� �����
     * 
     * @param exportQuota
     */
    public void setExportQuota(String exportQuota) {
        this.exportQuota = exportQuota;
    }

    /** 
     * Get the 'ApplicationNumber' element value. ����� ���������� �����
     * 
     * @return value
     */
    public String getApplicationNumber() {
        return applicationNumber;
    }

    /** 
     * Set the 'ApplicationNumber' element value. ����� ���������� �����
     * 
     * @param applicationNumber
     */
    public void setApplicationNumber(String applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    /** 
     * Get the 'PersonSignedDocument' element value. �������������� ����������� ����, ����������� ����������
     * 
     * @return value
     */
    public String getPersonSignedDocument() {
        return personSignedDocument;
    }

    /** 
     * Set the 'PersonSignedDocument' element value. �������������� ����������� ����, ����������� ����������
     * 
     * @param personSignedDocument
     */
    public void setPersonSignedDocument(String personSignedDocument) {
        this.personSignedDocument = personSignedDocument;
    }

    /** 
     * Get the 'Permission' element value. ���������� (����������)
     * 
     * @return value
     */
    public PermissionType getPermission() {
        return permission;
    }

    /** 
     * Set the 'Permission' element value. ���������� (����������)
     * 
     * @param permission
     */
    public void setPermission(PermissionType permission) {
        this.permission = permission;
    }

    /** 
     * Get the 'Exporter' element value. ���������
     * 
     * @return value
     */
    public CUOrganizationType getExporter() {
        return exporter;
    }

    /** 
     * Set the 'Exporter' element value. ���������
     * 
     * @param exporter
     */
    public void setExporter(CUOrganizationType exporter) {
        this.exporter = exporter;
    }

    /** 
     * Get the 'Importer' element value. ��������
     * 
     * @return value
     */
    public CUOrganizationType getImporter() {
        return importer;
    }

    /** 
     * Set the 'Importer' element value. ��������
     * 
     * @param importer
     */
    public void setImporter(CUOrganizationType importer) {
        this.importer = importer;
    }

    /** 
     * Get the 'GoodsDescription' element value. �������� ������
     * 
     * @return value
     */
    public GoodsDescriptionType getGoodsDescription() {
        return goodsDescription;
    }

    /** 
     * Set the 'GoodsDescription' element value. �������� ������
     * 
     * @param goodsDescription
     */
    public void setGoodsDescription(GoodsDescriptionType goodsDescription) {
        this.goodsDescription = goodsDescription;
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
