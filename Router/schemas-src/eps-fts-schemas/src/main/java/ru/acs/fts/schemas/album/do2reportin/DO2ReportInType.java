
package ru.acs.fts.schemas.album.do2reportin;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHCarrierType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WareHouseReportType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WhTransportType;

/** 
 * Отчет о выдаче товаров с СВХ по форме ДО2 (внутренний)
 */
public class DO2ReportInType extends WareHouseReportType
{
    private WHCarrierType carrier;
    private List<WhTransportType> DOTransportList = new ArrayList<WhTransportType>();
    private DO2GoodsShipmentType goodsShipment;
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
     * Get the list of 'DOTransports' element items. Транспортные средства
     * 
     * @return list
     */
    public List<WhTransportType> getDOTransportList() {
        return DOTransportList;
    }

    /** 
     * Set the list of 'DOTransports' element items. Транспортные средства
     * 
     * @param list
     */
    public void setDOTransportList(List<WhTransportType> list) {
        DOTransportList = list;
    }

    /** 
     * Get the 'GoodsShipment' element value. Сведения о товарах, выпускаемых со склада
     * 
     * @return value
     */
    public DO2GoodsShipmentType getGoodsShipment() {
        return goodsShipment;
    }

    /** 
     * Set the 'GoodsShipment' element value. Сведения о товарах, выпускаемых со склада
     * 
     * @param goodsShipment
     */
    public void setGoodsShipment(DO2GoodsShipmentType goodsShipment) {
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
