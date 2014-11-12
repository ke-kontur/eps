
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * Информация о пакете архива (без информации о документах пакета).
 */
public class AUDPacketInfoType extends AUDArchivePacketInfoType
{
    private AUDAppliedPacketInfoType appliedPacketInfo;

    /** 
     * Get the 'AppliedPacketInfo' element value. Информация о пакете архива, указанная прикладной системой.
     * 
     * @return value
     */
    public AUDAppliedPacketInfoType getAppliedPacketInfo() {
        return appliedPacketInfo;
    }

    /** 
     * Set the 'AppliedPacketInfo' element value. Информация о пакете архива, указанная прикладной системой.
     * 
     * @param appliedPacketInfo
     */
    public void setAppliedPacketInfo(AUDAppliedPacketInfoType appliedPacketInfo) {
        this.appliedPacketInfo = appliedPacketInfo;
    }
}
