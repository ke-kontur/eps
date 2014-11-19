
package ru.acs.fts.schemas.album.archdocdeleterequest;

import ru.acs.fts.schemas.album.electronicarchivecommonaggregatetypescust.ArchBaseDocType;

/** 
 * ������ �� �������� ��������� �� ������
 */
public class ArchDocDeleteRequestType extends ArchBaseDocType
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
