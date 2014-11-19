
package ru.acs.fts.schemas.album.mpo_declaration;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ���������� ���������� �������, ������������ � ���
 */
public class MPODeclarationType extends BaseDocType
{
    private String feedBillAgency;
    private LocalDate feedBillDate;
    private String MPONumber;
    private String docSign;
    private String PIRegID;
    private List<String> consignmentCategoryList = new ArrayList<String>();
    private String explication;
    private List<String> postalFeeList = new ArrayList<String>();
    private String totalCost;
    private String currencyCode;
    private String departureCountry;
    private String destinationCountry;
    private String totalGrossWeight;
    private String MPOFactWeight;
    private String comment;
    private String designatedOperator;
    private String MMPOName;
    private ConsigneeType consignee;
    private ImporterType importer;
    private ConsignorType consignor;
    private List<DocumentInfoType> documentInfoList = new ArrayList<DocumentInfoType>();
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private InformationType information;
    private String documentModeID;

    /** 
     * Get the 'FeedBillAgency' element value. ����������  ������
     * 
     * @return value
     */
    public String getFeedBillAgency() {
        return feedBillAgency;
    }

    /** 
     * Set the 'FeedBillAgency' element value. ����������  ������
     * 
     * @param feedBillAgency
     */
    public void setFeedBillAgency(String feedBillAgency) {
        this.feedBillAgency = feedBillAgency;
    }

    /** 
     * Get the 'FeedBillDate' element value. ���� ������
     * 
     * @return value
     */
    public LocalDate getFeedBillDate() {
        return feedBillDate;
    }

    /** 
     * Set the 'FeedBillDate' element value. ���� ������
     * 
     * @param feedBillDate
     */
    public void setFeedBillDate(LocalDate feedBillDate) {
        this.feedBillDate = feedBillDate;
    }

    /** 
     * Get the 'MPO_Number' element value. ����� ���
     * 
     * @return value
     */
    public String getMPONumber() {
        return MPONumber;
    }

    /** 
     * Set the 'MPO_Number' element value. ����� ���
     * 
     * @param MPONumber
     */
    public void setMPONumber(String MPONumber) {
        this.MPONumber = MPONumber;
    }

    /** 
     * Get the 'DocSign' element value. ��� ����������: 0 - ��������, 1-���������������
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. ��� ����������: 0 - ��������, 1-���������������
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'PI_RegID' element value. ��������������� ����� ��������������� ���������� �� ���
     * 
     * @return value
     */
    public String getPIRegID() {
        return PIRegID;
    }

    /** 
     * Set the 'PI_RegID' element value. ��������������� ����� ��������������� ���������� �� ���
     * 
     * @param PIRegID
     */
    public void setPIRegID(String PIRegID) {
        this.PIRegID = PIRegID;
    }

    /** 
     * Get the list of 'ConsignmentCategory' element items. ��������� ����������� � ������������ � ���������������
     * 
     * @return list
     */
    public List<String> getConsignmentCategoryList() {
        return consignmentCategoryList;
    }

    /** 
     * Set the list of 'ConsignmentCategory' element items. ��������� ����������� � ������������ � ���������������
     * 
     * @param list
     */
    public void setConsignmentCategoryList(List<String> list) {
        consignmentCategoryList = list;
    }

    /** 
     * Get the 'Explication' element value. ���������
     * 
     * @return value
     */
    public String getExplication() {
        return explication;
    }

    /** 
     * Set the 'Explication' element value. ���������
     * 
     * @param explication
     */
    public void setExplication(String explication) {
        this.explication = explication;
    }

    /** 
     * Get the list of 'PostalFees' element items. ����� �������� ������/��������
     * 
     * @return list
     */
    public List<String> getPostalFeeList() {
        return postalFeeList;
    }

    /** 
     * Set the list of 'PostalFees' element items. ����� �������� ������/��������
     * 
     * @param list
     */
    public void setPostalFeeList(List<String> list) {
        postalFeeList = list;
    }

    /** 
     * Get the 'TotalCost' element value. ����� ��������� �������
     * 
     * @return value
     */
    public String getTotalCost() {
        return totalCost;
    }

