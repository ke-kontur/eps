
package ru.acs.fts.schemas.album.extractfromorder;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Сведения  о сотруднике
 */
public class EmployeeInfoType extends PersonSignatureType
{
    private String clockNumber;

    /** 
     * Get the 'ClockNumber' element value. Табельный номер
     * 
     * @return value
     */
    public String getClockNumber() {
        return clockNumber;
    }

    /** 
     * Set the 'ClockNumber' element value. Табельный номер
     * 
     * @param clockNumber
     */
    public void setClockNumber(String clockNumber) {
        this.clockNumber = clockNumber;
    }
}
