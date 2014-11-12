
package ru.acs.fts.schemas.album.presenteddocinfores;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ���������� � �������������� ����������, ��������� � ����� 44
 */
public class PresentedDocInfoResType extends BaseDocType
{
    private List<PresentedDocType> presentedDocList = new ArrayList<PresentedDocType>();
    private String documentModeID;

    /** 
     * Get the list of 'PresentedDoc' element items. �������� � �������������� ����������
     * 
     * @return list
     */
    public List<PresentedDocType> getPresentedDocList() {
        return presentedDocList;
    }

    /** 
     * Set the list of 'PresentedDoc' element items. �������� � �������������� ����������
     * 
     * @param list
     */
    public void setPresentedDocList(List<PresentedDocType> list) {
        presentedDocList = list;
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
