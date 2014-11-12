
package ru.acs.fts.schemas.album.archpermitparticipantsinfo;

/** 
 * Документ архива
 */
public class ArchDocumentType
{
    private String archDocID;
    private String archDocumentID;

    /** 
     * Get the 'ArchDocID' element value. Идентификатор документа в архиве
     * 
     * @return value
     */
    public String getArchDocID() {
        return archDocID;
    }

    /** 
     * Set the 'ArchDocID' element value. Идентификатор документа в архиве
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
