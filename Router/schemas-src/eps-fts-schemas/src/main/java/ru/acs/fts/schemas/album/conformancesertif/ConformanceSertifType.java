
package ru.acs.fts.schemas.album.conformancesertif;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;
import ru.acs.fts.schemas.album.sertifcommonaggregatetypescust.SertifOrgBaseType;

/** 
 * ���������� ������������ - ��������, �������������� ������������ ��������� ������������ ����������� �������� � ������������.
 */
public class ConformanceSertifType extends BaseDocType
{
    private String BDRDID;
    private LocalDate beginDate;
    private LocalDate endDate;
    private List<String> addSertifInfList = new ArrayList<String>();
    private String documentSignature;
    private String certificateSign;
    private SertifOrganizationType sertifOrganization;
    private ManufacturerOrgType manufacturerInf;
    private SertifOrgBaseType sertifRecipient;
    private List<GroundDocsType> groundDocList = new ArrayList<GroundDocsType>();
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private List<PersonSignatureType> expertSignatureList = new ArrayList<PersonSignatureType>();
    private CertifNormDocType certifNormDoc;
    private List<ProlongCertificateType> prolongCertificateList = new ArrayList<ProlongCertificateType>();
    private CertifNormDocType federalDocs;
    private List<AppendsType> appendList = new ArrayList<AppendsType>();
    private RegistrationNumberType registrationNumber;
    private FormNumberType formNumber;
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
     * Get the 'BeginDate' element value. ���� ������ �������� ����������� (��������� � ����� ����������� ���������)
     * 
     * @return value
     */
    public LocalDate getBeginDate() {
        return beginDate;
    }

    /** 
     * Set the 'BeginDate' element value. ���� ������ �������� ����������� (��������� � ����� ����������� ���������)
     * 
     * @param beginDate
     */
    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    /** 
     * Get the 'EndDate' element value. ���� ��������� �������� ����������� (������������ ��� ������������ ������)
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. ���� ��������� �������� ����������� (������������ ��� ������������ ������)
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /** 
     * Get the list of 'AddSertifInf' element items. �������������� �������� � ������������ (���������, � ������������ ������������, ����������, ����� ��������� ����� ������������)
     * 
     * @return list
     */
    public List<String> getAddSertifInfList() {
        return addSertifInfList;
    }

    /** 
     * Set the list of 'AddSertifInf' element items. �������������� �������� � ������������ (���������, � ������������ ������������, ����������, ����� ��������� ����� ������������)
     * 
     * @param list
     */
    public void setAddSertifInfList(List<String> list) {
        addSertifInfList = list;
    }

    /** 
     * Get the 'DocumentSignature' element value. ������� ������������
     * 
     * @return value
     */
    public String getDocumentSignature() {
        return documentSignature;
    }

    /** 
     * Set the 'DocumentSignature' element value. ������� ������������
     * 
     * @param documentSignature
     */
    public void setDocumentSignature(String documentSignature) {
        this.documentSignature = documentSignature;
    }

    /** 
     * Get the 'CertificateSign' element value. ���������� ������������: 0 - ����������� �����; 1 - ������������
     * 
     * @return value
     */
    public String getCertificateSign() {
        return certificateSign;
    }

    /** 
     * Set the 'CertificateSign' element value. ���������� ������������: 0 - ����������� �����; 1 - ������������
     * 
     * @param certificateSign
     */
    public void setCertificateSign(String certificateSign) {
        this.certificateSign = certificateSign;
    }

    /** 
     * Get the 'SertifOrganization' element value. �������� �� ������ ������������
     * 
     * @return value
     */
    public SertifOrganizationType getSertifOrganization() {
        return sertifOrganization;
    }

    /** 
     * Set the 'SertifOrganization' element value. �������� �� ������ ������������
     * 
     * @param sertifOrganization
     */
    public void setSertifOrganization(SertifOrganizationType sertifOrganization) {
        this.sertifOrganization = sertifOrganization;
    }

    /** 
     * Get the 'ManufacturerInf' element value. ���������� �� ������������/�������������� ���������������.
     * 
     * @return value
     */
    public ManufacturerOrgType getManufacturerInf() {
        return manufacturerInf;
    }

    /** 
     * Set the 'ManufacturerInf' element value. ���������� �� ������������/�������������� ���������������.
     * 
     * @param manufacturerInf
     */
    public void setManufacturerInf(ManufacturerOrgType manufacturerInf) {
        this.manufacturerInf = manufacturerInf;
    }

