
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * ���������� � ��������� ������ � ������ (� ������ �������� ������ ��������).
 */
public class AUDDocumentInfoWithPacketType extends AUDDocumentInfoType
{
    private AUDPacketInfoType packetInfo;

    /** 
     * Get the 'PacketInfo' element value. ���������� � ������, � ������ �������� ������ ��������.
     * 
     * @return value
     */
    public AUDPacketInfoType getPacketInfo() {
        return packetInfo;
    }

    /** 
     * Set the 'PacketInfo' element value. ���������� � ������, � ������ �������� ������ ��������.
     * 
     * @param packetInfo
     */
    public void setPacketInfo(AUDPacketInfoType packetInfo) {
        this.packetInfo = packetInfo;
    }
}
