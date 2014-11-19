
package ru.acs.fts.schemas.admin.statusupdaterequest;

/** 
 * Список статусных переходов
 */
public class StateTransmissionsType
{
    private String initialStateCode;
    private String softVersion;
    private String targetStateCode;
    private String messageType;
    private String stateModel;
    private EventEnumeration event;

    /** 
     * Get the 'InitialStateCode' element value. Исходный статус
     * 
     * @return value
     */
    public String getInitialStateCode() {
        return initialStateCode;
    }

    /** 
     * Set the 'InitialStateCode' element value. Исходный статус
     * 
     * @param initialStateCode
     */
    public void setInitialStateCode(String initialStateCode) {
        this.initialStateCode = initialStateCode;
    }

    /** 
     * Get the 'SoftVersion' element value. Версия
     * 
     * @return value
     */
    public String getSoftVersion() {
        return softVersion;
    }

    /** 
     * Set the 'SoftVersion' element value. Версия
     * 
     * @param softVersion
     */
    public void setSoftVersion(String softVersion) {
        this.softVersion = softVersion;
    }

    /** 
     * Get the 'TargetStateCode' element value. Целевой статус
     * 
     * @return value
     */
    public String getTargetStateCode() {
        return targetStateCode;
    }

    /** 
     * Set the 'TargetStateCode' element value. Целевой статус
     * 
     * @param targetStateCode
     */
    public void setTargetStateCode(String targetStateCode) {
        this.targetStateCode = targetStateCode;
    }

    /** 
     * Get the 'MessageType' element value. Сообщение
     * 
     * @return value
     */
    public String getMessageType() {
        return messageType;
    }

    /** 
     * Set the 'MessageType' element value. Сообщение
     * 
     * @param messageType
     */
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    /** 
     * Get the 'StateModel' element value. Статусная модель 
     * 
     * @return value
     */
    public String getStateModel() {
        return stateModel;
    }

    /** 
     * Set the 'StateModel' element value. Статусная модель 
     * 
     * @param stateModel
     */
    public void setStateModel(String stateModel) {
        this.stateModel = stateModel;
    }

    /** 
     * Get the 'Event' element value. Событие
     * 
     * @return value
     */
    public EventEnumeration getEvent() {
        return event;
    }

    /** 
     * Set the 'Event' element value. Событие
     * 
     * @param event
     */
    public void setEvent(EventEnumeration event) {
        this.event = event;
    }
}
