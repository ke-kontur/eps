
package ru.acs.fts.schemas.album.notifcloseproc;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ����������� � �������� ��������� 
 */
public class NotifCloseProcType extends BaseDocType
{
    private String closeProcedureID;
    private String closeDateTime;
    private String documentModeID;

    /** 
     * Get the 'CloseProcedureID' element value. ���������� ������������� �������� ���������.
     * 
     * @return value
     */
    public String getCloseProcedureID() {
        return closeProcedureID;
    }

    /** 
     * Set the 'CloseProcedureID' element value. ���������� ������������� �������� ���������.
     * 
     * @param closeProcedureID
     */
    public void setCloseProcedureID(String closeProcedureID) {
        this.closeProcedureID = closeProcedureID;
    }

    /** 
     * Get the 'CloseDateTime' element value. ���� / ����� �������� ���������
     * 
     * @return value
     */
    public String getCloseDateTime() {
        return closeDateTime;
    }

    /** 
     * Set the 'CloseDateTime' element value. ���� / ����� �������� ���������
     * 
     * @param closeDateTime
     */
    public void setCloseDateTime(String closeDateTime) {
        this.closeDateTime = closeDateTime;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ���������� ������������� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ���������� ������������� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
