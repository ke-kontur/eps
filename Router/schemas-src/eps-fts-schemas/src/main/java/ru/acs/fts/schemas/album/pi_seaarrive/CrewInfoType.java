
package ru.acs.fts.schemas.album.pi_seaarrive;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� �� �������
 */
public class CrewInfoType
{
    private String RFMembersCount;
    private String foreignMembersCount;
    private List<CrewMemberInfoType> crewMemberInfoList = new ArrayList<CrewMemberInfoType>();

    /** 
     * Get the 'RFMembersCount' element value. ���������� ���������� ������ �������
     * 
     * @return value
     */
    public String getRFMembersCount() {
        return RFMembersCount;
    }

    /** 
     * Set the 'RFMembersCount' element value. ���������� ���������� ������ �������
     * 
     * @param RFMembersCount
     */
    public void setRFMembersCount(String RFMembersCount) {
        this.RFMembersCount = RFMembersCount;
    }

    /** 
     * Get the 'ForeignMembersCount' element value. ���������� ����������� ������ �������
     * 
     * @return value
     */
    public String getForeignMembersCount() {
        return foreignMembersCount;
    }

    /** 
     * Set the 'ForeignMembersCount' element value. ���������� ����������� ������ �������
     * 
     * @param foreignMembersCount
     */
    public void setForeignMembersCount(String foreignMembersCount) {
        this.foreignMembersCount = foreignMembersCount;
    }

    /** 
     * Get the list of 'CrewMemberInfo' element items. �������� � ����� �������
     * 
     * @return list
     */
    public List<CrewMemberInfoType> getCrewMemberInfoList() {
        return crewMemberInfoList;
    }

    /** 
     * Set the list of 'CrewMemberInfo' element items. �������� � ����� �������
     * 
     * @param list
     */
    public void setCrewMemberInfoList(List<CrewMemberInfoType> list) {
        crewMemberInfoList = list;
    }
}
