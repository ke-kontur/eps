
package ru.acs.fts.schemas.album.archdoclistrequest;

import ru.acs.fts.schemas.album.electronicarchivecommonaggregatetypescust.ArchBaseType;

/** 
 * ������ �� ��������� ������ ���������� � ������
 */
public class ArchDocListRequestType extends ArchBaseType
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
