
package ru.acs.fts.schemas.album.permitdelaydocs;

import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.DocumentDescriptionType;

/** 
 * Решение по документам
 */
public class DelayedDocsType extends DocumentDescriptionType
{
    private String delayDecision;
    private String requestPositionID;

    /** 
     * Get the 'DelayDecision' element value. Решение, которое принято по документу: 1 - положительное решение (отсрочка/в графическом виде) ; 0 - отрицательное решение
     * 
     * @return value
     */
    public String getDelayDecision() {
        return delayDecision;
    }

    /** 
     * Set the 'DelayDecision' element value. Решение, которое принято по документу: 1 - положительное решение (отсрочка/в графическом виде) ; 0 - отрицательное решение
     * 
     * @param delayDecision
     */
    public void setDelayDecision(String delayDecision) {
        this.delayDecision = delayDecision;
    }

    /** 
     * Get the 'RequestPositionID' element value. Идентификатор позиции в запросе
     * 
     * @return value
     */
    public String getRequestPositionID() {
        return requestPositionID;
    }

    /** 
     * Set the 'RequestPositionID' element value. Идентификатор позиции в запросе
     * 
     * @param requestPositionID
     */
    public void setRequestPositionID(String requestPositionID) {
        this.requestPositionID = requestPositionID;
    }
}
