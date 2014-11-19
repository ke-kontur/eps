
package ru.acs.fts.schemas.album.permitcustprocessing;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust.BaseTreatmentDocsType;
import ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust.TreatmentOrganizationType;
import ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust.TreatmentType;

/** 
 * ���������� �� ����������� ������� �� ���������� ����������
 */
public class PermitCustProcessingType extends BaseDocType
{
    private String permitNumber;
    private LocalDate sendDate;
    private List<String> commentList = new ArrayList<String>();
    private String basicPermitNumber;
    private String treatmentProcedureCode;
    private LocalDate permitPeriodDate;
    private String supplyStatus;
    private List<String> custProcedureWasteList = new ArrayList<String>();
    private CustomsType customs;
    private CustomsPersonType customsPerson;
    private PermitPropertiesType permitProperties;
    private TreatmentOrganizationType declarant;
    private TreatmentType treatment;
    private CustomsType goodsInCustoms;
    private CustomsType goodsOutCustoms;
    private List<BaseTreatmentDocsType> contractList = new ArrayList<BaseTreatmentDocsType>();
    private DecisionTransferType decisionTransfer;
    private String documentModeID;

    /** 
     * Get the 'PermitNumber' element value. ����� ���������� �� ����������� �� ���������� ����������
     * 
     * @return value
     */
    public String getPermitNumber() {
        return permitNumber;
    }

    /** 
     * Set the 'PermitNumber' element value. ����� ���������� �� ����������� �� ���������� ����������
     * 
     * @param permitNumber
     */
    public void setPermitNumber(String permitNumber) {
        this.permitNumber = permitNumber;
    }

    /** 
     * Get the 'SendDate' element value. ���� �����������
     * 
     * @return value
     */
    public LocalDate getSendDate() {
        return sendDate;
    }

    /** 
     * Set the 'SendDate' element value. ���� �����������
     * 
     * @param sendDate
     */
    public void setSendDate(LocalDate sendDate) {
        this.sendDate = sendDate;
    }

    /** 
     * Get the list of 'Comments' element items. ������ ������� �������
     * 
     * @return list
     */
    public List<String> getCommentList() {
        return commentList;
    }

    /** 
     * Set the list of 'Comments' element items. ������ ������� �������
     * 
     * @param list
     */
    public void setCommentList(List<String> list) {
        commentList = list;
    }

    /** 
     * Get the 'BasicPermitNumber' element value. ����� ��������� ���������� �� ����������� �� ���������� ���������� (� ������ ������ ���������� � ����������)
     * 
     * @return value
     */
    public String getBasicPermitNumber() {
        return basicPermitNumber;
    }

    /** 
     * Set the 'BasicPermitNumber' element value. ����� ��������� ���������� �� ����������� �� ���������� ���������� (� ������ ������ ���������� � ����������)
     * 
     * @param basicPermitNumber
     */
    public void setBasicPermitNumber(String basicPermitNumber) {
        this.basicPermitNumber = basicPermitNumber;
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
     * Get the 'PermitPeriodDate' element value. ���� �������� ����������
     * 
     * @return value
     */
    public LocalDate getPermitPeriodDate() {
        return permitPeriodDate;
    }

    /** 
     * Set the 'PermitPeriodDate' element value. ���� �������� ����������
     * 
     * @param permitPeriodDate
     */
    public void setPermitPeriodDate(LocalDate permitPeriodDate) {
        this.permitPeriodDate = permitPeriodDate;
    }

    /** 
     * Get the 'SupplyStatus' element value. ����������� �������� ��������� �����������.
     * 
     * @return value
     */
    public String getSupplyStatus() {
        return supplyStatus;
    }

    /** 
     * Set the 'SupplyStatus' element value. ����������� �������� ��������� �����������.
     * 
     * @param supplyStatus
     */
    public void setSupplyStatus(String supplyStatus) {
        this.supplyStatus = supplyStatus;
    }

    /** 
     * Get the list of 'CustProcedureWaste' element items. ������ �������� ��������� ��� ���������� ���������
     * 
     * @return list
     */
    public List<String> getCustProcedureWasteList() {
        return custProcedureWasteList;
    }

    /** 
     * Set the list of 'CustProcedureWaste' element items. ������ �������� ��������� ��� ���������� ���������
     * 
     * @param list
     */
    public void setCustProcedureWasteList(List<String> list) {
        custProcedureWasteList = list;
    }

    /** 
     * Get the 'Customs' element value. ���������� �����
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. ���������� �����
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'CustomsPerson' element value. ����������� ���� ����������� ������
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. ����������� ���� ����������� ������
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'PermitProperties' element value. ��������� ���������� ������� �� �������� ���������� �� ����������� ����� ����
     * 
     * @return value
     */
    public PermitPropertiesType getPermitProperties() {
        return permitProperties;
    }

    /** 
     * Set the 'PermitProperties' element value. ��������� ���������� ������� �� �������� ���������� �� ����������� ����� ����
     * 
     * @param permitProperties
     */
    public void setPermitProperties(PermitPropertiesType permitProperties) {
        this.permitProperties = permitProperties;
    }

    /** 
     * Get the 'Declarant' element value. �����������, ���������� ���������� �� �����������
     * 
     * @return value
     */
    public TreatmentOrganizationType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. �����������, ���������� ���������� �� �����������
     * 
     * @param declarant
     */
    public void setDeclarant(TreatmentOrganizationType declarant) {
        this.declarant = declarant;
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
     * Get the list of 'Contract' element items. �������� ��� ���� �������� �� �����������
     * 
     * @return list
     */
    public List<BaseTreatmentDocsType> getContractList() {
        return contractList;
    }

    /** 
     * Set the list of 'Contract' element items. �������� ��� ���� �������� �� �����������
     * 
     * @param list
     */
    public void setContractList(List<BaseTreatmentDocsType> list) {
        contractList = list;
    }

    /** 
     * Get the 'DecisionTransfer' element value. ������� � ��������  ���������� �� ����������� �������.
     * 
     * @return value
     */
    public DecisionTransferType getDecisionTransfer() {
        return decisionTransfer;
    }

    /** 
     * Set the 'DecisionTransfer' element value. ������� � ��������  ���������� �� ����������� �������.
     * 
     * @param decisionTransfer
     */
    public void setDecisionTransfer(DecisionTransferType decisionTransfer) {
        this.decisionTransfer = decisionTransfer;
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
