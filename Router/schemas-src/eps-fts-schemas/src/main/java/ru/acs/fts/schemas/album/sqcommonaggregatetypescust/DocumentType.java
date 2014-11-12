
package ru.acs.fts.schemas.album.sqcommonaggregatetypescust;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Сведения о документах
 */
public class DocumentType extends DocumentBaseType
{
    private LocalDate dateTo;

    /** 
     * Get the 'DateTo' element value. Срок действия заключения
     * 
     * @return value
     */
    public LocalDate getDateTo() {
        return dateTo;
    }

    /** 
     * Set the 'DateTo' element value. Срок действия заключения
     * 
     * @param dateTo
     */
    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }
}
