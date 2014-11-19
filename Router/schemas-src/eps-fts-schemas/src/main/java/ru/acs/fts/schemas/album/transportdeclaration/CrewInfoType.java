
package ru.acs.fts.schemas.album.transportdeclaration;

/** 
 * ������
 */
public class CrewInfoType
{
    private String crewDescription;
    private String totalMemberCount;

    /** 
     * Get the 'CrewDescription' element value. ������ (������� �����, �������� ������� � �.�.)
     * 
     * @return value
     */
    public String getCrewDescription() {
        return crewDescription;
    }

    /** 
     * Set the 'CrewDescription' element value. ������ (������� �����, �������� ������� � �.�.)
     * 
     * @param crewDescription
     */
    public void setCrewDescription(String crewDescription) {
        this.crewDescription = crewDescription;
    }

    /** 
     * Get the 'TotalMemberCount' element value. ����� ���������� ������ �������
     * 
     * @return value
     */
    public String getTotalMemberCount() {
        return totalMemberCount;
    }

    /** 
     * Set the 'TotalMemberCount' element value. ����� ���������� ������ �������
     * 
     * @param totalMemberCount
     */
    public void setTotalMemberCount(String totalMemberCount) {
        this.totalMemberCount = totalMemberCount;
    }
}
