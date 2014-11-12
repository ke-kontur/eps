
package ru.acs.fts.schemas.album.piint_transitinformation;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.priorcommonaggregatetypescust.PresentedDocumentsType;

/** 
 * Уведомление о подаче предварительных сведений. Внутренний формат
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
     * Get the 'PI_URN' element value. Уникальный идентификатор товарной партии. Формат - URN
     * 
     * @return value
     */
    public String getPIURN() {
        return PIURN;
    }

    /** 
     * Set the 'PI_URN' element value. Уникальный идентификатор товарной партии. Формат - URN
     * 
     * @param PIURN
     */
    public void setPIURN(String PIURN) {
        this.PIURN = PIURN;
    }

    /** 
     * Get the 'DocumentDate' element value. Дата составления документа
     * 
     * @return value
     */
    public LocalDate getDocumentDate() {
        return documentDate;
    }

    /** 
     * Set the 'DocumentDate' element value. Дата составления документа
     * 
     * @param documentDate
     */
    public void setDocumentDate(LocalDate documentDate) {
        this.documentDate = documentDate;
    }

    /** 
     * Get the 'BrokerDocNumber' element value. Номер документа в АС брокера
     * 
     * @return value
     */
    public String getBrokerDocNumber() {
        return brokerDocNumber;
    }

    /** 
     * Set the 'BrokerDocNumber' element value. Номер документа в АС брокера
     * 
     * @param brokerDocNumber
     */
    public void setBrokerDocNumber(String brokerDocNumber) {
        this.brokerDocNumber = brokerDocNumber;
    }

    /** 
     * Get the 'BorderCustomsCode' element value. Код таможни на границе
     * 
     * @return value
     */
    public String getBorderCustomsCode() {
        return borderCustomsCode;
    }

    /** 
     * Set the 'BorderCustomsCode' element value. Код таможни на границе
     * 
     * @param borderCustomsCode
     */
    public void setBorderCustomsCode(String borderCustomsCode) {
        this.borderCustomsCode = borderCustomsCode;
    }

    /** 
     * Get the 'BorderCustomsName' element value. Наименование таможни на границе
     * 
     * @return value
     */
    public String getBorderCustomsName() {
        return borderCustomsName;
    }

    /** 
     * Set the 'BorderCustomsName' element value. Наименование таможни на границе
     * 
     * @param borderCustomsName
     */
    public void setBorderCustomsName(String borderCustomsName) {
        this.borderCustomsName = borderCustomsName;
    }

    /** 
     * Get the 'ExpectArriveDate' element value. Ожидаемая дата прибытия на пункт пропуска
     * 
     * @return value
     */
    public LocalDate getExpectArriveDate() {
        return expectArriveDate;
    }

    /** 
     * Set the 'ExpectArriveDate' element value. Ожидаемая дата прибытия на пункт пропуска
     * 
     * @param expectArriveDate
     */
    public void setExpectArriveDate(LocalDate expectArriveDate) {
        this.expectArriveDate = expectArriveDate;
    }

    /** 
     * Get the 'ExpectArriveTime' element value. Ожидаемое время прибытия на пункт пропуска
     * 
     * @return value
     */
    public String getExpectArriveTime() {
        return expectArriveTime;
    }

    /** 
     * Set the 'ExpectArriveTime' element value. Ожидаемое время прибытия на пункт пропуска
     * 
     * @param expectArriveTime
     */
    public void setExpectArriveTime(String expectArriveTime) {
        this.expectArriveTime = expectArriveTime;
    }

    /** 
     * Get the 'Consignee' element value. Грузополучатель
     * 
     * @return value
     */
    public ConsigneeType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. Грузополучатель
     * 
     * @param consignee
     */
    public void setConsignee(ConsigneeType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'Carrier' element value. Перевозчик
     * 
     * @return value
     */
    public CarrierType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. Перевозчик
     * 
     * @param carrier
     */
    public void setCarrier(CarrierType carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the 'GoodsInformation' element value. Информация о перевозимых товарах
     * 
     * @return value
     */
    public GoodsInformationType getGoodsInformation() {
        return goodsInformation;
    }

    /** 
     * Set the 'GoodsInformation' element value. Информация о перевозимых товарах
     * 
     * @param goodsInformation
     */
    public void setGoodsInformation(GoodsInformationType goodsInformation) {
        this.goodsInformation = goodsInformation;
    }

    /** 
     * Get the list of 'LicenceDocument' element items. Сведения о документах обеспечения уплаты, лицензиях на перевозку товаров
     * 
     * @return list
     */
    public List<PresentedDocumentsType> getLicenceDocumentList() {
        return licenceDocumentList;
    }

    /** 
     * Set the list of 'LicenceDocument' element items. Сведения о документах обеспечения уплаты, лицензиях на перевозку товаров
     * 
     * @param list
     */
    public void setLicenceDocumentList(List<PresentedDocumentsType> list) {
        licenceDocumentList = list;
    }

    /** 
     * Get the 'Principal' element value. Доверитель
     * 
     * @return value
     */
    public PrincipalType getPrincipal() {
        return principal;
    }

    /** 
     * Set the 'Principal' element value. Доверитель
     * 
     * @param principal
     */
    public void setPrincipal(PrincipalType principal) {
        this.principal = principal;
    }

    /** 
     * Get the 'ShippingInformation' element value. Информация о перевозке груза
     * 
     * @return value
     */
    public ShippingInformationType getShippingInformation() {
        return shippingInformation;
    }

    /** 
     * Set the 'ShippingInformation' element value. Информация о перевозке груза
     * 
     * @param shippingInformation
     */
    public void setShippingInformation(
            ShippingInformationType shippingInformation) {
        this.shippingInformation = shippingInformation;
    }

    /** 
     * Get the 'Consignor' element value. Грузоотправитель
     * 
     * @return value
     */
    public ConsignorType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. Грузоотправитель
     * 
     * @param consignor
     */
    public void setConsignor(ConsignorType consignor) {
        this.consignor = consignor;
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
