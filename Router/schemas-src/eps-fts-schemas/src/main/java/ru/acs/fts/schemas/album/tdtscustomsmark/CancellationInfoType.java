
package ru.acs.fts.schemas.album.tdtscustomsmark;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;

/** 
 * Сведения об отказе
 */
public class CancellationInfoType
{
    private LocalDate date;
    private String time;
    private String foundation;
    private String resolutionDescription;
    private CustomsPersonType customsPerson;

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

    /** 
     * Get the 'Time' element value. Время
     * 
     * @return value
     */
    public String getTime() {
        return time;
    }

    /** 
     * Set the 'Time' element value. Время
     * 
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /** 
     * Get the 'Foundation' element value. Обоснование
     * 
     * @return value
     */
    public String getFoundation() {
        return foundation;
    }

    /** 
     * Set the 'Foundation' element value. Обоснование
     * 
     * @param foundation
     */
    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    /** 
     * Get the 'ResolutionDescription' element value. Описание принятого решения
     * 
     * @return value
     */
    public String getResolutionDescription() {
        return resolutionDescription;
    }

    /** 
     * Set the 'ResolutionDescription' element value. Описание принятого решения
     * 
     * @param resolutionDescription
     */
    public void setResolutionDescription(String resolutionDescription) {
        this.resolutionDescription = resolutionDescription;
    }

    /** 
     * Get the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }
}
