
package ru.acs.fts.schemas.album.airshoppingwaybill;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ��������� ����� ������������ ���������
 */
public class PersonScheduledNumberType extends PersonSignatureType
{
    private String scheduledNumber;

    /** 
     * Get the 'ScheduledNumber' element value. ��������� �����
     * 
     * @return value
     */
    public String getScheduledNumber() {
        return scheduledNumber;
    }

    /** 
     * Set the 'ScheduledNumber' element value. ��������� �����
     * 
     * @param scheduledNumber
     */
    public void setScheduledNumber(String scheduledNumber) {
        this.scheduledNumber = scheduledNumber;
    }
}
