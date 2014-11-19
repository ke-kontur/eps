
package ru.acs.fts.schemas.album.rfhissuedetailsresponse;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Разрешение
 */
public class PermissionType extends DocumentBaseType
{
    private LocalDate endDate;

    /** 
     * Get the 'EndDate' element value. Действительно до
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. Действительно до
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
