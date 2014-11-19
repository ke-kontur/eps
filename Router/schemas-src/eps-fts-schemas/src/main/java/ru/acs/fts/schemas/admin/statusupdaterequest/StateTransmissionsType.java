
package ru.acs.fts.schemas.admin.statusupdaterequest;

/** 
 * ������ ��������� ���������
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
     * Get the 'InitialStateCode' element value. �������� ������
     * 
     * @return value
     */
    public String getInitialStateCode() {
        return initialStateCode;
    }

    /** 
     * Set the 'InitialStateCode' element value. �������� ������
     * 
     * @param initialStateCode
     */
    public void setInitialStateCode(String initialStateCode) {
        this.initialStateCode = initialStateCode;
    }

    /** 
     * Get the 'SoftVersion' element value. ������
     * 
     * @return value
     */
    public String getSoftVersion() {
        return softVersion;
    }

    /** 
     * Set the 'SoftVersion' element value. ������
     * 
     * @param softVersion
     */
    public void setSoftVersion(String softVersion) {
        this.softVersion = softVersion;
    }

    /** 
     * Get the 'TargetStateCode' element value. ������� ������
     * 
     * @return value
     */
    public String getTargetStateCode() {
        return targetStateCode;
    }

    /** 
     * Set the 'TargetStateCode' element value. ������� ������
     * 
     * @param targetStateCode
     */
    public void setTargetStateCode(String targetStateCode) {
        this.targetStateCode = targetStateCode;
    }

    /** 
     * Get the 'MessageType' element value. ���������
     * 
     * @return value
     */
    public String getMessageType() {
        return messageType;
    }

    /** 
     * Set the 'MessageType' element value. ���������
     * 
     * @param messageType
     */
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    /** 
     * Get the 'StateModel' element value. ��������� ������ 
     * 
     * @return value
     */
    public String getStateModel() {
        return stateModel;
    }

    /** 
     * Set the 'StateModel' element value. ��������� ������ 
     * 
     * @param stateModel
     */
    public void setStateModel(String stateModel) {
        this.stateModel = stateModel;
    }

    /** 
     * Get the 'Event' element value. �������
     * 
     * @return value
     */
    public EventEnumeration getEvent() {
        return event;
    }

    /** 
     * Set the 'Event' element value. �������
     * 
     * @param event
     */
    public void setEvent(EventEnumeration event) {
        this.event = event;
    }
}
