
package ru.acs.fts.schemas.aud.aud_packetdoclistresponse;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;

/** 
 * Список документов, размещенных  в пакете
 */
public class AUDPacketDocListResponseType extends AUDBaseEnvelopeType
{
    private String packetAppliedID;
    private String archivePacketID;
    private List<ArchiveDocInfoType> archiveDocInfoList = new ArrayList<ArchiveDocInfoType>();
    private String documentModeID;

    /** 
     * Get the 'PacketAppliedID' element value. Прикладной  идентификатор пакета
     * 
     * @return value
     */
    public String getPacketAppliedID() {
        return packetAppliedID;
    }

    /** 
     * Set the 'PacketAppliedID' element value. Прикладной  идентификатор пакета
     * 
     * @param packetAppliedID
     */
    public void setPacketAppliedID(String packetAppliedID) {
        this.packetAppliedID = packetAppliedID;
    }

    /** 
     * Get the 'ArchivePacketID' element value. Архивный  идентификатор пакета
     * 
     * @return value
     */
    public String getArchivePacketID() {
        return archivePacketID;
    }

    /** 
     * Set the 'ArchivePacketID' element value. Архивный  идентификатор пакета
     * 
     * @param archivePacketID
     */
    public void setArchivePacketID(String archivePacketID) {
        this.archivePacketID = archivePacketID;
    }

    /** 
     * Get the list of 'ArchiveDocInfo' element items. Информация о документе архива
     * 
     * @return list
     */
    public List<ArchiveDocInfoType> getArchiveDocInfoList() {
        return archiveDocInfoList;
    }

    /** 
     * Set the list of 'ArchiveDocInfo' element items. Информация о документе архива
     * 
     * @param list
     */
    public void setArchiveDocInfoList(List<ArchiveDocInfoType> list) {
        archiveDocInfoList = list;
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
