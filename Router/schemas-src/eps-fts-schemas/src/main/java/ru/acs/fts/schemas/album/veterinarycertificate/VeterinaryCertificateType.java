
package ru.acs.fts.schemas.album.veterinarycertificate;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ������������ ����������
 */
public class VeterinaryCertificateType extends BaseDocType
{
    private List<String> specialNoteList = new ArrayList<String>();
    private LocalDate dateCertf;
    private String numberForm;
    private String route;
    private String productOrigin;
    private LocalDate dateManufactur;
    private String deemedFit;
    private String causeRestrictions;
    private String examination;
    private String importingCountry;
    private String reasonSending;
    private String locationCU;
    private String timeLocation;
    private String borderOffice;
    private String exportTerrAuthority;
    private OrganizationBaseType issueOrganization;
    private List<ProductInfoType> productInfoList = new ArrayList<ProductInfoType>();
    private ManufacturerType manufacturer;
    private OrganizationType sender;
    private LocationType location;
    private OrganizationType receiver;
    private DocumentBaseType shippingDocuments;
    private QuarantineType quarantine;
    private List<ResearchLaboratoryType> researchLaboratoryList = new ArrayList<ResearchLaboratoryType>();
    private List<ProcessingType> immunizationList = new ArrayList<ProcessingType>();
    private List<ProcessingType> processingParasiteList = new ArrayList<ProcessingType>();
    private PersonSignatureType personSignature;
    private List<MarkInspectionType> markInspectionList = new ArrayList<MarkInspectionType>();
    private List<TransportInfoType> transportInfoList = new ArrayList<TransportInfoType>();
    private WellBeingInfoType wellBeingInfo;
    private RegistrationInfoType registrationInfo;
    private String documentModeID;

    /** 
     * Get the list of 'SpecialNotes' element items. ������ �������
     * 
     * @return list
     */
    public List<String> getSpecialNoteList() {
        return specialNoteList;
    }

    /** 
     * Set the list of 'SpecialNotes' element items. ������ �������
     * 
     * @param list
     */
    public void setSpecialNoteList(List<String> list) {
        specialNoteList = list;
    }

    /** 
     * Get the 'DateCertf' element value. ���� ����������� �����������
     * 
     * @return value
     */
    public LocalDate getDateCertf() {
        return dateCertf;
    }

    /** 
     * Set the 'DateCertf' element value. ���� ����������� �����������
     * 
     * @param dateCertf
     */
    public void setDateCertf(LocalDate dateCertf) {
        this.dateCertf = dateCertf;
    }

    /** 
     * Get the 'NumberForm' element value. ����� ����� 
     * 
     * @return value
     */
    public String getNumberForm() {
        return numberForm;
    }

    /** 
     * Set the 'NumberForm' element value. ����� ����� 
     * 
     * @param numberForm
     */
    public void setNumberForm(String numberForm) {
        this.numberForm = numberForm;
    }

    /** 
     * Get the 'Route' element value. ������� ����������
     * 
     * @return value
     */
    public String getRoute() {
        return route;
    }

    /** 
     * Set the 'Route' element value. ������� ����������
     * 
     * @param route
     */
    public void setRoute(String route) {
        this.route = route;
    }

    /** 
     * Get the 'ProductOrigin' element value. ������������� ��������� (������ �������������)
     * 
     * @return value
     */
    public String getProductOrigin() {
        return productOrigin;
    }

    /** 
     * Set the 'ProductOrigin' element value. ������������� ��������� (������ �������������)
     * 
     * @param productOrigin
     */
    public void setProductOrigin(String productOrigin) {
        this.productOrigin = productOrigin;
    }

    /** 
     * Get the 'DateManufactur' element value. ���� ���������
     * 
     * @return value
     */
    public LocalDate getDateManufactur() {
        return dateManufactur;
    }

    /** 
     * Set the 'DateManufactur' element value. ���� ���������
     * 
     * @param dateManufactur
     */
    public void setDateManufactur(LocalDate dateManufactur) {
        this.dateManufactur = dateManufactur;
    }

