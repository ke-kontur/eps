
package ru.acs.fts.schemas.album.transitrevealedrisks;

import org.joda.time.LocalDate;

/** 
 * ���������� ��/���
 */
public class ProfilesType
{
    private String divisionCode;
    private String documentSignCode;
    private LocalDate registryDate;
    private String sequenceNumber;
    private String versionNumber;
    private LocalDate beginDate;
    private String documentDescription;
    private String PRNote;
    private CriterionCodeInfoType criterionCodeInfo;
    private String activityCode;
    private MinimizeMeasuresType minimizeMeasures;
    private String ID;

    /** 
     * Get the 'DivisionCode' element value. ��� ����������� ������, �������������� ��/���
     * 
     * @return value
     */
    public String getDivisionCode() {
        return divisionCode;
    }

    /** 
     * Set the 'DivisionCode' element value. ��� ����������� ������, �������������� ��/���
     * 
     * @param divisionCode
     */
    public void setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
    }

    /** 
     * Get the 'DocumentSignCode' element value. ��� �������� ���������. ��������� ��������: 11 - �������������� ������� �����, 12 - ������������ ������� �����, 13 - ��������� ������� �����, 55 - ������� �����, ������������ � ����������, 20 - ������� ������� �����.
     * 
     * @return value
     */
    public String getDocumentSignCode() {
        return documentSignCode;
    }

    /** 
     * Set the 'DocumentSignCode' element value. ��� �������� ���������. ��������� ��������: 11 - �������������� ������� �����, 12 - ������������ ������� �����, 13 - ��������� ������� �����, 55 - ������� �����, ������������ � ����������, 20 - ������� ������� �����.
     * 
     * @param documentSignCode
     */
    public void setDocumentSignCode(String documentSignCode) {
        this.documentSignCode = documentSignCode;
    }

    /** 
     * Get the 'RegistryDate' element value. ���� ����������� ��/���
     * 
     * @return value
     */
    public LocalDate getRegistryDate() {
        return registryDate;
    }

    /** 
     * Set the 'RegistryDate' element value. ���� ����������� ��/���
     * 
     * @param registryDate
     */
    public void setRegistryDate(LocalDate registryDate) {
        this.registryDate = registryDate;
    }

    /** 
     * Get the 'SequenceNumber' element value. ���������� ����� ��/���
     * 
     * @return value
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /** 
     * Set the 'SequenceNumber' element value. ���������� ����� ��/���
     * 
     * @param sequenceNumber
     */
    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    /** 
     * Get the 'VersionNumber' element value. ���������� ����� ������ ��/���
     * 
     * @return value
     */
    public String getVersionNumber() {
        return versionNumber;
    }

    /** 
     * Set the 'VersionNumber' element value. ���������� ����� ������ ��/���
     * 
     * @param versionNumber
     */
    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    /** 
     * Get the 'BeginDate' element value. ���� ������ �������� ������ ��/���
     * 
     * @return value
     */
    public LocalDate getBeginDate() {
        return beginDate;
    }

    /** 
     * Set the 'BeginDate' element value. ���� ������ �������� ������ ��/���
     * 
     * @param beginDate
     */
    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    /** 
     * Get the 'DocumentDescription' element value. �������� ����� (����������� ������ ��� �������������� ������������)
     * 
     * @return value
     */
    public String getDocumentDescription() {
        return documentDescription;
    }

    /** 
     * Set the 'DocumentDescription' element value. �������� ����� (����������� ������ ��� �������������� ������������)
     * 
     * @param documentDescription
     */
    public void setDocumentDescription(String documentDescription) {
        this.documentDescription = documentDescription;
    }

    /** 
     * Get the 'PRNote' element value. ���������� � ��/���
     * 
     * @return value
     */
    public String getPRNote() {
        return PRNote;
    }

    /** 
     * Set the 'PRNote' element value. ���������� � ��/���
     * 
     * @param PRNote
     */
    public void setPRNote(String PRNote) {
        this.PRNote = PRNote;
    }

    /** 
     * Get the 'CriterionCodeInfo' element value. ���������� � ������� ��������
     * 
     * @return value
     */
    public CriterionCodeInfoType getCriterionCodeInfo() {
        return criterionCodeInfo;
    }

    /** 
     * Set the 'CriterionCodeInfo' element value. ���������� � ������� ��������
     * 
     * @param criterionCodeInfo
     */
    public void setCriterionCodeInfo(CriterionCodeInfoType criterionCodeInfo) {
        this.criterionCodeInfo = criterionCodeInfo;
    }

    /** 
     * Get the 'ActivityCode' element value. ��� ����������� ������������ �������������, �� ����������� �������� ������� ����
     * 
     * @return value
     */
    public String getActivityCode() {
        return activityCode;
    }

    /** 
     * Set the 'ActivityCode' element value. ��� ����������� ������������ �������������, �� ����������� �������� ������� ����
     * 
     * @param activityCode
     */
    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    /** 
     * Get the 'MinimizeMeasures' element value. ���� �� ����������� �����
     * 
     * @return value
     */
    public MinimizeMeasuresType getMinimizeMeasures() {
        return minimizeMeasures;
    }

    /** 
     * Set the 'MinimizeMeasures' element value. ���� �� ����������� �����
     * 
     * @param minimizeMeasures
     */
    public void setMinimizeMeasures(MinimizeMeasuresType minimizeMeasures) {
        this.minimizeMeasures = minimizeMeasures;
    }

    /** 
     * Get the 'ID' attribute value. ���������� �������������, ������� ������������� ������� ����� � ��� "��"
     * 
     * @return value
     */
    public String getID() {
        return ID;
    }

    /** 
     * Set the 'ID' attribute value. ���������� �������������, ������� ������������� ������� ����� � ��� "��"
     * 
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }
}
