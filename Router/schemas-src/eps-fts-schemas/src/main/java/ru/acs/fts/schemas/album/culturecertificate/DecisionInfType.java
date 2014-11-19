
package ru.acs.fts.schemas.album.culturecertificate;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������� � �������, �� ��������� �������� �������� �����
 */
public class DecisionInfType extends DocumentBaseType
{
    private String stateStructure;

    /** 
     * Get the 'StateStructure' element value. ������������ ���������������� ������, ��������� �������������
     * 
     * @return value
     */
    public String getStateStructure() {
        return stateStructure;
    }

    /** 
     * Set the 'StateStructure' element value. ������������ ���������������� ������, ��������� �������������
     * 
     * @param stateStructure
     */
    public void setStateStructure(String stateStructure) {
        this.stateStructure = stateStructure;
    }
}
