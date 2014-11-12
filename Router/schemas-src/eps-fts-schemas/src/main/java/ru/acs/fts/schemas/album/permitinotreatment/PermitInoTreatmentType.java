
package ru.acs.fts.schemas.album.permitinotreatment;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;
import ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust.BaseTreatmentDocsType;
import ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust.TreatmentType;

/** 
 * ���������� �� ����������� ������� ��� ���������� ����������
 */
public class PermitInoTreatmentType extends BaseDocType
{
    private String permitNumber;
    private LocalDate sendDate;
    private List<String> commentList = new ArrayList<String>();
    private String basicPermitNumber;
    private String treatmentProcedureCode;
    private LocalDate permitPeriodDate;
    private String treatmentCountry;
    private String regionalCustoms;
    private PermitHolderType permitHolder;
    private TreatmentType treatment;
    private List<BaseTreatmentDocsType> baseTreatmentDocList = new ArrayList<BaseTreatmentDocsType>();
    private CustomsType customs;
    private CustomsPersonType customsPerson;
    private CustomsType customsInWaste;
    private CustomsType customsInHells;
    private List<DocumentBaseType> documentIDInfoList = new ArrayList<DocumentBaseType>();
    private PersonSignatureType signature;
    private String documentModeID;

    /** 
     * Get the 'PermitNumber' element value. ����� ���������� �� ����������� ��� ���������� ����������
     * 
     * @return value
     */
    public String getPermitNumber() {
        return permitNumber;
    }

    /** 
     * Set the 'PermitNumber' element value. ����� ���������� �� ����������� ��� ���������� ����������
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
     * Get the 'BasicPermitNumber' element value. ����� ��������� ���������� �� ����������� ��� ���������� ���������� (� ������ ������ ���������� � ����������)
     * 
     * @return value
     */
    public String getBasicPermitNumber() {
        return basicPermitNumber;
    }

    /** 
     * Set the 'BasicPermitNumber' element value. ����� ��������� ���������� �� ����������� ��� ���������� ���������� (� ������ ������ ���������� � ����������)
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
     * Get the 'RegionalCustoms' element value. ������������ ������������� ����������� ����������
     * 
     * @return value
     */
    public String getRegionalCustoms() {
        return regionalCustoms;
    }

    /** 
     * Set the 'RegionalCustoms' element value. ������������ ������������� ����������� ����������
     * 
     * @param regionalCustoms
     */
    public void setRegionalCustoms(String regionalCustoms) {
        this.regionalCustoms = regionalCustoms;
    }

    /** 
     * Get the 'PermitHolder' element value. ����, �������� ������ ����������
     * 
     * @return value
     */
    public PermitHolderType getPermitHolder() {
        return permitHolder;
    }

    /** 
     * Set the 'PermitHolder' element value. ����, �������� ������ ����������
     * 
     * @param permitHolder
     */
    public void setPermitHolder(PermitHolderType permitHolder) {
        this.permitHolder = permitHolder;
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
     * Get the list of 'BaseTreatmentDocs' element items. �������� ��� ���� ���������, � ������������ � �������� ��������� �� ����������� ������
     * 
     * @return list
     */
    public List<BaseTreatmentDocsType> getBaseTreatmentDocList() {
        return baseTreatmentDocList;
    }

    /** 
     * Set the list of 'BaseTreatmentDocs' element items. �������� ��� ���� ���������, � ������������ � �������� ��������� �� ����������� ������
     * 
     * @param list
     */
    public void setBaseTreatmentDocList(List<BaseTreatmentDocsType> list) {
        baseTreatmentDocList = list;
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
     * Get the list of 'DocumentIDInfo' element items. �������� � ����������,  �������������� ���������� �������� �� �����������
     * 
     * @return list
     */
    public List<DocumentBaseType> getDocumentIDInfoList() {
        return documentIDInfoList;
    }

    /** 
     * Set the list of 'DocumentIDInfo' element items. �������� � ����������,  �������������� ���������� �������� �� �����������
     * 
     * @param list
     */
    public void setDocumentIDInfoList(List<DocumentBaseType> list) {
        documentIDInfoList = list;
    }

    /** 
     * Get the 'Signature' element value. ��� ���������� �������, ���� ���������� ��������� 
     * 
     * @return value
     */
    public PersonSignatureType getSignature() {
        return signature;
    }

    /** 
     * Set the 'Signature' element value. ��� ���������� �������, ���� ���������� ��������� 
     * 
     * @param signature
     */
    public void setSignature(PersonSignatureType signature) {
        this.signature = signature;
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
