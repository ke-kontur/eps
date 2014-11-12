
package ru.acs.fts.schemas.admin.statusupdaterequest;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.admin.intexchcommonaggregatetypescust.BaseDocType;

/** 
 * Запрос сведений о состояниях (статусах) процедуры
 */
public class StatusUpdateRequestType extends BaseDocType
{
    private List<StateTransmissionsType> stateTransmissionList = new ArrayList<StateTransmissionsType>();
    private List<StatusesType> statuseList = new ArrayList<StatusesType>();
    private String documentModeID;

    /** 
     * Get the list of 'StateTransmissions' element items. Список статусных переходов
     * 
     * @return list
     */
    public List<StateTransmissionsType> getStateTransmissionList() {
        return stateTransmissionList;
    }

    /** 
     * Set the list of 'StateTransmissions' element items. Список статусных переходов
     * 
     * @param list
     */
    public void setStateTransmissionList(List<StateTransmissionsType> list) {
        stateTransmissionList = list;
    }

    /** 
     * Get the list of 'Statuses' element items. Список статусов 
     * 
     * @return list
     */
    public List<StatusesType> getStatuseList() {
        return statuseList;
    }

    /** 
     * Set the list of 'Statuses' element items. Список статусов 
     * 
     * @param list
     */
    public void setStatuseList(List<StatusesType> list) {
        statuseList = list;
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
