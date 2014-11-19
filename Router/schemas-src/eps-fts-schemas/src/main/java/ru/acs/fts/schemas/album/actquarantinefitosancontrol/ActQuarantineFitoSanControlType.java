
package ru.acs.fts.schemas.album.actquarantinefitosancontrol;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * ��� ���������������� ������������ ��������������� ��������
 */
public class ActQuarantineFitoSanControlType extends BaseDocType
{
    private String nameSubject;
    private String nameManagement;
    private LocalDate issueDate;
    private String registrationNumber;
    private String numberIKR;
    private List<String> resultScreeningList = new ArrayList<String>();
    private String confiscationSamples;
    private String returnDestructionSamples;
    private List<String> prescriptionList = new ArrayList<String>();
    private PersonBaseType authorizedOfficial;
    private List<DescriptionConsignmentType> descriptionConsignmentList = new ArrayList<DescriptionConsignmentType>();
    private FitoSanitaryCertificateInfoType fitoSanitaryCertificateInfo;
    private PersonBaseType owner;
    private String documentModeID;

    /** 
     * Get the 'NameSubject' element value. ������������ ��������
     * 
     * @return value
     */
    public String getNameSubject() {
        return nameSubject;
    }

    /** 
     * Set the 'NameSubject' element value. ������������ ��������
     * 
     * @param nameSubject
     */
    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    /** 
     * Get the 'NameManagement' element value. ������������ ������������� ����������
     * 
     * @return value
     */
    public String getNameManagement() {
        return nameManagement;
    }

    /** 
     * Set the 'NameManagement' element value. ������������ ������������� ����������
     * 
     * @param nameManagement
     */
    public void setNameManagement(String nameManagement) {
        this.nameManagement = nameManagement;
    }

    /** 
     * Get the 'IssueDate' element value. ���� ������
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. ���� ������
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the 'RegistrationNumber' element value. ��������������� �����
     * 
     * @return value
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /** 
     * Set the 'RegistrationNumber' element value. ��������������� �����
     * 
     * @param registrationNumber
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /** 
     * Get the 'NumberIKR' element value. ����� ���, �� ��������� �������� ����������� ����
     * 
     * @return value
     */
    public String getNumberIKR() {
        return numberIKR;
    }

    /** 
     * Set the 'NumberIKR' element value. ����� ���, �� ��������� �������� ����������� ����
     * 
     * @param numberIKR
     */
    public void setNumberIKR(String numberIKR) {
        this.numberIKR = numberIKR;
    }

    /** 
     * Get the list of 'ResultScreening' element items. ��������� ��������
     * 
     * @return list
     */
    public List<String> getResultScreeningList() {
        return resultScreeningList;
    }

    /** 
     * Set the list of 'ResultScreening' element items. ��������� ��������
     * 
     * @param list
     */
    public void setResultScreeningList(List<String> list) {
        resultScreeningList = list;
    }

    /** 
     * Get the 'ConfiscationSamples' element value. ��� ����������� �������������� ���������� �������� �������
     * 
     * @return value
     */
    public String getConfiscationSamples() {
        return confiscationSamples;
    }

    /** 
     * Set the 'ConfiscationSamples' element value. ��� ����������� �������������� ���������� �������� �������
     * 
     * @param confiscationSamples
     */
    public void setConfiscationSamples(String confiscationSamples) {
        this.confiscationSamples = confiscationSamples;
    }

    /** 
     * Get the 'ReturnDestructionSamples' element value. �������  �����   ����������   ���������� ���� 1- ���������, 2-  ����������, 3 - ��������� �� ��������.
     * 
     * @return value
     */
    public String getReturnDestructionSamples() {
        return returnDestructionSamples;
    }

    /** 
     * Set the 'ReturnDestructionSamples' element value. �������  �����   ����������   ���������� ���� 1- ���������, 2-  ����������, 3 - ��������� �� ��������.
     * 
     * @param returnDestructionSamples
     */
    public void setReturnDestructionSamples(String returnDestructionSamples) {
        this.returnDestructionSamples = returnDestructionSamples;
    }

    /** 
     * Get the list of 'Prescription' element items. �������������� ��������� �����������  ��������������  �����������,
     * 
     * @return list
     */
    public List<String> getPrescriptionList() {
        return prescriptionList;
    }

    /** 
     * Set the list of 'Prescription' element items. �������������� ��������� �����������  ��������������  �����������,
     * 
     * @param list
     */
    public void setPrescriptionList(List<String> list) {
        prescriptionList = list;
    }

    /** 
     * Get the 'AuthorizedOfficial' element value. ��������������  ����������� ����
     * 
     * @return value
     */
    public PersonBaseType getAuthorizedOfficial() {
        return authorizedOfficial;
    }

    /** 
     * Set the 'AuthorizedOfficial' element value. ��������������  ����������� ����
     * 
     * @param authorizedOfficial
     */
    public void setAuthorizedOfficial(PersonBaseType authorizedOfficial) {
        this.authorizedOfficial = authorizedOfficial;
    }

    /** 
     * Get the list of 'DescriptionConsignment' element items. �������� �����
     * 
     * @return list
     */
    public List<DescriptionConsignmentType> getDescriptionConsignmentList() {
        return descriptionConsignmentList;
    }

    /** 
     * Set the list of 'DescriptionConsignment' element items. �������� �����
     * 
     * @param list
     */
    public void setDescriptionConsignmentList(
            List<DescriptionConsignmentType> list) {
        descriptionConsignmentList = list;
    }

    /** 
     * Get the 'FitoSanitaryCertificateInfo' element value. �������� � �������������� (�����������) �����������
     * 
     * @return value
     */
    public FitoSanitaryCertificateInfoType getFitoSanitaryCertificateInfo() {
        return fitoSanitaryCertificateInfo;
    }

    /** 
     * Set the 'FitoSanitaryCertificateInfo' element value. �������� � �������������� (�����������) �����������
     * 
     * @param fitoSanitaryCertificateInfo
     */
    public void setFitoSanitaryCertificateInfo(
            FitoSanitaryCertificateInfoType fitoSanitaryCertificateInfo) {
        this.fitoSanitaryCertificateInfo = fitoSanitaryCertificateInfo;
    }

    /** 
     * Get the 'Owner' element value. ��� ���������  �  �����������  ���������   (�������������)   �����
     * 
     * @return value
     */
    public PersonBaseType getOwner() {
        return owner;
    }

    /** 
     * Set the 'Owner' element value. ��� ���������  �  �����������  ���������   (�������������)   �����
     * 
     * @param owner
     */
    public void setOwner(PersonBaseType owner) {
        this.owner = owner;
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
