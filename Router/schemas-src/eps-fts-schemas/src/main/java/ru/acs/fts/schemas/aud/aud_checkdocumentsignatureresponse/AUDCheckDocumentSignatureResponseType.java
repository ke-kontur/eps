
package ru.acs.fts.schemas.aud.aud_checkdocumentsignatureresponse;

import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDResultInfoType;

/** 
 * ����� �� ������ �� �������� ��� �� ��������.
 */
public class AUDCheckDocumentSignatureResponseType extends AUDBaseEnvelopeType
{
    private AUDResultInfoType resultInfo;
    private String documentModeID;

    /** 
     * Get the 'ResultInfo' element value. ��������� �������� ��� �� ��������.
     * 
     * @return value
     */
    public AUDResultInfoType getResultInfo() {
        return resultInfo;
    }

    /** 
     * Set the 'ResultInfo' element value. ��������� �������� ��� �� ��������.
     * 
     * @param resultInfo
     */
    public void setResultInfo(AUDResultInfoType resultInfo) {
        this.resultInfo = resultInfo;
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
