
package ru.acs.fts.schemas.album.inqinotreatment;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;
import ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust.TreatmentOrganizationType;
import ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust.TreatmentType;

/** 
 * ��������� �� ����������� ������� ��� ���������� ����������
 */
public class InqInoTreatmentType extends BaseDocType
{
    private String treatmentCountry;
    private String treatmentProcedureCode;
    private ApplicantType applicant;
    private TreatmentType treatment;
    private List<TreatContractsType> treatContractList = new ArrayList<TreatContractsType>();
    private PersonSignatureType personSignature;
    private DocumentBaseType inqDoc;
    private CustomsType customsInHells;
    private CustomsType customsInWaste;
    private CustomsType customs;
    private List<DocumentIDInfoType> documentIDInfoList = new ArrayList<DocumentIDInfoType>();
    private PersonSignatureType customsSuperior;
    private TreatmentOrganizationType contractHolder;
    private String documentModeID;

    /** 
     * Get the 'TreatmentCountry' element value. �������� ��� ������ �����������
     * 
     * @return value
     */
    public String getTreatmentCountry() {
        return treatmentCountry;
    }

    /** 
     * Set the 'TreatmentCountry' element value. �������� ��� ������ �����������
     * 
     * @param treatmentCountry
     */
    public void setTreatmentCountry(String treatmentCountry) {
        this.treatmentCountry = treatmentCountry;
    }

    /** 
     * Get the 'TreatmentProcedureCode' element value. ��� ������ �����������
     * 
     * @return value
     */
    public String getTreatmentProcedureCode() {
        return treatmentProcedureCode;
    }

    /** 
     * Set the 'TreatmentProcedureCode' element value. ��� ������ �����������
     * 
     * @param treatmentProcedureCode
     */
    public void setTreatmentProcedureCode(String treatmentProcedureCode) {
        this.treatmentProcedureCode = treatmentProcedureCode;
    }

    /** 
     * Get the 'Applicant' element value. �������� � ���������
     * 
     * @return value
     */
    public ApplicantType getApplicant() {
        return applicant;
    }

    /** 
     * Set the 'Applicant' element value. �������� � ���������
     * 
     * @param applicant
     */
    public void setApplicant(ApplicantType applicant) {
        this.applicant = applicant;
    }

    /** 
     * Get the 'Treatment' element value. �������� �����������
     * 
     * @return value
     */
    public TreatmentType getTreatment() {
        return treatment;
    }

    /** 
     * Set the 'Treatment' element value. �������� �����������
     * 
     * @param treatment
     */
    public void setTreatment(TreatmentType treatment) {
        this.treatment = treatment;
    }

    /** 
     * Get the list of 'TreatContracts' element items. �������� ��� ���� ���������, � ������������ � �������� ��������/��������� �� ����������� ������
     * 
     * @return list
     */
    public List<TreatContractsType> getTreatContractList() {
        return treatContractList;
    }

    /** 
     * Set the list of 'TreatContracts' element items. �������� ��� ���� ���������, � ������������ � �������� ��������/��������� �� ����������� ������
     * 
     * @param list
     */
    public void setTreatContractList(List<TreatContractsType> list) {
        treatContractList = list;
    }

    /** 
     * Get the 'PersonSignature' element value. ������� ������������ ����
     * 
     * @return value
     */
    public PersonSignatureType getPersonSignature() {
        return personSignature;
    }

    /** 
     * Set the 'PersonSignature' element value. ������� ������������ ����
     * 
     * @param personSignature
     */
    public void setPersonSignature(PersonSignatureType personSignature) {
        this.personSignature = personSignature;
    }

    /** 
     * Get the 'InqDoc' element value. ����� / ���� ��������� �� �����������
     * 
     * @return value
     */
    public DocumentBaseType getInqDoc() {
        return inqDoc;
    }

    /** 
     * Set the 'InqDoc' element value. ����� / ���� ��������� �� �����������
     * 
     * @param inqDoc
     */
    public void setInqDoc(DocumentBaseType inqDoc) {
        this.inqDoc = inqDoc;
    }

    /** 
     * Get the 'CustomsInHells' element value. ������� ����� ��������
     * 
     * @return value
     */
    public CustomsType getCustomsInHells() {
        return customsInHells;
    }

    /** 
     * Set the 'CustomsInHells' element value. ������� ����� ��������
     * 
     * @param customsInHells
     */
    public void setCustomsInHells(CustomsType customsInHells) {
        this.customsInHells = customsInHells;
    }

    /** 
     * Get the 'CustomsInWaste' element value. ������� ����� �������
     * 
     * @return value
     */
    public CustomsType getCustomsInWaste() {
        return customsInWaste;
    }

    /** 
     * Set the 'CustomsInWaste' element value. ������� ����� �������
     * 
     * @param customsInWaste
     */
    public void setCustomsInWaste(CustomsType customsInWaste) {
        this.customsInWaste = customsInWaste;
    }

    /** 
     * Get the 'Customs' element value. ���������� ����� � ������� �������� ��������� �� �����������
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. ���������� ����� � ������� �������� ��������� �� �����������
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the list of 'DocumentIDInfo' element items. �������� � ����������,  �������������� ���������� �������� �� �����������
     * 
     * @return list
     */
    public List<DocumentIDInfoType> getDocumentIDInfoList() {
        return documentIDInfoList;
    }

    /** 
     * Set the list of 'DocumentIDInfo' element items. �������� � ����������,  �������������� ���������� �������� �� �����������
     * 
     * @param list
     */
    public void setDocumentIDInfoList(List<DocumentIDInfoType> list) {
        documentIDInfoList = list;
    }

    /** 
     * Get the 'CustomsSuperior' element value. ��� ���������� �������, ���� ���������� ���������
     * 
     * @return value
     */
    public PersonSignatureType getCustomsSuperior() {
        return customsSuperior;
    }

    /** 
     * Set the 'CustomsSuperior' element value. ��� ���������� �������, ���� ���������� ���������
     * 
     * @param customsSuperior
     */
    public void setCustomsSuperior(PersonSignatureType customsSuperior) {
        this.customsSuperior = customsSuperior;
    }

    /** 
     * Get the 'ContractHolder' element value. �������������������
     * 
     * @return value
     */
    public TreatmentOrganizationType getContractHolder() {
        return contractHolder;
    }

    /** 
     * Set the 'ContractHolder' element value. �������������������
     * 
     * @param contractHolder
     */
    public void setContractHolder(TreatmentOrganizationType contractHolder) {
        this.contractHolder = contractHolder;
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
