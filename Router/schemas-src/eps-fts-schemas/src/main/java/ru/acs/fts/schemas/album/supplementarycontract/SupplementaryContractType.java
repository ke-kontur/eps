
package ru.acs.fts.schemas.album.supplementarycontract;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.ContractDeliveryTermsType;
import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.ContractDescriptionType;
import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.ContractRegistrationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationWBankType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ���������� (����������) � ���������
 */
public class SupplementaryContractType extends BaseDocType
{
    private String documentNumber;
    private LocalDate issueDate;
    private List<ContractRegistrationType> contractRegistrationList = new ArrayList<ContractRegistrationType>();
    private ContractDescriptionType contractDescription;
    private List<ContractDeliveryTermsType> supContractDeliveryTermList = new ArrayList<ContractDeliveryTermsType>();
    private List<AddContractSpecificationType> contractSpecificationList = new ArrayList<AddContractSpecificationType>();
    private OrganizationWBankType russianPerson;
    private OrganizationWBankType foreignPerson;
    private List<PersonSignatureType> contractSignedPersonList = new ArrayList<PersonSignatureType>();
    private String documentModeID;

    /** 
     * Get the 'DocumentNumber' element value. ����� ���������
     * 
     * @return value
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /** 
     * Set the 'DocumentNumber' element value. ����� ���������
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /** 
     * Get the 'IssueDate' element value. ���� ����������� ���������
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. ���� ����������� ���������
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the list of 'ContractRegistration' element items. �������� � ����������� ���������, � �������� ��������� ���������� (����, �����, �����)
     * 
     * @return list
     */
    public List<ContractRegistrationType> getContractRegistrationList() {
        return contractRegistrationList;
    }

    /** 
     * Set the list of 'ContractRegistration' element items. �������� � ����������� ���������, � �������� ��������� ���������� (����, �����, �����)
     * 
     * @param list
     */
    public void setContractRegistrationList(List<ContractRegistrationType> list) {
        contractRegistrationList = list;
    }

    /** 
     * Get the 'ContractDescription' element value. �������� ������� ���������
     * 
     * @return value
     */
    public ContractDescriptionType getContractDescription() {
        return contractDescription;
    }

    /** 
     * Set the 'ContractDescription' element value. �������� ������� ���������
     * 
     * @param contractDescription
     */
    public void setContractDescription(
            ContractDescriptionType contractDescription) {
        this.contractDescription = contractDescription;
    }

    /** 
     * Get the list of 'SupContractDeliveryTerms' element items. �������� ������� �������� ��������� (��� � ������������ � ���������)
     * 
     * @return list
     */
    public List<ContractDeliveryTermsType> getSupContractDeliveryTermList() {
        return supContractDeliveryTermList;
    }

    /** 
     * Set the list of 'SupContractDeliveryTerms' element items. �������� ������� �������� ��������� (��� � ������������ � ���������)
     * 
     * @param list
     */
    public void setSupContractDeliveryTermList(
            List<ContractDeliveryTermsType> list) {
        supContractDeliveryTermList = list;
    }

    /** 
     * Get the list of 'ContractSpecification' element items. ������������ � ���������� � ���������
     * 
     * @return list
     */
    public List<AddContractSpecificationType> getContractSpecificationList() {
        return contractSpecificationList;
    }

    /** 
     * Set the list of 'ContractSpecification' element items. ������������ � ���������� � ���������
     * 
     * @param list
     */
    public void setContractSpecificationList(
            List<AddContractSpecificationType> list) {
        contractSpecificationList = list;
    }

    /** 
     * Get the 'RussianPerson' element value. �������� ����������� ������������������
     * 
     * @return value
     */
    public OrganizationWBankType getRussianPerson() {
        return russianPerson;
    }

    /** 
     * Set the 'RussianPerson' element value. �������� ����������� ������������������
     * 
     * @param russianPerson
     */
    public void setRussianPerson(OrganizationWBankType russianPerson) {
        this.russianPerson = russianPerson;
    }

    /** 
     * Get the 'ForeignPerson' element value. ��������� ����������� ������� ���������
     * 
     * @return value
     */
    public OrganizationWBankType getForeignPerson() {
        return foreignPerson;
    }

    /** 
     * Set the 'ForeignPerson' element value. ��������� ����������� ������� ���������
     * 
     * @param foreignPerson
     */
    public void setForeignPerson(OrganizationWBankType foreignPerson) {
        this.foreignPerson = foreignPerson;
    }

    /** 
     * Get the list of 'ContractSignedPerson' element items. ����, ����������� ��������
     * 
     * @return list
     */
    public List<PersonSignatureType> getContractSignedPersonList() {
        return contractSignedPersonList;
    }

    /** 
     * Set the list of 'ContractSignedPerson' element items. ����, ����������� ��������
     * 
     * @param list
     */
    public void setContractSignedPersonList(List<PersonSignatureType> list) {
        contractSignedPersonList = list;
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
