
package ru.acs.fts.schemas.album.airshoppingwaybill;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Табельный номер составившего накладную
 */
public class PersonScheduledNumberType extends PersonSignatureType
{
    private String scheduledNumber;

    /** 
     * Get the 'ScheduledNumber' element value. Табельный номер
     * 
     * @return value
     */
    public String getScheduledNumber() {
        return scheduledNumber;
    }

    /** 
     * Set the 'ScheduledNumber' element value. Табельный номер
     * 
     * @param scheduledNumber
     */
    public void setScheduledNumber(String scheduledNumber) {
        this.scheduledNumber = scheduledNumber;
    }
}
