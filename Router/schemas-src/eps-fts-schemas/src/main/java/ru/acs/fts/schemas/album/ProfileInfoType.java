
package ru.acs.fts.schemas.album;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * ���, ����������� ��/���
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:CustomsDocuments:DTRevealedRisks:5.4.4" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ProfileInfoType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="DocumentSignCode"/>
 *     &lt;xs:element type="xs:string" name="DivisionCode"/>
 *     &lt;xs:element type="xs:date" name="RegistryDate"/>
 *     &lt;xs:element type="xs:string" name="SequenceNumber"/>
 *     &lt;xs:element type="xs:string" name="VersionNumber"/>
 *     &lt;xs:element type="xs:string" name="CriterionCode"/>
 *     &lt;xs:element type="xs:string" name="ActivityCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="FormalizedType"/>
 *     &lt;xs:element type="xs:date" name="BeginDate"/>
 *     &lt;xs:element type="xs:string" name="PRNote" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="MinimizeMeasuresNote" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="DescriptionMeasure" minOccurs="0"/>
 *     &lt;xs:element type="ns:MinimizeInfoType" name="MinimizeMeasuresInfo" minOccurs="0" maxOccurs="unbounded"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="xs:anySimpleType" name="ID"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ProfileInfoType
{
    private String documentSignCode;
    private String divisionCode;
    private LocalDate registryDate;
    private String sequenceNumber;
    private String versionNumber;
    private String criterionCode;
    private String activityCode;
    private String formalizedType;
    private LocalDate beginDate;
    private String PRNote;
    private String minimizeMeasuresNote;
    private String descriptionMeasure;
    private List<MinimizeInfoType> minimizeMeasuresInfoList = new ArrayList<MinimizeInfoType>();
    private String ID;

    /** 
     * Get the 'DocumentSignCode' element value. ��� �������� ���������. ��������� ��������:
    11 � �������������� ������� �����, 
    12 � ������������ ������� �����, 
    13 � ��������� ������� �����,
    20 � ������� ������� �����,
    32 � ������� ����� �� ������ �������,
    55 � ������� �����, ������������ � ����������,
    77 � ������� ����� ��� ����������� ������� ������������,
    88 � ��������� ������� �����.
     * 
     * @return value
     */
    public String getDocumentSignCode() {
        return documentSignCode;
    }

    /** 
     * Set the 'DocumentSignCode' element value. ��� �������� ���������. ��������� ��������:
    11 � �������������� ������� �����, 
    12 � ������������ ������� �����, 
    13 � ��������� ������� �����,
    20 � ������� ������� �����,
    32 � ������� ����� �� ������ �������,
    55 � ������� �����, ������������ � ����������,
    77 � ������� ����� ��� ����������� ������� ������������,
    88 � ��������� ������� �����.
     * 
     * @param documentSignCode
     */
    public void setDocumentSignCode(String documentSignCode) {
        this.documentSignCode = documentSignCode;
    }

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
     * Get the 'CriterionCode' element value. ��� �������� ��������
     * 
     * @return value
     */
    public String getCriterionCode() {
        return criterionCode;
    }

    /** 
     * Set the 'CriterionCode' element value. ��� �������� ��������
     * 
     * @param criterionCode
     */
    public void setCriterionCode(String criterionCode) {
        this.criterionCode = criterionCode;
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
     * Get the 'FormalizedType' element value. ������� ������������. ���������� �������� (������� �����): 0 - ��������������; 1 - ������������; 2 - ������������ ��������
     * 
     * @return value
     */
    public String getFormalizedType() {
        return formalizedType;
    }

    /** 
     * Set the 'FormalizedType' element value. ������� ������������. ���������� �������� (������� �����): 0 - ��������������; 1 - ������������; 2 - ������������ ��������
     * 
     * @param formalizedType
     */
    public void setFormalizedType(String formalizedType) {
        this.formalizedType = formalizedType;
    }

    /** 
     * Get the 'BeginDate' element value. ���� ������ �������� ������ �� (���� � ������� YYYY-MM-DD. �� ���������  ������ ISO 8601.)
     * 
     * @return value
     */
    public LocalDate getBeginDate() {
        return beginDate;
    }

    /** 
     * Set the 'BeginDate' element value. ���� ������ �������� ������ �� (���� � ������� YYYY-MM-DD. �� ���������  ������ ISO 8601.)
     * 
     * @param beginDate
     */
    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    /** 
     * Get the 'PRNote' element value. ���������� � ������� �����
     * 
     * @return value
     */
    public String getPRNote() {
        return PRNote;
    }

    /** 
     * Set the 'PRNote' element value. ���������� � ������� �����
     * 
     * @param PRNote
     */
    public void setPRNote(String PRNote) {
        this.PRNote = PRNote;
    }

    /** 
     * Get the 'MinimizeMeasuresNote' element value. �� ������������. �� ����������� � ���. �������� ������� ����� (����� �������������� ��� ������������).
     * 
     * @return value
     */
    public String getMinimizeMeasuresNote() {
        return minimizeMeasuresNote;
    }

    /** 
     * Set the 'MinimizeMeasuresNote' element value. �� ������������. �� ����������� � ���. �������� ������� ����� (����� �������������� ��� ������������).
     * 
     * @param minimizeMeasuresNote
     */
    public void setMinimizeMeasuresNote(String minimizeMeasuresNote) {
        this.minimizeMeasuresNote = minimizeMeasuresNote;
    }

    /** 
     * Get the 'DescriptionMeasure' element value. ���������� � ����� (������������ �����)
     * 
     * @return value
     */
    public String getDescriptionMeasure() {
        return descriptionMeasure;
    }

    /** 
     * Set the 'DescriptionMeasure' element value. ���������� � ����� (������������ �����)
     * 
     * @param descriptionMeasure
     */
    public void setDescriptionMeasure(String descriptionMeasure) {
        this.descriptionMeasure = descriptionMeasure;
    }

    /** 
     * Get the list of 'MinimizeMeasuresInfo' element items. ����� ���������� � ������ ���� �� ����������� ������
     * 
     * @return list
     */
    public List<MinimizeInfoType> getMinimizeMeasuresInfoList() {
        return minimizeMeasuresInfoList;
    }

    /** 
     * Set the list of 'MinimizeMeasuresInfo' element items. ����� ���������� � ������ ���� �� ����������� ������
     * 
     * @param list
     */
    public void setMinimizeMeasuresInfoList(List<MinimizeInfoType> list) {
        minimizeMeasuresInfoList = list;
    }

    /** 
     * Get the 'ID' attribute value. ���������� �������������, ������� ������������� ������� ����� � �� "��� ���" ������ ���, ���
     * 
     * @return value
     */
    public String getID() {
        return ID;
    }

    /** 
     * Set the 'ID' attribute value. ���������� �������������, ������� ������������� ������� ����� � �� "��� ���" ������ ���, ���
     * 
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }
}
