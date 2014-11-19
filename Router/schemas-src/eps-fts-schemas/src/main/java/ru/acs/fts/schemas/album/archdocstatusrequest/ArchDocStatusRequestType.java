
package ru.acs.fts.schemas.album.archdocstatusrequest;

import ru.acs.fts.schemas.album.electronicarchivecommonaggregatetypescust.ArchBaseDocType;

/** 
 * ������ ������� ��������� � ������ ����������
 */
public class ArchDocStatusRequestType extends ArchBaseDocType
{
    private String documentModeID;

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
