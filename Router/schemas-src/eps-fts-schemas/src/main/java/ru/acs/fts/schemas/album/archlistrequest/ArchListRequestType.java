
package ru.acs.fts.schemas.album.archlistrequest;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Запрос на получение списка архивов декларанта
 */
public class ArchListRequestType extends BaseDocType
{
    private String archDeclID;
    private String documentModeID;

    /** 
     * Get the 'ArchDeclID' element value. Идентификатор декларанта в архиве
     * 
     * @return value
     */
    public String getArchDeclID() {
        return archDeclID;
    }

    /** 
     * Set the 'ArchDeclID' element value. Идентификатор декларанта в архиве
     * 
     * @param archDeclID
     */
    public void setArchDeclID(String archDeclID) {
        this.archDeclID = archDeclID;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
