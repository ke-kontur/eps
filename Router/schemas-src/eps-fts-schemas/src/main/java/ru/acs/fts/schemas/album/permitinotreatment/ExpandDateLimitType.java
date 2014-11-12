
package ru.acs.fts.schemas.album.permitinotreatment;

/** 
 * —рок продлени€ переработки
 */
public class ExpandDateLimitType
{
    private String expandTime;

    /** 
     * Get the 'ExpandTime' element value. —рок продлени€ переработки (в мес€цах)
     * 
     * @return value
     */
    public String getExpandTime() {
        return expandTime;
    }

    /** 
     * Set the 'ExpandTime' element value. —рок продлени€ переработки (в мес€цах)
     * 
     * @param expandTime
     */
    public void setExpandTime(String expandTime) {
        this.expandTime = expandTime;
    }
}
