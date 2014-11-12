
package ru.acs.fts.schemas.album.scvvcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.scvvcommonleaftypescust.StateShipmentType;

/** 
 * �������� � ������� � ������ �������� ������
 */
public class SCVVConsigmentDecisionType
{
    private StateShipmentType stateShipment;
    private List<String> causeList = new ArrayList<String>();
    private SCVVConsignmentType shipmentFactInfo;

    /** 
     * Get the 'StateShipment' element value. ������ ������ ����� �������� �������.
     * 
     * @return value
     */
    public StateShipmentType getStateShipment() {
        return stateShipment;
    }

    /** 
     * Set the 'StateShipment' element value. ������ ������ ����� �������� �������.
     * 
     * @param stateShipment
     */
    public void setStateShipment(StateShipmentType stateShipment) {
        this.stateShipment = stateShipment;
    }

    /** 
     * Get the list of 'Cause' element items. �������� ������ ��������� �������
     * 
     * @return list
     */
    public List<String> getCauseList() {
        return causeList;
    }

    /** 
     * Set the list of 'Cause' element items. �������� ������ ��������� �������
     * 
     * @param list
     */
    public void setCauseList(List<String> list) {
        causeList = list;
    }

    /** 
     * Get the 'ShipmentFactInfo' element value. ���������� � ����������� ������ �� �������� ������ (� ������ �������� ������� � ���������� ������������ ������ �������)
     * 
     * @return value
     */
    public SCVVConsignmentType getShipmentFactInfo() {
        return shipmentFactInfo;
    }

    /** 
     * Set the 'ShipmentFactInfo' element value. ���������� � ����������� ������ �� �������� ������ (� ������ �������� ������� � ���������� ������������ ������ �������)
     * 
     * @param shipmentFactInfo
     */
    public void setShipmentFactInfo(SCVVConsignmentType shipmentFactInfo) {
        this.shipmentFactInfo = shipmentFactInfo;
    }
}
