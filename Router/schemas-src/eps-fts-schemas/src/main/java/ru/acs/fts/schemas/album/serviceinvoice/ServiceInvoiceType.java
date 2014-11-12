
package ru.acs.fts.schemas.album.serviceinvoice;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ����-������� �� ������ ����� �� ���������, �������� ����������/��������� ������� � �� ����������� �������
 */
public class ServiceInvoiceType extends BaseDocType
{
    private String documentSign;
    private String totalServiceCost;
    private String currency;
    private ServiceProviderType serviceProvider;
    private CUOrganizationType consignor;
    private CUOrganizationType consignee;
    private List<DocumentBaseType> paymentDocumentList = new ArrayList<DocumentBaseType>();
    private DocumentBaseType contractDetails;
    private DocumentBaseType insurance;
    private CUOrganizationType serviceConsumer;
    private List<ServiceDescriptionType> serviceDescriptionList = new ArrayList<ServiceDescriptionType>();
    private int choiceSelect = -1;
    private static final int INDIVIDUAL_ENTREPRENEUR_CHOICE = 0;
    private static final int SIGNATURE_DIRECTOR_CHIEF_ACCOUNTANT_CHOICE = 1;
    private PersonSignatureType individualEntrepreneur;
    private SignatureDirectorChiefAccountantType signatureDirectorChiefAccountant;
    private DocumentBaseType registration;
    private String documentModeID;

    /** 
     * Get the 'DocumentSign' element value. ������� ��������� (����-������� �� ������ �����: 0 -  �� ����������� �������; 1 - �� ��������� (���������������) �������� ����������/��������� �������)
     * 
     * @return value
     */
    public String getDocumentSign() {
        return documentSign;
    }

    /** 
     * Set the 'DocumentSign' element value. ������� ��������� (����-������� �� ������ �����: 0 -  �� ����������� �������; 1 - �� ��������� (���������������) �������� ����������/��������� �������)
     * 
     * @param documentSign
     */
    public void setDocumentSign(String documentSign) {
        this.documentSign = documentSign;
    }

    /** 
     * Get the 'TotalServiceCost' element value. ����� � ������
     * 
     * @return value
     */
    public String getTotalServiceCost() {
        return totalServiceCost;
    }

    /** 
     * Set the 'TotalServiceCost' element value. ����� � ������
     * 
     * @param totalServiceCost
     */
    public void setTotalServiceCost(String totalServiceCost) {
        this.totalServiceCost = totalServiceCost;
    }

    /** 
     * Get the 'Currency' element value. ��� ������
     * 
     * @return value
     */
    public String getCurrency() {
        return currency;
    }

    /** 
     * Set the 'Currency' element value. ��� ������
     * 
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /** 
     * Get the 'ServiceProvider' element value. ��������� ����� (����������/����������/����������)
     * 
     * @return value
     */
    public ServiceProviderType getServiceProvider() {
        return serviceProvider;
    }

