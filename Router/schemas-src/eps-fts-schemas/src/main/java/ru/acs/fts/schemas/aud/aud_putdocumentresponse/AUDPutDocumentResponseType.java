
package ru.acs.fts.schemas.aud.aud_putdocumentresponse;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDArchiveDocumentInfoType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDArchivePacketInfoType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDEmbeddedDocumentArchiveInfoType;

/** 
 * ќтвет на запрос на размещение документов на хранение.
 */
public class AUDPutDocumentResponseType extends AUDBaseEnvelopeType
{
    private AUDArchiveDocumentInfoType archiveDocumentInfo;
    private AUDArchivePacketInfoType archivePacketInfo;
    private List<AUDEmbeddedDocumentArchiveInfoType> embeddedDocumentArchiveInfoList = new ArrayList<AUDEmbeddedDocumentArchiveInfoType>();
    private String documentModeID;

    /** 
     * Get the 'ArchiveDocumentInfo' element value. »нформаци€ о размещенном на хранение документе архива.
     * 
     * @return value
     */
    public AUDArchiveDocumentInfoType getArchiveDocumentInfo() {
        return archiveDocumentInfo;
    }

    /** 
     * Set the 'ArchiveDocumentInfo' element value. »нформаци€ о размещенном на хранение документе архива.
     * 
     * @param archiveDocumentInfo
     */
    public void setArchiveDocumentInfo(
            AUDArchiveDocumentInfoType archiveDocumentInfo) {
        this.archiveDocumentInfo = archiveDocumentInfo;
    }

    /** 
     * Get the 'ArchivePacketInfo' element value.
     * 
     * @return value
     */
    public AUDArchivePacketInfoType getArchivePacketInfo() {
        return archivePacketInfo;
    }

    /** 
     * Set the 'ArchivePacketInfo' element value.
     * 
     * @param archivePacketInfo
     */
    public void setArchivePacketInfo(AUDArchivePacketInfoType archivePacketInfo) {
        this.archivePacketInfo = archivePacketInfo;
    }

    /** 
     * Get the list of 'EmbeddedDocumentArchiveInfo' element items. »нформаци€ о размещенном на хранение прикладном документе архива, вложенном в документ-контейнер. ”казываетс€ в случае, если переданный на хранение документ представл€ет собой документ-контейнер ('ED_Container').
     * 
     * @return list
     */
    public List<AUDEmbeddedDocumentArchiveInfoType> getEmbeddedDocumentArchiveInfoList() {
        return embeddedDocumentArchiveInfoList;
    }

    /** 
     * Set the list of 'EmbeddedDocumentArchiveInfo' element items. »нформаци€ о размещенном на хранение прикладном документе архива, вложенном в документ-контейнер. ”казываетс€ в случае, если переданный на хранение документ представл€ет собой документ-контейнер ('ED_Container').
     * 
     * @param list
     */
    public void setEmbeddedDocumentArchiveInfoList(
            List<AUDEmbeddedDocumentArchiveInfoType> list) {
        embeddedDocumentArchiveInfoList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. »дентификатор вида технологического документа (запроса, ответа)
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. »дентификатор вида технологического документа (запроса, ответа)
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
