
package ru.acs.fts.schemas.album.archcreaterequest;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Запрос на создание электронного архива
 */
public class ArchCreateRequestType extends BaseDocType
{
    private String archiveName;
    private String archDeclID;
    private String documentModeID;

    /** 
     * Get the 'ArchiveName' element value. Наименование архива
     * 
     * @return value
     */
    public String getArchiveName() {
        return archiveName;
    }

    /** 
     * Set the 'ArchiveName' element value. Наименование архива
     * 
     * @param archiveName
     */
    public void setArchiveName(String archiveName) {
        this.archiveName = archiveName;
    }

    /** 
     * Get the 'ArchDeclID' element value. Идентификатор декларанта в архиве.
     * 
     * @return value
     */
    public String getArchDeclID() {
        return archDeclID;
    }

    /** 
     * Set the 'ArchDeclID' element value. Идентификатор декларанта в архиве.
     * 
     * @param archDeclID
     */
    public void setArchDeclID(String archDeclID) {
        this.archDeclID = archDeclID;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
