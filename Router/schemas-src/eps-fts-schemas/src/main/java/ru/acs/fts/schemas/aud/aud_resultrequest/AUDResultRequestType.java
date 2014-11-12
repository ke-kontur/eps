
package ru.acs.fts.schemas.aud.aud_resultrequest;

import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;

/** 
 * ������ �� ��������� ����������� ��������� ���������������� ���������.
 */
public class AUDResultRequestType extends AUDBaseEnvelopeType
{
    private String requestDocumentID;
    private String documentModeID;

    /** 
     * Get the 'RequestDocumentID' element value. ������������� ���������������� ���������, ��������� ��������� �������� ��������� ��������.
     * 
     * @return value
     */
    public String getRequestDocumentID() {
        return requestDocumentID;
    }

    /** 
     * Set the 'RequestDocumentID' element value. ������������� ���������������� ���������, ��������� ��������� �������� ��������� ��������.
     * 
     * @param requestDocumentID
     */
    public void setRequestDocumentID(String requestDocumentID) {
        this.requestDocumentID = requestDocumentID;
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
