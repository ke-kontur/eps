
package ru.acs.fts.schemas.album.tir_carnet;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.cutransportcommonaggregatetypescust.TIRForwarderType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.TDGuaranteeType;

/** 
 * Книжка МДП
 */
public class TIRCarnetType extends BaseDocType
{
    private String TIRHolderID;
    private String TIRCustomstCode;
    private String goodsQuantity;
    private String shipSpecifGoodsQuantity;
    private String dispatchCountryCode;
    private String destinationCountryCode;
    private String totalInvoicedCost;
    private String totalPageQuantity;
    private String destinationCountryName;
    private String dispatchCountryName;
    private String dispatchCountryA3Code;
    private String destinationCountryA3Code;
    private TIRIdentifierType TIRIdentifier;
    private TIRCarrierType carrier;
    private TIRForwarderType forwarder;
    private TDGuaranteeType guarantee;
    private List<TIRTransportMeansType> transportMeanList = new ArrayList<TIRTransportMeansType>();
    private List<TIRPrecedingDocumentType> precedingDocumentList = new ArrayList<TIRPrecedingDocumentType>();
    private List<TIRShipmentType> TIRShipmentList = new ArrayList<TIRShipmentType>();
    private TIRCustomsMarkType dispatchCustomsMark;
    private TIRCustomsMarkType departureCustomsMark;
    private MarkType mark;
    private String documentModeID;

    /** 
     * Get the 'TIRHolderID' element value. Идентификационный номер держателя книжки МДП
     * 
     * @return value
     */
    public String getTIRHolderID() {
        return TIRHolderID;
    }

    /** 
     * Set the 'TIRHolderID' element value. Идентификационный номер держателя книжки МДП
     * 
     * @param TIRHolderID
     */
    public void setTIRHolderID(String TIRHolderID) {
        this.TIRHolderID = TIRHolderID;
    }

    /** 
     * Get the 'TIRCustomstCode' element value. Резерв. Не используется. Код таможенного органа оформления МДП
     * 
     * @return value
     */
    public String getTIRCustomstCode() {
        return TIRCustomstCode;
    }

    /** 
     * Set the 'TIRCustomstCode' element value. Резерв. Не используется. Код таможенного органа оформления МДП
     * 
     * @param TIRCustomstCode
     */
    public void setTIRCustomstCode(String TIRCustomstCode) {
        this.TIRCustomstCode = TIRCustomstCode;
    }

    /** 
     * Get the 'GoodsQuantity' element value. Общее число  товаров по книжке МДП
     * 
     * @return value
     */
    public String getGoodsQuantity() {
        return goodsQuantity;
    }

    /** 
     * Set the 'GoodsQuantity' element value. Общее число  товаров по книжке МДП
     * 
     * @param goodsQuantity
     */
    public void setGoodsQuantity(String goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }

    /** 
     * Get the 'ShipSpecifGoodsQuantity' element value. Количество товаров по отгрузочным спецификациям
     * 
     * @return value
     */
    public String getShipSpecifGoodsQuantity() {
        return shipSpecifGoodsQuantity;
    }

    /** 
     * Set the 'ShipSpecifGoodsQuantity' element value. Количество товаров по отгрузочным спецификациям
     * 
     * @param shipSpecifGoodsQuantity
     */
    public void setShipSpecifGoodsQuantity(String shipSpecifGoodsQuantity) {
        this.shipSpecifGoodsQuantity = shipSpecifGoodsQuantity;
    }

    /** 
     * Get the 'DispatchCountryCode' element value. Буквенный код страны отправления
     * 
     * @return value
     */
    public String getDispatchCountryCode() {
        return dispatchCountryCode;
    }

    /** 
     * Set the 'DispatchCountryCode' element value. Буквенный код страны отправления
     * 
     * @param dispatchCountryCode
     */
    public void setDispatchCountryCode(String dispatchCountryCode) {
        this.dispatchCountryCode = dispatchCountryCode;
    }

