
package ru.acs.fts.schemas.album.customsregistrycertificate;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * ������������� � ��������� � ������ �������������� ������������� ����������/���������� ������������/���������� ���/���������� ��������� ������������ ��������/���������� ���������� �������
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
     * Get the 'DocSign' element value. ������� ������������� � ��������� � ������: 1 - ���; 2 - ���������� ������������; 3 - ���������� ���; 4 - ���������� ��������� ������������ ��������; 5 - ���������� ���������� �������
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. ������� ������������� � ��������� � ������: 1 - ���; 2 - ���������� ������������; 3 - ���������� ���; 4 - ���������� ��������� ������������ ��������; 5 - ���������� ���������� �������
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'IssueDate' element value. ���� ������ �������������/������� ���������
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. ���� ������ �������������/������� ���������
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the 'CertificateRegNumber' element value. ��������������� ����� �������������
     * 
     * @return value
     */
    public String getCertificateRegNumber() {
        return certificateRegNumber;
    }

    /** 
     * Set the 'CertificateRegNumber' element value. ��������������� ����� �������������
     * 
     * @param certificateRegNumber
     */
    public void setCertificateRegNumber(String certificateRegNumber) {
        this.certificateRegNumber = certificateRegNumber;
    }

    /** 
     * Get the list of 'Simplification' element items. ����������� ��������� (���)
     * 
     * @return list
     */
    public List<String> getSimplificationList() {
        return simplificationList;
    }

    /** 
     * Set the list of 'Simplification' element items. ����������� ��������� (���)
     * 
     * @param list
     */
    public void setSimplificationList(List<String> list) {
        simplificationList = list;
    }

    /** 
     * Get the 'WarehouseType' element value. ������� ����, ��� ����� �������� ��������
     * 
     * @return value
     */
    public String getWarehouseType() {
        return warehouseType;
    }

    /** 
     * Set the 'WarehouseType' element value. ������� ����, ��� ����� �������� ��������
     * 
     * @param warehouseType
     */
    public void setWarehouseType(String warehouseType) {
        this.warehouseType = warehouseType;
    }

    /** 
     * Get the 'TotalSquare' element value. ����� ������� ���/������, ��. �
     * 
     * @return value
     */
    public String getTotalSquare() {
        return totalSquare;
    }

    /** 
     * Set the 'TotalSquare' element value. ����� ������� ���/������, ��. �
     * 
     * @param totalSquare
     */
    public void setTotalSquare(String totalSquare) {
        this.totalSquare = totalSquare;
    }

    /** 
     * Get the 'IssueCustoms' element value. �������� � ���������� ������, �������� �������������
     * 
     * @return value
     */
    public CustomsType getIssueCustoms() {
        return issueCustoms;
    }

    /** 
     * Set the 'IssueCustoms' element value. �������� � ���������� ������, �������� �������������
     * 
     * @param issueCustoms
     */
    public void setIssueCustoms(CustomsType issueCustoms) {
        this.issueCustoms = issueCustoms;
    }

    /** 
     * Get the list of 'SimplificOperationCustoms' element items. ���������� ������, � ������� ����� ������������� ���������� �������� (���)
     * 
     * @return list
     */
    public List<CustomsType> getSimplificOperationCustomList() {
        return simplificOperationCustomList;
    }

    /** 
     * Set the list of 'SimplificOperationCustoms' element items. ���������� ������, � ������� ����� ������������� ���������� �������� (���)
     * 
     * @param list
     */
    public void setSimplificOperationCustomList(List<CustomsType> list) {
        simplificOperationCustomList = list;
    }

    /** 
     * Get the list of 'Guarantee' element items. �������� �� ����������� ������ ���������� ��������
     * 
     * @return list
     */
    public List<AmountCustomsPaymentType> getGuaranteeList() {
        return guaranteeList;
    }

    /** 
     * Set the list of 'Guarantee' element items. �������� �� ����������� ������ ���������� ��������
     * 
     * @param list
     */
    public void setGuaranteeList(List<AmountCustomsPaymentType> list) {
        guaranteeList = list;
    }

    /** 
     * Get the 'RegisteredOrganization' element value. �������� �� �����������, ������������������ � �������� ���/����������� �����������/��������� ���/��������� ���/��������� ����������� ������
     * 
     * @return value
     */
    public RegisteredOrganizationType getRegisteredOrganization() {
        return registeredOrganization;
    }

    /** 
     * Set the 'RegisteredOrganization' element value. �������� �� �����������, ������������������ � �������� ���/����������� �����������/��������� ���/��������� ���/��������� ����������� ������
     * 
     * @param registeredOrganization
     */
    public void setRegisteredOrganization(
            RegisteredOrganizationType registeredOrganization) {
        this.registeredOrganization = registeredOrganization;
    }

    /** 
     * Get the 'ChiefCustomsPerson' element value. ������������ ����������� ������
     * 
     * @return value
     */
    public PersonBaseType getChiefCustomsPerson() {
        return chiefCustomsPerson;
    }

    /** 
     * Set the 'ChiefCustomsPerson' element value. ������������ ����������� ������
     * 
     * @param chiefCustomsPerson
     */
    public void setChiefCustomsPerson(PersonBaseType chiefCustomsPerson) {
        this.chiefCustomsPerson = chiefCustomsPerson;
    }

    /** 
     * Get the list of 'GoodsOperationPlace' element items. �������������� ��������������� ���������, �������� ��������, ���� ����������
     * 
     * @return list
     */
    public List<GoodsOperationPlaceType> getGoodsOperationPlaceList() {
        return goodsOperationPlaceList;
    }

    /** 
     * Set the list of 'GoodsOperationPlace' element items. �������������� ��������������� ���������, �������� ��������, ���� ����������
     * 
     * @param list
     */
    public void setGoodsOperationPlaceList(List<GoodsOperationPlaceType> list) {
        goodsOperationPlaceList = list;
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
