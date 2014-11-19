
package ru.acs.fts.schemas.album.goodsdiscrepancyreport;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.scvvcommonaggregatetypescust.ShipmentDiscrepancyInfoType;

/** 
 * ����� � ��������� ������������ ���������� � ������ ������� ��� ����������� �� ��
 */
public class GoodsDiscrepancyReportType extends BaseDocType
{
    private String discrepancyIndicator;
    private String processNumber;
    private List<ShipmentDiscrepancyInfoType> shipmentDiscrepancyInfoList = new ArrayList<ShipmentDiscrepancyInfoType>();
    private String documentModeID;

    /** 
     * Get the 'DiscrepancyIndicator' element value. ������� ������� ����������� � ��������� � ������
     * 
     * @return value
     */
    public String getDiscrepancyIndicator() {
        return discrepancyIndicator;
    }

    /** 
     * Set the 'DiscrepancyIndicator' element value. ������� ������� ����������� � ��������� � ������
     * 
     * @param discrepancyIndicator
     */
    public void setDiscrepancyIndicator(String discrepancyIndicator) {
        this.discrepancyIndicator = discrepancyIndicator;
    }

    /** 
     * Get the 'ProcessNumber' element value. ���������� ������������� ��������.
     * 
     * @return value
     */
    public String getProcessNumber() {
        return processNumber;
    }

    /** 
     * Set the 'ProcessNumber' element value. ���������� ������������� ��������.
     * 
     * @param processNumber
     */
    public void setProcessNumber(String processNumber) {
        this.processNumber = processNumber;
    }

    /** 
     * Get the list of 'ShipmentDiscrepancyInfo' element items. ���������� � ��������� ������������ � �������� ������
     * 
     * @return list
     */
    public List<ShipmentDiscrepancyInfoType> getShipmentDiscrepancyInfoList() {
        return shipmentDiscrepancyInfoList;
    }

    /** 
     * Set the list of 'ShipmentDiscrepancyInfo' element items. ���������� � ��������� ������������ � �������� ������
     * 
     * @param list
     */
    public void setShipmentDiscrepancyInfoList(
            List<ShipmentDiscrepancyInfoType> list) {
        shipmentDiscrepancyInfoList = list;
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
