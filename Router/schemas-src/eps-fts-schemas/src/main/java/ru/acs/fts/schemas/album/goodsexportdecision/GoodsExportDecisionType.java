
package ru.acs.fts.schemas.album.goodsexportdecision;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.scvvcommonaggregatetypescust.SCVVConsigmentDecisionType;

/** 
 * ������� � ����������/������� ������ ������� � �����������
 */
public class GoodsExportDecisionType extends BaseDocType
{
    private String decisionDate;
    private String processNumber;
    private List<SCVVConsigmentDecisionType> shipmentFactInfoList = new ArrayList<SCVVConsigmentDecisionType>();
    private String documentModeID;

    /** 
     * Get the 'DecisionDate' element value. ���� � ����� �������� �������
     * 
     * @return value
     */
    public String getDecisionDate() {
        return decisionDate;
    }

    /** 
     * Set the 'DecisionDate' element value. ���� � ����� �������� �������
     * 
     * @param decisionDate
     */
    public void setDecisionDate(String decisionDate) {
        this.decisionDate = decisionDate;
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
     * Get the list of 'ShipmentFactInfo' element items. �������� �� �������� ������� �� �������� ������.
     * 
     * @return list
     */
    public List<SCVVConsigmentDecisionType> getShipmentFactInfoList() {
        return shipmentFactInfoList;
    }

    /** 
     * Set the list of 'ShipmentFactInfo' element items. �������� �� �������� ������� �� �������� ������.
     * 
     * @param list
     */
    public void setShipmentFactInfoList(List<SCVVConsigmentDecisionType> list) {
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
