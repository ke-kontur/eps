
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * ����������� ��� ��� �������� ������������ ���� ����������� ������
 */
public class WHCustomInspectorType extends PersonBaseType
{
    private String LNP;

    /** 
     * Get the 'LNP' element value. �.�.�. ���������� ����������� ������, ������������������� �����
     * 
     * @return value
     */
    public String getLNP() {
        return LNP;
    }

    /** 
     * Set the 'LNP' element value. �.�.�. ���������� ����������� ������, ������������������� �����
     * 
     * @param LNP
     */
    public void setLNP(String LNP) {
        this.LNP = LNP;
    }
}
