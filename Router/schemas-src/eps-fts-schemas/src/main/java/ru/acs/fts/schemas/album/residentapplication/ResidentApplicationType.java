
package ru.acs.fts.schemas.album.residentapplication;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ��������� ��������� ������ ������������� ����
 */
public class ResidentApplicationType extends BaseDocType
{
    private String applicationType;
    private String customsTreatmentYear;
    private String notes;
    private RegistryNumberType registryNumber;
    private CustomsType customs;
    private CustomsPersonType customsPersonSignature;
    private ResidentType resident;
    private PersonSignatureType residentPersonSignature;
    private ActivitiesAgreementType activitiesAgreement;
    private FormOneType formOne;
    private FormTwoType formTwo;
    private String documentModeID;

    /** 
     * Get the 'ApplicationType' element value. ��� ���������: 0 - ��������; 1 - ��������� � (���) ���������� � ���������
     * 
     * @return value
     */
    public String getApplicationType() {
        return applicationType;
    }

    /** 
     * Set the 'ApplicationType' element value. ��� ���������: 0 - ��������; 1 - ��������� � (���) ���������� � ���������
     * 
     * @param applicationType
     */
    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    /** 
     * Get the 'CustomsTreatmentYear' element value. ��� ����������� ������ ��������� ���������� ����
     * 
     * @return value
     */
    public String getCustomsTreatmentYear() {
        return customsTreatmentYear;
    }

    /** 
     * Set the 'CustomsTreatmentYear' element value. ��� ����������� ������ ��������� ���������� ����
     * 
     * @param customsTreatmentYear
     */
    public void setCustomsTreatmentYear(String customsTreatmentYear) {
        this.customsTreatmentYear = customsTreatmentYear;
    }

    /** 
     * Get the 'Notes' element value. ��������� ������� 
     * 
     * @return value
     */
    public String getNotes() {
        return notes;
    }

    /** 
     * Set the 'Notes' element value. ��������� ������� 
     * 
     * @param notes
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /** 
     * Get the 'RegistryNumber' element value. ��������������� ����� ��������� ���� ��������/������/�������/��
     * 
     * @return value
     */
    public RegistryNumberType getRegistryNumber() {
        return registryNumber;
    }

    /** 
     * Set the 'RegistryNumber' element value. ��������������� ����� ��������� ���� ��������/������/�������/��
     * 
     * @param registryNumber
     */
    public void setRegistryNumber(RegistryNumberType registryNumber) {
        this.registryNumber = registryNumber;
    }

    /** 
     * Get the 'Customs' element value. ��� � ������������ ����������� ������
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. ��� � ������������ ����������� ������
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'CustomsPersonSignature' element value. ��� � ������ �������� ������ ����������� ���������� 
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPersonSignature() {
        return customsPersonSignature;
    }

    /** 
     * Set the 'CustomsPersonSignature' element value. ��� � ������ �������� ������ ����������� ���������� 
     * 
     * @param customsPersonSignature
     */
    public void setCustomsPersonSignature(
            CustomsPersonType customsPersonSignature) {
        this.customsPersonSignature = customsPersonSignature;
    }

    /** 
     * Get the 'Resident' element value. �������� � ��������� ��� 
     * 
     * @return value
     */
    public ResidentType getResident() {
        return resident;
    }

    /** 
     * Set the 'Resident' element value. �������� � ��������� ��� 
     * 
     * @param resident
     */
    public void setResident(ResidentType resident) {
        this.resident = resident;
    }

    /** 
     * Get the 'ResidentPersonSignature' element value. ��� � ������� ��������������� ���� ����������� - ��������� ��� 
     * 
     * @return value
     */
    public PersonSignatureType getResidentPersonSignature() {
        return residentPersonSignature;
    }

    /** 
     * Set the 'ResidentPersonSignature' element value. ��� � ������� ��������������� ���� ����������� - ��������� ��� 
     * 
     * @param residentPersonSignature
     */
    public void setResidentPersonSignature(
            PersonSignatureType residentPersonSignature) {
        this.residentPersonSignature = residentPersonSignature;
    }

    /** 
     * Get the 'ActivitiesAgreement' element value. ���������� � ������� ������������ 
     * 
     * @return value
     */
    public ActivitiesAgreementType getActivitiesAgreement() {
        return activitiesAgreement;
    }

    /** 
     * Set the 'ActivitiesAgreement' element value. ���������� � ������� ������������ 
     * 
     * @param activitiesAgreement
     */
    public void setActivitiesAgreement(
            ActivitiesAgreementType activitiesAgreement) {
        this.activitiesAgreement = activitiesAgreement;
    }

    /** 
     * Get the 'FormOne' element value. ����� �1. �������� � �������, �������������� � ����� �� ���������� ��� � ������������ � ���������� ������� ��������� ���������� ����, ��� ���������� � ��������� ��� ��������, �� ��������� � ������������ ������� � ������������� ��������� �� �����������. 
     * 
     * @return value
     */
    public FormOneType getFormOne() {
        return formOne;
    }

    /** 
     * Set the 'FormOne' element value. ����� �1. �������� � �������, �������������� � ����� �� ���������� ��� � ������������ � ���������� ������� ��������� ���������� ����, ��� ���������� � ��������� ��� ��������, �� ��������� � ������������ ������� � ������������� ��������� �� �����������. 
     * 
     * @param formOne
     */
    public void setFormOne(FormOneType formOne) {
        this.formOne = formOne;
    }

    /** 
     * Get the 'FormTwo' element value. ����� �2. �������� � �������, �������������� � ����� �� ���������� ��� � ������������ � ���������� ������� ��������� ���������� ���� � ����� ����������� �������, � ��������� ����������� � ������� 
     * 
     * @return value
     */
    public FormTwoType getFormTwo() {
        return formTwo;
    }

    /** 
     * Set the 'FormTwo' element value. ����� �2. �������� � �������, �������������� � ����� �� ���������� ��� � ������������ � ���������� ������� ��������� ���������� ���� � ����� ����������� �������, � ��������� ����������� � ������� 
     * 
     * @param formTwo
     */
    public void setFormTwo(FormTwoType formTwo) {
        this.formTwo = formTwo;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������.
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������.
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