    /** 
     * Get the 'DeemedFit' element value. �������� ������ ��� : 1- ���������� ��� �����������; 2- ���������� � ������������; 3- �����������; 4-  ������������� ��� �����������; 5 - ������������� � ������������
     * 
     * @return value
     */
    public String getDeemedFit() {
        return deemedFit;
    }

    /** 
     * Set the 'DeemedFit' element value. �������� ������ ��� : 1- ���������� ��� �����������; 2- ���������� � ������������; 3- �����������; 4-  ������������� ��� �����������; 5 - ������������� � ������������
     * 
     * @param deemedFit
     */
    public void setDeemedFit(String deemedFit) {
        this.deemedFit = deemedFit;
    }

    /** 
     * Get the 'CauseRestrictions' element value. ������� ����������� ��� ���������� ��� �������������
     * 
     * @return value
     */
    public String getCauseRestrictions() {
        return causeRestrictions;
    }

    /** 
     * Set the 'CauseRestrictions' element value. ������� ����������� ��� ���������� ��� �������������
     * 
     * @param causeRestrictions
     */
    public void setCauseRestrictions(String causeRestrictions) {
        this.causeRestrictions = causeRestrictions;
    }

    /** 
     * Get the 'Examination' element value. ���������� ����������: 0 - ����������� �����������-���������� ���������� � ������ ������, 1 - ����������� �� �����, ���������� �����������-���������� ����������
     * 
     * @return value
     */
    public String getExamination() {
        return examination;
    }

    /** 
     * Set the 'Examination' element value. ���������� ����������: 0 - ����������� �����������-���������� ���������� � ������ ������, 1 - ����������� �� �����, ���������� �����������-���������� ����������
     * 
     * @param examination
     */
    public void setExamination(String examination) {
        this.examination = examination;
    }

    /** 
     * Get the 'ImportingCountry' element value. ������ - ��������
     * 
     * @return value
     */
    public String getImportingCountry() {
        return importingCountry;
    }

    /** 
     * Set the 'ImportingCountry' element value. ������ - ��������
     * 
     * @param importingCountry
     */
    public void setImportingCountry(String importingCountry) {
        this.importingCountry = importingCountry;
    }

    /** 
     * Get the 'ReasonSending' element value. �������� � ������� �������� �������� (��� �������, ����������, ���� � �.�)
     * 
     * @return value
     */
    public String getReasonSending() {
        return reasonSending;
    }

    /** 
     * Set the 'ReasonSending' element value. �������� � ������� �������� �������� (��� �������, ����������, ���� � �.�)
     * 
     * @param reasonSending
     */
    public void setReasonSending(String reasonSending) {
        this.reasonSending = reasonSending;
    }

    /** 
     * Get the 'LocationCU' element value. �������� ���������� �� ���������� ��: 1- � ��������, 2- �� ����� 6 �������, 3 - ����� 6 �������
     * 
     * @return value
     */
    public String getLocationCU() {
        return locationCU;
    }

    /** 
     * Set the 'LocationCU' element value. �������� ���������� �� ���������� ��: 1- � ��������, 2- �� ����� 6 �������, 3 - ����� 6 �������
     * 
     * @param locationCU
     */
    public void setLocationCU(String locationCU) {
        this.locationCU = locationCU;
    }

    /** 
     * Get the 'TimeLocation' element value. ����� ���������� � �������
     * 
     * @return value
     */
    public String getTimeLocation() {
        return timeLocation;
    }

    /** 
     * Set the 'TimeLocation' element value. ����� ���������� � �������
     * 
     * @param timeLocation
     */
    public void setTimeLocation(String timeLocation) {
        this.timeLocation = timeLocation;
    }

    /** 
     * Get the 'BorderOffice' element value. ����� �������� ����� ���������� �������
     * 
     * @return value
     */
    public String getBorderOffice() {
        return borderOffice;
    }