    /** 
     * Get the 'SertifRecipient' element value. ���������� � ����, �������� ����� ���������� / ���������
     * 
     * @return value
     */
    public SertifOrgBaseType getSertifRecipient() {
        return sertifRecipient;
    }

    /** 
     * Set the 'SertifRecipient' element value. ���������� � ����, �������� ����� ���������� / ���������
     * 
     * @param sertifRecipient
     */
    public void setSertifRecipient(SertifOrgBaseType sertifRecipient) {
        this.sertifRecipient = sertifRecipient;
    }

    /** 
     * Get the list of 'GroundDocs' element items. ��������  ���������� �� ��������� ������� ����� ����������
     * 
     * @return list
     */
    public List<GroundDocsType> getGroundDocList() {
        return groundDocList;
    }

    /** 
     * Set the list of 'GroundDocs' element items. ��������  ���������� �� ��������� ������� ����� ����������
     * 
     * @param list
     */
    public void setGroundDocList(List<GroundDocsType> list) {
        groundDocList = list;
    }

    /** 
     * Get the list of 'Goods' element items. �������� � ���������
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. �������� � ���������
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }

    /** 
     * Get the list of 'ExpertSignature' element items. ������� ��������
     * 
     * @return list
     */
    public List<PersonSignatureType> getExpertSignatureList() {
        return expertSignatureList;
    }

    /** 
     * Set the list of 'ExpertSignature' element items. ������� ��������
     * 
     * @param list
     */
    public void setExpertSignatureList(List<PersonSignatureType> list) {
        expertSignatureList = list;
    }

    /** 
     * Get the 'CertifNormDoc' element value. ����������� ����������� ����������, �� ������������ ������� ����������� ������������ (�����, ������ ������)
     * 
     * @return value
     */
    public CertifNormDocType getCertifNormDoc() {
        return certifNormDoc;
    }

    /** 
     * Set the 'CertifNormDoc' element value. ����������� ����������� ����������, �� ������������ ������� ����������� ������������ (�����, ������ ������)
     * 
     * @param certifNormDoc
     */
    public void setCertifNormDoc(CertifNormDocType certifNormDoc) {
        this.certifNormDoc = certifNormDoc;
    }

    /** 
     * Get the list of 'ProlongCertificate' element items. �������� � ��������� �����������
     * 
     * @return list
     */
    public List<ProlongCertificateType> getProlongCertificateList() {
        return prolongCertificateList;
    }

    /** 
     * Set the list of 'ProlongCertificate' element items. �������� � ��������� �����������
     * 
     * @param list
     */
    public void setProlongCertificateList(List<ProlongCertificateType> list) {
        prolongCertificateList = list;
    }

    /** 
     * Get the 'FederalDocs' element value. �������� ���������� �����������  �������, ���������������  ���������� ��� ������� ���������
     * 
     * @return value
     */
    public CertifNormDocType getFederalDocs() {
        return federalDocs;
    }

    /** 
     * Set the 'FederalDocs' element value. �������� ���������� �����������  �������, ���������������  ���������� ��� ������� ���������
     * 
     * @param federalDocs
     */
    public void setFederalDocs(CertifNormDocType federalDocs) {
        this.federalDocs = federalDocs;
    }

    /** 
     * Get the list of 'Append' element items. �������� � �����������
     * 
     * @return list
     */
    public List<AppendsType> getAppendList() {
        return appendList;
    }

    /** 
     * Set the list of 'Append' element items. �������� � �����������
     * 
     * @param list
     */
    public void setAppendList(List<AppendsType> list) {
        appendList = list;
    }

    /** 
     * Get the 'RegistrationNumber' element value. ��������������� �����
     * 
     * @return value
     */
    public RegistrationNumberType getRegistrationNumber() {
        return registrationNumber;
    }

    /** 
     * Set the 'RegistrationNumber' element value. ��������������� �����
     * 
     * @param registrationNumber
     */
    public void setRegistrationNumber(RegistrationNumberType registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /** 
     * Get the 'FormNumber' element value. ����� ������ �����������
     * 
     * @return value
     */
    public FormNumberType getFormNumber() {
        return formNumber;
    }

    /** 
     * Set the 'FormNumber' element value. ����� ������ �����������
     * 
     * @param formNumber
     */
    public void setFormNumber(FormNumberType formNumber) {
        this.formNumber = formNumber;
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
