
package ru.acs.fts.schemas.album.conclusionaboutnotaccessory;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Заключение
 */
public class ConclusionType extends DocumentBaseType
{
    private LocalDate duration;

    /** 
     * Get the 'Duration' element value. Cрок действия заключения
     * 
     * @return value
     */
    public LocalDate getDuration() {
        return duration;
    }

    /** 
     * Set the 'Duration' element value. Cрок действия заключения
     * 
     * @param duration
     */
    public void setDuration(LocalDate duration) {
        this.duration = duration;
    }
}
