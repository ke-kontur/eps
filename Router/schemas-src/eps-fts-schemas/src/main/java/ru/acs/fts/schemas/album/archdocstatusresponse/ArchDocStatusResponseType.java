
package ru.acs.fts.schemas.album.archdocstatusresponse;

import ru.acs.fts.schemas.album.electronicarchivecommonaggregatetypescust.ArchBaseDocType;

/** 
 * ������ ��������� � ������
 */
public class ArchDocStatusResponseType extends ArchBaseDocType
{
    private String archDocStatus;
    private String documentModeID;

    /** 
     * Get the 'ArchDocStatus' element value. ������ ��������� � ������
     * 
     * @return value
     */
    public String getArchDocStatus() {
        return archDocStatus;
    }

    /** 
     * Set the 'ArchDocStatus' element value. ������ ��������� � ������
     * 
     * @param archDocStatus
     */
    public void setArchDocStatus(String archDocStatus) {
        this.archDocStatus = archDocStatus;
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
