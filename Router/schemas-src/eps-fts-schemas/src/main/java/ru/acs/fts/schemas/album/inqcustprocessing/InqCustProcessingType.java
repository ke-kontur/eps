
package ru.acs.fts.schemas.album.inqcustprocessing;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;
import ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust.BaseTreatmentDocsType;
import ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust.TreatmentOrganizationType;
import ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust.TreatmentType;

/** 
 * ��������� �� ����������� ������� �� ���������� ����������
 */
public class InqCustProcessingType extends BaseDocType
{
    private String treatmentProcedureCode;
    private TreatmentOrganizationType declarant;
    private TreatmentOrganizationType contractHolder;
    private CustomsType customs;
    private List<BaseTreatmentDocsType> contractList = new ArrayList<BaseTreatmentDocsType>();
    private CustomsType goodsInCustoms;
    private CustomsType goodsOutCustoms;
    private TreatmentType treatment;
    private PersonSignatureType personSignature;
    private DocumentBaseType inqDoc;
    private String documentModeID;

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
     * Get the 'Declarant' element value. ���������
     * 
     * @return value
     */
    public TreatmentOrganizationType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. ���������
     * 
     * @param declarant
     */
    public void setDeclarant(TreatmentOrganizationType declarant) {
        this.declarant = declarant;
    }

    /** 
     * Get the 'ContractHolder' element value. ������������������
     * 
     * @return value
     */
    public TreatmentOrganizationType getContractHolder() {
        return contractHolder;
    }

    /** 
     * Set the 'ContractHolder' element value. ������������������
     * 
     * @param contractHolder
     */
    public void setContractHolder(TreatmentOrganizationType contractHolder) {
        this.contractHolder = contractHolder;
    }

    /** 
     * Get the 'Customs' element value. ��� � ������������ ����������� ������ � ������� �������� ���������
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. ��� � ������������ ����������� ������ � ������� �������� ���������
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the list of 'Contract' element items. ����� ���� ��������� �� �����������
     * 
     * @return list
     */
    public List<BaseTreatmentDocsType> getContractList() {
        return contractList;
    }

    /** 
     * Set the list of 'Contract' element items. ����� ���� ��������� �� �����������
     * 
     * @param list
     */
    public void setContractList(List<BaseTreatmentDocsType> list) {
        contractList = list;
    }

    /** 
     * Get the 'GoodsInCustoms' element value. ������� ����� ������� ��� �����������
     * 
     * @return value
     */
    public CustomsType getGoodsInCustoms() {
        return goodsInCustoms;
    }

    /** 
     * Set the 'GoodsInCustoms' element value. ������� ����� ������� ��� �����������
     * 
     * @param goodsInCustoms
     */
    public void setGoodsInCustoms(CustomsType goodsInCustoms) {
        this.goodsInCustoms = goodsInCustoms;
    }

    /** 
     * Get the 'GoodsOutCustoms' element value. ������� ������  ������� ���������
     * 
     * @return value
     */
    public CustomsType getGoodsOutCustoms() {
        return goodsOutCustoms;
    }

    /** 
     * Set the 'GoodsOutCustoms' element value. ������� ������  ������� ���������
     * 
     * @param goodsOutCustoms
     */
    public void setGoodsOutCustoms(CustomsType goodsOutCustoms) {
        this.goodsOutCustoms = goodsOutCustoms;
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
     * Get the 'PersonSignature' element value. ������� ������������ ���� �� ���������. (���, ���������, ����)
     * 
     * @return value
     */
    public PersonSignatureType getPersonSignature() {
        return personSignature;
    }

    /** 
     * Set the 'PersonSignature' element value. ������� ������������ ���� �� ���������. (���, ���������, ����)
     * 
     * @param personSignature
     */
    public void setPersonSignature(PersonSignatureType personSignature) {
        this.personSignature = personSignature;
    }

    /** 
     * Get the 'InqDoc' element value. �����/���� ��������� �� �����������
     * 
     * @return value
     */
    public DocumentBaseType getInqDoc() {
        return inqDoc;
    }

    /** 
     * Set the 'InqDoc' element value. �����/���� ��������� �� �����������
     * 
     * @param inqDoc
     */
    public void setInqDoc(DocumentBaseType inqDoc) {
        this.inqDoc = inqDoc;
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
