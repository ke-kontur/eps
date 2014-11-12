
package ru.acs.fts.schemas.album.transportdeclaration;

/** 
 * ���������
 */
public class PassengersType
{
    private String TSMPPassenger;
    private String memberCount;

    /** 
     * Get the 'TSMPPassenger' element value. ������� ������� ����������, ����������� � ����
     * 
     * @return value
     */
    public String getTSMPPassenger() {
        return TSMPPassenger;
    }

    /** 
     * Set the 'TSMPPassenger' element value. ������� ������� ����������, ����������� � ����
     * 
     * @param TSMPPassenger
     */
    public void setTSMPPassenger(String TSMPPassenger) {
        this.TSMPPassenger = TSMPPassenger;
    }

    /** 
     * Get the 'MemberCount' element value. ���������� ����������, ����������� � ����
     * 
     * @return value
     */
    public String getMemberCount() {
        return memberCount;
    }

    /** 
     * Set the 'MemberCount' element value. ���������� ����������, ����������� � ����
     * 
     * @param memberCount
     */
    public void setMemberCount(String memberCount) {
        this.memberCount = memberCount;
    }
}
