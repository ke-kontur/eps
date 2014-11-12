
package ru.acs.fts.schemas.album.quarantinecertificate;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;
import ru.acs.fts.schemas.album.sertifcommonaggregatetypescust.SertifOrgBaseType;

/** 
 * Карантинный сертификат
 */
public class QuarantineCertificateType extends BaseDocType
{
    private String registrationNumber;
    private LocalDate issueDate;
    private LocalDate expirationDate;
    private List<String> statusGoodsInfoList = new ArrayList<String>();
    private String regionManagement;
    private List<String> additionalActivityList = new ArrayList<String>();
    private String unloadingPlace;
    private String unloadingRegion;
    private SertifOrgBaseType subjectInfo;
    private SertifOrgBaseType declarantInfo;
    private SertifOrgBaseType receiverInfo;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private AddressSearchType addressSearch;
    private PersonSignatureType inspectorSignature;
    private List<DocumentBaseType> authorityCertificateList = new ArrayList<DocumentBaseType>();
    private String documentModeID;

    /** 
     * Get the 'RegistrationNumber' element value. Регистрационный номер
     * 
     * @return value
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /** 
     * Set the 'RegistrationNumber' element value. Регистрационный номер
     * 
     * @param registrationNumber
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /** 
     * Get the 'IssueDate' element value. Дата выдачи
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. Дата выдачи
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the 'ExpirationDate' element value. Дата окончания действия сертификата
     * 
     * @return value
     */
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    /** 
     * Set the 'ExpirationDate' element value. Дата окончания действия сертификата
     * 
     * @param expirationDate
     */
    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    /** 
     * Get the list of 'StatusGoodsInfo' element items. Сведения о состоянии товара
     * 
     * @return list
     */
    public List<String> getStatusGoodsInfoList() {
        return statusGoodsInfoList;
    }

    /** 
     * Set the list of 'StatusGoodsInfo' element items. Сведения о состоянии товара
     * 
     * @param list
     */
    public void setStatusGoodsInfoList(List<String> list) {
        statusGoodsInfoList = list;
    }

    /** 
     * Get the 'RegionManagement' element value. Республика, край, область, город
     * 
     * @return value
     */
    public String getRegionManagement() {
        return regionManagement;
    }

    /** 
     * Set the 'RegionManagement' element value. Республика, край, область, город
     * 
     * @param regionManagement
     */
    public void setRegionManagement(String regionManagement) {
        this.regionManagement = regionManagement;
    }

    /** 
     * Get the list of 'AdditionalActivities' element items. Дополнительные мероприятия
     * 
     * @return list
     */
    public List<String> getAdditionalActivityList() {
        return additionalActivityList;
    }

    /** 
     * Set the list of 'AdditionalActivities' element items. Дополнительные мероприятия
     * 
     * @param list
     */
    public void setAdditionalActivityList(List<String> list) {
        additionalActivityList = list;
    }

    /** 
     * Get the 'UnloadingPlace' element value. Наименование пункта выгрузки
     * 
     * @return value
     */
    public String getUnloadingPlace() {
        return unloadingPlace;
    }

    /** 
     * Set the 'UnloadingPlace' element value. Наименование пункта выгрузки
     * 
     * @param unloadingPlace
     */
    public void setUnloadingPlace(String unloadingPlace) {
        this.unloadingPlace = unloadingPlace;
    }

    /** 
     * Get the 'UnloadingRegion' element value. Наименование региона выгрузки
     * 
     * @return value
     */
    public String getUnloadingRegion() {
        return unloadingRegion;
    }

    /** 
     * Set the 'UnloadingRegion' element value. Наименование региона выгрузки
     * 
     * @param unloadingRegion
     */
    public void setUnloadingRegion(String unloadingRegion) {
        this.unloadingRegion = unloadingRegion;
    }

    /** 
     * Get the 'SubjectInfo' element value. Сведения о субъекте
     * 
     * @return value
     */
    public SertifOrgBaseType getSubjectInfo() {
        return subjectInfo;
    }

    /** 
     * Set the 'SubjectInfo' element value. Сведения о субъекте
     * 
     * @param subjectInfo
     */
    public void setSubjectInfo(SertifOrgBaseType subjectInfo) {
        this.subjectInfo = subjectInfo;
    }

    /** 
     * Get the 'DeclarantInfo' element value. Сведение о заявителе
     * 
     * @return value
     */
    public SertifOrgBaseType getDeclarantInfo() {
        return declarantInfo;
    }

    /** 
     * Set the 'DeclarantInfo' element value. Сведение о заявителе
     * 
     * @param declarantInfo
     */
    public void setDeclarantInfo(SertifOrgBaseType declarantInfo) {
        this.declarantInfo = declarantInfo;
    }

    /** 
     * Get the 'ReceiverInfo' element value. Сведения о получателе
     * 
     * @return value
     */
    public SertifOrgBaseType getReceiverInfo() {
        return receiverInfo;
    }

    /** 
     * Set the 'ReceiverInfo' element value. Сведения о получателе
     * 
     * @param receiverInfo
     */
    public void setReceiverInfo(SertifOrgBaseType receiverInfo) {
        this.receiverInfo = receiverInfo;
    }

    /** 
     * Get the list of 'Goods' element items. Сведения о товаре
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. Сведения о товаре
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }

    /** 
     * Get the 'AddressSearch' element value. Адрес проведения карантинного досмотра
     * 
     * @return value
     */
    public AddressSearchType getAddressSearch() {
        return addressSearch;
    }

    /** 
     * Set the 'AddressSearch' element value. Адрес проведения карантинного досмотра
     * 
     * @param addressSearch
     */
    public void setAddressSearch(AddressSearchType addressSearch) {
        this.addressSearch = addressSearch;
    }

    /** 
     * Get the 'InspectorSignature' element value. Подпись инспектора
     * 
     * @return value
     */
    public PersonSignatureType getInspectorSignature() {
        return inspectorSignature;
    }

    /** 
     * Set the 'InspectorSignature' element value. Подпись инспектора
     * 
     * @param inspectorSignature
     */
    public void setInspectorSignature(PersonSignatureType inspectorSignature) {
        this.inspectorSignature = inspectorSignature;
    }

    /** 
     * Get the list of 'AuthorityCertificate' element items. Основание выдачи сертификата 
     * 
     * @return list
     */
    public List<DocumentBaseType> getAuthorityCertificateList() {
        return authorityCertificateList;
    }

    /** 
     * Set the list of 'AuthorityCertificate' element items. Основание выдачи сертификата 
     * 
     * @param list
     */
    public void setAuthorityCertificateList(List<DocumentBaseType> list) {
        authorityCertificateList = list;
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
