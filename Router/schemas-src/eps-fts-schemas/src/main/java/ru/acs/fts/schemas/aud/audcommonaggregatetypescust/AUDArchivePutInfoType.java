
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

import org.joda.time.DateTime;

/** 
 * ���������� � ���� � ������� ���������� � ������.
 */
public class AUDArchivePutInfoType
{
    private DateTime putDateTime;

    /** 
     * Get the 'PutDateTime' element value. ���� � ����� ���������� � ������.
     * 
     * @return value
     */
    public DateTime getPutDateTime() {
        return putDateTime;
    }

    /** 
     * Set the 'PutDateTime' element value. ���� � ����� ���������� � ������.
     * 
     * @param putDateTime
     */
    public void setPutDateTime(DateTime putDateTime) {
        this.putDateTime = putDateTime;
    }
}
