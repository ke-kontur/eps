
package ru.acs.fts.schemas.album.instrinspection;

/** 
 * Объем досмотра
 */
public class InspEffortType
{
    private String effortPercent;

    /** 
     * Get the 'EffortPercent' element value. Объем досмотра: 1 - 10%; 2 - 50%; 3 - 100%
     * 
     * @return value
     */
    public String getEffortPercent() {
        return effortPercent;
    }

    /** 
     * Set the 'EffortPercent' element value. Объем досмотра: 1 - 10%; 2 - 50%; 3 - 100%
     * 
     * @param effortPercent
     */
    public void setEffortPercent(String effortPercent) {
        this.effortPercent = effortPercent;
    }
}
