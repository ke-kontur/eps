
package ru.acs.fts.schemas.album.result;

import java.util.ArrayList;
import java.util.List;

/** 
 * Информация о процессе для которого запрашивается статус/история
 */
public class ProcInformationType
{
    private String procState;
    private String processID;
    private String stateDescription;
    private List<EventListType> eventList = new ArrayList<EventListType>();

    /** 
     * Get the 'ProcState' element value. Текущий статус процесса
     * 
     * @return value
     */
    public String getProcState() {
        return procState;
    }

    /** 
     * Set the 'ProcState' element value. Текущий статус процесса
     * 
     * @param procState
     */
    public void setProcState(String procState) {
        this.procState = procState;
    }

    /** 
     * Get the 'ProcessID' element value. Идентификатор процесса, для которого запрашивается статус / история
     * 
     * @return value
     */
    public String getProcessID() {
        return processID;
    }

    /** 
     * Set the 'ProcessID' element value. Идентификатор процесса, для которого запрашивается статус / история
     * 
     * @param processID
     */
    public void setProcessID(String processID) {
        this.processID = processID;
    }

    /** 
     * Get the 'StateDescription' element value. Описание статусного состояния
     * 
     * @return value
     */
    public String getStateDescription() {
        return stateDescription;
    }

    /** 
     * Set the 'StateDescription' element value. Описание статусного состояния
     * 
     * @param stateDescription
     */
    public void setStateDescription(String stateDescription) {
        this.stateDescription = stateDescription;
    }

    /** 
     * Get the list of 'EventList' element items. Информация о событиях / сообщениях
     * 
     * @return list
     */
    public List<EventListType> getEventList() {
        return eventList;
    }

    /** 
     * Set the list of 'EventList' element items. Информация о событиях / сообщениях
     * 
     * @param list
     */
    public void setEventList(List<EventListType> list) {
        eventList = list;
    }
}