    /** 
     * Get the 'DestinationCountryCode' element value. Буквенный код страны назначения
     * 
     * @return value
     */
    public String getDestinationCountryCode() {
        return destinationCountryCode;
    }

    /** 
     * Set the 'DestinationCountryCode' element value. Буквенный код страны назначения
     * 
     * @param destinationCountryCode
     */
    public void setDestinationCountryCode(String destinationCountryCode) {
        this.destinationCountryCode = destinationCountryCode;
    }

    /** 
     * Get the 'TotalInvoicedCost' element value. Общая фактурная стоимость
     * 
     * @return value
     */
    public String getTotalInvoicedCost() {
        return totalInvoicedCost;
    }

    /** 
     * Set the 'TotalInvoicedCost' element value. Общая фактурная стоимость
     * 
     * @param totalInvoicedCost
     */
    public void setTotalInvoicedCost(String totalInvoicedCost) {
        this.totalInvoicedCost = totalInvoicedCost;
    }

    /** 
     * Get the 'TotalPageQuantity' element value. Количество листов всех документов
     * 
     * @return value
     */
    public String getTotalPageQuantity() {
        return totalPageQuantity;
    }

    /** 
     * Set the 'TotalPageQuantity' element value. Количество листов всех документов
     * 
     * @param totalPageQuantity
     */
    public void setTotalPageQuantity(String totalPageQuantity) {
        this.totalPageQuantity = totalPageQuantity;
    }

    /** 
     * Get the 'DestinationCountryName' element value. Наименование страны назначения
     * 
     * @return value
     */
    public String getDestinationCountryName() {
        return destinationCountryName;
    }

    /** 
     * Set the 'DestinationCountryName' element value. Наименование страны назначения
     * 
     * @param destinationCountryName
     */
    public void setDestinationCountryName(String destinationCountryName) {
        this.destinationCountryName = destinationCountryName;
    }

    /** 
     * Get the 'DispatchCountryName' element value. Наименование страны отправления
     * 
     * @return value
     */
    public String getDispatchCountryName() {
        return dispatchCountryName;
    }

    /** 
     * Set the 'DispatchCountryName' element value. Наименование страны отправления
     * 
     * @param dispatchCountryName
     */
    public void setDispatchCountryName(String dispatchCountryName) {
        this.dispatchCountryName = dispatchCountryName;
    }

    /** 
     * Get the 'DispatchCountryA3Code' element value. Буквенный  ISO Alpha 3 код страны отправления
     * 
     * @return value
     */
    public String getDispatchCountryA3Code() {
        return dispatchCountryA3Code;
    }

    /** 
     * Set the 'DispatchCountryA3Code' element value. Буквенный  ISO Alpha 3 код страны отправления
     * 
     * @param dispatchCountryA3Code
     */
    public void setDispatchCountryA3Code(String dispatchCountryA3Code) {
        this.dispatchCountryA3Code = dispatchCountryA3Code;
    }

    /** 
     * Get the 'DestinationCountryA3Code' element value. Буквенный  ISO Alpha 3 код страны назначения
     * 
     * @return value
     */
    public String getDestinationCountryA3Code() {
        return destinationCountryA3Code;
    }

    /** 
     * Set the 'DestinationCountryA3Code' element value. Буквенный  ISO Alpha 3 код страны назначения
     * 
     * @param destinationCountryA3Code
     */
    public void setDestinationCountryA3Code(String destinationCountryA3Code) {
        this.destinationCountryA3Code = destinationCountryA3Code;
    }

    /** 
     * Get the 'TIRIdentifier' element value. Идентификатор книжки МДП
     * 
     * @return value
     */
    public TIRIdentifierType getTIRIdentifier() {
        return TIRIdentifier;
    }

