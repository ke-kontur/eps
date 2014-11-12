
package ru.acs.fts.schemas.album.pi_seaarrive;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения об экипаже
 */
public class CrewInfoType
{
    private String RFMembersCount;
    private String foreignMembersCount;
    private List<CrewMemberInfoType> crewMemberInfoList = new ArrayList<CrewMemberInfoType>();

    /** 
     * Get the 'RFMembersCount' element value. Количество российских членов экипажа
     * 
     * @return value
     */
    public String getRFMembersCount() {
        return RFMembersCount;
    }

    /** 
     * Set the 'RFMembersCount' element value. Количество российских членов экипажа
     * 
     * @param RFMembersCount
     */
    public void setRFMembersCount(String RFMembersCount) {
        this.RFMembersCount = RFMembersCount;
    }

    /** 
     * Get the 'ForeignMembersCount' element value. Количество иностранных членов экипажа
     * 
     * @return value
     */
    public String getForeignMembersCount() {
        return foreignMembersCount;
    }

    /** 
     * Set the 'ForeignMembersCount' element value. Количество иностранных членов экипажа
     * 
     * @param foreignMembersCount
     */
    public void setForeignMembersCount(String foreignMembersCount) {
        this.foreignMembersCount = foreignMembersCount;
    }

    /** 
     * Get the list of 'CrewMemberInfo' element items. Сведения о члене экипажа
     * 
     * @return list
     */
    public List<CrewMemberInfoType> getCrewMemberInfoList() {
        return crewMemberInfoList;
    }

    /** 
     * Set the list of 'CrewMemberInfo' element items. Сведения о члене экипажа
     * 
     * @param list
     */
    public void setCrewMemberInfoList(List<CrewMemberInfoType> list) {
        crewMemberInfoList = list;
    }
}
