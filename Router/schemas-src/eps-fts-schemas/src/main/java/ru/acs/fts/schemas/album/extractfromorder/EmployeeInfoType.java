
package ru.acs.fts.schemas.album.extractfromorder;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ��������  � ����������
 */
public class EmployeeInfoType extends PersonSignatureType
{
    private String clockNumber;

    /** 
     * Get the 'ClockNumber' element value. ��������� �����
     * 
     * @return value
     */
    public String getClockNumber() {
        return clockNumber;
    }

    /** 
     * Set the 'ClockNumber' element value. ��������� �����
     * 
     * @param clockNumber
     */
    public void setClockNumber(String clockNumber) {
        this.clockNumber = clockNumber;
    }
}
