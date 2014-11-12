
package ru.acs.fts.schemas.album.eps_inforequest;

/** 
 * Запрос к архиву декларанта
 */
public class ArchRequestType
{
    private String archDeclID;
    private String archID;
    private String archDocID;
    private String archDocumentID;

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
     * Get the 'ArchID' element value. Идентификатор архива декларанта
     * 
     * @return value
     */
    public String getArchID() {
        return archID;
    }

    /** 
     * Set the 'ArchID' element value. Идентификатор архива декларанта
     * 
     * @param archID
     */
    public void setArchID(String archID) {
        this.archID = archID;
    }

    /** 
     * Get the 'ArchDocID' element value. Архивный идентификатор документа
     * 
     * @return value
     */
    public String getArchDocID() {
        return archDocID;
    }

    /** 
     * Set the 'ArchDocID' element value. Архивный идентификатор документа
     * 
     * @param archDocID
     */
    public void setArchDocID(String archDocID) {
        this.archDocID = archDocID;
    }

    /** 
     * Get the 'ArchDocumentID' element value. Уникальный идентификатор документа
     * 
     * @return value
     */
    public String getArchDocumentID() {
        return archDocumentID;
    }

    /** 
     * Set the 'ArchDocumentID' element value. Уникальный идентификатор документа
     * 
     * @param archDocumentID
     */
    public void setArchDocumentID(String archDocumentID) {
        this.archDocumentID = archDocumentID;
    }
}
