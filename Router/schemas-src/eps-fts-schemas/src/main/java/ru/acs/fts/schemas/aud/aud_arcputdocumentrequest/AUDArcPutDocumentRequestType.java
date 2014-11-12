
package ru.acs.fts.schemas.aud.aud_arcputdocumentrequest;

import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDDocumentInfoWithPacketSyncType;

/** 
 * ������ �� ���������� ��������� �� �������� � ������ �������� ������.
 */
public class AUDArcPutDocumentRequestType extends AUDBaseEnvelopeType
{
    private AUDDocumentInfoWithPacketSyncType documentInfoWithPacketSync;
    private String documentModeID;

    /** 
     * Get the 'DocumentInfoWithPacketSync' element value. ���������� � ��������� ������ � ������ (� ������ �������� ������ ��������).
     * 
     * @return value
     */
    public AUDDocumentInfoWithPacketSyncType getDocumentInfoWithPacketSync() {
        return documentInfoWithPacketSync;
    }

    /** 
     * Set the 'DocumentInfoWithPacketSync' element value. ���������� � ��������� ������ � ������ (� ������ �������� ������ ��������).
     * 
     * @param documentInfoWithPacketSync
     */
    public void setDocumentInfoWithPacketSync(
            AUDDocumentInfoWithPacketSyncType documentInfoWithPacketSync) {
        this.documentInfoWithPacketSync = documentInfoWithPacketSync;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������������� ��������� (�������, ������)
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������������� ��������� (�������, ������)
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