    /** 
     * Set the 'ServiceProvider' element value. ��������� ����� (����������/����������/����������)
     * 
     * @param serviceProvider
     */
    public void setServiceProvider(ServiceProviderType serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    /** 
     * Get the 'Consignor' element value. ����������������
     * 
     * @return value
     */
    public CUOrganizationType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. ����������������
     * 
     * @param consignor
     */
    public void setConsignor(CUOrganizationType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'Consignee' element value. ���������������
     * 
     * @return value
     */
    public CUOrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. ���������������
     * 
     * @param consignee
     */
    public void setConsignee(CUOrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the list of 'PaymentDocument' element items. ��������-��������� ��������
     * 
     * @return list
     */
    public List<DocumentBaseType> getPaymentDocumentList() {
        return paymentDocumentList;
    }

    /** 
     * Set the list of 'PaymentDocument' element items. ��������-��������� ��������
     * 
     * @param list
     */
    public void setPaymentDocumentList(List<DocumentBaseType> list) {
        paymentDocumentList = list;
    }

    /** 
     * Get the 'ContractDetails' element value. ��������� ��������
     * 
     * @return value
     */
    public DocumentBaseType getContractDetails() {
        return contractDetails;
    }

    /** 
     * Set the 'ContractDetails' element value. ��������� ��������
     * 
     * @param contractDetails
     */
    public void setContractDetails(DocumentBaseType contractDetails) {
        this.contractDetails = contractDetails;
    }

    /** 
     * Get the 'Insurance' element value. ��������� �����
     * 
     * @return value
     */
    public DocumentBaseType getInsurance() {
        return insurance;
    }

    /** 
     * Set the 'Insurance' element value. ��������� �����
     * 
     * @param insurance
     */
    public void setInsurance(DocumentBaseType insurance) {
        this.insurance = insurance;
    }

    /** 
     * Get the 'ServiceConsumer' element value. ������ (������������/��������)
     * 
     * @return value
     */
    public CUOrganizationType getServiceConsumer() {
        return serviceConsumer;
    }

    /** 
     * Set the 'ServiceConsumer' element value. ������ (������������/��������)
     * 
     * @param serviceConsumer
     */
    public void setServiceConsumer(CUOrganizationType serviceConsumer) {
        this.serviceConsumer = serviceConsumer;
    }

    /** 
     * Get the list of 'ServiceDescription' element items. �������� ����������� �����, ��������� �����
     * 
     * @return list
     */
    public List<ServiceDescriptionType> getServiceDescriptionList() {
        return serviceDescriptionList;
    }

    /** 
     * Set the list of 'ServiceDescription' element items. �������� ����������� �����, ��������� �����
     * 
     * @param list
     */
    public void setServiceDescriptionList(List<ServiceDescriptionType> list) {
        serviceDescriptionList = list;
    }

    private void setChoiceSelect(int choice) {
        if (choiceSelect == -1) {
            choiceSelect = choice;
        } else if (choiceSelect != choice) {
            throw new IllegalStateException(
                    "Need to call clearChoiceSelect() before changing existing choice");
        }
    }

    /** 
     * Clear the choice selection.
     */
    public void clearChoiceSelect() {
        choiceSelect = -1;
    }

    /** 
     * Check if IndividualEntrepreneur is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifIndividualEntrepreneur() {
        return choiceSelect == INDIVIDUAL_ENTREPRENEUR_CHOICE;
    }

    /** 
     * Get the 'IndividualEntrepreneur' element value. �������������� ���������������
     * 
     * @return value
     */
    public PersonSignatureType getIndividualEntrepreneur() {
        return individualEntrepreneur;
    }

    /** 
     * Set the 'IndividualEntrepreneur' element value. �������������� ���������������
     * 
     * @param individualEntrepreneur
     */
    public void setIndividualEntrepreneur(
            PersonSignatureType individualEntrepreneur) {
        setChoiceSelect(INDIVIDUAL_ENTREPRENEUR_CHOICE);
        this.individualEntrepreneur = individualEntrepreneur;
    }

    /** 
     * Check if SignatureDirectorChiefAccountant is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifSignatureDirectorChiefAccountant() {
        return choiceSelect == SIGNATURE_DIRECTOR_CHIEF_ACCOUNTANT_CHOICE;
    }

    /** 
     * Get the 'SignatureDirectorChiefAccountant' element value. ������� ������������ ����������� � �������� ����������.
     * 
     * @return value
     */
    public SignatureDirectorChiefAccountantType getSignatureDirectorChiefAccountant() {
        return signatureDirectorChiefAccountant;
    }

    /** 
     * Set the 'SignatureDirectorChiefAccountant' element value. ������� ������������ ����������� � �������� ����������.
     * 
     * @param signatureDirectorChiefAccountant
     */
    public void setSignatureDirectorChiefAccountant(
            SignatureDirectorChiefAccountantType signatureDirectorChiefAccountant) {
        setChoiceSelect(SIGNATURE_DIRECTOR_CHIEF_ACCOUNTANT_CHOICE);
        this.signatureDirectorChiefAccountant = signatureDirectorChiefAccountant;
    }

    /** 
     * Get the 'Registration' element value. ��������������� ������ �����-�������
     * 
     * @return value
     */
    public DocumentBaseType getRegistration() {
        return registration;
    }

    /** 
     * Set the 'Registration' element value. ��������������� ������ �����-�������
     * 
     * @param registration
     */
    public void setRegistration(DocumentBaseType registration) {
        this.registration = registration;
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
