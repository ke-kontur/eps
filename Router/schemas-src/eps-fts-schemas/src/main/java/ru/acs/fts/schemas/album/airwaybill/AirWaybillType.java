
package ru.acs.fts.schemas.album.airwaybill;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.AirportType;

/** 
 * ������������ ��������� 
 */
public class AirWaybillType extends BaseDocType
{
    private String agreedValuation;
    private String agreedValuationCurrencyCode;
    private String totalCost;
    private String NCVIndicator;
    private String insuranceCost;
    private String XXXIndicator;
    private String SCI;
    private String NVDIndicator;
    private AirportType departurePoint;
    private AirportType destinationPoint;
    private RegistrationType registration;
    private AirOrganizationType consignor;
    private AirOrganizationType consignee;
    private IssueAgentType issuingCarrierAgent;
    private List<PaymentType> paymentList = new ArrayList<PaymentType>();
    private List<GoodsMovementType> goodsMovementList = new ArrayList<GoodsMovementType>();
    private List<HandlingInfoType> handlingInfoList = new ArrayList<HandlingInfoType>();
    private OrganizationType issueInfo;
    private AWBGoodsInfoType AWBGoodsInfo;
    private PaymentInfoType paymentInfo;
    private PersonBaseType consignorSign;
    private PersonBaseType carrierSign;
    private MarkType mark;
    private String documentModeID;

    /** 
     * Get the 'AgreedValuation' element value. ������������� ���������  ��� ���������. ��� NVD -  �� �����������
     * 
     * @return value
     */
    public String getAgreedValuation() {
        return agreedValuation;
    }

    /** 
     * Set the 'AgreedValuation' element value. ������������� ���������  ��� ���������. ��� NVD -  �� �����������
     * 
     * @param agreedValuation
     */
    public void setAgreedValuation(String agreedValuation) {
        this.agreedValuation = agreedValuation;
    }

    /** 
     * Get the 'AgreedValuationCurrencyCode' element value. ��� ������, �������� � ������ �����������
     * 
     * @return value
     */
    public String getAgreedValuationCurrencyCode() {
        return agreedValuationCurrencyCode;
    }

    /** 
     * Set the 'AgreedValuationCurrencyCode' element value. ��� ������, �������� � ������ �����������
     * 
     * @param agreedValuationCurrencyCode
     */
    public void setAgreedValuationCurrencyCode(
            String agreedValuationCurrencyCode) {
        this.agreedValuationCurrencyCode = agreedValuationCurrencyCode;
    }

    /** 
     * Get the 'TotalCost' element value. ����������� ��������� ������ ��� �������. � ������ NCV ������� �� �����������
     * 
     * @return value
     */
    public String getTotalCost() {
        return totalCost;
    }

    /** 
     * Set the 'TotalCost' element value. ����������� ��������� ������ ��� �������. � ������ NCV ������� �� �����������
     * 
     * @param totalCost
     */
    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    /** 
     * Get the 'NCVIndicator' element value. ��������� ����������� ��������� (NCV): 1 - ���� �� �������� ���������, 0 - ��������� �������� � �������� TotalCost
     * 
     * @return value
     */
    public String getNCVIndicator() {
        return NCVIndicator;
    }

    /** 
     * Set the 'NCVIndicator' element value. ��������� ����������� ��������� (NCV): 1 - ���� �� �������� ���������, 0 - ��������� �������� � �������� TotalCost
     * 
     * @param NCVIndicator
     */
    public void setNCVIndicator(String NCVIndicator) {
        this.NCVIndicator = NCVIndicator;
    }

    /** 
     * Get the 'InsuranceCost' element value. ��������� ��������� . ���  XXX ������� �� �����������.
     * 
     * @return value
     */
    public String getInsuranceCost() {
        return insuranceCost;
    }

    /** 
     * Set the 'InsuranceCost' element value. ��������� ��������� . ���  XXX ������� �� �����������.
     * 
     * @param insuranceCost
     */
    public void setInsuranceCost(String insuranceCost) {
        this.insuranceCost = insuranceCost;
    }

