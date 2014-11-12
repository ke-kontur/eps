
package ru.acs.fts.schemas.album.detaildatard;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * �������� �� �������������� ���������
 */
public class DetailDataRDType extends BaseDocType
{
    private String BDRDID;
    private String documentNumber;
    private LocalDate issueDate;
    private LocalDate term;
    private String documentCode;
    private String status;
    private LocalDate statusDate;
    private String formNumber;
    private LocalDate datePlacement;
    private OrganizationInfoType manufacturer;
    private OrganizationInfoType receiver;
    private List<GoodsInfoType> goodsInfoList = new ArrayList<GoodsInfoType>();
    private String documentModeID;

    /** 
     * Get the 'BDRDID' element value. ���������� ����� �� �� ��
     * 
     * @return value
     */
    public String getBDRDID() {
        return BDRDID;
    }

    /** 
     * Set the 'BDRDID' element value. ���������� ����� �� �� ��
     * 
     * @param BDRDID
     */
    public void setBDRDID(String BDRDID) {
        this.BDRDID = BDRDID;
    }

    /** 
     * Get the 'DocumentNumber' element value. ����� ���������
     * 
     * @return value
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /** 
     * Set the 'DocumentNumber' element value. ����� ���������
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /** 
     * Get the 'IssueDate' element value. ���� ������ ���������
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. ���� ������ ���������
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the 'Term' element value. ���� ��������
     * 
     * @return value
     */
    public LocalDate getTerm() {
        return term;
    }

    /** 
     * Set the 'Term' element value. ���� ��������
     * 
     * @param term
     */
    public void setTerm(LocalDate term) {
        this.term = term;
    }

    /** 
     * Get the 'DocumentCode' element value. ��� ���� ���������
     * 
     * @return value
     */
    public String getDocumentCode() {
        return documentCode;
    }

    /** 
     * Set the 'DocumentCode' element value. ��� ���� ���������
     * 
     * @param documentCode
     */
    public void setDocumentCode(String documentCode) {
        this.documentCode = documentCode;
    }

    /** 
     * Get the 'Status' element value. ������
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' element value. ������
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** 
     * Get the 'StatusDate' element value. ���� ��������� �������
     * 
     * @return value
     */
    public LocalDate getStatusDate() {
        return statusDate;
    }

    /** 
     * Set the 'StatusDate' element value. ���� ��������� �������
     * 
     * @param statusDate
     */
    public void setStatusDate(LocalDate statusDate) {
        this.statusDate = statusDate;
    }

    /** 
     * Get the 'FormNumber' element value. ����� ������
     * 
     * @return value
     */
    public String getFormNumber() {
        return formNumber;
    }

    /** 
     * Set the 'FormNumber' element value. ����� ������
     * 
     * @param formNumber
     */
    public void setFormNumber(String formNumber) {
        this.formNumber = formNumber;
    }

    /** 
     * Get the 'DatePlacement' element value. ���� ��������� � �� ��
     * 
     * @return value
     */
    public LocalDate getDatePlacement() {
        return datePlacement;
    }

    /** 
     * Set the 'DatePlacement' element value. ���� ��������� � �� ��
     * 
     * @param datePlacement
     */
    public void setDatePlacement(LocalDate datePlacement) {
        this.datePlacement = datePlacement;
    }

    /** 
     * Get the 'Manufacturer' element value. �������� � ����� ������������
     * 
     * @return value
     */
    public OrganizationInfoType getManufacturer() {
        return manufacturer;
    }

    /** 
     * Set the 'Manufacturer' element value. �������� � ����� ������������
     * 
     * @param manufacturer
     */
    public void setManufacturer(OrganizationInfoType manufacturer) {
        this.manufacturer = manufacturer;
    }

    /** 
     * Get the 'Receiver' element value. �������� � ����� ����������
     * 
     * @return value
     */
    public OrganizationInfoType getReceiver() {
        return receiver;
    }

    /** 
     * Set the 'Receiver' element value. �������� � ����� ����������
     * 
     * @param receiver
     */
    public void setReceiver(OrganizationInfoType receiver) {
        this.receiver = receiver;
    }

    /** 
     * Get the list of 'GoodsInfo' element items. �������� � ���������
     * 
     * @return list
     */
    public List<GoodsInfoType> getGoodsInfoList() {
        return goodsInfoList;
    }

    /** 
     * Set the list of 'GoodsInfo' element items. �������� � ���������
     * 
     * @param list
     */
    public void setGoodsInfoList(List<GoodsInfoType> list) {
        goodsInfoList = list;
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
