
package ru.acs.fts.schemas.aud.aud_getpacketrequest;

import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDDocumentDataPresenceInfoType;
import ru.acs.fts.schemas.aud.audcommonleaftypescust.AUDDocumentVersionsRequestType;
import ru.acs.fts.schemas.aud.commonaggregatetypescust.GTDIDType;

/** 
 * Запрос на извлечение пакета (пакетов) документов архива.
 */
public class AUDGetPacketRequestType extends AUDBaseEnvelopeType
{
    private AUDDocumentVersionsRequestType documentVersionsRequirements;
    private int choiceSelect = -1;
    private static final int APPLIED_PACKET_ID_CHOICE = 0;
    private static final int ARCHIVE_PACKET_ID_CHOICE = 1;
    private static final int GTDID_CHOICE = 2;
    private String appliedPacketId;
    private String archivePacketId;
    private GTDIDType GTDID;
    private AUDDocumentDataPresenceInfoType documentDataPresenceInfo;
    private String documentModeID;

    /** 
     * Get the 'DocumentVersionsRequirements' element value. Указывает, какие версии документов пакета требуется предоставить.
     * 
     * @return value
     */
    public AUDDocumentVersionsRequestType getDocumentVersionsRequirements() {
        return documentVersionsRequirements;
    }

    /** 
     * Set the 'DocumentVersionsRequirements' element value. Указывает, какие версии документов пакета требуется предоставить.
     * 
     * @param documentVersionsRequirements
     */
    public void setDocumentVersionsRequirements(
            AUDDocumentVersionsRequestType documentVersionsRequirements) {
        this.documentVersionsRequirements = documentVersionsRequirements;
    }

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
     * Check if AppliedPacketId is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifAppliedPacketId() {
        return choiceSelect == APPLIED_PACKET_ID_CHOICE;
    }

    /** 
     * Get the 'AppliedPacketId' element value. Прикладной идентификатор пакета документов.
     * 
     * @return value
     */
    public String getAppliedPacketId() {
        return appliedPacketId;
    }

    /** 
     * Set the 'AppliedPacketId' element value. Прикладной идентификатор пакета документов.
     * 
     * @param appliedPacketId
     */
    public void setAppliedPacketId(String appliedPacketId) {
        setChoiceSelect(APPLIED_PACKET_ID_CHOICE);
        this.appliedPacketId = appliedPacketId;
    }

    /** 
     * Check if ArchivePacketId is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifArchivePacketId() {
        return choiceSelect == ARCHIVE_PACKET_ID_CHOICE;
    }

    /** 
     * Get the 'ArchivePacketId' element value. Архивный идентификатор пакета документов.
     * 
     * @return value
     */
    public String getArchivePacketId() {
        return archivePacketId;
    }

    /** 
     * Set the 'ArchivePacketId' element value. Архивный идентификатор пакета документов.
     * 
     * @param archivePacketId
     */
    public void setArchivePacketId(String archivePacketId) {
        setChoiceSelect(ARCHIVE_PACKET_ID_CHOICE);
        this.archivePacketId = archivePacketId;
    }

    /** 
     * Check if GTDID is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifGTDID() {
        return choiceSelect == GTDID_CHOICE;
    }

    /** 
     * Get the 'GTDID' element value. Номер ГТД к которой принадлежит данный  пакет
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. Номер ГТД к которой принадлежит данный  пакет
     * 
     * @param GTDID
     */
    public void setGTDID(GTDIDType GTDID) {
        setChoiceSelect(GTDID_CHOICE);
        this.GTDID = GTDID;
    }

    /** 
     * Get the 'DocumentDataPresenceInfo' element value. Признаки необходимости предоставления отдельных данных, связанных с документом.
     * 
     * @return value
     */
    public AUDDocumentDataPresenceInfoType getDocumentDataPresenceInfo() {
        return documentDataPresenceInfo;
    }

    /** 
     * Set the 'DocumentDataPresenceInfo' element value. Признаки необходимости предоставления отдельных данных, связанных с документом.
     * 
     * @param documentDataPresenceInfo
     */
    public void setDocumentDataPresenceInfo(
            AUDDocumentDataPresenceInfoType documentDataPresenceInfo) {
        this.documentDataPresenceInfo = documentDataPresenceInfo;
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
