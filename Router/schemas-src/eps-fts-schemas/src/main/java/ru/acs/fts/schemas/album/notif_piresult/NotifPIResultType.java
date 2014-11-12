
package ru.acs.fts.schemas.album.notif_piresult;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ����������� � ����������� ��������� ���������
 */
public class NotifPIResultType extends BaseDocType
{
    private ResponseType response;
    private String documentModeID;

    /** 
     * Get the 'Response' element value. ��������� ��������� ���������
     * 
     * @return value
     */
    public ResponseType getResponse() {
        return response;
    }

    /** 
     * Set the 'Response' element value. ��������� ��������� ���������
     * 
     * @param response
     */
    public void setResponse(ResponseType response) {
        this.response = response;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
