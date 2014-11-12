
package ru.acs.fts.schemas.album.do1report;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHCarrierType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WareHouseReportType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WhTransportType;

/** 
 * Отчет о помещении товара на СВХ по форме ДО-1
 */
public class DO1ReportType extends WareHouseReportType
{
    private WHCarrierType carrier;
    private List<WhTransportType> transportList = new ArrayList<WhTransportType>();
    private DO1GoodsShipmentType goodsShipment;
    private String documentModeID;

    /** 
     * Get the 'Carrier' element value. Перевозчик
     * 
     * @return value
     */
    public WHCarrierType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. Перевозчик
     * 
     * @param carrier
     */
    public void setCarrier(WHCarrierType carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the list of 'Transports' element items. Описание транспортных  средств
     * 
     * @return list
     */
    public List<WhTransportType> getTransportList() {
        return transportList;
    }

    /** 
     * Set the list of 'Transports' element items. Описание транспортных  средств
     * 
     * @param list
     */
    public void setTransportList(List<WhTransportType> list) {
        transportList = list;
    }

    /** 
     * Get the 'GoodsShipment' element value. Сведения о грузах, помещаемых на временное хранение
     * 
     * @return value
     */
    public DO1GoodsShipmentType getGoodsShipment() {
        return goodsShipment;
    }

    /** 
     * Set the 'GoodsShipment' element value. Сведения о грузах, помещаемых на временное хранение
     * 
     * @param goodsShipment
     */
    public void setGoodsShipment(DO1GoodsShipmentType goodsShipment) {
        this.goodsShipment = goodsShipment;
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
