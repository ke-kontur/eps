
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * ���������� � ������ ������ (��� ���������� � ���������� ������).
 */
public class AUDPacketInfoType extends AUDArchivePacketInfoType
{
    private AUDAppliedPacketInfoType appliedPacketInfo;

    /** 
     * Get the 'AppliedPacketInfo' element value. ���������� � ������ ������, ��������� ���������� ��������.
     * 
     * @return value
     */
    public AUDAppliedPacketInfoType getAppliedPacketInfo() {
        return appliedPacketInfo;
    }

    /** 
     * Set the 'AppliedPacketInfo' element value. ���������� � ������ ������, ��������� ���������� ��������.
     * 
     * @param appliedPacketInfo
     */
    public void setAppliedPacketInfo(AUDAppliedPacketInfoType appliedPacketInfo) {
        this.appliedPacketInfo = appliedPacketInfo;
    }
}
