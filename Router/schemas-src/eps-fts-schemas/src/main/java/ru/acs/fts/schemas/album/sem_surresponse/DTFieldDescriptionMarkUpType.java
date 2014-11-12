
package ru.acs.fts.schemas.album.sem_surresponse;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.semcommonaggregatetypescust.MarkUpType;

/** 
 * ����������� ��������� ���������� ����� ��
 */
public class DTFieldDescriptionMarkUpType
{
    private String DTFieldName;
    private List<MarkUpType> markupList = new ArrayList<MarkUpType>();

    /** 
     * Get the 'DTFieldName' element value. ����� ����� ��
     * 
     * @return value
     */
    public String getDTFieldName() {
        return DTFieldName;
    }

    /** 
     * Set the 'DTFieldName' element value. ����� ����� ��
     * 
     * @param DTFieldName
     */
    public void setDTFieldName(String DTFieldName) {
        this.DTFieldName = DTFieldName;
    }

    /** 
     * Get the list of 'Markup' element items. ��������� ��������
     * 
     * @return list
     */
    public List<MarkUpType> getMarkupList() {
        return markupList;
    }

    /** 
     * Set the list of 'Markup' element items. ��������� ��������
     * 
     * @param list
     */
    public void setMarkupList(List<MarkUpType> list) {
        markupList = list;
    }
}
