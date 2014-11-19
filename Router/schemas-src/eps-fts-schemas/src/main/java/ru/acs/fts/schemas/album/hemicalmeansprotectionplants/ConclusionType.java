
package ru.acs.fts.schemas.album.hemicalmeansprotectionplants;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Заключение
 */
public class ConclusionType extends DocumentBaseType
{
    private LocalDate conclusionDeadLine;

    /** 
     * Get the 'ConclusionDeadLine' element value. Срок действия заключения
     * 
     * @return value
     */
    public LocalDate getConclusionDeadLine() {
        return conclusionDeadLine;
    }

    /** 
     * Set the 'ConclusionDeadLine' element value. Срок действия заключения
     * 
     * @param conclusionDeadLine
     */
    public void setConclusionDeadLine(LocalDate conclusionDeadLine) {
        this.conclusionDeadLine = conclusionDeadLine;
    }
}
