
package ru.acs.fts.schemas.album.notifgoodstimeout;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Уведомление об истечении сроков предъявления товаров/предоставления сведений
 */
public class NotifGoodsTimeOutType extends BaseDocType
{
    private LocalDate stateChDate;
    private String stateChTime;
    private String processID;
    private String procState;
    private String stateDescription;
    private String prevProcState;
    private String prevStateDescription;
    private String documentModeID;

    /** 
     * Get the 'StateChDate' element value. Дата смены статуса
     * 
     * @return value
     */
    public LocalDate getStateChDate() {
        return stateChDate;
    }

    /** 
     * Set the 'StateChDate' element value. Дата смены статуса
     * 
     * @param stateChDate
     */
    public void setStateChDate(LocalDate stateChDate) {
        this.stateChDate = stateChDate;
    }

    /** 
     * Get the 'StateChTime' element value. Время смены статуса
     * 
     * @return value
     */
    public String getStateChTime() {
        return stateChTime;
    }

    /** 
     * Set the 'StateChTime' element value. Время смены статуса
     * 
     * @param stateChTime
     */
    public void setStateChTime(String stateChTime) {
        this.stateChTime = stateChTime;
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
     * Get the 'StateDescription' element value. Описание текущего статусного состояния
     * 
     * @return value
     */
    public String getStateDescription() {
        return stateDescription;
    }

    /** 
     * Set the 'StateDescription' element value. Описание текущего статусного состояния
     * 
     * @param stateDescription
     */
    public void setStateDescription(String stateDescription) {
        this.stateDescription = stateDescription;
    }

    /** 
     * Get the 'PrevProcState' element value. Предыдущий статус процесса
     * 
     * @return value
     */
    public String getPrevProcState() {
        return prevProcState;
    }

    /** 
     * Set the 'PrevProcState' element value. Предыдущий статус процесса
     * 
     * @param prevProcState
     */
    public void setPrevProcState(String prevProcState) {
        this.prevProcState = prevProcState;
    }

    /** 
     * Get the 'PrevStateDescription' element value. Описание предыдущего статусного состояния
     * 
     * @return value
     */
    public String getPrevStateDescription() {
        return prevStateDescription;
    }

    /** 
     * Set the 'PrevStateDescription' element value. Описание предыдущего статусного состояния
     * 
     * @param prevStateDescription
     */
    public void setPrevStateDescription(String prevStateDescription) {
        this.prevStateDescription = prevStateDescription;
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
