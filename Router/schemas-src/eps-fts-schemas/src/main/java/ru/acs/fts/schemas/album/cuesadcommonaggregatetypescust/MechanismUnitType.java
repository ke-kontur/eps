
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� � �������������� �����
 */
public class MechanismUnitType extends ComponentDescriptionType
{
    private String unitDescription;
    private List<MechUnitPartType> mechUnitPartList = new ArrayList<MechUnitPartType>();

    /** 
     * Get the 'UnitDescription' element value. ������������ �� / ������� ������ (������ ����������)
     * 
     * @return value
     */
    public String getUnitDescription() {
        return unitDescription;
    }

    /** 
     * Set the 'UnitDescription' element value. ������������ �� / ������� ������ (������ ����������)
     * 
     * @param unitDescription
     */
    public void setUnitDescription(String unitDescription) {
        this.unitDescription = unitDescription;
    }

    /** 
     * Get the list of 'MechUnitPart' element items. �������� � ���������� ��������������� �����
     * 
     * @return list
     */
    public List<MechUnitPartType> getMechUnitPartList() {
        return mechUnitPartList;
    }

    /** 
     * Set the list of 'MechUnitPart' element items. �������� � ���������� ��������������� �����
     * 
     * @param list
     */
    public void setMechUnitPartList(List<MechUnitPartType> list) {
        mechUnitPartList = list;
    }
}
