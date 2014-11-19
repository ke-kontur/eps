
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * Информация о документе архива и пакете (в состав которого входит документ).
 */
public class AUDDocumentInfoWithPacketType extends AUDDocumentInfoType
{
    private AUDPacketInfoType packetInfo;

    /** 
     * Get the 'PacketInfo' element value. Информация о пакете, в состав которого входит документ.
     * 
     * @return value
     */
    public AUDPacketInfoType getPacketInfo() {
        return packetInfo;
    }

    /** 
     * Set the 'PacketInfo' element value. Информация о пакете, в состав которого входит документ.
     * 
     * @param packetInfo
     */
    public void setPacketInfo(AUDPacketInfoType packetInfo) {
        this.packetInfo = packetInfo;
    }
}
