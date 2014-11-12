
package ru.acs.fts.schemas.album.reqoperations;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ����������/��������� � ���������� �������� � ��������� ������� �  ������������ �������
 */
public class ReqOperationsType extends BaseDocType
{
    private LocalDate reqDate;
    private String docSign;
    private CUCustomsType customs;
    private DeclarantType declarant;
    private OperationsType transportation;
    private OperationsType weighing;
    private OperationsType differentDefinitionQuantity;
    private OperationsType loading;
    private OperationsType unloading;
    private OperationsType overload;
    private OperationsType correctionPackaging;
    private OperationsType unpacking;
    private OperationsType packing;
    private OperationsType repackaging;
    private OperationsType openingLocationGoods;
    private OperationsType divisionConsignment;
    private CustomsPersonType customsPerson;
    private PersonSignatureType personSignature;
    private DirectionRequirementType directionRequirement;
    private String documentModeID;

    /** 
     * Get the 'ReqDate' element value. ���� ����������
     * 
     * @return value
     */
    public LocalDate getReqDate() {
        return reqDate;
    }

    /** 
     * Set the 'ReqDate' element value. ���� ����������
     * 
     * @param reqDate
     */
    public void setReqDate(LocalDate reqDate) {
        this.reqDate = reqDate;
    }

    /** 
     * Get the 'DocSign' element value. ������� ���������: 0 - ����������; 1 - ���������
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. ������� ���������: 0 - ����������; 1 - ���������
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'Customs' element value. �������� � ���������� ������
     * 
     * @return value
     */
    public CUCustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. �������� � ���������� ������
     * 
     * @param customs
     */
    public void setCustoms(CUCustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'Declarant' element value. �������� � ����������, ���� ����, ���������� ������������ � ��������� ������� � (���) ������������ �������, � �� ��������������.
     * 
     * @return value
     */
    public DeclarantType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. �������� � ����������, ���� ����, ���������� ������������ � ��������� ������� � (���) ������������ �������, � �� ��������������.
     * 
     * @param declarant
     */
    public void setDeclarant(DeclarantType declarant) {
        this.declarant = declarant;
    }

    /** 
     * Get the 'Transportation' element value. ���������������
     * 
     * @return value
     */
    public OperationsType getTransportation() {
        return transportation;
    }

    /** 
     * Set the 'Transportation' element value. ���������������
     * 
     * @param transportation
     */
    public void setTransportation(OperationsType transportation) {
        this.transportation = transportation;
    }

    /** 
     * Get the 'Weighing' element value. �����������
     * 
     * @return value
     */
    public OperationsType getWeighing() {
        return weighing;
    }

    /** 
     * Set the 'Weighing' element value. �����������
     * 
     * @param weighing
     */
    public void setWeighing(OperationsType weighing) {
        this.weighing = weighing;
    }

    /** 
     * Get the 'DifferentDefinitionQuantity' element value. ���� ����������� ���������� �������
     * 
     * @return value
     */
    public OperationsType getDifferentDefinitionQuantity() {
        return differentDefinitionQuantity;
    }

    /** 
     * Set the 'DifferentDefinitionQuantity' element value. ���� ����������� ���������� �������
     * 
     * @param differentDefinitionQuantity
     */
    public void setDifferentDefinitionQuantity(
            OperationsType differentDefinitionQuantity) {
        this.differentDefinitionQuantity = differentDefinitionQuantity;
    }

    /** 
     * Get the 'Loading' element value. ��������
     * 
     * @return value
     */
    public OperationsType getLoading() {
        return loading;
    }

    /** 
     * Set the 'Loading' element value. ��������
     * 
     * @param loading
     */
    public void setLoading(OperationsType loading) {
        this.loading = loading;
    }

    /** 
     * Get the 'Unloading' element value. ��������
     * 
     * @return value
     */
    public OperationsType getUnloading() {
        return unloading;
    }

    /** 
     * Set the 'Unloading' element value. ��������
     * 
     * @param unloading
     */
    public void setUnloading(OperationsType unloading) {
        this.unloading = unloading;
    }

    /** 
     * Get the 'Overload' element value. ����������
     * 
     * @return value
     */
    public OperationsType getOverload() {
        return overload;
    }

    /** 
     * Set the 'Overload' element value. ����������
     * 
     * @param overload
     */
    public void setOverload(OperationsType overload) {
        this.overload = overload;
    }

    /** 
     * Get the 'CorrectionPackaging' element value. ����������� ������������ ��������
     * 
     * @return value
     */
    public OperationsType getCorrectionPackaging() {
        return correctionPackaging;
    }

    /** 
     * Set the 'CorrectionPackaging' element value. ����������� ������������ ��������
     * 
     * @param correctionPackaging
     */
    public void setCorrectionPackaging(OperationsType correctionPackaging) {
        this.correctionPackaging = correctionPackaging;
    }

    /** 
     * Get the 'Unpacking' element value. �������� ��������
     * 
     * @return value
     */
    public OperationsType getUnpacking() {
        return unpacking;
    }

    /** 
     * Set the 'Unpacking' element value. �������� ��������
     * 
     * @param unpacking
     */
    public void setUnpacking(OperationsType unpacking) {
        this.unpacking = unpacking;
    }

    /** 
     * Get the 'Packing' element value. ��������
     * 
     * @return value
     */
    public OperationsType getPacking() {
        return packing;
    }

    /** 
     * Set the 'Packing' element value. ��������
     * 
     * @param packing
     */
    public void setPacking(OperationsType packing) {
        this.packing = packing;
    }

    /** 
     * Get the 'Repackaging' element value. ������������
     * 
     * @return value
     */
    public OperationsType getRepackaging() {
        return repackaging;
    }

    /** 
     * Set the 'Repackaging' element value. ������������
     * 
     * @param repackaging
     */
    public void setRepackaging(OperationsType repackaging) {
        this.repackaging = repackaging;
    }

    /** 
     * Get the 'OpeningLocationGoods' element value. �������� ���������, �������� � ������ ����,  ��� ��������� ��� ����� ���������� ������
     * 
     * @return value
     */
    public OperationsType getOpeningLocationGoods() {
        return openingLocationGoods;
    }

    /** 
     * Set the 'OpeningLocationGoods' element value. �������� ���������, �������� � ������ ����,  ��� ��������� ��� ����� ���������� ������
     * 
     * @param openingLocationGoods
     */
    public void setOpeningLocationGoods(OperationsType openingLocationGoods) {
        this.openingLocationGoods = openingLocationGoods;
    }

    /** 
     * Get the 'DivisionConsignment' element value. ���������� �������� ������ �� ��������� ����� � (���) ������������� �������
     * 
     * @return value
     */
    public OperationsType getDivisionConsignment() {
        return divisionConsignment;
    }

    /** 
     * Set the 'DivisionConsignment' element value. ���������� �������� ������ �� ��������� ����� � (���) ������������� �������
     * 
     * @param divisionConsignment
     */
    public void setDivisionConsignment(OperationsType divisionConsignment) {
        this.divisionConsignment = divisionConsignment;
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
     * Get the 'PersonSignature' element value. ������� ����, ����������� ����������
     * 
     * @return value
     */
    public PersonSignatureType getPersonSignature() {
        return personSignature;
    }

    /** 
     * Set the 'PersonSignature' element value. ������� ����, ����������� ����������
     * 
     * @param personSignature
     */
    public void setPersonSignature(PersonSignatureType personSignature) {
        this.personSignature = personSignature;
    }

    /** 
     * Get the 'DirectionRequirement' element value. ��� ����������� ���������� �� ����� ��� ���� ��������
     * 
     * @return value
     */
    public DirectionRequirementType getDirectionRequirement() {
        return directionRequirement;
    }

    /** 
     * Set the 'DirectionRequirement' element value. ��� ����������� ���������� �� ����� ��� ���� ��������
     * 
     * @param directionRequirement
     */
    public void setDirectionRequirement(
            DirectionRequirementType directionRequirement) {
        this.directionRequirement = directionRequirement;
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
