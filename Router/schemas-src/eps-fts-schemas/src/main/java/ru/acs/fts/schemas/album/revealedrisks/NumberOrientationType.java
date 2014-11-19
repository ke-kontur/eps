
package ru.acs.fts.schemas.album.revealedrisks;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDID5Type;

/** 
 * ����� ������������ 
 */
public class NumberOrientationType extends GTDID5Type
{
    private String terrActionCode;

    /** 
     * Get the 'TerrActionCode' element value. ��� ���� ��������� ��������� ��������:11 - �������������� ������� �����, 12 - ������������ ������� �����, 13 - ��������� ������� �����, 55 - ������� �����, ������������ � ����������, 20 - ������� ������� �����, 25 - �������������� ������������, 26 - ������������ ������������, 27 - ��������� ������������, 32 - ����������� ������������ ������� �����, 77 -  ��� ��������� ���, ���������� � "������� ������".
     * 
     * @return value
     */
    public String getTerrActionCode() {
        return terrActionCode;
    }

    /** 
     * Set the 'TerrActionCode' element value. ��� ���� ��������� ��������� ��������:11 - �������������� ������� �����, 12 - ������������ ������� �����, 13 - ��������� ������� �����, 55 - ������� �����, ������������ � ����������, 20 - ������� ������� �����, 25 - �������������� ������������, 26 - ������������ ������������, 27 - ��������� ������������, 32 - ����������� ������������ ������� �����, 77 -  ��� ��������� ���, ���������� � "������� ������".
     * 
     * @param terrActionCode
     */
    public void setTerrActionCode(String terrActionCode) {
        this.terrActionCode = terrActionCode;
    }
}
