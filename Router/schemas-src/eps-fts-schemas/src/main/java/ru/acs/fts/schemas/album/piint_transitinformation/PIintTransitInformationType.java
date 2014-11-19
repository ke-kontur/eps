
package ru.acs.fts.schemas.album.piint_transitinformation;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.priorcommonaggregatetypescust.PresentedDocumentsType;

/** 
 * ����������� � ������ ��������������� ��������. ���������� ������
 */
public class PIintTransitInformationType extends BaseDocType
{
    private String PIURN;
    private LocalDate documentDate;
    private String brokerDocNumber;
    private String borderCustomsCode;
    private String borderCustomsName;
    private LocalDate expectArriveDate;
    private String expectArriveTime;
    private ConsigneeType consignee;
    private CarrierType carrier;
    private GoodsInformationType goodsInformation;
    private List<PresentedDocumentsType> licenceDocumentList = new ArrayList<PresentedDocumentsType>();
    private PrincipalType principal;
    private ShippingInformationType shippingInformation;
    private ConsignorType consignor;
    private String documentModeID;

    /** 
     * Get the 'PI_URN' element value. ���������� ������������� �������� ������. ������ - URN
     * 
     * @return value
     */
    public String getPIURN() {
        return PIURN;
    }

    /** 
     * Set the 'PI_URN' element value. ���������� ������������� �������� ������. ������ - URN
     * 
     * @param PIURN
     */
    public void setPIURN(String PIURN) {
        this.PIURN = PIURN;
    }

    /** 
     * Get the 'DocumentDate' element value. ���� ����������� ���������
     * 
     * @return value
     */
    public LocalDate getDocumentDate() {
        return documentDate;
    }

    /** 
     * Set the 'DocumentDate' element value. ���� ����������� ���������
     * 
     * @param documentDate
     */
    public void setDocumentDate(LocalDate documentDate) {
        this.documentDate = documentDate;
    }

    /** 
     * Get the 'BrokerDocNumber' element value. ����� ��������� � �� �������
     * 
     * @return value
     */
    public String getBrokerDocNumber() {
        return brokerDocNumber;
    }

    /** 
     * Set the 'BrokerDocNumber' element value. ����� ��������� � �� �������
     * 
     * @param brokerDocNumber
     */
    public void setBrokerDocNumber(String brokerDocNumber) {
        this.brokerDocNumber = brokerDocNumber;
    }

    /** 
     * Get the 'BorderCustomsCode' element value. ��� ������� �� �������
     * 
     * @return value
     */
    public String getBorderCustomsCode() {
        return borderCustomsCode;
    }

    /** 
     * Set the 'BorderCustomsCode' element value. ��� ������� �� �������
     * 
     * @param borderCustomsCode
     */
    public void setBorderCustomsCode(String borderCustomsCode) {
        this.borderCustomsCode = borderCustomsCode;
    }

    /** 
     * Get the 'BorderCustomsName' element value. ������������ ������� �� �������
     * 
     * @return value
     */
    public String getBorderCustomsName() {
        return borderCustomsName;
    }

    /** 
     * Set the 'BorderCustomsName' element value. ������������ ������� �� �������
     * 
     * @param borderCustomsName
     */
    public void setBorderCustomsName(String borderCustomsName) {
        this.borderCustomsName = borderCustomsName;
    }

    /** 
     * Get the 'ExpectArriveDate' element value. ��������� ���� �������� �� ����� ��������
     * 
     * @return value
     */
    public LocalDate getExpectArriveDate() {
        return expectArriveDate;
    }

    /** 
     * Set the 'ExpectArriveDate' element value. ��������� ���� �������� �� ����� ��������
     * 
     * @param expectArriveDate
     */
    public void setExpectArriveDate(LocalDate expectArriveDate) {
        this.expectArriveDate = expectArriveDate;
    }

    /** 
     * Get the 'ExpectArriveTime' element value. ��������� ����� �������� �� ����� ��������
     * 
     * @return value
     */
    public String getExpectArriveTime() {
        return expectArriveTime;
    }

    /** 
     * Set the 'ExpectArriveTime' element value. ��������� ����� �������� �� ����� ��������
     * 
     * @param expectArriveTime
     */
    public void setExpectArriveTime(String expectArriveTime) {
        this.expectArriveTime = expectArriveTime;
    }

    /** 
     * Get the 'Consignee' element value. ���������������
     * 
     * @return value
     */
    public ConsigneeType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. ���������������
     * 
     * @param consignee
     */
    public void setConsignee(ConsigneeType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'Carrier' element value. ����������
     * 
     * @return value
     */
    public CarrierType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. ����������
     * 
     * @param carrier
     */
    public void setCarrier(CarrierType carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the 'GoodsInformation' element value. ���������� � ����������� �������
     * 
     * @return value
     */
    public GoodsInformationType getGoodsInformation() {
        return goodsInformation;
    }

    /** 
     * Set the 'GoodsInformation' element value. ���������� � ����������� �������
     * 
     * @param goodsInformation
     */
    public void setGoodsInformation(GoodsInformationType goodsInformation) {
        this.goodsInformation = goodsInformation;
    }

    /** 
     * Get the list of 'LicenceDocument' element items. �������� � ���������� ����������� ������, ��������� �� ��������� �������
     * 
     * @return list
     */
    public List<PresentedDocumentsType> getLicenceDocumentList() {
        return licenceDocumentList;
    }

    /** 
     * Set the list of 'LicenceDocument' element items. �������� � ���������� ����������� ������, ��������� �� ��������� �������
     * 
     * @param list
     */
    public void setLicenceDocumentList(List<PresentedDocumentsType> list) {
        licenceDocumentList = list;
    }

    /** 
     * Get the 'Principal' element value. ����������
     * 
     * @return value
     */
    public PrincipalType getPrincipal() {
        return principal;
    }

    /** 
     * Set the 'Principal' element value. ����������
     * 
     * @param principal
     */
    public void setPrincipal(PrincipalType principal) {
        this.principal = principal;
    }

    /** 
     * Get the 'ShippingInformation' element value. ���������� � ��������� �����
     * 
     * @return value
     */
    public ShippingInformationType getShippingInformation() {
        return shippingInformation;
    }

    /** 
     * Set the 'ShippingInformation' element value. ���������� � ��������� �����
     * 
     * @param shippingInformation
     */
    public void setShippingInformation(
            ShippingInformationType shippingInformation) {
        this.shippingInformation = shippingInformation;
    }

    /** 
     * Get the 'Consignor' element value. ����������������
     * 
     * @return value
     */
    public ConsignorType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. ����������������
     * 
     * @param consignor
     */
    public void setConsignor(ConsignorType consignor) {
        this.consignor = consignor;
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