    /** 
     * Set the 'BorderOffice' element value. ����� �������� ����� ���������� �������
     * 
     * @param borderOffice
     */
    public void setBorderOffice(String borderOffice) {
        this.borderOffice = borderOffice;
    }

    /** 
     * Get the 'ExportTerrAuthority' element value. ���������������-��������������� ������� ������-����������
     * 
     * @return value
     */
    public String getExportTerrAuthority() {
        return exportTerrAuthority;
    }

    /** 
     * Set the 'ExportTerrAuthority' element value. ���������������-��������������� ������� ������-����������
     * 
     * @param exportTerrAuthority
     */
    public void setExportTerrAuthority(String exportTerrAuthority) {
        this.exportTerrAuthority = exportTerrAuthority;
    }

    /** 
     * Get the 'IssueOrganization' element value. ������������ ������������ ���� ��� �.�.�. ����������� ����, �������� ������ ����������
     * 
     * @return value
     */
    public OrganizationBaseType getIssueOrganization() {
        return issueOrganization;
    }

    /** 
     * Set the 'IssueOrganization' element value. ������������ ������������ ���� ��� �.�.�. ����������� ����, �������� ������ ����������
     * 
     * @param issueOrganization
     */
    public void setIssueOrganization(OrganizationBaseType issueOrganization) {
        this.issueOrganization = issueOrganization;
    }

    /** 
     * Get the list of 'ProductInfo' element items. �������� � ���������/��������
     * 
     * @return list
     */
    public List<ProductInfoType> getProductInfoList() {
        return productInfoList;
    }

    /** 
     * Set the list of 'ProductInfo' element items. �������� � ���������/��������
     * 
     * @param list
     */
    public void setProductInfoList(List<ProductInfoType> list) {
        productInfoList = list;
    }

    /** 
     * Get the 'Manufacturer' element value. ������������� ���������
     * 
     * @return value
     */
    public ManufacturerType getManufacturer() {
        return manufacturer;
    }

    /** 
     * Set the 'Manufacturer' element value. ������������� ���������
     * 
     * @param manufacturer
     */
    public void setManufacturer(ManufacturerType manufacturer) {
        this.manufacturer = manufacturer;
    }

    /** 
     * Get the 'Sender' element value. �����������
     * 
     * @return value
     */
    public OrganizationType getSender() {
        return sender;
    }

    /** 
     * Set the 'Sender' element value. �����������
     * 
     * @param sender
     */
    public void setSender(OrganizationType sender) {
        this.sender = sender;
    }

    /** 
     * Get the 'Location' element value. ��������������� ���������/���������/����� ����������� �����������
     * 
     * @return value
     */
    public LocationType getLocation() {
        return location;
    }

    /** 
     * Set the 'Location' element value. ��������������� ���������/���������/����� ����������� �����������
     * 
     * @param location
     */
    public void setLocation(LocationType location) {
        this.location = location;
    }

    /** 
     * Get the 'Receiver' element value. ����������
     * 
     * @return value
     */
    public OrganizationType getReceiver() {
        return receiver;
    }

    /** 
     * Set the 'Receiver' element value. ����������
     * 
     * @param receiver
     */
    public void setReceiver(OrganizationType receiver) {
        this.receiver = receiver;
    }

    /** 
     * Get the 'ShippingDocuments' element value. ������������ ���������
     * 
     * @return value
     */
    public DocumentBaseType getShippingDocuments() {
        return shippingDocuments;
    }

    /** 
     * Set the 'ShippingDocuments' element value. ������������ ���������
     * 
     * @param shippingDocuments
     */
    public void setShippingDocuments(DocumentBaseType shippingDocuments) {
        this.shippingDocuments = shippingDocuments;
    }

    /** 
     * Get the 'Quarantine' element value. ����������������
     * 
     * @return value
     */
    public QuarantineType getQuarantine() {
        return quarantine;
    }

