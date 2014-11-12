
package ru.acs.fts.schemas.album.waybillexpressindividual;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Индивидуальная накладная при экспресс перевозке
 */
public class WayBillExpressIndividualType extends BaseDocType
{
    private String wayBillNumber;
    private String currencyCode;
    private String shipmentType;
    private String services;
    private String specialServices;
    private String internationalDistribution;
    private String mailStickerNumber;
    private String customsModeCode;
    private String netWeightTotal;
    private String grossWeightTotal;
    private SenderType sender;
    private List<ReceiverType> receiverList = new ArrayList<ReceiverType>();
    private CarrierType carrier;
    private DeparturePointType departurePoint;
    private DeliveryPointType deliveryPoint;
    private WayBillAcceptedType wayBillAccepted;
    private InsuranceType insurance;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private String documentModeID;

    /** 
     * Get the 'WayBillNumber' element value. Номер индивидуальной накладной 
     * 
     * @return value
     */
    public String getWayBillNumber() {
        return wayBillNumber;
    }

    /** 
     * Set the 'WayBillNumber' element value. Номер индивидуальной накладной 
     * 
     * @param wayBillNumber
     */
    public void setWayBillNumber(String wayBillNumber) {
        this.wayBillNumber = wayBillNumber;
    }

    /** 
     * Get the 'CurrencyCode' element value. Код валюты. Относится ко всем значениям стоимости в этом документе 
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Код валюты. Относится ко всем значениям стоимости в этом документе 
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'ShipmentType' element value. Тип перевозки: 1 - автомобильные перевозки; 2 - перевозки водным транспортом; 3 - авиаперевозки
     * 
     * @return value
     */
    public String getShipmentType() {
        return shipmentType;
    }

    /** 
     * Set the 'ShipmentType' element value. Тип перевозки: 1 - автомобильные перевозки; 2 - перевозки водным транспортом; 3 - авиаперевозки
     * 
     * @param shipmentType
     */
    public void setShipmentType(String shipmentType) {
        this.shipmentType = shipmentType;
    }

    /** 
     * Get the 'Services' element value. Информация об услугах 
     * 
     * @return value
     */
    public String getServices() {
        return services;
    }

    /** 
     * Set the 'Services' element value. Информация об услугах 
     * 
     * @param services
     */
    public void setServices(String services) {
        this.services = services;
    }

    /** 
     * Get the 'SpecialServices' element value. Информация о специальных услугах 
     * 
     * @return value
     */
    public String getSpecialServices() {
        return specialServices;
    }

