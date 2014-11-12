
package ru.acs.fts.schemas.album.actinspection;

import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.AutoInspResultsType;

/** 
 * ���������� �������� ���������� (�������� ������� 8702, 8703 �� �� ��� ��)
 */
public class CarInformationType extends AutoInspResultsType
{
    private String arriveMode;

    /** 
     * Get the 'ArriveMode' element value. ������������ �������� (������������ ��������) ������� (�) � �������� ������: "1" - �� ������������ ��������, "2" - � ����������(��), "3" - ����� �����
     * 
     * @return value
     */
    public String getArriveMode() {
        return arriveMode;
    }

    /** 
     * Set the 'ArriveMode' element value. ������������ �������� (������������ ��������) ������� (�) � �������� ������: "1" - �� ������������ ��������, "2" - � ����������(��), "3" - ����� �����
     * 
     * @param arriveMode
     */
    public void setArriveMode(String arriveMode) {
        this.arriveMode = arriveMode;
    }
}
