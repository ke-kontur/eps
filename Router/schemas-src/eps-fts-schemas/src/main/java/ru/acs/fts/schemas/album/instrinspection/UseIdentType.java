
package ru.acs.fts.schemas.album.instrinspection;

import java.util.ArrayList;
import java.util.List;

/** 
 * ���������� ������� �������������
 */
public class UseIdentType
{
    private List<IdentUnitType> identUnitList = new ArrayList<IdentUnitType>();

    /** 
     * Get the list of 'IdentUnit' element items. �������� �������������
     * 
     * @return list
     */
    public List<IdentUnitType> getIdentUnitList() {
        return identUnitList;
    }

    /** 
     * Set the list of 'IdentUnit' element items. �������� �������������
     * 
     * @param list
     */
    public void setIdentUnitList(List<IdentUnitType> list) {
        identUnitList = list;
    }
}