    /** 
     * Set the 'SpecialServices' element value. Информация о специальных услугах 
     * 
     * @param specialServices
     */
    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }

    /** 
     * Get the 'InternationalDistribution' element value. Признак использования международной рассылки
     * 
     * @return value
     */
    public String getInternationalDistribution() {
        return internationalDistribution;
    }

    /** 
     * Set the 'InternationalDistribution' element value. Признак использования международной рассылки
     * 
     * @param internationalDistribution
     */
    public void setInternationalDistribution(String internationalDistribution) {
        this.internationalDistribution = internationalDistribution;
    }

    /** 
     * Get the 'MailStickerNumber' element value. Номер наклейки для разового отправления с оплатой получателя 
     * 
     * @return value
     */
    public String getMailStickerNumber() {
        return mailStickerNumber;
    }

    /** 
     * Set the 'MailStickerNumber' element value. Номер наклейки для разового отправления с оплатой получателя 
     * 
     * @param mailStickerNumber
     */
    public void setMailStickerNumber(String mailStickerNumber) {
        this.mailStickerNumber = mailStickerNumber;
    }

    /** 
     * Get the 'CustomsModeCode' element value. Код  таможенного режима 
     * 
     * @return value
     */
    public String getCustomsModeCode() {
        return customsModeCode;
    }

    /** 
     * Set the 'CustomsModeCode' element value. Код  таможенного режима 
     * 
     * @param customsModeCode
     */
    public void setCustomsModeCode(String customsModeCode) {
        this.customsModeCode = customsModeCode;
    }

    /** 
     * Get the 'NetWeightTotal' element value. Суммарный вес товаров нетто, кг
     * 
     * @return value
     */
    public String getNetWeightTotal() {
        return netWeightTotal;
    }

    /** 
     * Set the 'NetWeightTotal' element value. Суммарный вес товаров нетто, кг
     * 
     * @param netWeightTotal
     */
    public void setNetWeightTotal(String netWeightTotal) {
        this.netWeightTotal = netWeightTotal;
    }

    /** 
     * Get the 'GrossWeightTotal' element value. Суммарный вес товаров брутто, кг 
     * 
     * @return value
     */
    public String getGrossWeightTotal() {
        return grossWeightTotal;
    }

    /** 
     * Set the 'GrossWeightTotal' element value. Суммарный вес товаров брутто, кг 
     * 
     * @param grossWeightTotal
     */
    public void setGrossWeightTotal(String grossWeightTotal) {
        this.grossWeightTotal = grossWeightTotal;
    }

    /** 
     * Get the 'Sender' element value. Отправитель 
     * 
     * @return value
     */
    public SenderType getSender() {
        return sender;
    }

    /** 
     * Set the 'Sender' element value. Отправитель 
     * 
     * @param sender
     */
    public void setSender(SenderType sender) {
        this.sender = sender;
    }

    /** 
     * Get the list of 'Receiver' element items. Получатель
     * 
     * @return list
     */
    public List<ReceiverType> getReceiverList() {
        return receiverList;
    }

    /** 
     * Set the list of 'Receiver' element items. Получатель
     * 
     * @param list
     */
    public void setReceiverList(List<ReceiverType> list) {
        receiverList = list;
    }

    /** 
     * Get the 'Carrier' element value. Наименование перевозчика и его реквизиты 
     * 
     * @return value
     */
    public CarrierType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. Наименование перевозчика и его реквизиты 
     * 
     * @param carrier
     */
    public void setCarrier(CarrierType carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the 'DeparturePoint' element value. Пункт отправления 
     * 
     * @return value
     */
    public DeparturePointType getDeparturePoint() {
        return departurePoint;
    }

    /** 
     * Set the 'DeparturePoint' element value. Пункт отправления 
     * 
     * @param departurePoint
     */
    public void setDeparturePoint(DeparturePointType departurePoint) {
        this.departurePoint = departurePoint;
    }

    /** 
     * Get the 'DeliveryPoint' element value. Пункт назначения
     * 
     * @return value
     */
    public DeliveryPointType getDeliveryPoint() {
        return deliveryPoint;
    }

    /** 
     * Set the 'DeliveryPoint' element value. Пункт назначения
     * 
     * @param deliveryPoint
     */
    public void setDeliveryPoint(DeliveryPointType deliveryPoint) {
        this.deliveryPoint = deliveryPoint;
    }

    /** 
     * Get the 'WayBillAccepted' element value. Накладная была принята: дата, время и имя принявшего лица
     * 
     * @return value
     */
    public WayBillAcceptedType getWayBillAccepted() {
        return wayBillAccepted;
    }

    /** 
     * Set the 'WayBillAccepted' element value. Накладная была принята: дата, время и имя принявшего лица
     * 
     * @param wayBillAccepted
     */
    public void setWayBillAccepted(WayBillAcceptedType wayBillAccepted) {
        this.wayBillAccepted = wayBillAccepted;
    }

    /** 
     * Get the 'Insurance' element value. Информация о страховании 
     * 
     * @return value
     */
    public InsuranceType getInsurance() {
        return insurance;
    }

    /** 
     * Set the 'Insurance' element value. Информация о страховании 
     * 
     * @param insurance
     */
    public void setInsurance(InsuranceType insurance) {
        this.insurance = insurance;
    }

    /** 
     * Get the list of 'Goods' element items. Товар накладной
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. Товар накладной
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
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
