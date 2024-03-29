
package ru.acs.fts.schemas.album.extractfromorder;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ������� �� ������� � ������ �� ������ / � �������� �� ������ ������
 */
public class ExtractFromOrderType extends BaseDocType
{
    private LocalDate beginDate;
    private LocalDate endDate;
    private String workKind;
    private String transferReason;
    private String employeeLNP;
    private List<String> termsKindWorkList = new ArrayList<String>();
    private String trialPeriod;
    private String orderEmploymentTransfer;
    private DocumentBaseType documentReference;
    private OrganizationType organization;
    private EmployeeInfoType employee;
    private EmploymentPlaceType lastEmployeePlace;
    private EmploymentPlaceType newEmployeePlace;
    private List<DocumentBaseType> groundList = new ArrayList<DocumentBaseType>();
    private PersonSignatureType personSignature;
    private String documentModeID;

    /** 
     * Get the 'BeginDate' element value. ���� ������ / ��������
     * 
     * @return value
     */
    public LocalDate getBeginDate() {
        return beginDate;
    }

    /** 
     * Set the 'BeginDate' element value. ���� ������ / ��������
     * 
     * @param beginDate
     */
    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    /** 
     * Get the 'EndDate' element value. ���� ����������
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. ���� ����������
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /** 
     * Get the 'WorkKind' element value. ��� ������ / �������� (���������, ��������)
     * 
     * @return value
     */
    public String getWorkKind() {
        return workKind;
    }

    /** 
     * Set the 'WorkKind' element value. ��� ������ / �������� (���������, ��������)
     * 
     * @param workKind
     */
    public void setWorkKind(String workKind) {
        this.workKind = workKind;
    }

    /** 
     * Get the 'TransferReason' element value. ������� ��������
     * 
     * @return value
     */
    public String getTransferReason() {
        return transferReason;
    }

    /** 
     * Set the 'TransferReason' element value. ������� ��������
     * 
     * @param transferReason
     */
    public void setTransferReason(String transferReason) {
        this.transferReason = transferReason;
    }

    /** 
     * Get the 'EmployeeLNP' element value. ������ �������� ������ ����������
     * 
     * @return value
     */
    public String getEmployeeLNP() {
        return employeeLNP;
    }

    /** 
     * Set the 'EmployeeLNP' element value. ������ �������� ������ ����������
     * 
     * @param employeeLNP
     */
    public void setEmployeeLNP(String employeeLNP) {
        this.employeeLNP = employeeLNP;
    }

    /** 
     * Get the list of 'TermsKindWork' element items. ������� ������, �������� ������
     * 
     * @return list
     */
    public List<String> getTermsKindWorkList() {
        return termsKindWorkList;
    }

    /** 
     * Set the list of 'TermsKindWork' element items. ������� ������, �������� ������
     * 
     * @param list
     */
    public void setTermsKindWorkList(List<String> list) {
        termsKindWorkList = list;
    }

    /** 
     * Get the 'TrialPeriod' element value. ������������� ����
     * 
     * @return value
     */
    public String getTrialPeriod() {
        return trialPeriod;
    }

    /** 
     * Set the 'TrialPeriod' element value. ������������� ����
     * 
     * @param trialPeriod
     */
    public void setTrialPeriod(String trialPeriod) {
        this.trialPeriod = trialPeriod;
    }

    /** 
     * Get the 'OrderEmploymentTransfer' element value. ������� �� �������: 1 - � ������ �� ������,  0 - � �������� �� ������ ������
     * 
     * @return value
     */
    public String getOrderEmploymentTransfer() {
        return orderEmploymentTransfer;
    }

    /** 
     * Set the 'OrderEmploymentTransfer' element value. ������� �� �������: 1 - � ������ �� ������,  0 - � �������� �� ������ ������
     * 
     * @param orderEmploymentTransfer
     */
    public void setOrderEmploymentTransfer(String orderEmploymentTransfer) {
        this.orderEmploymentTransfer = orderEmploymentTransfer;
    }

    /** 
     * Get the 'DocumentReference' element value. ��������� ���������
     * 
     * @return value
     */
    public DocumentBaseType getDocumentReference() {
        return documentReference;
    }

    /** 
     * Set the 'DocumentReference' element value. ��������� ���������
     * 
     * @param documentReference
     */
    public void setDocumentReference(DocumentBaseType documentReference) {
        this.documentReference = documentReference;
    }

    /** 
     * Get the 'Organization' element value. �����������-������������
     * 
     * @return value
     */
    public OrganizationType getOrganization() {
        return organization;
    }

    /** 
     * Set the 'Organization' element value. �����������-������������
     * 
     * @param organization
     */
    public void setOrganization(OrganizationType organization) {
        this.organization = organization;
    }

    /** 
     * Get the 'Employee' element value. ���������
     * 
     * @return value
     */
    public EmployeeInfoType getEmployee() {
        return employee;
    }

    /** 
     * Set the 'Employee' element value. ���������
     * 
     * @param employee
     */
    public void setEmployee(EmployeeInfoType employee) {
        this.employee = employee;
    }

    /** 
     * Get the 'LastEmployeePlace' element value. ������� ����� ������
     * 
     * @return value
     */
    public EmploymentPlaceType getLastEmployeePlace() {
        return lastEmployeePlace;
    }

    /** 
     * Set the 'LastEmployeePlace' element value. ������� ����� ������
     * 
     * @param lastEmployeePlace
     */
    public void setLastEmployeePlace(EmploymentPlaceType lastEmployeePlace) {
        this.lastEmployeePlace = lastEmployeePlace;
    }

    /** 
     * Get the 'NewEmployeePlace' element value. ����� ����� ������
     * 
     * @return value
     */
    public EmploymentPlaceType getNewEmployeePlace() {
        return newEmployeePlace;
    }

    /** 
     * Set the 'NewEmployeePlace' element value. ����� ����� ������
     * 
     * @param newEmployeePlace
     */
    public void setNewEmployeePlace(EmploymentPlaceType newEmployeePlace) {
        this.newEmployeePlace = newEmployeePlace;
    }

    /** 
     * Get the list of 'Ground' element items. ��������-��������� ��� ������ / ��������
     * 
     * @return list
     */
    public List<DocumentBaseType> getGroundList() {
        return groundList;
    }

    /** 
     * Set the list of 'Ground' element items. ��������-��������� ��� ������ / ��������
     * 
     * @param list
     */
    public void setGroundList(List<DocumentBaseType> list) {
        groundList = list;
    }

    /** 
     * Get the 'PersonSignature' element value. ������� ������������ ���� �� ���������
     * 
     * @return value
     */
    public PersonSignatureType getPersonSignature() {
        return personSignature;
    }

    /** 
     * Set the 'PersonSignature' element value. ������� ������������ ���� �� ���������
     * 
     * @param personSignature
     */
    public void setPersonSignature(PersonSignatureType personSignature) {
        this.personSignature = personSignature;
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
