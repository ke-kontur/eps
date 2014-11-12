
package ru.acs.fts.schemas.aud.aud_packetinventoryresponse;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;

/** 
 * Опись документов по пакету, которые храняться в АЮД
 */
public class AUDPacketInventoryResponseType extends AUDBaseEnvelopeType
{
    private String appliedProcessId;
    private List<String> appliedPacketIdList = new ArrayList<String>();
    private String packetType;
    private DateTime issued;
    private List<DocumentInventoryItemType> documentInventoryItemList = new ArrayList<DocumentInventoryItemType>();
    private String documentModeID;

    /** 
     * Get the 'AppliedProcessId' element value. Уникальный идентификатор процесса (архивный идентификатор пакета)
     * 
     * @return value
     */
    public String getAppliedProcessId() {
        return appliedProcessId;
    }

    /** 
     * Set the 'AppliedProcessId' element value. Уникальный идентификатор процесса (архивный идентификатор пакета)
     * 
     * @param appliedProcessId
     */
    public void setAppliedProcessId(String appliedProcessId) {
        this.appliedProcessId = appliedProcessId;
    }

    /** 
     * Get the list of 'AppliedPacketId' element items. Прикладной идентификатор пакета
     * 
     * @return list
     */
    public List<String> getAppliedPacketIdList() {
        return appliedPacketIdList;
    }

    /** 
     * Set the list of 'AppliedPacketId' element items. Прикладной идентификатор пакета
     * 
     * @param list
     */
    public void setAppliedPacketIdList(List<String> list) {
        appliedPacketIdList = list;
    }

    /** 
     * Get the 'PacketType' element value. Тип размещаемого пакета: 01 - ГТД, 99 - прочие
     * 
     * @return value
     */
    public String getPacketType() {
        return packetType;
    }

    /** 
     * Set the 'PacketType' element value. Тип размещаемого пакета: 01 - ГТД, 99 - прочие
     * 
     * @param packetType
     */
    public void setPacketType(String packetType) {
        this.packetType = packetType;
    }

    /** 
     * Get the 'Issued' element value. Дата и время составления ответа
     * 
     * @return value
     */
    public DateTime getIssued() {
        return issued;
    }

    /** 
     * Set the 'Issued' element value. Дата и время составления ответа
     * 
     * @param issued
     */
    public void setIssued(DateTime issued) {
        this.issued = issued;
    }

    /** 
     * Get the list of 'DocumentInventoryItem' element items. Сведения о документе из описи
     * 
     * @return list
     */
    public List<DocumentInventoryItemType> getDocumentInventoryItemList() {
        return documentInventoryItemList;
    }

    /** 
     * Set the list of 'DocumentInventoryItem' element items. Сведения о документе из описи
     * 
     * @param list
     */
    public void setDocumentInventoryItemList(
            List<DocumentInventoryItemType> list) {
        documentInventoryItemList = list;
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
