
package ru.acs.fts.schemas.album.customsregistrycertificate;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Свидетельство о включении в реестр уполномоченных экономических операторов/таможенных перевозчиков/владельцев СВХ/владельцев магазинов беспошлинной торговли/владельцев таможенных складов
 */
public class CustomsRegistryCertificateType extends BaseDocType
{
    private String docSign;
    private LocalDate issueDate;
    private String certificateRegNumber;
    private List<String> simplificationList = new ArrayList<String>();
    private String warehouseType;
    private String totalSquare;
    private CustomsType issueCustoms;
    private List<CustomsType> simplificOperationCustomList = new ArrayList<CustomsType>();
    private List<AmountCustomsPaymentType> guaranteeList = new ArrayList<AmountCustomsPaymentType>();
    private RegisteredOrganizationType registeredOrganization;
    private PersonBaseType chiefCustomsPerson;
    private List<GoodsOperationPlaceType> goodsOperationPlaceList = new ArrayList<GoodsOperationPlaceType>();
    private String documentModeID;

    /** 
     * Get the 'DocSign' element value. Признак свидетельства о включении в реестр: 1 - УЭО; 2 - таможенных перевозчиков; 3 - владельцев СВХ; 4 - владельцев магазинов беспошлинной торговли; 5 - владельцев таможенных складов
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. Признак свидетельства о включении в реестр: 1 - УЭО; 2 - таможенных перевозчиков; 3 - владельцев СВХ; 4 - владельцев магазинов беспошлинной торговли; 5 - владельцев таможенных складов
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'IssueDate' element value. Дата выдачи свидетельства/подписи документа
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. Дата выдачи свидетельства/подписи документа
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the 'CertificateRegNumber' element value. Регистрационный номер свидетельства
     * 
     * @return value
     */
    public String getCertificateRegNumber() {
        return certificateRegNumber;
    }

    /** 
     * Set the 'CertificateRegNumber' element value. Регистрационный номер свидетельства
     * 
     * @param certificateRegNumber
     */
    public void setCertificateRegNumber(String certificateRegNumber) {
        this.certificateRegNumber = certificateRegNumber;
    }

    /** 
     * Get the list of 'Simplification' element items. Специальное упрощение (УЭО)
     * 
     * @return list
     */
    public List<String> getSimplificationList() {
        return simplificationList;
    }

    /** 
     * Set the list of 'Simplification' element items. Специальное упрощение (УЭО)
     * 
     * @param list
     */
    public void setSimplificationList(List<String> list) {
        simplificationList = list;
    }

    /** 
     * Get the 'WarehouseType' element value. Признак того, что склад является открытым
     * 
     * @return value
     */
    public String getWarehouseType() {
        return warehouseType;
    }

    /** 
     * Set the 'WarehouseType' element value. Признак того, что склад является открытым
     * 
     * @param warehouseType
     */
    public void setWarehouseType(String warehouseType) {
        this.warehouseType = warehouseType;
    }

    /** 
     * Get the 'TotalSquare' element value. Общая площадь МБТ/склада, кв. м
     * 
     * @return value
     */
    public String getTotalSquare() {
        return totalSquare;
    }

    /** 
     * Set the 'TotalSquare' element value. Общая площадь МБТ/склада, кв. м
     * 
     * @param totalSquare
     */
    public void setTotalSquare(String totalSquare) {
        this.totalSquare = totalSquare;
    }

    /** 
     * Get the 'IssueCustoms' element value. Сведения о таможенном органе, выдавшем свидетельство
     * 
     * @return value
     */
    public CustomsType getIssueCustoms() {
        return issueCustoms;
    }

    /** 
     * Set the 'IssueCustoms' element value. Сведения о таможенном органе, выдавшем свидетельство
     * 
     * @param issueCustoms
     */
    public void setIssueCustoms(CustomsType issueCustoms) {
        this.issueCustoms = issueCustoms;
    }

    /** 
     * Get the list of 'SimplificOperationCustoms' element items. Таможенные органы, в которых могут производиться таможенные операции (УЭО)
     * 
     * @return list
     */
    public List<CustomsType> getSimplificOperationCustomList() {
        return simplificOperationCustomList;
    }

    /** 
     * Set the list of 'SimplificOperationCustoms' element items. Таможенные органы, в которых могут производиться таможенные операции (УЭО)
     * 
     * @param list
     */
    public void setSimplificOperationCustomList(List<CustomsType> list) {
        simplificOperationCustomList = list;
    }

    /** 
     * Get the list of 'Guarantee' element items. Сведения об обеспечении уплаты таможенных платежей
     * 
     * @return list
     */
    public List<AmountCustomsPaymentType> getGuaranteeList() {
        return guaranteeList;
    }

    /** 
     * Set the list of 'Guarantee' element items. Сведения об обеспечении уплаты таможенных платежей
     * 
     * @param list
     */
    public void setGuaranteeList(List<AmountCustomsPaymentType> list) {
        guaranteeList = list;
    }

    /** 
     * Get the 'RegisteredOrganization' element value. Сведения об организации, зарегистрированной в качестве УЭО/таможенного перевозчика/владельца СВХ/владельца МБТ/владельца таможенного склада
     * 
     * @return value
     */
    public RegisteredOrganizationType getRegisteredOrganization() {
        return registeredOrganization;
    }

    /** 
     * Set the 'RegisteredOrganization' element value. Сведения об организации, зарегистрированной в качестве УЭО/таможенного перевозчика/владельца СВХ/владельца МБТ/владельца таможенного склада
     * 
     * @param registeredOrganization
     */
    public void setRegisteredOrganization(
            RegisteredOrganizationType registeredOrganization) {
        this.registeredOrganization = registeredOrganization;
    }

    /** 
     * Get the 'ChiefCustomsPerson' element value. Руководитель таможенного органа
     * 
     * @return value
     */
    public PersonBaseType getChiefCustomsPerson() {
        return chiefCustomsPerson;
    }

    /** 
     * Set the 'ChiefCustomsPerson' element value. Руководитель таможенного органа
     * 
     * @param chiefCustomsPerson
     */
    public void setChiefCustomsPerson(PersonBaseType chiefCustomsPerson) {
        this.chiefCustomsPerson = chiefCustomsPerson;
    }

    /** 
     * Get the list of 'GoodsOperationPlace' element items. Характеристика местонахождения помещения, открытой площадки, иной территории
     * 
     * @return list
     */
    public List<GoodsOperationPlaceType> getGoodsOperationPlaceList() {
        return goodsOperationPlaceList;
    }

    /** 
     * Set the list of 'GoodsOperationPlace' element items. Характеристика местонахождения помещения, открытой площадки, иной территории
     * 
     * @param list
     */
    public void setGoodsOperationPlaceList(List<GoodsOperationPlaceType> list) {
        goodsOperationPlaceList = list;
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
