
package ru.acs.fts.schemas.album.tir_carnet;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.cutransportcommonaggregatetypescust.TIRForwarderType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.TDGuaranteeType;

/** 
 * ������ ���
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
     * Get the 'TIRHolderID' element value. ����������������� ����� ��������� ������ ���
     * 
     * @return value
     */
    public String getTIRHolderID() {
        return TIRHolderID;
    }

    /** 
     * Set the 'TIRHolderID' element value. ����������������� ����� ��������� ������ ���
     * 
     * @param TIRHolderID
     */
    public void setTIRHolderID(String TIRHolderID) {
        this.TIRHolderID = TIRHolderID;
    }

    /** 
     * Get the 'TIRCustomstCode' element value. ������. �� ������������. ��� ����������� ������ ���������� ���
     * 
     * @return value
     */
    public String getTIRCustomstCode() {
        return TIRCustomstCode;
    }

    /** 
     * Set the 'TIRCustomstCode' element value. ������. �� ������������. ��� ����������� ������ ���������� ���
     * 
     * @param TIRCustomstCode
     */
    public void setTIRCustomstCode(String TIRCustomstCode) {
        this.TIRCustomstCode = TIRCustomstCode;
    }

    /** 
     * Get the 'GoodsQuantity' element value. ����� �����  ������� �� ������ ���
     * 
     * @return value
     */
    public String getGoodsQuantity() {
        return goodsQuantity;
    }

    /** 
     * Set the 'GoodsQuantity' element value. ����� �����  ������� �� ������ ���
     * 
     * @param goodsQuantity
     */
    public void setGoodsQuantity(String goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }

    /** 
     * Get the 'ShipSpecifGoodsQuantity' element value. ���������� ������� �� ����������� �������������
     * 
     * @return value
     */
    public String getShipSpecifGoodsQuantity() {
        return shipSpecifGoodsQuantity;
    }

    /** 
     * Set the 'ShipSpecifGoodsQuantity' element value. ���������� ������� �� ����������� �������������
     * 
     * @param shipSpecifGoodsQuantity
     */
    public void setShipSpecifGoodsQuantity(String shipSpecifGoodsQuantity) {
        this.shipSpecifGoodsQuantity = shipSpecifGoodsQuantity;
    }

    /** 
     * Get the 'DispatchCountryCode' element value. ��������� ��� ������ �����������
     * 
     * @return value
     */
    public String getDispatchCountryCode() {
        return dispatchCountryCode;
    }

    /** 
     * Set the 'DispatchCountryCode' element value. ��������� ��� ������ �����������
     * 
     * @param dispatchCountryCode
     */
    public void setDispatchCountryCode(String dispatchCountryCode) {
        this.dispatchCountryCode = dispatchCountryCode;
    }

    /** 
     * Get the 'DestinationCountryCode' element value. ��������� ��� ������ ����������
     * 
     * @return value
     */
    public String getDestinationCountryCode() {
        return destinationCountryCode;
    }

    /** 
     * Set the 'DestinationCountryCode' element value. ��������� ��� ������ ����������
     * 
     * @param destinationCountryCode
     */
    public void setDestinationCountryCode(String destinationCountryCode) {
        this.destinationCountryCode = destinationCountryCode;
    }

    /** 
     * Get the 'TotalInvoicedCost' element value. ����� ��������� ���������
     * 
     * @return value
     */
    public String getTotalInvoicedCost() {
        return totalInvoicedCost;
    }

    /** 
     * Set the 'TotalInvoicedCost' element value. ����� ��������� ���������
     * 
     * @param totalInvoicedCost
     */
    public void setTotalInvoicedCost(String totalInvoicedCost) {
        this.totalInvoicedCost = totalInvoicedCost;
    }

    /** 
     * Get the 'TotalPageQuantity' element value. ���������� ������ ���� ����������
     * 
     * @return value
     */
    public String getTotalPageQuantity() {
        return totalPageQuantity;
    }

    /** 
     * Set the 'TotalPageQuantity' element value. ���������� ������ ���� ����������
     * 
     * @param totalPageQuantity
     */
    public void setTotalPageQuantity(String totalPageQuantity) {
        this.totalPageQuantity = totalPageQuantity;
    }

    /** 
     * Get the 'DestinationCountryName' element value. ������������ ������ ����������
     * 
     * @return value
     */
    public String getDestinationCountryName() {
        return destinationCountryName;
    }

    /** 
     * Set the 'DestinationCountryName' element value. ������������ ������ ����������
     * 
     * @param destinationCountryName
     */
    public void setDestinationCountryName(String destinationCountryName) {
        this.destinationCountryName = destinationCountryName;
    }

    /** 
     * Get the 'DispatchCountryName' element value. ������������ ������ �����������
     * 
     * @return value
     */
    public String getDispatchCountryName() {
        return dispatchCountryName;
    }

    /** 
     * Set the 'DispatchCountryName' element value. ������������ ������ �����������
     * 
     * @param dispatchCountryName
     */
    public void setDispatchCountryName(String dispatchCountryName) {
        this.dispatchCountryName = dispatchCountryName;
    }

    /** 
     * Get the 'DispatchCountryA3Code' element value. ���������  ISO Alpha 3 ��� ������ �����������
     * 
     * @return value
     */
    public String getDispatchCountryA3Code() {
        return dispatchCountryA3Code;
    }

    /** 
     * Set the 'DispatchCountryA3Code' element value. ���������  ISO Alpha 3 ��� ������ �����������
     * 
     * @param dispatchCountryA3Code
     */
    public void setDispatchCountryA3Code(String dispatchCountryA3Code) {
        this.dispatchCountryA3Code = dispatchCountryA3Code;
    }

    /** 
     * Get the 'DestinationCountryA3Code' element value. ���������  ISO Alpha 3 ��� ������ ����������
     * 
     * @return value
     */
    public String getDestinationCountryA3Code() {
        return destinationCountryA3Code;
    }

    /** 
     * Set the 'DestinationCountryA3Code' element value. ���������  ISO Alpha 3 ��� ������ ����������
     * 
     * @param destinationCountryA3Code
     */
    public void setDestinationCountryA3Code(String destinationCountryA3Code) {
        this.destinationCountryA3Code = destinationCountryA3Code;
    }

    /** 
     * Get the 'TIRIdentifier' element value. ������������� ������ ���
     * 
     * @return value
     */
    public TIRIdentifierType getTIRIdentifier() {
        return TIRIdentifier;
    }

    /** 
     * Set the 'TIRIdentifier' element value. ������������� ������ ���
     * 
     * @param TIRIdentifier
     */
    public void setTIRIdentifier(TIRIdentifierType TIRIdentifier) {
        this.TIRIdentifier = TIRIdentifier;
    }

    /** 
     * Get the 'Carrier' element value. ���������� / ��������� ������ ���
     * 
     * @return value
     */
    public TIRCarrierType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. ���������� / ��������� ������ ���
     * 
     * @param carrier
     */
    public void setCarrier(TIRCarrierType carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the 'Forwarder' element value. ����������
     * 
     * @return value
     */
    public TIRForwarderType getForwarder() {
        return forwarder;
    }

    /** 
     * Set the 'Forwarder' element value. ����������
     * 
     * @param forwarder
     */
    public void setForwarder(TIRForwarderType forwarder) {
        this.forwarder = forwarder;
    }

    /** 
     * Get the 'Guarantee' element value. �����������
     * 
     * @return value
     */
    public TDGuaranteeType getGuarantee() {
        return guarantee;
    }

    /** 
     * Set the 'Guarantee' element value. �����������
     * 
     * @param guarantee
     */
    public void setGuarantee(TDGuaranteeType guarantee) {
        this.guarantee = guarantee;
    }

    /** 
     * Get the list of 'TransportMeans' element items. ������������ ��������
     * 
     * @return list
     */
    public List<TIRTransportMeansType> getTransportMeanList() {
        return transportMeanList;
    }

    /** 
     * Set the list of 'TransportMeans' element items. ������������ ��������
     * 
     * @param list
     */
    public void setTransportMeanList(List<TIRTransportMeansType> list) {
        transportMeanList = list;
    }

    /** 
     * Get the list of 'PrecedingDocument' element items. �������������� ��������
     * 
     * @return list
     */
    public List<TIRPrecedingDocumentType> getPrecedingDocumentList() {
        return precedingDocumentList;
    }

    /** 
     * Set the list of 'PrecedingDocument' element items. �������������� ��������
     * 
     * @param list
     */
    public void setPrecedingDocumentList(List<TIRPrecedingDocumentType> list) {
        precedingDocumentList = list;
    }

    /** 
     * Get the list of 'TIR_Shipment' element items. �������� � �������� ������
     * 
     * @return list
     */
    public List<TIRShipmentType> getTIRShipmentList() {
        return TIRShipmentList;
    }

    /** 
     * Set the list of 'TIR_Shipment' element items. �������� � �������� ������
     * 
     * @param list
     */
    public void setTIRShipmentList(List<TIRShipmentType> list) {
        TIRShipmentList = list;
    }

    /** 
     * Get the 'DispatchCustomsMark' element value. ������� ������� ����������� ��� ������������� ������� ��� ������
     * 
     * @return value
     */
    public TIRCustomsMarkType getDispatchCustomsMark() {
        return dispatchCustomsMark;
    }

    /** 
     * Set the 'DispatchCustomsMark' element value. ������� ������� ����������� ��� ������������� ������� ��� ������
     * 
     * @param dispatchCustomsMark
     */
    public void setDispatchCustomsMark(TIRCustomsMarkType dispatchCustomsMark) {
        this.dispatchCustomsMark = dispatchCustomsMark;
    }

    /** 
     * Get the 'DepartureCustomsMark' element value. ������� ������� ���������� ��� ������������� ������� ��� ������
     * 
     * @return value
     */
    public TIRCustomsMarkType getDepartureCustomsMark() {
        return departureCustomsMark;
    }

    /** 
     * Set the 'DepartureCustomsMark' element value. ������� ������� ���������� ��� ������������� ������� ��� ������
     * 
     * @param departureCustomsMark
     */
    public void setDepartureCustomsMark(TIRCustomsMarkType departureCustomsMark) {
        this.departureCustomsMark = departureCustomsMark;
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
