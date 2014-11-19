
package ru.acs.fts.schemas.album.actcommonform;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ��� ����� �����
 */
public class ActCommonFormType extends BaseDocType
{
    private String trainIndex;
    private String trainNumber;
    private String span;
    private String shipmentNumber;
    private LocalDate receiptDate;
    private String reason;
    private DocumentBaseType actInfo;
    private StationType station;
    private CUOrganizationType carrier;
    private StationType departureStation;
    private StationType dispatchStation;
    private List<GoodsInfoType> goodList = new ArrayList<GoodsInfoType>();
    private List<PersonType> personList = new ArrayList<PersonType>();
    private CustomsType wayCustoms;
    private GTDIDType TD;
    private String documentModeID;

    /** 
     * Get the 'TrainIndex' element value. ������ ������
     * 
     * @return value
     */
    public String getTrainIndex() {
        return trainIndex;
    }

    /** 
     * Set the 'TrainIndex' element value. ������ ������
     * 
     * @param trainIndex
     */
    public void setTrainIndex(String trainIndex) {
        this.trainIndex = trainIndex;
    }

    /** 
     * Get the 'TrainNumber' element value. ����� ������
     * 
     * @return value
     */
    public String getTrainNumber() {
        return trainNumber;
    }

    /** 
     * Set the 'TrainNumber' element value. ����� ������
     * 
     * @param trainNumber
     */
    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    /** 
     * Get the 'Span' element value. �������
     * 
     * @return value
     */
    public String getSpan() {
        return span;
    }

    /** 
     * Set the 'Span' element value. �������
     * 
     * @param span
     */
    public void setSpan(String span) {
        this.span = span;
    }

    /** 
     * Get the 'ShipmentNumber' element value. ����� �������� (���������)
     * 
     * @return value
     */
    public String getShipmentNumber() {
        return shipmentNumber;
    }

    /** 
     * Set the 'ShipmentNumber' element value. ����� �������� (���������)
     * 
     * @param shipmentNumber
     */
    public void setShipmentNumber(String shipmentNumber) {
        this.shipmentNumber = shipmentNumber;
    }

    /** 
     * Get the 'ReceiptDate' element value. ���� ������ ����� � ���������
     * 
     * @return value
     */
    public LocalDate getReceiptDate() {
        return receiptDate;
    }

    /** 
     * Set the 'ReceiptDate' element value. ���� ������ ����� � ���������
     * 
     * @param receiptDate
     */
    public void setReceiptDate(LocalDate receiptDate) {
        this.receiptDate = receiptDate;
    }

    /** 
     * Get the 'Reason' element value. �������� �������������, ��������� ����������� ����
     * 
     * @return value
     */
    public String getReason() {
        return reason;
    }

    /** 
     * Set the 'Reason' element value. �������� �������������, ��������� ����������� ����
     * 
     * @param reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /** 
     * Get the 'ActInfo' element value. ����� � ���� ����������� ���� ����� �����
     * 
     * @return value
     */
    public DocumentBaseType getActInfo() {
        return actInfo;
    }

    /** 
     * Set the 'ActInfo' element value. ����� � ���� ����������� ���� ����� �����
     * 
     * @param actInfo
     */
    public void setActInfo(DocumentBaseType actInfo) {
        this.actInfo = actInfo;
    }

    /** 
     * Get the 'Station' element value. �������� � ��������������� �������
     * 
     * @return value
     */
    public StationType getStation() {
        return station;
    }

    /** 
     * Set the 'Station' element value. �������� � ��������������� �������
     * 
     * @param station
     */
    public void setStation(StationType station) {
        this.station = station;
    }

    /** 
     * Get the 'Carrier' element value. ����������
     * 
     * @return value
     */
    public CUOrganizationType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. ����������
     * 
     * @param carrier
     */
    public void setCarrier(CUOrganizationType carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the 'DepartureStation' element value. ������� �����������
     * 
     * @return value
     */
    public StationType getDepartureStation() {
        return departureStation;
    }

    /** 
     * Set the 'DepartureStation' element value. ������� �����������
     * 
     * @param departureStation
     */
    public void setDepartureStation(StationType departureStation) {
        this.departureStation = departureStation;
    }

    /** 
     * Get the 'DispatchStation' element value. ������� ����������
     * 
     * @return value
     */
    public StationType getDispatchStation() {
        return dispatchStation;
    }

    /** 
     * Set the 'DispatchStation' element value. ������� ����������
     * 
     * @param dispatchStation
     */
    public void setDispatchStation(StationType dispatchStation) {
        this.dispatchStation = dispatchStation;
    }

    /** 
     * Get the list of 'Goods' element items. �������� ������
     * 
     * @return list
     */
    public List<GoodsInfoType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. �������� ������
     * 
     * @param list
     */
    public void setGoodList(List<GoodsInfoType> list) {
        goodList = list;
    }

    /** 
     * Get the list of 'Person' element items. ����, � ����������� �������� ��������� ���
     * 
     * @return list
     */
    public List<PersonType> getPersonList() {
        return personList;
    }

    /** 
     * Set the list of 'Person' element items. ����, � ����������� �������� ��������� ���
     * 
     * @param list
     */
    public void setPersonList(List<PersonType> list) {
        personList = list;
    }

    /** 
     * Get the 'WayCustoms' element value. ������������� ���������� ����
     * 
     * @return value
     */
    public CustomsType getWayCustoms() {
        return wayCustoms;
    }

    /** 
     * Set the 'WayCustoms' element value. ������������� ���������� ����
     * 
     * @param wayCustoms
     */
    public void setWayCustoms(CustomsType wayCustoms) {
        this.wayCustoms = wayCustoms;
    }

    /** 
     * Get the 'TD' element value. ����� ���������� ����������
     * 
     * @return value
     */
    public GTDIDType getTD() {
        return TD;
    }

    /** 
     * Set the 'TD' element value. ����� ���������� ����������
     * 
     * @param TD
     */
    public void setTD(GTDIDType TD) {
        this.TD = TD;
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
