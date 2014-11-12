
package ru.acs.fts.schemas.album.tir_carnet;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;

/** 
 * Должностное лицо таможенного органа.
 */
public class TIRCustomsPersonType extends CustomsPersonType
{
    private LocalDate date;

    /** 
     * Get the 'Date' element value. Дата
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. Дата
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }
}
