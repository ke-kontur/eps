
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

import org.joda.time.DateTime;

/** 
 * Информация о дате и времени размещения в архиве.
 */
public class AUDArchivePutInfoType
{
    private DateTime putDateTime;

    /** 
     * Get the 'PutDateTime' element value. Дата и время размещения в архиве.
     * 
     * @return value
     */
    public DateTime getPutDateTime() {
        return putDateTime;
    }

    /** 
     * Set the 'PutDateTime' element value. Дата и время размещения в архиве.
     * 
     * @param putDateTime
     */
    public void setPutDateTime(DateTime putDateTime) {
        this.putDateTime = putDateTime;
    }
}
