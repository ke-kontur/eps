
package ru.acs.fts.schemas.album.airwaybill;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.AirportType;

/** 
 * Авиагрузовая накладная 
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
     * Get the 'AgreedValuation' element value. Декларируемая стоимость  для перевозки. При NVD -  не заполняется
     * 
     * @return value
     */
    public String getAgreedValuation() {
        return agreedValuation;
    }

    /** 
     * Set the 'AgreedValuation' element value. Декларируемая стоимость  для перевозки. При NVD -  не заполняется
     * 
     * @param agreedValuation
     */
    public void setAgreedValuation(String agreedValuation) {
        this.agreedValuation = agreedValuation;
    }

    /** 
     * Get the 'AgreedValuationCurrencyCode' element value. Код валюты, принятой в стране отправления
     * 
     * @return value
     */
    public String getAgreedValuationCurrencyCode() {
        return agreedValuationCurrencyCode;
    }

    /** 
     * Set the 'AgreedValuationCurrencyCode' element value. Код валюты, принятой в стране отправления
     * 
     * @param agreedValuationCurrencyCode
     */
    public void setAgreedValuationCurrencyCode(
            String agreedValuationCurrencyCode) {
        this.agreedValuationCurrencyCode = agreedValuationCurrencyCode;
    }

    /** 
     * Get the 'TotalCost' element value. Объявленная стоимость товара для таможни. В случае NCV элемент не заполняется
     * 
     * @return value
     */
    public String getTotalCost() {
        return totalCost;
    }

    /** 
     * Set the 'TotalCost' element value. Объявленная стоимость товара для таможни. В случае NCV элемент не заполняется
     * 
     * @param totalCost
     */
    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    /** 
     * Get the 'NCVIndicator' element value. Индикатор незаявления стоимости (NCV): 1 - если не заявлена стоимость, 0 - стоимость заявлена в элементе TotalCost
     * 
     * @return value
     */
    public String getNCVIndicator() {
        return NCVIndicator;
    }

    /** 
     * Set the 'NCVIndicator' element value. Индикатор незаявления стоимости (NCV): 1 - если не заявлена стоимость, 0 - стоимость заявлена в элементе TotalCost
     * 
     * @param NCVIndicator
     */
    public void setNCVIndicator(String NCVIndicator) {
        this.NCVIndicator = NCVIndicator;
    }

    /** 
     * Get the 'InsuranceCost' element value. Стоимость страховки . При  XXX элемент не заполняется.
     * 
     * @return value
     */
    public String getInsuranceCost() {
        return insuranceCost;
    }

    /** 
     * Set the 'InsuranceCost' element value. Стоимость страховки . При  XXX элемент не заполняется.
     * 
     * @param insuranceCost
     */
    public void setInsuranceCost(String insuranceCost) {
        this.insuranceCost = insuranceCost;
    }

    /** 
     * Get the 'XXXIndicator' element value. Индикатор незаявления стоимости страховки (XXX): 1 -  если не заявлена страховка, 0 - страховка заявлена в  элементе InsuranceCost
     * 
     * @return value
     */
    public String getXXXIndicator() {
        return XXXIndicator;
    }

    /** 
     * Set the 'XXXIndicator' element value. Индикатор незаявления стоимости страховки (XXX): 1 -  если не заявлена страховка, 0 - страховка заявлена в  элементе InsuranceCost
     * 
     * @param XXXIndicator
     */
    public void setXXXIndicator(String XXXIndicator) {
        this.XXXIndicator = XXXIndicator;
    }

    /** 
     * Get the 'SCI' element value. Таможенный статус груза  (Код SCI)
     * 
     * @return value
     */
    public String getSCI() {
        return SCI;
    }

    /** 
     * Set the 'SCI' element value. Таможенный статус груза  (Код SCI)
     * 
     * @param SCI
     */
    public void setSCI(String SCI) {
        this.SCI = SCI;
    }

    /** 
     * Get the 'NVDIndicator' element value. Индикатор незаявления стоимости для перевозки (NVD): 1 - если стоимость  товара не заявлена, 0 - стоимость для перевозки заявлена в элементе AgreedValuation
     * 
     * @return value
     */
    public String getNVDIndicator() {
        return NVDIndicator;
    }

    /** 
     * Set the 'NVDIndicator' element value. Индикатор незаявления стоимости для перевозки (NVD): 1 - если стоимость  товара не заявлена, 0 - стоимость для перевозки заявлена в элементе AgreedValuation
     * 
     * @param NVDIndicator
     */
    public void setNVDIndicator(String NVDIndicator) {
        this.NVDIndicator = NVDIndicator;
    }

    /** 
     * Get the 'DeparturePoint' element value. Информация об аэропорте отправления или городе, если
     * 
     * @return value
     */
    public AirportType getDeparturePoint() {
        return departurePoint;
    }

    /** 
     * Set the 'DeparturePoint' element value. Информация об аэропорте отправления или городе, если
     * 
     * @param departurePoint
     */
    public void setDeparturePoint(AirportType departurePoint) {
        this.departurePoint = departurePoint;
    }

    /** 
     * Get the 'DestinationPoint' element value. Информация об аэропорте назначения или городе, если
     * 
     * @return value
     */
    public AirportType getDestinationPoint() {
        return destinationPoint;
    }

    /** 
     * Set the 'DestinationPoint' element value. Информация об аэропорте назначения или городе, если
     * 
     * @param destinationPoint
     */
    public void setDestinationPoint(AirportType destinationPoint) {
        this.destinationPoint = destinationPoint;
    }

    /** 
     * Get the 'Registration' element value. Сведения о составлении накладной 
     * 
     * @return value
     */
    public RegistrationType getRegistration() {
        return registration;
    }

    /** 
     * Set the 'Registration' element value. Сведения о составлении накладной 
     * 
     * @param registration
     */
    public void setRegistration(RegistrationType registration) {
        this.registration = registration;
    }

    /** 
     * Get the 'Consignor' element value. Реквизиты грузоотправителя
     * 
     * @return value
     */
    public AirOrganizationType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. Реквизиты грузоотправителя
     * 
     * @param consignor
     */
    public void setConsignor(AirOrganizationType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'Consignee' element value. Реквизиты грузополучателя
     * 
     * @return value
     */
    public AirOrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. Реквизиты грузополучателя
     * 
     * @param consignee
     */
    public void setConsignee(AirOrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'IssuingCarrierAgent' element value. Реквизиты агента выдающего перевозчика
     * 
     * @return value
     */
    public IssueAgentType getIssuingCarrierAgent() {
        return issuingCarrierAgent;
    }

    /** 
     * Set the 'IssuingCarrierAgent' element value. Реквизиты агента выдающего перевозчика
     * 
     * @param issuingCarrierAgent
     */
    public void setIssuingCarrierAgent(IssueAgentType issuingCarrierAgent) {
        this.issuingCarrierAgent = issuingCarrierAgent;
    }

    /** 
     * Get the list of 'Payment' element items. Информация о платежах 
     * 
     * @return list
     */
    public List<PaymentType> getPaymentList() {
        return paymentList;
    }

    /** 
     * Set the list of 'Payment' element items. Информация о платежах 
     * 
     * @param list
     */
    public void setPaymentList(List<PaymentType> list) {
        paymentList = list;
    }

    /** 
     * Get the list of 'GoodsMovement' element items. Описание перемещения груза
     * 
     * @return list
     */
    public List<GoodsMovementType> getGoodsMovementList() {
        return goodsMovementList;
    }

    /** 
     * Set the list of 'GoodsMovement' element items. Описание перемещения груза
     * 
     * @param list
     */
    public void setGoodsMovementList(List<GoodsMovementType> list) {
        goodsMovementList = list;
    }

    /** 
     * Get the list of 'HandlingInfo' element items. Информация по обработке груза
     * 
     * @return list
     */
    public List<HandlingInfoType> getHandlingInfoList() {
        return handlingInfoList;
    }

    /** 
     * Set the list of 'HandlingInfo' element items. Информация по обработке груза
     * 
     * @param list
     */
    public void setHandlingInfoList(List<HandlingInfoType> list) {
        handlingInfoList = list;
    }

    /** 
     * Get the 'IssueInfo' element value. Авиакомпания, выписавшая накладную
     * 
     * @return value
     */
    public OrganizationType getIssueInfo() {
        return issueInfo;
    }

    /** 
     * Set the 'IssueInfo' element value. Авиакомпания, выписавшая накладную
     * 
     * @param issueInfo
     */
    public void setIssueInfo(OrganizationType issueInfo) {
        this.issueInfo = issueInfo;
    }

    /** 
     * Get the 'AWBGoodsInfo' element value. Информация о грузе и тарифах
     * 
     * @return value
     */
    public AWBGoodsInfoType getAWBGoodsInfo() {
        return AWBGoodsInfo;
    }

    /** 
     * Set the 'AWBGoodsInfo' element value. Информация о грузе и тарифах
     * 
     * @param AWBGoodsInfo
     */
    public void setAWBGoodsInfo(AWBGoodsInfoType AWBGoodsInfo) {
        this.AWBGoodsInfo = AWBGoodsInfo;
    }

    /** 
     * Get the 'PaymentInfo' element value. Информация по платежам
     * 
     * @return value
     */
    public PaymentInfoType getPaymentInfo() {
        return paymentInfo;
    }

    /** 
     * Set the 'PaymentInfo' element value. Информация по платежам
     * 
     * @param paymentInfo
     */
    public void setPaymentInfo(PaymentInfoType paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    /** 
     * Get the 'ConsignorSign' element value. Подпись грузоотправителя
     * 
     * @return value
     */
    public PersonBaseType getConsignorSign() {
        return consignorSign;
    }

    /** 
     * Set the 'ConsignorSign' element value. Подпись грузоотправителя
     * 
     * @param consignorSign
     */
    public void setConsignorSign(PersonBaseType consignorSign) {
        this.consignorSign = consignorSign;
    }

    /** 
     * Get the 'CarrierSign' element value. Подпись перевозчика
     * 
     * @return value
     */
    public PersonBaseType getCarrierSign() {
        return carrierSign;
    }

    /** 
     * Set the 'CarrierSign' element value. Подпись перевозчика
     * 
     * @param carrierSign
     */
    public void setCarrierSign(PersonBaseType carrierSign) {
        this.carrierSign = carrierSign;
    }

    /** 
     * Get the 'Mark' element value. Отметки о прохождении товарами таможенного и иных видов государственного контроля.
     * 
     * @return value
     */
    public MarkType getMark() {
        return mark;
    }

    /** 
     * Set the 'Mark' element value. Отметки о прохождении товарами таможенного и иных видов государственного контроля.
     * 
     * @param mark
     */
    public void setMark(MarkType mark) {
        this.mark = mark;
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
