
package ru.acs.fts.schemas.album.permitinotreatment;

/** 
 * Срок продления переработки
 */
public class ExpandDateLimitType
{
    private String expandTime;

    /** 
     * Get the 'ExpandTime' element value. Срок продления переработки (в месяцах)
     * 
     * @return value
     */
    public String getExpandTime() {
        return expandTime;
    }

    /** 
     * Set the 'ExpandTime' element value. Срок продления переработки (в месяцах)
     * 
     * @param expandTime
     */
    public void setExpandTime(String expandTime) {
        this.expandTime = expandTime;
    }
}
