
package ru.acs.fts.schemas.album.fsbshifrmeans;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;
import ru.acs.fts.schemas.album.sqcommonaggregatetypescust.DocumentType;

/** 
 * ����� �� ������ �������� �� ���������� (�������������� ����������) �� ����, ����� � ������� ����������� ����������� �������, ��������������� ��� ���������� ��������� ����������, ������������ (�����������������) �������
 */
public class FSBShifrMeansType extends BaseDocType
{
    private String isCanceled;
    private String BDRDID;
    private String docSign;
    private String sign;
    private String countryOrigin;
    private String info;
    private String authorizedPerson;
    private DocumentType conclusionDescription;
    private CUOrganizationType name;
    private OrganizationBaseType manufacturerName;
    private SupplementaryQuantityType quantity;
    private DocumentType contractDescription;
    private SupplementaryQuantityType addQuantity;
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
     * Get the 'DocSign' element value. ������� ���������: 0 - ���������� �� ����, ����� � ������� ����������� ����������� �������, ��������������� ��� ���������� ��������� ���������� ; 1 - ���������� �� ����, ����� � ������� ������������ (�����������������) �������
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. ������� ���������: 0 - ���������� �� ����, ����� � ������� ����������� ����������� �������, ��������������� ��� ���������� ��������� ���������� ; 1 - ���������� �� ����, ����� � ������� ������������ (�����������������) �������
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'Sign' element value. ������� (��������� ���� /�����, �������, ���� ��� ���������� ������� ��� ��� � �.�.)
     * 
     * @return value
     */
    public String getSign() {
        return sign;
    }

    /** 
     * Set the 'Sign' element value. ������� (��������� ���� /�����, �������, ���� ��� ���������� ������� ��� ��� � �.�.)
     * 
     * @param sign
     */
    public void setSign(String sign) {
        this.sign = sign;
    }

    /** 
     * Get the 'CountryOrigin' element value. ������ ����������� / ����������
     * 
     * @return value
     */
    public String getCountryOrigin() {
        return countryOrigin;
    }

    /** 
     * Set the 'CountryOrigin' element value. ������ ����������� / ����������
     * 
     * @param countryOrigin
     */
    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }

    /** 
     * Get the 'Info' element value. �������� ��� ���
     * 
     * @return value
     */
    public String getInfo() {
        return info;
    }

    /** 
     * Set the 'Info' element value. �������� ��� ���
     * 
     * @param info
     */
    public void setInfo(String info) {
        this.info = info;
    }

    /** 
     * Get the 'AuthorizedPerson' element value. �������������� ����������� ���� (���, ���������), ����������� ����������
     * 
     * @return value
     */
    public String getAuthorizedPerson() {
        return authorizedPerson;
    }

    /** 
     * Set the 'AuthorizedPerson' element value. �������������� ����������� ���� (���, ���������), ����������� ����������
     * 
     * @param authorizedPerson
     */
    public void setAuthorizedPerson(String authorizedPerson) {
        this.authorizedPerson = authorizedPerson;
    }

    /** 
     * Get the 'ConclusionDescription' element value. ��������� ����������
     * 
     * @return value
     */
    public DocumentType getConclusionDescription() {
        return conclusionDescription;
    }

    /** 
     * Set the 'ConclusionDescription' element value. ��������� ����������
     * 
     * @param conclusionDescription
     */
    public void setConclusionDescription(DocumentType conclusionDescription) {
        this.conclusionDescription = conclusionDescription;
    }

    /** 
     * Get the 'Name' element value. ������������ ���������� ���������� (��������������� ���������) (���, ���, ����������� �����)
     * 
     * @return value
     */
    public CUOrganizationType getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. ������������ ���������� ���������� (��������������� ���������) (���, ���, ����������� �����)
     * 
     * @param name
     */
    public void setName(CUOrganizationType name) {
        this.name = name;
    }

    /** 
     * Get the 'ManufacturerName' element value. ������������ ����� �������������
     * 
     * @return value
     */
    public OrganizationBaseType getManufacturerName() {
        return manufacturerName;
    }

    /** 
     * Set the 'ManufacturerName' element value. ������������ ����� �������������
     * 
     * @param manufacturerName
     */
    public void setManufacturerName(OrganizationBaseType manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    /** 
     * Get the 'Quantity' element value. ���������� ������
     * 
     * @return value
     */
    public SupplementaryQuantityType getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. ���������� ������
     * 
     * @param quantity
     */
    public void setQuantity(SupplementaryQuantityType quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the 'ContractDescription' element value. ��������� ���������
     * 
     * @return value
     */
    public DocumentType getContractDescription() {
        return contractDescription;
    }

    /** 
     * Set the 'ContractDescription' element value. ��������� ���������
     * 
     * @param contractDescription
     */
    public void setContractDescription(DocumentType contractDescription) {
        this.contractDescription = contractDescription;
    }

    /** 
     * Get the 'AddQuantity' element value. ���������� � �������������� ������� ���������
     * 
     * @return value
     */
    public SupplementaryQuantityType getAddQuantity() {
        return addQuantity;
    }

    /** 
     * Set the 'AddQuantity' element value. ���������� � �������������� ������� ���������
     * 
     * @param addQuantity
     */
    public void setAddQuantity(SupplementaryQuantityType addQuantity) {
        this.addQuantity = addQuantity;
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
