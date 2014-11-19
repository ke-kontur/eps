
package ru.acs.fts.schemas.album.cwquitance;

import java.util.ArrayList;
import java.util.List;

/** 
 * ���������
 */
public class QuitanceType
{
    private String documentModeID;
    private List<CommonDocumentType> correctDocumentList = new ArrayList<CommonDocumentType>();

    /** 
     * Get the 'DocumentModeID' element value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' element value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }

    /** 
     * Get the list of 'CorrectDocument' element items. �������������� ��������
     * 
     * @return list
     */
    public List<CommonDocumentType> getCorrectDocumentList() {
        return correctDocumentList;
    }

    /** 
     * Set the list of 'CorrectDocument' element items. �������������� ��������
     * 
     * @param list
     */
    public void setCorrectDocumentList(List<CommonDocumentType> list) {
        correctDocumentList = list;
    }
}
