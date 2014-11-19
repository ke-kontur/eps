
package ru.acs.fts.schemas.album.ktsoutcustomsmark;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;

/** 
 * Сведения о подписи/внесении служебной отметки
 */
public class SubscriptionType extends CustomsPersonType
{
    private LocalDate markDate;
    private String markTime;

    /** 
     * Get the 'MarkDate' element value. Дата подписи/ внесения служебной отметки
     * 
     * @return value
     */
    public LocalDate getMarkDate() {
        return markDate;
    }

    /** 
     * Set the 'MarkDate' element value. Дата подписи/ внесения служебной отметки
     * 
     * @param markDate
     */
    public void setMarkDate(LocalDate markDate) {
        this.markDate = markDate;
    }

    /** 
     * Get the 'MarkTime' element value. Время подписи/ внесения служебной отметки
     * 
     * @return value
     */
    public String getMarkTime() {
        return markTime;
    }

    /** 
     * Set the 'MarkTime' element value. Время подписи/ внесения служебной отметки
     * 
     * @param markTime
     */
    public void setMarkTime(String markTime) {
        this.markTime = markTime;
    }
}
