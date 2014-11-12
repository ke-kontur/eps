
package ru.acs.fts.schemas.album.goodscheckreport;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� ���������, ����������� ����������� ��������
 */
public class FactValueDocumentType extends DescriptionDocumentType
{
    private List<MarksType> markList = new ArrayList<MarksType>();

    /** 
     * Get the list of 'Marks' element items. �������� � �������
     * 
     * @return list
     */
    public List<MarksType> getMarkList() {
        return markList;
    }

    /** 
     * Set the list of 'Marks' element items. �������� � �������
     * 
     * @param list
     */
    public void setMarkList(List<MarksType> list) {
        markList = list;
    }
}
