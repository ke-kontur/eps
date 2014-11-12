
package ru.acs.fts.schemas.album.revealeddirections;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ��������� ��������� ����������� ������������
 */
public class RevealedDirectionsType extends BaseDocType
{
    private List<DirectionsListType> directionsList = new ArrayList<DirectionsListType>();
    private String documentModeID;

    /** 
     * Get the list of 'DirectionsList' element items. ������ ����������� ����������� ������������
     * 
     * @return list
     */
    public List<DirectionsListType> getDirectionsList() {
        return directionsList;
    }

    /** 
     * Set the list of 'DirectionsList' element items. ������ ����������� ����������� ������������
     * 
     * @param list
     */
    public void setDirectionsList(List<DirectionsListType> list) {
        directionsList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ��������� (��� ��������� � ������� �������� ��� ��)
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ��������� (��� ��������� � ������� �������� ��� ��)
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