    /** 
     * Set the 'TIRIdentifier' element value. Идентификатор книжки МДП
     * 
     * @param TIRIdentifier
     */
    public void setTIRIdentifier(TIRIdentifierType TIRIdentifier) {
        this.TIRIdentifier = TIRIdentifier;
    }

    /** 
     * Get the 'Carrier' element value. Перевозчик / Держатель книжки МДП
     * 
     * @return value
     */
    public TIRCarrierType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. Перевозчик / Держатель книжки МДП
     * 
     * @param carrier
     */
    public void setCarrier(TIRCarrierType carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the 'Forwarder' element value. Экспедитор
     * 
     * @return value
     */
    public TIRForwarderType getForwarder() {
        return forwarder;
    }

    /** 
     * Set the 'Forwarder' element value. Экспедитор
     * 
     * @param forwarder
     */
    public void setForwarder(TIRForwarderType forwarder) {
        this.forwarder = forwarder;
    }

    /** 
     * Get the 'Guarantee' element value. Обеспечение
     * 
     * @return value
     */
    public TDGuaranteeType getGuarantee() {
        return guarantee;
    }

    /** 
     * Set the 'Guarantee' element value. Обеспечение
     * 
     * @param guarantee
     */
    public void setGuarantee(TDGuaranteeType guarantee) {
        this.guarantee = guarantee;
    }

    /** 
     * Get the list of 'TransportMeans' element items. Транспортные средства
     * 
     * @return list
     */
    public List<TIRTransportMeansType> getTransportMeanList() {
        return transportMeanList;
    }

    /** 
     * Set the list of 'TransportMeans' element items. Транспортные средства
     * 
     * @param list
     */
    public void setTransportMeanList(List<TIRTransportMeansType> list) {
        transportMeanList = list;
    }

    /** 
     * Get the list of 'PrecedingDocument' element items. Предшествующий документ
     * 
     * @return list
     */
    public List<TIRPrecedingDocumentType> getPrecedingDocumentList() {
        return precedingDocumentList;
    }

    /** 
     * Set the list of 'PrecedingDocument' element items. Предшествующий документ
     * 
     * @param list
     */
    public void setPrecedingDocumentList(List<TIRPrecedingDocumentType> list) {
        precedingDocumentList = list;
    }

    /** 
     * Get the list of 'TIR_Shipment' element items. Сведения о товарной партии
     * 
     * @return list
     */
    public List<TIRShipmentType> getTIRShipmentList() {
        return TIRShipmentList;
    }

    /** 
     * Set the list of 'TIR_Shipment' element items. Сведения о товарной партии
     * 
     * @param list
     */
    public void setTIRShipmentList(List<TIRShipmentType> list) {
        TIRShipmentList = list;
    }

    /** 
     * Get the 'DispatchCustomsMark' element value. Отметки таможни отправления или промежуточной таможни при въезде
     * 
     * @return value
     */
    public TIRCustomsMarkType getDispatchCustomsMark() {
        return dispatchCustomsMark;
    }

    /** 
     * Set the 'DispatchCustomsMark' element value. Отметки таможни отправления или промежуточной таможни при въезде
     * 
     * @param dispatchCustomsMark
     */
    public void setDispatchCustomsMark(TIRCustomsMarkType dispatchCustomsMark) {
        this.dispatchCustomsMark = dispatchCustomsMark;
    }

    /** 
     * Get the 'DepartureCustomsMark' element value. Отметки таможни назначения или промежуточной таможни при выезде
     * 
     * @return value
     */
    public TIRCustomsMarkType getDepartureCustomsMark() {
        return departureCustomsMark;
    }

    /** 
     * Set the 'DepartureCustomsMark' element value. Отметки таможни назначения или промежуточной таможни при выезде
     * 
     * @param departureCustomsMark
     */
    public void setDepartureCustomsMark(TIRCustomsMarkType departureCustomsMark) {
        this.departureCustomsMark = departureCustomsMark;
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
