
package ru.acs.fts.schemas.album.archpermitparticipantsinfo;

import java.util.ArrayList;
import java.util.List;

/** 
 * Архив, доступный для просмотра
 */
public class ArchiveType
{
    private String archID;
    private List<ArchDocumentType> archDocumentList = new ArrayList<ArchDocumentType>();

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
     * Get the list of 'ArchDocument' element items. Документ архива
     * 
     * @return list
     */
    public List<ArchDocumentType> getArchDocumentList() {
        return archDocumentList;
    }

    /** 
     * Set the list of 'ArchDocument' element items. Документ архива
     * 
     * @param list
     */
    public void setArchDocumentList(List<ArchDocumentType> list) {
        archDocumentList = list;
    }
}
