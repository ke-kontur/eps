
package ru.acs.fts.schemas.album.extractfromorder;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Выписка из приказа о приеме на работу / о переводе на другую работу
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
     * Get the 'BeginDate' element value. Дата приема / перевода
     * 
     * @return value
     */
    public LocalDate getBeginDate() {
        return beginDate;
    }

    /** 
     * Set the 'BeginDate' element value. Дата приема / перевода
     * 
     * @param beginDate
     */
    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    /** 
     * Get the 'EndDate' element value. Дата увольнения
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. Дата увольнения
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /** 
     * Get the 'WorkKind' element value. Вид приема / перевода (постоянно, временно)
     * 
     * @return value
     */
    public String getWorkKind() {
        return workKind;
    }

    /** 
     * Set the 'WorkKind' element value. Вид приема / перевода (постоянно, временно)
     * 
     * @param workKind
     */
    public void setWorkKind(String workKind) {
        this.workKind = workKind;
    }

    /** 
     * Get the 'TransferReason' element value. Причина перевода
     * 
     * @return value
     */
    public String getTransferReason() {
        return transferReason;
    }

    /** 
     * Set the 'TransferReason' element value. Причина перевода
     * 
     * @param transferReason
     */
    public void setTransferReason(String transferReason) {
        this.transferReason = transferReason;
    }

    /** 
     * Get the 'EmployeeLNP' element value. Личная номерная печать сотрудника
     * 
     * @return value
     */
    public String getEmployeeLNP() {
        return employeeLNP;
    }

    /** 
     * Set the 'EmployeeLNP' element value. Личная номерная печать сотрудника
     * 
     * @param employeeLNP
     */
    public void setEmployeeLNP(String employeeLNP) {
        this.employeeLNP = employeeLNP;
    }

    /** 
     * Get the list of 'TermsKindWork' element items. Условия приема, характер работы
     * 
     * @return list
     */
    public List<String> getTermsKindWorkList() {
        return termsKindWorkList;
    }

    /** 
     * Set the list of 'TermsKindWork' element items. Условия приема, характер работы
     * 
     * @param list
     */
    public void setTermsKindWorkList(List<String> list) {
        termsKindWorkList = list;
    }

    /** 
     * Get the 'TrialPeriod' element value. Испытательный срок
     * 
     * @return value
     */
    public String getTrialPeriod() {
        return trialPeriod;
    }

    /** 
     * Set the 'TrialPeriod' element value. Испытательный срок
     * 
     * @param trialPeriod
     */
    public void setTrialPeriod(String trialPeriod) {
        this.trialPeriod = trialPeriod;
    }

    /** 
     * Get the 'OrderEmploymentTransfer' element value. Выписка из приказа: 1 - о приеме на работу,  0 - о переводе на другую работу
     * 
     * @return value
     */
    public String getOrderEmploymentTransfer() {
        return orderEmploymentTransfer;
    }

    /** 
     * Set the 'OrderEmploymentTransfer' element value. Выписка из приказа: 1 - о приеме на работу,  0 - о переводе на другую работу
     * 
     * @param orderEmploymentTransfer
     */
    public void setOrderEmploymentTransfer(String orderEmploymentTransfer) {
        this.orderEmploymentTransfer = orderEmploymentTransfer;
    }

    /** 
     * Get the 'DocumentReference' element value. Реквизиты документа
     * 
     * @return value
     */
    public DocumentBaseType getDocumentReference() {
        return documentReference;
    }

    /** 
     * Set the 'DocumentReference' element value. Реквизиты документа
     * 
     * @param documentReference
     */
    public void setDocumentReference(DocumentBaseType documentReference) {
        this.documentReference = documentReference;
    }

    /** 
     * Get the 'Organization' element value. Организация-работодатель
     * 
     * @return value
     */
    public OrganizationType getOrganization() {
        return organization;
    }

    /** 
     * Set the 'Organization' element value. Организация-работодатель
     * 
     * @param organization
     */
    public void setOrganization(OrganizationType organization) {
        this.organization = organization;
    }

    /** 
     * Get the 'Employee' element value. Сотрудник
     * 
     * @return value
     */
    public EmployeeInfoType getEmployee() {
        return employee;
    }

    /** 
     * Set the 'Employee' element value. Сотрудник
     * 
     * @param employee
     */
    public void setEmployee(EmployeeInfoType employee) {
        this.employee = employee;
    }

    /** 
     * Get the 'LastEmployeePlace' element value. Прежнее место работы
     * 
     * @return value
     */
    public EmploymentPlaceType getLastEmployeePlace() {
        return lastEmployeePlace;
    }

    /** 
     * Set the 'LastEmployeePlace' element value. Прежнее место работы
     * 
     * @param lastEmployeePlace
     */
    public void setLastEmployeePlace(EmploymentPlaceType lastEmployeePlace) {
        this.lastEmployeePlace = lastEmployeePlace;
    }

    /** 
     * Get the 'NewEmployeePlace' element value. Новое место работы
     * 
     * @return value
     */
    public EmploymentPlaceType getNewEmployeePlace() {
        return newEmployeePlace;
    }

    /** 
     * Set the 'NewEmployeePlace' element value. Новое место работы
     * 
     * @param newEmployeePlace
     */
    public void setNewEmployeePlace(EmploymentPlaceType newEmployeePlace) {
        this.newEmployeePlace = newEmployeePlace;
    }

    /** 
     * Get the list of 'Ground' element items. Документ-основание для приема / перевода
     * 
     * @return list
     */
    public List<DocumentBaseType> getGroundList() {
        return groundList;
    }

    /** 
     * Set the list of 'Ground' element items. Документ-основание для приема / перевода
     * 
     * @param list
     */
    public void setGroundList(List<DocumentBaseType> list) {
        groundList = list;
    }

    /** 
     * Get the 'PersonSignature' element value. Подпись должностного лица на документе
     * 
     * @return value
     */
    public PersonSignatureType getPersonSignature() {
        return personSignature;
    }

    /** 
     * Set the 'PersonSignature' element value. Подпись должностного лица на документе
     * 
     * @param personSignature
     */
    public void setPersonSignature(PersonSignatureType personSignature) {
        this.personSignature = personSignature;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
