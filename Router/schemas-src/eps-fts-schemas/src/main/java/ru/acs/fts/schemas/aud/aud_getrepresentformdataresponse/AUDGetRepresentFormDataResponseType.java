
package ru.acs.fts.schemas.aud.aud_getrepresentformdataresponse;

import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;

/** 
 * ����� �� ������ �� ������ �� ��������� ������ (������ XSLT-��������������) ��� ������������ ������������� ��������� � ����� ������������.
 */
public class AUDGetRepresentFormDataResponseType extends AUDBaseEnvelopeType
{
    private byte[] representationFormingData;
    private String documentModeID;

    /** 
     * Get the 'RepresentationFormingData' element value. ������ (����� XSLT-��������������), ������������ ��� ������������ ������������� ��������� (� ����� ��� ������������).
     * 
     * @return value
     */
    public byte[] getRepresentationFormingData() {
        return representationFormingData;
    }

    /** 
     * Set the 'RepresentationFormingData' element value. ������ (����� XSLT-��������������), ������������ ��� ������������ ������������� ��������� (� ����� ��� ������������).
     * 
     * @param representationFormingData
     */
    public void setRepresentationFormingData(byte[] representationFormingData) {
        this.representationFormingData = representationFormingData;
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
