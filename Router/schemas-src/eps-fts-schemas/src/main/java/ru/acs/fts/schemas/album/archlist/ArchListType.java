
package ru.acs.fts.schemas.album.archlist;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ������ ������� ����������
 */
public class ArchListType extends BaseDocType
{
    private List<ArchiveListType> archiveList = new ArrayList<ArchiveListType>();
    private String documentModeID;

    /** 
     * Get the list of 'ArchiveList' element items. ������� ������ ������� ����������
     * 
     * @return list
     */
    public List<ArchiveListType> getArchiveList() {
        return archiveList;
    }

    /** 
     * Set the list of 'ArchiveList' element items. ������� ������ ������� ����������
     * 
     * @param list
     */
    public void setArchiveList(List<ArchiveListType> list) {
        archiveList = list;
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
