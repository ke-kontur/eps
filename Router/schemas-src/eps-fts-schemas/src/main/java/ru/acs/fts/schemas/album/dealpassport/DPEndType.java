
package ru.acs.fts.schemas.album.dealpassport;

import org.joda.time.LocalDate;

/** 
 * Информация о закрытии ПС
 */
public class DPEndType
{
    private LocalDate date;
    private String reason;

    /** 
     * Get the 'Date' element value. Дата закрытия ПС
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. Дата закрытия ПС
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'Reason' element value. Основание для закрытия ПС (указывается номер подпункта 3.18.1 - 3.18.3 пункта 3.18 Инструкции ЦБ РФ от 15.06.2004 г. N 117-И, на основании которого закрывается ПС)
     * 
     * @return value
     */
    public String getReason() {
        return reason;
    }

    /** 
     * Set the 'Reason' element value. Основание для закрытия ПС (указывается номер подпункта 3.18.1 - 3.18.3 пункта 3.18 Инструкции ЦБ РФ от 15.06.2004 г. N 117-И, на основании которого закрывается ПС)
     * 
     * @param reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }
}
