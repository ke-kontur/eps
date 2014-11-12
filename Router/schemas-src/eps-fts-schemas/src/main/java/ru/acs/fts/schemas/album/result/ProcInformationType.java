
package ru.acs.fts.schemas.album.result;

import java.util.ArrayList;
import java.util.List;

/** 
 * ���������� � �������� ��� �������� ������������� ������/�������
 */
public class ProcInformationType
{
    private String procState;
    private String processID;
    private String stateDescription;
    private List<EventListType> eventList = new ArrayList<EventListType>();

    /** 
     * Get the 'ProcState' element value. ������� ������ ��������
     * 
     * @return value
     */
    public String getProcState() {
        return procState;
    }

    /** 
     * Set the 'ProcState' element value. ������� ������ ��������
     * 
     * @param procState
     */
    public void setProcState(String procState) {
        this.procState = procState;
    }

    /** 
     * Get the 'ProcessID' element value. ������������� ��������, ��� �������� ������������� ������ / �������
     * 
     * @return value
     */
    public String getProcessID() {
        return processID;
    }

    /** 
     * Set the 'ProcessID' element value. ������������� ��������, ��� �������� ������������� ������ / �������
     * 
     * @param processID
     */
    public void setProcessID(String processID) {
        this.processID = processID;
    }

    /** 
     * Get the 'StateDescription' element value. �������� ���������� ���������
     * 
     * @return value
     */
    public String getStateDescription() {
        return stateDescription;
    }

    /** 
     * Set the 'StateDescription' element value. �������� ���������� ���������
     * 
     * @param stateDescription
     */
    public void setStateDescription(String stateDescription) {
        this.stateDescription = stateDescription;
    }

    /** 
     * Get the list of 'EventList' element items. ���������� � �������� / ����������
     * 
     * @return list
     */
    public List<EventListType> getEventList() {
        return eventList;
    }

    /** 
     * Set the list of 'EventList' element items. ���������� � �������� / ����������
     * 
     * @param list
     */
    public void setEventList(List<EventListType> list) {
        eventList = list;
    }
}
