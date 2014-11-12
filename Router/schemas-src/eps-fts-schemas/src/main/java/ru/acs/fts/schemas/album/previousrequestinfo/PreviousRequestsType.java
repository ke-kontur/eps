
package ru.acs.fts.schemas.album.previousrequestinfo;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * Сведения о ранее поступивших запросах
 */
public class PreviousRequestsType
{
    private LocalDate previousRequestDate;
    private String previousRequestTime;
    private CustomsType customs;

    /** 
     * Get the 'PreviousRequestDate' element value. Дата запроса
     * 
     * @return value
     */
    public LocalDate getPreviousRequestDate() {
        return previousRequestDate;
    }

    /** 
     * Set the 'PreviousRequestDate' element value. Дата запроса
     * 
     * @param previousRequestDate
     */
    public void setPreviousRequestDate(LocalDate previousRequestDate) {
        this.previousRequestDate = previousRequestDate;
    }

    /** 
     * Get the 'PreviousRequestTime' element value. Время запроса
     * 
     * @return value
     */
    public String getPreviousRequestTime() {
        return previousRequestTime;
    }

    /** 
     * Set the 'PreviousRequestTime' element value. Время запроса
     * 
     * @param previousRequestTime
     */
    public void setPreviousRequestTime(String previousRequestTime) {
        this.previousRequestTime = previousRequestTime;
    }

    /** 
     * Get the 'Customs' element value. Таможенный орган
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Таможенный орган
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }
}
