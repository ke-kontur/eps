
package ru.acs.fts.schemas.album.minfinmetalstoneinout;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ����� �� ������ �������� � ���������� ���������������� ��������, ������������ ��� ����� � ������ ����������� ������, � ������ ��������� �������, ���������� ����������� ������� � ����������� �����, ��������(���������) ��(�) ����������(��) ����������� - ����� ����������� �����
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
     * Get the 'IsCanceled' element value. ������� ����������� �������� ���������
     * 
     * @return value
     */
    public String getIsCanceled() {
        return isCanceled;
    }

    /** 
     * Set the 'IsCanceled' element value. ������� ����������� �������� ���������
     * 
     * @param isCanceled
     */
    public void setIsCanceled(String isCanceled) {
        this.isCanceled = isCanceled;
    }

    /** 
     * Get the 'BDRDID' element value. ������������� ��������� �� �� ��
     * 
     * @return value
     */
    public String getBDRDID() {
        return BDRDID;
    }

    /** 
     * Set the 'BDRDID' element value. ������������� ��������� �� �� ��
     * 
     * @param BDRDID
     */
    public void setBDRDID(String BDRDID) {
        this.BDRDID = BDRDID;
    }

    /** 
     * Get the 'DocSign' element value. ������� ���������: 1 - ����������� � ������ ��������� ����������� ��������, �������������� �� ����������� �����; 2 - �����������, ����������� ��� ����� � ������ ����������� ������; 3 - ����������� � ������ ��������� �������, ���������� ����������� ������� � ����������� �����, ��������� � ���������� ����������� - ����� ����������� ����� ; 4 - ����������� �������, ���������� ����������� ������� � ����������� �����, �������� �� ���������� ����������� - ����� ����������� �����
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. ������� ���������: 1 - ����������� � ������ ��������� ����������� ��������, �������������� �� ����������� �����; 2 - �����������, ����������� ��� ����� � ������ ����������� ������; 3 - ����������� � ������ ��������� �������, ���������� ����������� ������� � ����������� �����, ��������� � ���������� ����������� - ����� ����������� ����� ; 4 - ����������� �������, ���������� ����������� ������� � ����������� �����, �������� �� ���������� ����������� - ����� ����������� �����
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'ControlResult' element value. ���������� ���������������� ��������
     * 
     * @return value
     */
    public String getControlResult() {
        return controlResult;
    }

    /** 
     * Set the 'ControlResult' element value. ���������� ���������������� ��������
     * 
     * @param controlResult
     */
    public void setControlResult(String controlResult) {
        this.controlResult = controlResult;
    }

    /** 
     * Get the 'ControlDate' element value. ���� ���������� �����������
     * 
     * @return value
     */
    public LocalDate getControlDate() {
        return controlDate;
    }

    /** 
     * Set the 'ControlDate' element value. ���� ���������� �����������
     * 
     * @param controlDate
     */
    public void setControlDate(LocalDate controlDate) {
        this.controlDate = controlDate;
    }

    /** 
     * Get the 'TotalPrice' element value. ��������� ������
     * 
     * @return value
     */
    public String getTotalPrice() {
        return totalPrice;
    }

    /** 
     * Set the 'TotalPrice' element value. ��������� ������
     * 
     * @param totalPrice
     */
    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    /** 
     * Get the 'TotalWeight' element value. ����� ����� ������
     * 
     * @return value
     */
    public String getTotalWeight() {
        return totalWeight;
    }

    /** 
     * Set the 'TotalWeight' element value. ����� ����� ������
     * 
     * @param totalWeight
     */
    public void setTotalWeight(String totalWeight) {
        this.totalWeight = totalWeight;
    }

    /** 
     * Get the 'PlaceCount' element value. ���������� ����
     * 
     * @return value
     */
    public String getPlaceCount() {
        return placeCount;
    }

    /** 
     * Set the 'PlaceCount' element value. ���������� ����
     * 
     * @param placeCount
     */
    public void setPlaceCount(String placeCount) {
        this.placeCount = placeCount;
    }

    /** 
     * Get the 'Act' element value. ��� ���������������� ��������
     * 
     * @return value
     */
    public DocumentBaseType getAct() {
        return act;
    }

    /** 
     * Set the 'Act' element value. ��� ���������������� ��������
     * 
     * @param act
     */
    public void setAct(DocumentBaseType act) {
        this.act = act;
    }

    /** 
     * Get the 'Contract' element value. ��������
     * 
     * @return value
     */
    public DocumentBaseType getContract() {
        return contract;
    }

    /** 
     * Set the 'Contract' element value. ��������
     * 
     * @param contract
     */
    public void setContract(DocumentBaseType contract) {
        this.contract = contract;
    }

    /** 
     * Get the 'License' element value. ��������
     * 
     * @return value
     */
    public DocumentBaseType getLicense() {
        return license;
    }

    /** 
     * Set the 'License' element value. ��������
     * 
     * @param license
     */
    public void setLicense(DocumentBaseType license) {
        this.license = license;
    }

    /** 
     * Get the 'Certificate' element value. ����������
     * 
     * @return value
     */
    public DocumentBaseType getCertificate() {
        return certificate;
    }

    /** 
     * Set the 'Certificate' element value. ����������
     * 
     * @param certificate
     */
    public void setCertificate(DocumentBaseType certificate) {
        this.certificate = certificate;
    }

    /** 
     * Get the 'Specification' element value. ������������
     * 
     * @return value
     */
    public DocumentBaseType getSpecification() {
        return specification;
    }

    /** 
     * Set the 'Specification' element value. ������������
     * 
     * @param specification
     */
    public void setSpecification(DocumentBaseType specification) {
        this.specification = specification;
    }

    /** 
     * Get the 'Invoice' element value. ������
     * 
     * @return value
     */
    public DocumentBaseType getInvoice() {
        return invoice;
    }

    /** 
     * Set the 'Invoice' element value. ������
     * 
     * @param invoice
     */
    public void setInvoice(DocumentBaseType invoice) {
        this.invoice = invoice;
    }

    /** 
     * Get the 'ProductDescription' element value. �������� ������
     * 
     * @return value
     */
    public ProductDescriptionType getProductDescription() {
        return productDescription;
    }

    /** 
     * Set the 'ProductDescription' element value. �������� ������
     * 
     * @param productDescription
     */
    public void setProductDescription(ProductDescriptionType productDescription) {
        this.productDescription = productDescription;
    }

    /** 
     * Get the 'OwnerOrg' element value. �����������
     * 
     * @return value
     */
    public CUOrganizationType getOwnerOrg() {
        return ownerOrg;
    }

    /** 
     * Set the 'OwnerOrg' element value. �����������
     * 
     * @param ownerOrg
     */
    public void setOwnerOrg(CUOrganizationType ownerOrg) {
        this.ownerOrg = ownerOrg;
    }

    /** 
     * Get the 'Exporter' element value. �����������-���������
     * 
     * @return value
     */
    public CUOrganizationType getExporter() {
        return exporter;
    }

    /** 
     * Set the 'Exporter' element value. �����������-���������
     * 
     * @param exporter
     */
    public void setExporter(CUOrganizationType exporter) {
        this.exporter = exporter;
    }

    /** 
     * Get the 'Importer' element value. �����������-��������
     * 
     * @return value
     */
    public CUOrganizationType getImporter() {
        return importer;
    }

    /** 
     * Set the 'Importer' element value. �����������-��������
     * 
     * @param importer
     */
    public void setImporter(CUOrganizationType importer) {
        this.importer = importer;
    }

    /** 
     * Get the 'CargoHandler' element value. ��������������� (����������������)
     * 
     * @return value
     */
    public CUOrganizationType getCargoHandler() {
        return cargoHandler;
    }

    /** 
     * Set the 'CargoHandler' element value. ��������������� (����������������)
     * 
     * @param cargoHandler
     */
    public void setCargoHandler(CUOrganizationType cargoHandler) {
        this.cargoHandler = cargoHandler;
    }

    /** 
     * Get the 'ControlOrganization' element value. ������������ ����������� �����������
     * 
     * @return value
     */
    public CUOrganizationType getControlOrganization() {
        return controlOrganization;
    }

    /** 
     * Set the 'ControlOrganization' element value. ������������ ����������� �����������
     * 
     * @param controlOrganization
     */
    public void setControlOrganization(CUOrganizationType controlOrganization) {
        this.controlOrganization = controlOrganization;
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
