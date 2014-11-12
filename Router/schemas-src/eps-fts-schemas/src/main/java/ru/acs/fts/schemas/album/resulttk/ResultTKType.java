
package ru.acs.fts.schemas.album.resulttk;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * �������� �� ������������� ��������
 */
public class ResultTKType extends BaseDocType
{
    private List<InspectionType> inspectionList = new ArrayList<InspectionType>();
    private String documentModeID;

    /** 
     * Get the list of 'Inspection' element items. ������ ������������� ��������/���������
     * 
     * @return list
     */
    public List<InspectionType> getInspectionList() {
        return inspectionList;
    }

    /** 
     * Set the list of 'Inspection' element items. ������ ������������� ��������/���������
     * 
     * @param list
     */
    public void setInspectionList(List<InspectionType> list) {
        inspectionList = list;
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