    /** 
     * Set the 'Quarantine' element value. ����������������
     * 
     * @param quarantine
     */
    public void setQuarantine(QuarantineType quarantine) {
        this.quarantine = quarantine;
    }

    /** 
     * Get the list of 'ResearchLaboratory' element items. ������������ � �����������
     * 
     * @return list
     */
    public List<ResearchLaboratoryType> getResearchLaboratoryList() {
        return researchLaboratoryList;
    }

    /** 
     * Set the list of 'ResearchLaboratory' element items. ������������ � �����������
     * 
     * @param list
     */
    public void setResearchLaboratoryList(List<ResearchLaboratoryType> list) {
        researchLaboratoryList = list;
    }

    /** 
     * Get the list of 'Immunization' element items. �����������
     * 
     * @return list
     */
    public List<ProcessingType> getImmunizationList() {
        return immunizationList;
    }

    /** 
     * Set the list of 'Immunization' element items. �����������
     * 
     * @param list
     */
    public void setImmunizationList(List<ProcessingType> list) {
        immunizationList = list;
    }

    /** 
     * Get the list of 'ProcessingParasites' element items. ��������� ������ ���������
     * 
     * @return list
     */
    public List<ProcessingType> getProcessingParasiteList() {
        return processingParasiteList;
    }

    /** 
     * Set the list of 'ProcessingParasites' element items. ��������� ������ ���������
     * 
     * @param list
     */
    public void setProcessingParasiteList(List<ProcessingType> list) {
        processingParasiteList = list;
    }

    /** 
     * Get the 'PersonSignature' element value. ������� ����, ��������� ����������
     * 
     * @return value
     */
    public PersonSignatureType getPersonSignature() {
        return personSignature;
    }

    /** 
     * Set the 'PersonSignature' element value. ������� ����, ��������� ����������
     * 
     * @param personSignature
     */
    public void setPersonSignature(PersonSignatureType personSignature) {
        this.personSignature = personSignature;
    }

    /** 
     * Get the list of 'MarkInspection' element items. ������� � �����������-���������� ������� ��� ��������, � ���� ���������� � �� ����� ����������
     * 
     * @return list
     */
    public List<MarkInspectionType> getMarkInspectionList() {
        return markInspectionList;
    }

    /** 
     * Set the list of 'MarkInspection' element items. ������� � �����������-���������� ������� ��� ��������, � ���� ���������� � �� ����� ����������
     * 
     * @param list
     */
    public void setMarkInspectionList(List<MarkInspectionType> list) {
        markInspectionList = list;
    }

    /** 
     * Get the list of 'TransportInfo' element items. �������� � ����������
     * 
     * @return list
     */
    public List<TransportInfoType> getTransportInfoList() {
        return transportInfoList;
    }

    /** 
     * Set the list of 'TransportInfo' element items. �������� � ����������
     * 
     * @param list
     */
    public void setTransportInfoList(List<TransportInfoType> list) {
        transportInfoList = list;
    }

    /** 
     * Get the 'WellBeingInfo' element value. �������� � ������������ (���������, ���������)
     * 
     * @return value
     */
    public WellBeingInfoType getWellBeingInfo() {
        return wellBeingInfo;
    }

    /** 
     * Set the 'WellBeingInfo' element value. �������� � ������������ (���������, ���������)
     * 
     * @param wellBeingInfo
     */
    public void setWellBeingInfo(WellBeingInfoType wellBeingInfo) {
        this.wellBeingInfo = wellBeingInfo;
    }

    /** 
     * Get the 'RegistrationInfo' element value. �������� � �����������
     * 
     * @return value
     */
    public RegistrationInfoType getRegistrationInfo() {
        return registrationInfo;
    }

    /** 
     * Set the 'RegistrationInfo' element value. �������� � �����������
     * 
     * @param registrationInfo
     */
    public void setRegistrationInfo(RegistrationInfoType registrationInfo) {
        this.registrationInfo = registrationInfo;
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
