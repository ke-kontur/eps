
package ru.acs.fts.schemas.album.do1reportin;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHCarrierType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WareHouseReportType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WhTransportType;

/** 
 * ����� � ��������� ����� �� ��� �� ����� ��-1 (����������)
 */
public class DO1ReportInType extends WareHouseReportType
{
    private WHCarrierType carrier;
    private List<WhTransportType> transportList = new ArrayList<WhTransportType>();
    private DO1GoodsShipmentType goodsShipment;
    private String documentModeID;

    /** 
     * Get the 'Carrier' element value. ����������
     * 
     * @return value
     */
    public WHCarrierType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. ����������
     * 
     * @param carrier
     */
    public void setCarrier(WHCarrierType carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the list of 'Transports' element items. �������� ������������  �������
     * 
     * @return list
     */
    public List<WhTransportType> getTransportList() {
        return transportList;
    }

    /** 
     * Set the list of 'Transports' element items. �������� ������������  �������
     * 
     * @param list
     */
    public void setTransportList(List<WhTransportType> list) {
        transportList = list;
    }

    /** 
     * Get the 'GoodsShipment' element value. �������� � ������, ���������� �� ��������� ��������
     * 
     * @return value
     */
    public DO1GoodsShipmentType getGoodsShipment() {
        return goodsShipment;
    }

    /** 
     * Set the 'GoodsShipment' element value. �������� � ������, ���������� �� ��������� ��������
     * 
     * @param goodsShipment
     */
    public void setGoodsShipment(DO1GoodsShipmentType goodsShipment) {
        this.goodsShipment = goodsShipment;
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
