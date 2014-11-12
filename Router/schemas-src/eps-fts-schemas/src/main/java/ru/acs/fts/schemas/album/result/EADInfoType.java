
package ru.acs.fts.schemas.album.result;

/** 
 * Информация о документах в архиве декларанта
 */
public class EADInfoType
{
    private String archDeclID;
    private String archID;
    private String archDocID;
    private String archDocStatus;

    /** 
     * Get the 'ArchDeclID' element value. Идентификатор декларанта а ЭАД
     * 
     * @return value
     */
    public String getArchDeclID() {
        return archDeclID;
    }

    /** 
     * Set the 'ArchDeclID' element value. Идентификатор декларанта а ЭАД
     * 
     * @param archDeclID
     */
    public void setArchDeclID(String archDeclID) {
        this.archDeclID = archDeclID;
    }

    /** 
     * Get the 'ArchID' element value. Идентификатор архива
     * 
     * @return value
     */
    public String getArchID() {
        return archID;
    }

    /** 
     * Set the 'ArchID' element value. Идентификатор архива
     * 
     * @param archID
     */
    public void setArchID(String archID) {
        this.archID = archID;
    }

    /** 
     * Get the 'ArchDocID' element value. Идентификатор документа в архиве декларанта
     * 
     * @return value
     */
    public String getArchDocID() {
        return archDocID;
    }

    /** 
     * Set the 'ArchDocID' element value. Идентификатор документа в архиве декларанта
     * 
     * @param archDocID
     */
    public void setArchDocID(String archDocID) {
        this.archDocID = archDocID;
    }

    /** 
     * Get the 'ArchDocStatus' element value. Статус документа в архиве.
     * 
     * @return value
     */
    public String getArchDocStatus() {
        return archDocStatus;
    }

    /** 
     * Set the 'ArchDocStatus' element value. Статус документа в архиве.
     * 
     * @param archDocStatus
     */
    public void setArchDocStatus(String archDocStatus) {
        this.archDocStatus = archDocStatus;
    }
}
