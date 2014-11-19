
package ru.acs.fts.schemas.album.permitdelaydocs;

import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.DocumentDescriptionType;

/** 
 * ������� �� ����������
 */
public class DelayedDocsType extends DocumentDescriptionType
{
    private String delayDecision;
    private String requestPositionID;

    /** 
     * Get the 'DelayDecision' element value. �������, ������� ������� �� ���������: 1 - ������������� ������� (��������/� ����������� ����) ; 0 - ������������� �������
     * 
     * @return value
     */
    public String getDelayDecision() {
        return delayDecision;
    }

    /** 
     * Set the 'DelayDecision' element value. �������, ������� ������� �� ���������: 1 - ������������� ������� (��������/� ����������� ����) ; 0 - ������������� �������
     * 
     * @param delayDecision
     */
    public void setDelayDecision(String delayDecision) {
        this.delayDecision = delayDecision;
    }

    /** 
     * Get the 'RequestPositionID' element value. ������������� ������� � �������
     * 
     * @return value
     */
    public String getRequestPositionID() {
        return requestPositionID;
    }

    /** 
     * Set the 'RequestPositionID' element value. ������������� ������� � �������
     * 
     * @param requestPositionID
     */
    public void setRequestPositionID(String requestPositionID) {
        this.requestPositionID = requestPositionID;
    }
}
