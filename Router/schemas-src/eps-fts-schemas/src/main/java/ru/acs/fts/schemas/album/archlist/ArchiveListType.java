
package ru.acs.fts.schemas.album.archlist;

/** 
 * Элемент списка архивов декларанта
 */
public class ArchiveListType
{
    private String archID;
    private String archName;

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
     * Get the 'ArchName' element value. Наименование архива
     * 
     * @return value
     */
    public String getArchName() {
        return archName;
    }

    /** 
     * Set the 'ArchName' element value. Наименование архива
     * 
     * @param archName
     */
    public void setArchName(String archName) {
        this.archName = archName;
    }
}
