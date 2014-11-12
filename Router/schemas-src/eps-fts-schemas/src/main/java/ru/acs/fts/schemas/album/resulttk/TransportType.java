
package ru.acs.fts.schemas.album.resulttk;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * ��������������� ������ ��
 */
public class TransportType extends TransportMeansBaseType
{
    private List<CheckViolationType> violFidelNumbTrailList = new ArrayList<CheckViolationType>();

    /** 
     * Get the list of 'ViolFidelNumbTrail' element items. ������� � ������������ �������������� ����� ������ ����������� �������/����������� ������������� �����������
     * 
     * @return list
     */
    public List<CheckViolationType> getViolFidelNumbTrailList() {
        return violFidelNumbTrailList;
    }

    /** 
     * Set the list of 'ViolFidelNumbTrail' element items. ������� � ������������ �������������� ����� ������ ����������� �������/����������� ������������� �����������
     * 
     * @param list
     */
    public void setViolFidelNumbTrailList(List<CheckViolationType> list) {
        violFidelNumbTrailList = list;
    }
}
