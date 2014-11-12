
package ru.acs.fts.schemas.album.archpermitparticipantsinfo;

import java.util.ArrayList;
import java.util.List;

/** 
 * �����, ��������� ��� ���������
 */
public class ArchiveType
{
    private String archID;
    private List<ArchDocumentType> archDocumentList = new ArrayList<ArchDocumentType>();

    /** 
     * Get the 'ArchID' element value. ������������� ������
     * 
     * @return value
     */
    public String getArchID() {
        return archID;
    }

    /** 
     * Set the 'ArchID' element value. ������������� ������
     * 
     * @param archID
     */
    public void setArchID(String archID) {
        this.archID = archID;
    }

    /** 
     * Get the list of 'ArchDocument' element items. �������� ������
     * 
     * @return list
     */
    public List<ArchDocumentType> getArchDocumentList() {
        return archDocumentList;
    }

    /** 
     * Set the list of 'ArchDocument' element items. �������� ������
     * 
     * @param list
     */
    public void setArchDocumentList(List<ArchDocumentType> list) {
        archDocumentList = list;
    }
}