    /** 
     * Set the 'TotalCost' element value. ����� ��������� �������
     * 
     * @param totalCost
     */
    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    /** 
     * Get the 'CurrencyCode' element value. ��� ������
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. ��� ������
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'DepartureCountry' element value. ������ ����������� ������
     * 
     * @return value
     */
    public String getDepartureCountry() {
        return departureCountry;
    }

    /** 
     * Set the 'DepartureCountry' element value. ������ ����������� ������
     * 
     * @param departureCountry
     */
    public void setDepartureCountry(String departureCountry) {
        this.departureCountry = departureCountry;
    }

    /** 
     * Get the 'DestinationCountry' element value. ������ ���������� ������
     * 
     * @return value
     */
    public String getDestinationCountry() {
        return destinationCountry;
    }

    /** 
     * Set the 'DestinationCountry' element value. ������ ���������� ������
     * 
     * @param destinationCountry
     */
    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    /** 
     * Get the 'TotalGrossWeight' element value. ����� ��� ������, ������ (��)
     * 
     * @return value
     */
    public String getTotalGrossWeight() {
        return totalGrossWeight;
    }

    /** 
     * Set the 'TotalGrossWeight' element value. ����� ��� ������, ������ (��)
     * 
     * @param totalGrossWeight
     */
    public void setTotalGrossWeight(String totalGrossWeight) {
        this.totalGrossWeight = totalGrossWeight;
    }

    /** 
     * Get the 'MPOFactWeight' element value. ����������� ��� ��� (��)
     * 
     * @return value
     */
    public String getMPOFactWeight() {
        return MPOFactWeight;
    }

    /** 
     * Set the 'MPOFactWeight' element value. ����������� ��� ��� (��)
     * 
     * @param MPOFactWeight
     */
    public void setMPOFactWeight(String MPOFactWeight) {
        this.MPOFactWeight = MPOFactWeight;
    }

    /** 
     * Get the 'Comment' element value. ����������
     * 
     * @return value
     */
    public String getComment() {
        return comment;
    }

    /** 
     * Set the 'Comment' element value. ����������
     * 
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /** 
     * Get the 'DesignatedOperator' element value. ����������� ��������
     * 
     * @return value
     */
    public String getDesignatedOperator() {
        return designatedOperator;
    }

    /** 
     * Set the 'DesignatedOperator' element value. ����������� ��������
     * 
     * @param designatedOperator
     */
    public void setDesignatedOperator(String designatedOperator) {
        this.designatedOperator = designatedOperator;
    }

    /** 
     * Get the 'MMPOName' element value. ������������ ����
     * 
     * @return value
     */
    public String getMMPOName() {
        return MMPOName;
    }

    /** 
     * Set the 'MMPOName' element value. ������������ ����
     * 
     * @param MMPOName
     */
    public void setMMPOName(String MMPOName) {
        this.MMPOName = MMPOName;
    }

    /** 
     * Get the 'Consignee' element value. ����������
     * 
     * @return value
     */
    public ConsigneeType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. ����������
     * 
     * @param consignee
     */
    public void setConsignee(ConsigneeType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'Importer' element value. ��������
     * 
     * @return value
     */
    public ImporterType getImporter() {
        return importer;
    }

    /** 
     * Set the 'Importer' element value. ��������
     * 
     * @param importer
     */
    public void setImporter(ImporterType importer) {
        this.importer = importer;
    }

    /** 
     * Get the 'Consignor' element value. �����������
     * 
     * @return value
     */
    public ConsignorType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. �����������
     * 
     * @param consignor
     */
    public void setConsignor(ConsignorType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the list of 'DocumentInfo' element items. �������� � ���������
     * 
     * @return list
     */
    public List<DocumentInfoType> getDocumentInfoList() {
        return documentInfoList;
    }

    /** 
     * Set the list of 'DocumentInfo' element items. �������� � ���������
     * 
     * @param list
     */
    public void setDocumentInfoList(List<DocumentInfoType> list) {
        documentInfoList = list;
    }

    /** 
     * Get the list of 'Goods' element items. �������� � �������
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. �������� � �������
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }

    /** 
     * Get the 'Information' element value. �������������� ����������
     * 
     * @return value
     */
    public InformationType getInformation() {
        return information;
    }

    /** 
     * Set the 'Information' element value. �������������� ����������
     * 
     * @param information
     */
    public void setInformation(InformationType information) {
        this.information = information;
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
