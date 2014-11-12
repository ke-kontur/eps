
package ru.acs.fts.schemas.album.inventory;

import org.joda.time.LocalDate;

/** 
 * Дата представления товарной партии
 */
public class GoodsPresentDateType
{
    private LocalDate presentDate;

    /** 
     * Get the 'PresentDate' element value. Дата представления товара/товарной партии
     * 
     * @return value
     */
    public LocalDate getPresentDate() {
        return presentDate;
    }

    /** 
     * Set the 'PresentDate' element value. Дата представления товара/товарной партии
     * 
     * @param presentDate
     */
    public void setPresentDate(LocalDate presentDate) {
        this.presentDate = presentDate;
    }
}
