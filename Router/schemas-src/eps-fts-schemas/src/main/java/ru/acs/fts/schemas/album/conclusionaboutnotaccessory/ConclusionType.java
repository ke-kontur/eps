
package ru.acs.fts.schemas.album.conclusionaboutnotaccessory;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ����������
 */
public class ConclusionType extends DocumentBaseType
{
    private LocalDate duration;

    /** 
     * Get the 'Duration' element value. C��� �������� ����������
     * 
     * @return value
     */
    public LocalDate getDuration() {
        return duration;
    }

    /** 
     * Set the 'Duration' element value. C��� �������� ����������
     * 
     * @param duration
     */
    public void setDuration(LocalDate duration) {
        this.duration = duration;
    }
}