    /** 
     * Get the 'XXXIndicator' element value. ��������� ����������� ��������� ��������� (XXX): 1 -  ���� �� �������� ���������, 0 - ��������� �������� �  �������� InsuranceCost
     * 
     * @return value
     */
    public String getXXXIndicator() {
        return XXXIndicator;
    }

    /** 
     * Set the 'XXXIndicator' element value. ��������� ����������� ��������� ��������� (XXX): 1 -  ���� �� �������� ���������, 0 - ��������� �������� �  �������� InsuranceCost
     * 
     * @param XXXIndicator
     */
    public void setXXXIndicator(String XXXIndicator) {
        this.XXXIndicator = XXXIndicator;
    }

    /** 
     * Get the 'SCI' element value. ���������� ������ �����  (��� SCI)
     * 
     * @return value
     */
    public String getSCI() {
        return SCI;
    }

    /** 
     * Set the 'SCI' element value. ���������� ������ �����  (��� SCI)
     * 
     * @param SCI
     */
    public void setSCI(String SCI) {
        this.SCI = SCI;
    }

    /** 
     * Get the 'NVDIndicator' element value. ��������� ����������� ��������� ��� ��������� (NVD): 1 - ���� ���������  ������ �� ��������, 0 - ��������� ��� ��������� �������� � �������� AgreedValuation
     * 
     * @return value
     */
    public String getNVDIndicator() {
        return NVDIndicator;
    }

    /** 
     * Set the 'NVDIndicator' element value. ��������� ����������� ��������� ��� ��������� (NVD): 1 - ���� ���������  ������ �� ��������, 0 - ��������� ��� ��������� �������� � �������� AgreedValuation
     * 
     * @param NVDIndicator
     */
    public void setNVDIndicator(String NVDIndicator) {
        this.NVDIndicator = NVDIndicator;
    }

    /** 
     * Get the 'DeparturePoint' element value. ���������� �� ��������� ����������� ��� ������, ����
     * 
     * @return value
     */
    public AirportType getDeparturePoint() {
        return departurePoint;
    }

    /** 
     * Set the 'DeparturePoint' element value. ���������� �� ��������� ����������� ��� ������, ����
     * 
     * @param departurePoint
     */
    public void setDeparturePoint(AirportType departurePoint) {
        this.departurePoint = departurePoint;
    }

    /** 
     * Get the 'DestinationPoint' element value. ���������� �� ��������� ���������� ��� ������, ����
     * 
     * @return value
     */
    public AirportType getDestinationPoint() {
        return destinationPoint;
    }

    /** 
     * Set the 'DestinationPoint' element value. ���������� �� ��������� ���������� ��� ������, ����
     * 
     * @param destinationPoint
     */
    public void setDestinationPoint(AirportType destinationPoint) {
        this.destinationPoint = destinationPoint;
    }

    /** 
     * Get the 'Registration' element value. �������� � ����������� ��������� 
     * 
     * @return value
     */
    public RegistrationType getRegistration() {
        return registration;
    }

    /** 
     * Set the 'Registration' element value. �������� � ����������� ��������� 
     * 
     * @param registration
     */
    public void setRegistration(RegistrationType registration) {
        this.registration = registration;
    }

