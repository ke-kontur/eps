
package ru.acs.fts.schemas.album.inventory;

import org.joda.time.LocalDate;

/** 
 * ƒата представлени€ товарной партии
 */
public class GoodsPresentDateType
{
    private LocalDate presentDate;

    /** 
     * Get the 'PresentDate' element value. ƒата представлени€ товара/товарной партии
     * 
     * @return value
     */
    public LocalDate getPresentDate() {
        return presentDate;
    }

    /** 
     * Set the 'PresentDate' element value. ƒата представлени€ товара/товарной партии
     * 
     * @param presentDate
     */
    public void setPresentDate(LocalDate presentDate) {
        this.presentDate = presentDate;
    }
}
