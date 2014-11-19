
package ru.acs.fts.schemas.album.goodsdiscrepancyreport;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.scvvcommonaggregatetypescust.ShipmentDiscrepancyInfoType;

/** 
 * Отчет о найденных расхождениях заявленных к вывозу товаров над заявленными по ДТ
 */
public class GoodsDiscrepancyReportType extends BaseDocType
{
    private String discrepancyIndicator;
    private String processNumber;
    private List<ShipmentDiscrepancyInfoType> shipmentDiscrepancyInfoList = new ArrayList<ShipmentDiscrepancyInfoType>();
    private String documentModeID;

    /** 
     * Get the 'DiscrepancyIndicator' element value. Признак наличия расхождений в сообщении о вывозе
     * 
     * @return value
     */
    public String getDiscrepancyIndicator() {
        return discrepancyIndicator;
    }

    /** 
     * Set the 'DiscrepancyIndicator' element value. Признак наличия расхождений в сообщении о вывозе
     * 
     * @param discrepancyIndicator
     */
    public void setDiscrepancyIndicator(String discrepancyIndicator) {
        this.discrepancyIndicator = discrepancyIndicator;
    }

    /** 
     * Get the 'ProcessNumber' element value. Уникальный идентификатор процесса.
     * 
     * @return value
     */
    public String getProcessNumber() {
        return processNumber;
    }

    /** 
     * Set the 'ProcessNumber' element value. Уникальный идентификатор процесса.
     * 
     * @param processNumber
     */
    public void setProcessNumber(String processNumber) {
        this.processNumber = processNumber;
    }

    /** 
     * Get the list of 'ShipmentDiscrepancyInfo' element items. Информация о найденных расхождениях в товарной партии
     * 
     * @return list
     */
    public List<ShipmentDiscrepancyInfoType> getShipmentDiscrepancyInfoList() {
        return shipmentDiscrepancyInfoList;
    }

    /** 
     * Set the list of 'ShipmentDiscrepancyInfo' element items. Информация о найденных расхождениях в товарной партии
     * 
     * @param list
     */
    public void setShipmentDiscrepancyInfoList(
            List<ShipmentDiscrepancyInfoType> list) {
        shipmentDiscrepancyInfoList = list;
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