    /** 
     * Get the 'Consignor' element value. ��������� ����������������
     * 
     * @return value
     */
    public AirOrganizationType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. ��������� ����������������
     * 
     * @param consignor
     */
    public void setConsignor(AirOrganizationType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'Consignee' element value. ��������� ���������������
     * 
     * @return value
     */
    public AirOrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. ��������� ���������������
     * 
     * @param consignee
     */
    public void setConsignee(AirOrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'IssuingCarrierAgent' element value. ��������� ������ ��������� �����������
     * 
     * @return value
     */
    public IssueAgentType getIssuingCarrierAgent() {
        return issuingCarrierAgent;
    }

    /** 
     * Set the 'IssuingCarrierAgent' element value. ��������� ������ ��������� �����������
     * 
     * @param issuingCarrierAgent
     */
    public void setIssuingCarrierAgent(IssueAgentType issuingCarrierAgent) {
        this.issuingCarrierAgent = issuingCarrierAgent;
    }

    /** 
     * Get the list of 'Payment' element items. ���������� � �������� 
     * 
     * @return list
     */
    public List<PaymentType> getPaymentList() {
        return paymentList;
    }

    /** 
     * Set the list of 'Payment' element items. ���������� � �������� 
     * 
     * @param list
     */
    public void setPaymentList(List<PaymentType> list) {
        paymentList = list;
    }

    /** 
     * Get the list of 'GoodsMovement' element items. �������� ����������� �����
     * 
     * @return list
     */
    public List<GoodsMovementType> getGoodsMovementList() {
        return goodsMovementList;
    }

    /** 
     * Set the list of 'GoodsMovement' element items. �������� ����������� �����
     * 
     * @param list
     */
    public void setGoodsMovementList(List<GoodsMovementType> list) {
        goodsMovementList = list;
    }

    /** 
     * Get the list of 'HandlingInfo' element items. ���������� �� ��������� �����
     * 
     * @return list
     */
    public List<HandlingInfoType> getHandlingInfoList() {
        return handlingInfoList;
    }

    /** 
     * Set the list of 'HandlingInfo' element items. ���������� �� ��������� �����
     * 
     * @param list
     */
    public void setHandlingInfoList(List<HandlingInfoType> list) {
        handlingInfoList = list;
    }

    /** 
     * Get the 'IssueInfo' element value. ������������, ���������� ���������
     * 
     * @return value
     */
    public OrganizationType getIssueInfo() {
        return issueInfo;
    }

    /** 
     * Set the 'IssueInfo' element value. ������������, ���������� ���������
     * 
     * @param issueInfo
     */
    public void setIssueInfo(OrganizationType issueInfo) {
        this.issueInfo = issueInfo;
    }

    /** 
     * Get the 'AWBGoodsInfo' element value. ���������� � ����� � �������
     * 
     * @return value
     */
    public AWBGoodsInfoType getAWBGoodsInfo() {
        return AWBGoodsInfo;
    }

    /** 
     * Set the 'AWBGoodsInfo' element value. ���������� � ����� � �������
     * 
     * @param AWBGoodsInfo
     */
    public void setAWBGoodsInfo(AWBGoodsInfoType AWBGoodsInfo) {
        this.AWBGoodsInfo = AWBGoodsInfo;
    }

    /** 
     * Get the 'PaymentInfo' element value. ���������� �� ��������
     * 
     * @return value
     */
    public PaymentInfoType getPaymentInfo() {
        return paymentInfo;
    }

    /** 
     * Set the 'PaymentInfo' element value. ���������� �� ��������
     * 
     * @param paymentInfo
     */
    public void setPaymentInfo(PaymentInfoType paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    /** 
     * Get the 'ConsignorSign' element value. ������� ����������������
     * 
     * @return value
     */
    public PersonBaseType getConsignorSign() {
        return consignorSign;
    }

    /** 
     * Set the 'ConsignorSign' element value. ������� ����������������
     * 
     * @param consignorSign
     */
    public void setConsignorSign(PersonBaseType consignorSign) {
        this.consignorSign = consignorSign;
    }

    /** 
     * Get the 'CarrierSign' element value. ������� �����������
     * 
     * @return value
     */
    public PersonBaseType getCarrierSign() {
        return carrierSign;
    }

    /** 
     * Set the 'CarrierSign' element value. ������� �����������
     * 
     * @param carrierSign
     */
    public void setCarrierSign(PersonBaseType carrierSign) {
        this.carrierSign = carrierSign;
    }

    /** 
     * Get the 'Mark' element value. ������� � ����������� �������� ����������� � ���� ����� ���������������� ��������.
     * 
     * @return value
     */
    public MarkType getMark() {
        return mark;
    }

    /** 
     * Set the 'Mark' element value. ������� � ����������� �������� ����������� � ���� ����� ���������������� ��������.
     * 
     * @param mark
     */
    public void setMark(MarkType mark) {
        this.mark = mark;
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
