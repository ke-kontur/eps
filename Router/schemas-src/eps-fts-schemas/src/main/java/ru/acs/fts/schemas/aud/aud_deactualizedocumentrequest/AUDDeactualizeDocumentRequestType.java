
package ru.acs.fts.schemas.aud.aud_deactualizedocumentrequest;

import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;

/** 
 * ������ �� �������������� ��������� ������.
 */
public class AUDDeactualizeDocumentRequestType extends AUDBaseEnvelopeType
{
    private String archiveDocumentId;
    private String documentModeID;

    /** 
     * Get the 'ArchiveDocumentId' element value. �������� ������������� ���������.
     * 
     * @return value
     */
    public String getArchiveDocumentId() {
        return archiveDocumentId;
    }

    /** 
     * Set the 'ArchiveDocumentId' element value. �������� ������������� ���������.
     * 
     * @param archiveDocumentId
     */
    public void setArchiveDocumentId(String archiveDocumentId) {
        this.archiveDocumentId = archiveDocumentId;
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
