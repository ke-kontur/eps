
package ru.acs.fts.schemas.album.reportclosecontrol;

import org.joda.time.LocalDate;

/** 
 * Нормативный документ, в соответствии с которым выполняется контроль
 */
public class CheckNormativeDocumentType extends NormativeDocumentType
{
    private LocalDate beginDate;
    private LocalDate endDate;

    /** 
     * Get the 'BeginDate' element value. Дата начала действия документа для данного контроля
     * 
     * @return value
     */
    public LocalDate getBeginDate() {
        return beginDate;
    }

    /** 
     * Set the 'BeginDate' element value. Дата начала действия документа для данного контроля
     * 
     * @param beginDate
     */
    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    /** 
     * Get the 'EndDate' element value. Дата окончания действия документа для данного контроля
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. Дата окончания действия документа для данного контроля
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
