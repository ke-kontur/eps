
package ru.acs.fts.schemas.album.hemicalmeansprotectionplants;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ����������
 */
public class ConclusionType extends DocumentBaseType
{
    private LocalDate conclusionDeadLine;

    /** 
     * Get the 'ConclusionDeadLine' element value. ���� �������� ����������
     * 
     * @return value
     */
    public LocalDate getConclusionDeadLine() {
        return conclusionDeadLine;
    }

    /** 
     * Set the 'ConclusionDeadLine' element value. ���� �������� ����������
     * 
     * @param conclusionDeadLine
     */
    public void setConclusionDeadLine(LocalDate conclusionDeadLine) {
        this.conclusionDeadLine = conclusionDeadLine;
    }
}
