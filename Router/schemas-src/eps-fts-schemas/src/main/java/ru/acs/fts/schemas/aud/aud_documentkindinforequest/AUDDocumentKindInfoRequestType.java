
package ru.acs.fts.schemas.aud.aud_documentkindinforequest;

import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;

/** 
 * ������ �� ��������� ���������� � ������������������ ����� ����������.
 */
public class AUDDocumentKindInfoRequestType extends AUDBaseEnvelopeType
{
    private String documentModeID;

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
