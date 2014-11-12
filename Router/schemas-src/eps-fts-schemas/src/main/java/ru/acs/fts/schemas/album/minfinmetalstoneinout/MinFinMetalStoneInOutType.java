
package ru.acs.fts.schemas.album.minfinmetalstoneinout;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Ответ на запрос сведений о документах государственного контроля, оформляемого при ввозе и вывозе драгоценных камней, и оценки стоимости товаров, содержащих драгоценные металлы и драгоценные камни, ввозимых(вывозимых) на(с) территорию(ии) государства - члена Таможенного союза
 */
public class MinFinMetalStoneInOutType extends BaseDocType
{
    private String isCanceled;
    private String BDRDID;
    private String docSign;
    private String controlResult;
    private LocalDate controlDate;
    private String totalPrice;
    private String totalWeight;
    private String placeCount;
    private DocumentBaseType act;
    private DocumentBaseType contract;
    private DocumentBaseType license;
    private DocumentBaseType certificate;
    private DocumentBaseType specification;
    private DocumentBaseType invoice;
    private ProductDescriptionType productDescription;
    private CUOrganizationType ownerOrg;
    private CUOrganizationType exporter;
    private CUOrganizationType importer;
    private CUOrganizationType cargoHandler;
    private CUOrganizationType controlOrganization;
    private String documentModeID;

    /** 
     * Get the 'IsCanceled' element value. Признак прекращения действия документа
     * 
     * @return value
     */
    public String getIsCanceled() {
        return isCanceled;
    }

    /** 
     * Set the 'IsCanceled' element value. Признак прекращения действия документа
     * 
     * @param isCanceled
     */
    public void setIsCanceled(String isCanceled) {
        this.isCanceled = isCanceled;
    }

    /** 
     * Get the 'BDRDID' element value. Идентификатор документа по БД РД
     * 
     * @return value
     */
    public String getBDRDID() {
        return BDRDID;
    }

    /** 
     * Set the 'BDRDID' element value. Идентификатор документа по БД РД
     * 
     * @param BDRDID
     */
    public void setBDRDID(String BDRDID) {
        this.BDRDID = BDRDID;
    }

    /** 
     * Get the 'DocSign' element value. Признак документа: 1 - госконтроль и оценка стоимости драгоценных металлов, экспортируемых из Таможенного союза; 2 - госконтроль, оформляемый при ввозе и вывозе драгоценных камней; 3 - госконтроль и оценка стоимости товаров, содержащих драгоценные металлы и драгоценные камни, вывозимых с территории государства - члена Таможенного союза ; 4 - госконтроль товаров, содержащих драгоценные металлы и драгоценные камни, ввозимых на территорию государства - члена Таможенного союза
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. Признак документа: 1 - госконтроль и оценка стоимости драгоценных металлов, экспортируемых из Таможенного союза; 2 - госконтроль, оформляемый при ввозе и вывозе драгоценных камней; 3 - госконтроль и оценка стоимости товаров, содержащих драгоценные металлы и драгоценные камни, вывозимых с территории государства - члена Таможенного союза ; 4 - госконтроль товаров, содержащих драгоценные металлы и драгоценные камни, ввозимых на территорию государства - члена Таможенного союза
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'ControlResult' element value. Результаты государственного контроля
     * 
     * @return value
     */
    public String getControlResult() {
        return controlResult;
    }

    /** 
     * Set the 'ControlResult' element value. Результаты государственного контроля
     * 
     * @param controlResult
     */
    public void setControlResult(String controlResult) {
        this.controlResult = controlResult;
    }

    /** 
     * Get the 'ControlDate' element value. Дата проведения госконтроля
     * 
     * @return value
     */
    public LocalDate getControlDate() {
        return controlDate;
    }

    /** 
     * Set the 'ControlDate' element value. Дата проведения госконтроля
     * 
     * @param controlDate
     */
    public void setControlDate(LocalDate controlDate) {
        this.controlDate = controlDate;
    }

    /** 
     * Get the 'TotalPrice' element value. Стоимость партии
     * 
     * @return value
     */
    public String getTotalPrice() {
        return totalPrice;
    }

    /** 
     * Set the 'TotalPrice' element value. Стоимость партии
     * 
     * @param totalPrice
     */
    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    /** 
     * Get the 'TotalWeight' element value. Общая масса партии
     * 
     * @return value
     */
    public String getTotalWeight() {
        return totalWeight;
    }

    /** 
     * Set the 'TotalWeight' element value. Общая масса партии
     * 
     * @param totalWeight
     */
    public void setTotalWeight(String totalWeight) {
        this.totalWeight = totalWeight;
    }

    /** 
     * Get the 'PlaceCount' element value. Количество мест
     * 
     * @return value
     */
    public String getPlaceCount() {
        return placeCount;
    }

