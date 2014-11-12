
package ru.acs.fts.schemas.aud.aud_packetdoclistrequest;

import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;
import ru.acs.fts.schemas.aud.commonaggregatetypescust.GTDIDType;

/** 
 * Запрос списка документов пакета
 */
public class AUDPacketDocListRequestType extends AUDBaseEnvelopeType
{
    private int choiceSelect = -1;
    private static final int PACKET_DT_NUM_CHOICE = 0;
    private static final int PACKET_APPLIED_ID_CHOICE = 1;
    private static final int ARCHIVE_PACKET_ID_CHOICE = 2;
    private GTDIDType packetDTNum;
    private String packetAppliedID;
    private String archivePacketID;
    private String documentModeID;

    private void setChoiceSelect(int choice) {
        if (choiceSelect == -1) {
            choiceSelect = choice;
        } else if (choiceSelect != choice) {
            throw new IllegalStateException(
                    "Need to call clearChoiceSelect() before changing existing choice");
        }
    }

    /** 
     * Clear the choice selection.
     */
    public void clearChoiceSelect() {
        choiceSelect = -1;
    }

    /** 
     * Check if PacketDTNum is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifPacketDTNum() {
        return choiceSelect == PACKET_DT_NUM_CHOICE;
    }

    /** 
     * Get the 'PacketDTNum' element value. Регистрационный  номер ДТ
     * 
     * @return value
     */
    public GTDIDType getPacketDTNum() {
        return packetDTNum;
    }

    /** 
     * Set the 'PacketDTNum' element value. Регистрационный  номер ДТ
     * 
     * @param packetDTNum
     */
    public void setPacketDTNum(GTDIDType packetDTNum) {
        setChoiceSelect(PACKET_DT_NUM_CHOICE);
        this.packetDTNum = packetDTNum;
    }

    /** 
     * Check if PacketAppliedID is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifPacketAppliedID() {
        return choiceSelect == PACKET_APPLIED_ID_CHOICE;
    }

    /** 
     * Get the 'PacketAppliedID' element value. Прикладной идентификатор пакета
     * 
     * @return value
     */
    public String getPacketAppliedID() {
        return packetAppliedID;
    }

    /** 
     * Set the 'PacketAppliedID' element value. Прикладной идентификатор пакета
     * 
     * @param packetAppliedID
     */
    public void setPacketAppliedID(String packetAppliedID) {
        setChoiceSelect(PACKET_APPLIED_ID_CHOICE);
        this.packetAppliedID = packetAppliedID;
    }

    /** 
     * Check if ArchivePacketID is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifArchivePacketID() {
        return choiceSelect == ARCHIVE_PACKET_ID_CHOICE;
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
        setChoiceSelect(ARCHIVE_PACKET_ID_CHOICE);
        this.archivePacketID = archivePacketID;
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
