
package ru.acs.fts.schemas.album.electronicarchivecommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Базовый тип для архива
 */
public class ArchBaseType extends BaseDocType
{
    private String archDeclID;
    private String archID;

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
}
