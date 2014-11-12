
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� ������������ - ������ �����������
 */
public class ComponentsListType
{
    private List<MechanismUnitType> mechanismUnitList = new ArrayList<MechanismUnitType>();

    /** 
     * Get the list of 'MechanismUnit' element items. �������� � �������������� ����� ��� ���������� ������
     * 
     * @return list
     */
    public List<MechanismUnitType> getMechanismUnitList() {
        return mechanismUnitList;
    }

    /** 
     * Set the list of 'MechanismUnit' element items. �������� � �������������� ����� ��� ���������� ������
     * 
     * @param list
     */
    public void setMechanismUnitList(List<MechanismUnitType> list) {
        mechanismUnitList = list;
    }
}
