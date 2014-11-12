
package ru.acs.fts.schemas.aud.aud_getdocumentformattedresponse;

import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;

/** 
 * ����� �� ������ �� ��������� ������ ��� ����������� ��������� ������.
 */
public class AUDGetDocumentFormattedResponseType extends AUDBaseEnvelopeType
{
    private byte[] documentRepresentation;
    private String documentModeID;

    /** 
     * Get the 'DocumentRepresentation' element value. �������������� ������������� ��������� (��� ������������ ���������).
     * 
     * @return value
     */
    public byte[] getDocumentRepresentation() {
        return documentRepresentation;
    }

    /** 
     * Set the 'DocumentRepresentation' element value. �������������� ������������� ��������� (��� ������������ ���������).
     * 
     * @param documentRepresentation
     */
    public void setDocumentRepresentation(byte[] documentRepresentation) {
        this.documentRepresentation = documentRepresentation;
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
