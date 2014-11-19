
package ru.acs.fts.schemas.aud.aud_getpacketresponse;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDPacketInfoWithDocumentsType;

/** 
 * Ответ на запрос на извлечение пакета (пакетов) документов архива.
 */
public class AUDGetPacketResponseType extends AUDBaseEnvelopeType
{
    private List<AUDPacketInfoWithDocumentsType> packetInfoWithDocumentList = new ArrayList<AUDPacketInfoWithDocumentsType>();
    private String documentModeID;

    /** 
     * Get the list of 'PacketInfoWithDocuments' element items. Информация о пакете архива и его документах.
     * 
     * @return list
     */
    public List<AUDPacketInfoWithDocumentsType> getPacketInfoWithDocumentList() {
        return packetInfoWithDocumentList;
    }

    /** 
     * Set the list of 'PacketInfoWithDocuments' element items. Информация о пакете архива и его документах.
     * 
     * @param list
     */
    public void setPacketInfoWithDocumentList(
            List<AUDPacketInfoWithDocumentsType> list) {
        packetInfoWithDocumentList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида технологического документа (запроса, ответа)
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида технологического документа (запроса, ответа)
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
