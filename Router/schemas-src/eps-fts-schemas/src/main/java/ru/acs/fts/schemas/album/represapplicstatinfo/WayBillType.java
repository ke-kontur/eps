
package ru.acs.fts.schemas.album.represapplicstatinfo;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������� � ���������
 */
public class WayBillType extends DocumentBaseType
{
    private String wayBillKind;

    /** 
     * Get the 'WayBillKind' element value. ���: 1 - �������������� ���������; 2 - ����� �������������; 3 - ������������ ���������
     * 
     * @return value
     */
    public String getWayBillKind() {
        return wayBillKind;
    }

    /** 
     * Set the 'WayBillKind' element value. ���: 1 - �������������� ���������; 2 - ����� �������������; 3 - ������������ ���������
     * 
     * @param wayBillKind
     */
    public void setWayBillKind(String wayBillKind) {
        this.wayBillKind = wayBillKind;
    }
}
