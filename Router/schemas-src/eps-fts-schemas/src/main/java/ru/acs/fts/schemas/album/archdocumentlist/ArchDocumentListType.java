
package ru.acs.fts.schemas.album.archdocumentlist;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.electronicarchivecommonaggregatetypescust.ArchBaseType;

/** 
 * ������ ���������� � ������ ����������
 */
public class ArchDocumentListType extends ArchBaseType
{
    private List<ArchDocumentType> documentInfoList = new ArrayList<ArchDocumentType>();
    private String documentModeID;

    /** 
     * Get the list of 'DocumentInfo' element items. ���������� � ���������
     * 
     * @return list
     */
    public List<ArchDocumentType> getDocumentInfoList() {
        return documentInfoList;
    }

    /** 
     * Set the list of 'DocumentInfo' element items. ���������� � ���������
     * 
     * @param list
     */
    public void setDocumentInfoList(List<ArchDocumentType> list) {
        documentInfoList = list;
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
