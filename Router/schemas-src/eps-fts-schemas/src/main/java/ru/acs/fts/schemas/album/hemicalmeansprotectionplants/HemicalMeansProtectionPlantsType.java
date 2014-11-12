
package ru.acs.fts.schemas.album.hemicalmeansprotectionplants;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������� �� ���������� � ���������������� ����� �������� �������������������� ���������� ������� ������ �������� ��� ���������� ��������������� � ���������������� ���������, � ����� ������������� ���������� �������������������� ���������� ������� ������ �������� ��� ���������� ������ ����������� ������������ �������� ���������
 */
public class HemicalMeansProtectionPlantsType extends BaseDocType
{
    private String BDRDID;
    private ConclusionType conclusion;
    private CUOrganizationType applicant;
    private DocumentBaseType foreignTradeContract;
    private GoodsDescriptionType goodsDescription;
    private PersonConclusionType personConclusion;
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
     * Get the 'Conclusion' element value. ����������
     * 
     * @return value
     */
    public ConclusionType getConclusion() {
        return conclusion;
    }

    /** 
     * Set the 'Conclusion' element value. ����������
     * 
     * @param conclusion
     */
    public void setConclusion(ConclusionType conclusion) {
        this.conclusion = conclusion;
    }

    /** 
     * Get the 'Applicant' element value. ���������
     * 
     * @return value
     */
    public CUOrganizationType getApplicant() {
        return applicant;
    }

    /** 
     * Set the 'Applicant' element value. ���������
     * 
     * @param applicant
     */
    public void setApplicant(CUOrganizationType applicant) {
        this.applicant = applicant;
    }

    /** 
     * Get the 'ForeignTradeContract' element value. ��������� ��������������� ���������
     * 
     * @return value
     */
    public DocumentBaseType getForeignTradeContract() {
        return foreignTradeContract;
    }

    /** 
     * Set the 'ForeignTradeContract' element value. ��������� ��������������� ���������
     * 
     * @param foreignTradeContract
     */
    public void setForeignTradeContract(DocumentBaseType foreignTradeContract) {
        this.foreignTradeContract = foreignTradeContract;
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
     * Get the 'PersonConclusion' element value. �������������� ����������� ����, ����������� ����������
     * 
     * @return value
     */
    public PersonConclusionType getPersonConclusion() {
        return personConclusion;
    }

    /** 
     * Set the 'PersonConclusion' element value. �������������� ����������� ����, ����������� ����������
     * 
     * @param personConclusion
     */
    public void setPersonConclusion(PersonConclusionType personConclusion) {
        this.personConclusion = personConclusion;
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
