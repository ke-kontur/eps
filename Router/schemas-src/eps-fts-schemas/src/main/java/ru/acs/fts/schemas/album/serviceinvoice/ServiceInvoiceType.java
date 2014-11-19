
package ru.acs.fts.schemas.album.serviceinvoice;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Счет-фактура на оплату услуг по перевозке, погрузке перегрузке/разгрузке товаров и по страхованию товаров
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
     * Get the 'DocumentSign' element value. Признак документа (Счет-фактура на оплату услуг: 0 -  по страхованию товаров; 1 - по перевозке (транспортировке) погрузке перегрузке/разгрузке товаров)
     * 
     * @return value
     */
    public String getDocumentSign() {
        return documentSign;
    }

    /** 
     * Set the 'DocumentSign' element value. Признак документа (Счет-фактура на оплату услуг: 0 -  по страхованию товаров; 1 - по перевозке (транспортировке) погрузке перегрузке/разгрузке товаров)
     * 
     * @param documentSign
     */
    public void setDocumentSign(String documentSign) {
        this.documentSign = documentSign;
    }

    /** 
     * Get the 'TotalServiceCost' element value. Всего к оплате
     * 
     * @return value
     */
    public String getTotalServiceCost() {
        return totalServiceCost;
    }

    /** 
     * Set the 'TotalServiceCost' element value. Всего к оплате
     * 
     * @param totalServiceCost
     */
    public void setTotalServiceCost(String totalServiceCost) {
        this.totalServiceCost = totalServiceCost;
    }

    /** 
     * Get the 'Currency' element value. Код валюты
     * 
     * @return value
     */
    public String getCurrency() {
        return currency;
    }

    /** 
     * Set the 'Currency' element value. Код валюты
     * 
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /** 
     * Get the 'ServiceProvider' element value. Поставщик услуг (страховщик/экспедитор/перевозчик)
     * 
     * @return value
     */
    public ServiceProviderType getServiceProvider() {
        return serviceProvider;
    }

    /** 
     * Set the 'ServiceProvider' element value. Поставщик услуг (страховщик/экспедитор/перевозчик)
     * 
     * @param serviceProvider
     */
    public void setServiceProvider(ServiceProviderType serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    /** 
     * Get the 'Consignor' element value. Грузоотправитель
     * 
     * @return value
     */
    public CUOrganizationType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. Грузоотправитель
     * 
     * @param consignor
     */
    public void setConsignor(CUOrganizationType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'Consignee' element value. Грузополучатель
     * 
     * @return value
     */
    public CUOrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. Грузополучатель
     * 
     * @param consignee
     */
    public void setConsignee(CUOrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the list of 'PaymentDocument' element items. Платежно-расчетный документ
     * 
     * @return list
     */
    public List<DocumentBaseType> getPaymentDocumentList() {
        return paymentDocumentList;
    }

    /** 
     * Set the list of 'PaymentDocument' element items. Платежно-расчетный документ
     * 
     * @param list
     */
    public void setPaymentDocumentList(List<DocumentBaseType> list) {
        paymentDocumentList = list;
    }

    /** 
     * Get the 'ContractDetails' element value. Реквизиты договора
     * 
     * @return value
     */
    public DocumentBaseType getContractDetails() {
        return contractDetails;
    }

    /** 
     * Set the 'ContractDetails' element value. Реквизиты договора
     * 
     * @param contractDetails
     */
    public void setContractDetails(DocumentBaseType contractDetails) {
        this.contractDetails = contractDetails;
    }

    /** 
     * Get the 'Insurance' element value. Страховой полис
     * 
     * @return value
     */
    public DocumentBaseType getInsurance() {
        return insurance;
    }

    /** 
     * Set the 'Insurance' element value. Страховой полис
     * 
     * @param insurance
     */
    public void setInsurance(DocumentBaseType insurance) {
        this.insurance = insurance;
    }

    /** 
     * Get the 'ServiceConsumer' element value. Клиент (страхователь/заказчик)
     * 
     * @return value
     */
    public CUOrganizationType getServiceConsumer() {
        return serviceConsumer;
    }

    /** 
     * Set the 'ServiceConsumer' element value. Клиент (страхователь/заказчик)
     * 
     * @param serviceConsumer
     */
    public void setServiceConsumer(CUOrganizationType serviceConsumer) {
        this.serviceConsumer = serviceConsumer;
    }

    /** 
     * Get the list of 'ServiceDescription' element items. Описание выполненных работ, оказанных услуг
     * 
     * @return list
     */
    public List<ServiceDescriptionType> getServiceDescriptionList() {
        return serviceDescriptionList;
    }

    /** 
     * Set the list of 'ServiceDescription' element items. Описание выполненных работ, оказанных услуг
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
     * Get the 'IndividualEntrepreneur' element value. Индивидуальный предприниматель
     * 
     * @return value
     */
    public PersonSignatureType getIndividualEntrepreneur() {
        return individualEntrepreneur;
    }

    /** 
     * Set the 'IndividualEntrepreneur' element value. Индивидуальный предприниматель
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
     * Get the 'SignatureDirectorChiefAccountant' element value. Подпись руководителя организации и главного бухгалтера.
     * 
     * @return value
     */
    public SignatureDirectorChiefAccountantType getSignatureDirectorChiefAccountant() {
        return signatureDirectorChiefAccountant;
    }

    /** 
     * Set the 'SignatureDirectorChiefAccountant' element value. Подпись руководителя организации и главного бухгалтера.
     * 
     * @param signatureDirectorChiefAccountant
     */
    public void setSignatureDirectorChiefAccountant(
            SignatureDirectorChiefAccountantType signatureDirectorChiefAccountant) {
        setChoiceSelect(SIGNATURE_DIRECTOR_CHIEF_ACCOUNTANT_CHOICE);
        this.signatureDirectorChiefAccountant = signatureDirectorChiefAccountant;
    }

    /** 
     * Get the 'Registration' element value. Регистрационные данные счета-фактуры
     * 
     * @return value
     */
    public DocumentBaseType getRegistration() {
        return registration;
    }

    /** 
     * Set the 'Registration' element value. Регистрационные данные счета-фактуры
     * 
     * @param registration
     */
    public void setRegistration(DocumentBaseType registration) {
        this.registration = registration;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