    /** 
     * Set the 'PlaceCount' element value. Количество мест
     * 
     * @param placeCount
     */
    public void setPlaceCount(String placeCount) {
        this.placeCount = placeCount;
    }

    /** 
     * Get the 'Act' element value. Акт государственного контроля
     * 
     * @return value
     */
    public DocumentBaseType getAct() {
        return act;
    }

    /** 
     * Set the 'Act' element value. Акт государственного контроля
     * 
     * @param act
     */
    public void setAct(DocumentBaseType act) {
        this.act = act;
    }

    /** 
     * Get the 'Contract' element value. Контракт
     * 
     * @return value
     */
    public DocumentBaseType getContract() {
        return contract;
    }

    /** 
     * Set the 'Contract' element value. Контракт
     * 
     * @param contract
     */
    public void setContract(DocumentBaseType contract) {
        this.contract = contract;
    }

    /** 
     * Get the 'License' element value. Лицензия
     * 
     * @return value
     */
    public DocumentBaseType getLicense() {
        return license;
    }

    /** 
     * Set the 'License' element value. Лицензия
     * 
     * @param license
     */
    public void setLicense(DocumentBaseType license) {
        this.license = license;
    }

    /** 
     * Get the 'Certificate' element value. Сертификат
     * 
     * @return value
     */
    public DocumentBaseType getCertificate() {
        return certificate;
    }

    /** 
     * Set the 'Certificate' element value. Сертификат
     * 
     * @param certificate
     */
    public void setCertificate(DocumentBaseType certificate) {
        this.certificate = certificate;
    }

    /** 
     * Get the 'Specification' element value. Спецификация
     * 
     * @return value
     */
    public DocumentBaseType getSpecification() {
        return specification;
    }

    /** 
     * Set the 'Specification' element value. Спецификация
     * 
     * @param specification
     */
    public void setSpecification(DocumentBaseType specification) {
        this.specification = specification;
    }

    /** 
     * Get the 'Invoice' element value. Инвойс
     * 
     * @return value
     */
    public DocumentBaseType getInvoice() {
        return invoice;
    }

    /** 
     * Set the 'Invoice' element value. Инвойс
     * 
     * @param invoice
     */
    public void setInvoice(DocumentBaseType invoice) {
        this.invoice = invoice;
    }

    /** 
     * Get the 'ProductDescription' element value. Описание товара
     * 
     * @return value
     */
    public ProductDescriptionType getProductDescription() {
        return productDescription;
    }

    /** 
     * Set the 'ProductDescription' element value. Описание товара
     * 
     * @param productDescription
     */
    public void setProductDescription(ProductDescriptionType productDescription) {
        this.productDescription = productDescription;
    }

    /** 
     * Get the 'OwnerOrg' element value. Собственник
     * 
     * @return value
     */
    public CUOrganizationType getOwnerOrg() {
        return ownerOrg;
    }

    /** 
     * Set the 'OwnerOrg' element value. Собственник
     * 
     * @param ownerOrg
     */
    public void setOwnerOrg(CUOrganizationType ownerOrg) {
        this.ownerOrg = ownerOrg;
    }

    /** 
     * Get the 'Exporter' element value. Организация-экспортер
     * 
     * @return value
     */
    public CUOrganizationType getExporter() {
        return exporter;
    }

    /** 
     * Set the 'Exporter' element value. Организация-экспортер
     * 
     * @param exporter
     */
    public void setExporter(CUOrganizationType exporter) {
        this.exporter = exporter;
    }

    /** 
     * Get the 'Importer' element value. Организация-импортер
     * 
     * @return value
     */
    public CUOrganizationType getImporter() {
        return importer;
    }

    /** 
     * Set the 'Importer' element value. Организация-импортер
     * 
     * @param importer
     */
    public void setImporter(CUOrganizationType importer) {
        this.importer = importer;
    }

    /** 
     * Get the 'CargoHandler' element value. Грузополучатель (грузоотправитель)
     * 
     * @return value
     */
    public CUOrganizationType getCargoHandler() {
        return cargoHandler;
    }

    /** 
     * Set the 'CargoHandler' element value. Грузополучатель (грузоотправитель)
     * 
     * @param cargoHandler
     */
    public void setCargoHandler(CUOrganizationType cargoHandler) {
        this.cargoHandler = cargoHandler;
    }

    /** 
     * Get the 'ControlOrganization' element value. Наименование организации госконтроля
     * 
     * @return value
     */
    public CUOrganizationType getControlOrganization() {
        return controlOrganization;
    }

    /** 
     * Set the 'ControlOrganization' element value. Наименование организации госконтроля
     * 
     * @param controlOrganization
     */
    public void setControlOrganization(CUOrganizationType controlOrganization) {
        this.controlOrganization = controlOrganization;
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
