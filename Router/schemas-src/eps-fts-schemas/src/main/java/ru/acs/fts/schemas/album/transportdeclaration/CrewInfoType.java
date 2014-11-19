
package ru.acs.fts.schemas.album.transportdeclaration;

/** 
 * Экипаж
 */
public class CrewInfoType
{
    private String crewDescription;
    private String totalMemberCount;

    /** 
     * Get the 'CrewDescription' element value. Экипаж (команда судна, поездная бригада и т.п.)
     * 
     * @return value
     */
    public String getCrewDescription() {
        return crewDescription;
    }

    /** 
     * Set the 'CrewDescription' element value. Экипаж (команда судна, поездная бригада и т.п.)
     * 
     * @param crewDescription
     */
    public void setCrewDescription(String crewDescription) {
        this.crewDescription = crewDescription;
    }

    /** 
     * Get the 'TotalMemberCount' element value. Общее количество членов экипажа
     * 
     * @return value
     */
    public String getTotalMemberCount() {
        return totalMemberCount;
    }

    /** 
     * Set the 'TotalMemberCount' element value. Общее количество членов экипажа
     * 
     * @param totalMemberCount
     */
    public void setTotalMemberCount(String totalMemberCount) {
        this.totalMemberCount = totalMemberCount;
    }
}
