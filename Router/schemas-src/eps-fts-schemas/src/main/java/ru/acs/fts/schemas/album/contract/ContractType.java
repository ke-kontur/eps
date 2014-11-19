
package ru.acs.fts.schemas.album.contract;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.ContractDeliveryTermsType;
import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.ContractDescriptionType;
import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.ContractRegistrationType;
import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.ContractSpecificationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationWBankType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ��������/ ������� ��������
 */
public class ContractType extends BaseDocType
{
    private String supplementationSign;
    private ContractDescriptionType contractTerms;
    private OrganizationWBankType foreignPerson;
    private OrganizationWBankType russianPerson;
    private List<ContractDeliveryTermsType> contractDeliveryTermList = new ArrayList<ContractDeliveryTermsType>();
    private List<ContractSpecificationType> contractSpecificationList = new ArrayList<ContractSpecificationType>();
    private ContractRegistrationType contractRegistration;
    private PersonSignatureType contractSignedPerson;
    private String documentModeID;

    /** 
     * Get the 'SupplementationSign' element value. ������� ������� ����������/���������� � ���������, ������� ��������� � ������������/������������� �������
     * 
     * @return value
     */
    public String getSupplementationSign() {
        return supplementationSign;
    }

    /** 
     * Set the 'SupplementationSign' element value. ������� ������� ����������/���������� � ���������, ������� ��������� � ������������/������������� �������
     * 
     * @param supplementationSign
     */
    public void setSupplementationSign(String supplementationSign) {
        this.supplementationSign = supplementationSign;
    }

    /** 
     * Get the 'ContractTerms' element value. ������� ���������
     * 
     * @return value
     */
    public ContractDescriptionType getContractTerms() {
        return contractTerms;
    }

    /** 
     * Set the 'ContractTerms' element value. ������� ���������
     * 
     * @param contractTerms
     */
    public void setContractTerms(ContractDescriptionType contractTerms) {
        this.contractTerms = contractTerms;
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
     * Get the list of 'ContractDeliveryTerms' element items. �������� ������� �������� � ���������
     * 
     * @return list
     */
    public List<ContractDeliveryTermsType> getContractDeliveryTermList() {
        return contractDeliveryTermList;
    }

    /** 
     * Set the list of 'ContractDeliveryTerms' element items. �������� ������� �������� � ���������
     * 
     * @param list
     */
    public void setContractDeliveryTermList(List<ContractDeliveryTermsType> list) {
        contractDeliveryTermList = list;
    }

    /** 
     * Get the list of 'ContractSpecification' element items. ��������� ������������ � ���������
     * 
     * @return list
     */
    public List<ContractSpecificationType> getContractSpecificationList() {
        return contractSpecificationList;
    }

    /** 
     * Set the list of 'ContractSpecification' element items. ��������� ������������ � ���������
     * 
     * @param list
     */
    public void setContractSpecificationList(
            List<ContractSpecificationType> list) {
        contractSpecificationList = list;
    }

    /** 
     * Get the 'ContractRegistration' element value. �������� � ���������� (����������) ��������� (����, �����, �����)
     * 
     * @return value
     */
    public ContractRegistrationType getContractRegistration() {
        return contractRegistration;
    }

    /** 
     * Set the 'ContractRegistration' element value. �������� � ���������� (����������) ��������� (����, �����, �����)
     * 
     * @param contractRegistration
     */
    public void setContractRegistration(
            ContractRegistrationType contractRegistration) {
        this.contractRegistration = contractRegistration;
    }

    /** 
     * Get the 'ContractSignedPerson' element value. ����, ����������� ��������
     * 
     * @return value
     */
    public PersonSignatureType getContractSignedPerson() {
        return contractSignedPerson;
    }

    /** 
     * Set the 'ContractSignedPerson' element value. ����, ����������� ��������
     * 
     * @param contractSignedPerson
     */
    public void setContractSignedPerson(PersonSignatureType contractSignedPerson) {
        this.contractSignedPerson = contractSignedPerson;
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
