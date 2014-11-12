
package ru.acs.fts.schemas.album.ktsin;

import org.joda.time.LocalDate;

/** 
 * КТС. Внутренний формат. Технологические отметки.
 */
public class KTSinTechMarksType
{
    private LocalDate modificationDate;
    private String modificationTime;

    /** 
     * Get the 'ModificationDate' element value. Дата последнего внесения изменений в документ.
     * 
     * @return value
     */
    public LocalDate getModificationDate() {
        return modificationDate;
    }

    /** 
     * Set the 'ModificationDate' element value. Дата последнего внесения изменений в документ.
     * 
     * @param modificationDate
     */
    public void setModificationDate(LocalDate modificationDate) {
        this.modificationDate = modificationDate;
    }

    /** 
     * Get the 'ModificationTime' element value. Время последнего внесения изменений в ДТС.
     * 
     * @return value
     */
    public String getModificationTime() {
        return modificationTime;
    }

    /** 
     * Set the 'ModificationTime' element value. Время последнего внесения изменений в ДТС.
     * 
     * @param modificationTime
     */
    public void setModificationTime(String modificationTime) {
        this.modificationTime = modificationTime;
    }
}
