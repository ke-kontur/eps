
package ru.acs.fts.schemas.album.archcreaterequest;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ������ �� �������� ������������ ������
 */
public class ArchCreateRequestType extends BaseDocType
{
    private String archiveName;
    private String archDeclID;
    private String documentModeID;

    /** 
     * Get the 'ArchiveName' element value. ������������ ������
     * 
     * @return value
     */
    public String getArchiveName() {
        return archiveName;
    }

    /** 
     * Set the 'ArchiveName' element value. ������������ ������
     * 
     * @param archiveName
     */
    public void setArchiveName(String archiveName) {
        this.archiveName = archiveName;
    }

    /** 
     * Get the 'ArchDeclID' element value. ������������� ���������� � ������.
     * 
     * @return value
     */
    public String getArchDeclID() {
        return archDeclID;
    }

    /** 
     * Set the 'ArchDeclID' element value. ������������� ���������� � ������.
     * 
     * @param archDeclID
     */
    public void setArchDeclID(String archDeclID) {
        this.archDeclID = archDeclID;
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
