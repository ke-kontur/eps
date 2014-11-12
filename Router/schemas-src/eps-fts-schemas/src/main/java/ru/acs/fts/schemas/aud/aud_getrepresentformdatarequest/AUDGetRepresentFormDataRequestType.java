
package ru.acs.fts.schemas.aud.aud_getrepresentformdatarequest;

import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDDocumentKindRepresentationIdInfoType;

/** 
 * ������ �� ��������� ������ (������ XSLT-��������������) ��� ������������ ������������� ��������� � ����� ������������.
 */
public class AUDGetRepresentFormDataRequestType extends AUDBaseEnvelopeType
{
    private AUDDocumentKindRepresentationIdInfoType documentKindRepresentationIdInfo;
    private String documentModeID;

    /** 
     * Get the 'DocumentKindRepresentationIdInfo' element value. ���������� ��� ������������� ���� ������������� (������������� ��� ������������ ���������).
     * 
     * @return value
     */
    public AUDDocumentKindRepresentationIdInfoType getDocumentKindRepresentationIdInfo() {
        return documentKindRepresentationIdInfo;
    }

    /** 
     * Set the 'DocumentKindRepresentationIdInfo' element value. ���������� ��� ������������� ���� ������������� (������������� ��� ������������ ���������).
     * 
     * @param documentKindRepresentationIdInfo
     */
    public void setDocumentKindRepresentationIdInfo(
            AUDDocumentKindRepresentationIdInfoType documentKindRepresentationIdInfo) {
        this.documentKindRepresentationIdInfo = documentKindRepresentationIdInfo;
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
