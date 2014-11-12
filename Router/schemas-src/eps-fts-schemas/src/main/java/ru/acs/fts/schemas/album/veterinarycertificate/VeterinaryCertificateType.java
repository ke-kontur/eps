
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
 * Ветеринарный сертификат
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
     * Get the list of 'SpecialNotes' element items. Особые отметки
     * 
     * @return list
     */
    public List<String> getSpecialNoteList() {
        return specialNoteList;
    }

    /** 
     * Set the list of 'SpecialNotes' element items. Особые отметки
     * 
     * @param list
     */
    public void setSpecialNoteList(List<String> list) {
        specialNoteList = list;
    }

    /** 
     * Get the 'DateCertf' element value. Дата составления сертификата
     * 
     * @return value
     */
    public LocalDate getDateCertf() {
        return dateCertf;
    }

    /** 
     * Set the 'DateCertf' element value. Дата составления сертификата
     * 
     * @param dateCertf
     */
    public void setDateCertf(LocalDate dateCertf) {
        this.dateCertf = dateCertf;
    }

    /** 
     * Get the 'NumberForm' element value. Номер формы 
     * 
     * @return value
     */
    public String getNumberForm() {
        return numberForm;
    }

    /** 
     * Set the 'NumberForm' element value. Номер формы 
     * 
     * @param numberForm
     */
    public void setNumberForm(String numberForm) {
        this.numberForm = numberForm;
    }

    /** 
     * Get the 'Route' element value. Маршрут следования
     * 
     * @return value
     */
    public String getRoute() {
        return route;
    }

    /** 
     * Set the 'Route' element value. Маршрут следования
     * 
     * @param route
     */
    public void setRoute(String route) {
        this.route = route;
    }

    /** 
     * Get the 'ProductOrigin' element value. Происхождение продукции (Страна происхождения)
     * 
     * @return value
     */
    public String getProductOrigin() {
        return productOrigin;
    }

    /** 
     * Set the 'ProductOrigin' element value. Происхождение продукции (Страна происхождения)
     * 
     * @param productOrigin
     */
    public void setProductOrigin(String productOrigin) {
        this.productOrigin = productOrigin;
    }

    /** 
     * Get the 'DateManufactur' element value. Дата выработки
     * 
     * @return value
     */
    public LocalDate getDateManufactur() {
        return dateManufactur;
    }

    /** 
     * Set the 'DateManufactur' element value. Дата выработки
     * 
     * @param dateManufactur
     */
    public void setDateManufactur(LocalDate dateManufactur) {
        this.dateManufactur = dateManufactur;
    }

    /** 
     * Get the 'DeemedFit' element value. Признано годным для : 1- реализации без ограничений; 2- реализации с ограничением; 3- переработки; 4-  использование без ограничений; 5 - использование с ограничением
     * 
     * @return value
     */
    public String getDeemedFit() {
        return deemedFit;
    }

    /** 
     * Set the 'DeemedFit' element value. Признано годным для : 1- реализации без ограничений; 2- реализации с ограничением; 3- переработки; 4-  использование без ограничений; 5 - использование с ограничением
     * 
     * @param deemedFit
     */
    public void setDeemedFit(String deemedFit) {
        this.deemedFit = deemedFit;
    }

    /** 
     * Get the 'CauseRestrictions' element value. Причина ограничения при реализации или использовании
     * 
     * @return value
     */
    public String getCauseRestrictions() {
        return causeRestrictions;
    }

    /** 
     * Set the 'CauseRestrictions' element value. Причина ограничения при реализации или использовании
     * 
     * @param causeRestrictions
     */
    public void setCauseRestrictions(String causeRestrictions) {
        this.causeRestrictions = causeRestrictions;
    }

    /** 
     * Get the 'Examination' element value. Проведение экспертизы: 0 - подвергнута ветеринарно-санитарной экспертизе в полном объеме, 1 - изготовлена из сырья, прошедшего ветеринарно-санитарную экспертизу
     * 
     * @return value
     */
    public String getExamination() {
        return examination;
    }

    /** 
     * Set the 'Examination' element value. Проведение экспертизы: 0 - подвергнута ветеринарно-санитарной экспертизе в полном объеме, 1 - изготовлена из сырья, прошедшего ветеринарно-санитарную экспертизу
     * 
     * @param examination
     */
    public void setExamination(String examination) {
        this.examination = examination;
    }

    /** 
     * Get the 'ImportingCountry' element value. Страна - импортер
     * 
     * @return value
     */
    public String getImportingCountry() {
        return importingCountry;
    }

    /** 
     * Set the 'ImportingCountry' element value. Страна - импортер
     * 
     * @param importingCountry
     */
    public void setImportingCountry(String importingCountry) {
        this.importingCountry = importingCountry;
    }

    /** 
     * Get the 'ReasonSending' element value. Сведения о причине отправки животных (для откорма, разведения, убоя и т.д)
     * 
     * @return value
     */
    public String getReasonSending() {
        return reasonSending;
    }

    /** 
     * Set the 'ReasonSending' element value. Сведения о причине отправки животных (для откорма, разведения, убоя и т.д)
     * 
     * @param reasonSending
     */
    public void setReasonSending(String reasonSending) {
        this.reasonSending = reasonSending;
    }

    /** 
     * Get the 'LocationCU' element value. Животные находились на територрии ТС: 1- с рождения, 2- не менее 6 месяцев, 3 - более 6 месяцев
     * 
     * @return value
     */
    public String getLocationCU() {
        return locationCU;
    }

    /** 
     * Set the 'LocationCU' element value. Животные находились на територрии ТС: 1- с рождения, 2- не менее 6 месяцев, 3 - более 6 месяцев
     * 
     * @param locationCU
     */
    public void setLocationCU(String locationCU) {
        this.locationCU = locationCU;
    }

    /** 
     * Get the 'TimeLocation' element value. Время нахождения в месяцах
     * 
     * @return value
     */
    public String getTimeLocation() {
        return timeLocation;
    }

    /** 
     * Set the 'TimeLocation' element value. Время нахождения в месяцах
     * 
     * @param timeLocation
     */
    public void setTimeLocation(String timeLocation) {
        this.timeLocation = timeLocation;
    }

    /** 
     * Get the 'BorderOffice' element value. Пункт пропуска через таможенную границу
     * 
     * @return value
     */
    public String getBorderOffice() {
        return borderOffice;
    }

    /** 
     * Set the 'BorderOffice' element value. Пункт пропуска через таможенную границу
     * 
     * @param borderOffice
     */
    public void setBorderOffice(String borderOffice) {
        this.borderOffice = borderOffice;
    }

    /** 
     * Get the 'ExportTerrAuthority' element value. Административно-территориальная единица страны-экспортера
     * 
     * @return value
     */
    public String getExportTerrAuthority() {
        return exportTerrAuthority;
    }

    /** 
     * Set the 'ExportTerrAuthority' element value. Административно-территориальная единица страны-экспортера
     * 
     * @param exportTerrAuthority
     */
    public void setExportTerrAuthority(String exportTerrAuthority) {
        this.exportTerrAuthority = exportTerrAuthority;
    }

    /** 
     * Get the 'IssueOrganization' element value. Наименование юридического лица или ф.и.о. физического лица, которому выдали сертификат
     * 
     * @return value
     */
    public OrganizationBaseType getIssueOrganization() {
        return issueOrganization;
    }

    /** 
     * Set the 'IssueOrganization' element value. Наименование юридического лица или ф.и.о. физического лица, которому выдали сертификат
     * 
     * @param issueOrganization
     */
    public void setIssueOrganization(OrganizationBaseType issueOrganization) {
        this.issueOrganization = issueOrganization;
    }

    /** 
     * Get the list of 'ProductInfo' element items. Сведения о продукции/животном
     * 
     * @return list
     */
    public List<ProductInfoType> getProductInfoList() {
        return productInfoList;
    }

    /** 
     * Set the list of 'ProductInfo' element items. Сведения о продукции/животном
     * 
     * @param list
     */
    public void setProductInfoList(List<ProductInfoType> list) {
        productInfoList = list;
    }

    /** 
     * Get the 'Manufacturer' element value. Производитель продукции
     * 
     * @return value
     */
    public ManufacturerType getManufacturer() {
        return manufacturer;
    }

    /** 
     * Set the 'Manufacturer' element value. Производитель продукции
     * 
     * @param manufacturer
     */
    public void setManufacturer(ManufacturerType manufacturer) {
        this.manufacturer = manufacturer;
    }

    /** 
     * Get the 'Sender' element value. Отправитель
     * 
     * @return value
     */
    public OrganizationType getSender() {
        return sender;
    }

    /** 
     * Set the 'Sender' element value. Отправитель
     * 
     * @param sender
     */
    public void setSender(OrganizationType sender) {
        this.sender = sender;
    }

    /** 
     * Get the 'Location' element value. Местонахождение продукции/животного/Место составления сертификата
     * 
     * @return value
     */
    public LocationType getLocation() {
        return location;
    }

    /** 
     * Set the 'Location' element value. Местонахождение продукции/животного/Место составления сертификата
     * 
     * @param location
     */
    public void setLocation(LocationType location) {
        this.location = location;
    }

    /** 
     * Get the 'Receiver' element value. Получатель
     * 
     * @return value
     */
    public OrganizationType getReceiver() {
        return receiver;
    }

    /** 
     * Set the 'Receiver' element value. Получатель
     * 
     * @param receiver
     */
    public void setReceiver(OrganizationType receiver) {
        this.receiver = receiver;
    }

    /** 
     * Get the 'ShippingDocuments' element value. Транспортные документы
     * 
     * @return value
     */
    public DocumentBaseType getShippingDocuments() {
        return shippingDocuments;
    }

    /** 
     * Set the 'ShippingDocuments' element value. Транспортные документы
     * 
     * @param shippingDocuments
     */
    public void setShippingDocuments(DocumentBaseType shippingDocuments) {
        this.shippingDocuments = shippingDocuments;
    }

    /** 
     * Get the 'Quarantine' element value. Карантинирование
     * 
     * @return value
     */
    public QuarantineType getQuarantine() {
        return quarantine;
    }

    /** 
     * Set the 'Quarantine' element value. Карантинирование
     * 
     * @param quarantine
     */
    public void setQuarantine(QuarantineType quarantine) {
        this.quarantine = quarantine;
    }

    /** 
     * Get the list of 'ResearchLaboratory' element items. Исследование в лаборатории
     * 
     * @return list
     */
    public List<ResearchLaboratoryType> getResearchLaboratoryList() {
        return researchLaboratoryList;
    }

    /** 
     * Set the list of 'ResearchLaboratory' element items. Исследование в лаборатории
     * 
     * @param list
     */
    public void setResearchLaboratoryList(List<ResearchLaboratoryType> list) {
        researchLaboratoryList = list;
    }

    /** 
     * Get the list of 'Immunization' element items. Иммунизация
     * 
     * @return list
     */
    public List<ProcessingType> getImmunizationList() {
        return immunizationList;
    }

    /** 
     * Set the list of 'Immunization' element items. Иммунизация
     * 
     * @param list
     */
    public void setImmunizationList(List<ProcessingType> list) {
        immunizationList = list;
    }

    /** 
     * Get the list of 'ProcessingParasites' element items. Обработка против паразитов
     * 
     * @return list
     */
    public List<ProcessingType> getProcessingParasiteList() {
        return processingParasiteList;
    }

    /** 
     * Set the list of 'ProcessingParasites' element items. Обработка против паразитов
     * 
     * @param list
     */
    public void setProcessingParasiteList(List<ProcessingType> list) {
        processingParasiteList = list;
    }

    /** 
     * Get the 'PersonSignature' element value. Подпись лица, выдавшего сертификат
     * 
     * @return value
     */
    public PersonSignatureType getPersonSignature() {
        return personSignature;
    }

    /** 
     * Set the 'PersonSignature' element value. Подпись лица, выдавшего сертификат
     * 
     * @param personSignature
     */
    public void setPersonSignature(PersonSignatureType personSignature) {
        this.personSignature = personSignature;
    }

    /** 
     * Get the list of 'MarkInspection' element items. Отметки о ветеринарно-санитарном осмотре при погрузке, в пути следования и на месте назначения
     * 
     * @return list
     */
    public List<MarkInspectionType> getMarkInspectionList() {
        return markInspectionList;
    }

    /** 
     * Set the list of 'MarkInspection' element items. Отметки о ветеринарно-санитарном осмотре при погрузке, в пути следования и на месте назначения
     * 
     * @param list
     */
    public void setMarkInspectionList(List<MarkInspectionType> list) {
        markInspectionList = list;
    }

    /** 
     * Get the list of 'TransportInfo' element items. Сведения о транспорте
     * 
     * @return list
     */
    public List<TransportInfoType> getTransportInfoList() {
        return transportInfoList;
    }

    /** 
     * Set the list of 'TransportInfo' element items. Сведения о транспорте
     * 
     * @param list
     */
    public void setTransportInfoList(List<TransportInfoType> list) {
        transportInfoList = list;
    }

    /** 
     * Get the 'WellBeingInfo' element value. Сведения о благополучии (местности, хозяйства)
     * 
     * @return value
     */
    public WellBeingInfoType getWellBeingInfo() {
        return wellBeingInfo;
    }

    /** 
     * Set the 'WellBeingInfo' element value. Сведения о благополучии (местности, хозяйства)
     * 
     * @param wellBeingInfo
     */
    public void setWellBeingInfo(WellBeingInfoType wellBeingInfo) {
        this.wellBeingInfo = wellBeingInfo;
    }

    /** 
     * Get the 'RegistrationInfo' element value. Сведения о регистрации
     * 
     * @return value
     */
    public RegistrationInfoType getRegistrationInfo() {
        return registrationInfo;
    }

    /** 
     * Set the 'RegistrationInfo' element value. Сведения о регистрации
     * 
     * @param registrationInfo
     */
    public void setRegistrationInfo(RegistrationInfoType registrationInfo) {
        this.registrationInfo = registrationInfo;
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
