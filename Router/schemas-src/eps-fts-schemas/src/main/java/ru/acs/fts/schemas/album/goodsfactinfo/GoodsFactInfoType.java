
package ru.acs.fts.schemas.album.goodsfactinfo;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.scvvcommonaggregatetypescust.SCVVConsignmentType;

/** 
 * ���������� � ���������� ��������� �������
 */
public class GoodsFactInfoType extends BaseDocType
{
    private String processNumber;
    private List<SCVVConsignmentType> shipmentFactInfoList = new ArrayList<SCVVConsignmentType>();
    private String documentModeID;

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
     * Get the list of 'ShipmentFactInfo' element items. ���������� � ����������� ������ �� �������� ������
     * 
     * @return list
     */
    public List<SCVVConsignmentType> getShipmentFactInfoList() {
        return shipmentFactInfoList;
    }

    /** 
     * Set the list of 'ShipmentFactInfo' element items. ���������� � ����������� ������ �� �������� ������
     * 
     * @param list
     */
    public void setShipmentFactInfoList(List<SCVVConsignmentType> list) {
        shipmentFactInfoList = list;
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
