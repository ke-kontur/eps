
package ru.acs.fts.schemas.album.quaranfitosanitcontrol;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������� ���
 */
public class ActType extends DocumentBaseType
{
    private String blankNum;

    /** 
     * Get the 'BlankNum' element value. ����� ������, ��������� ����
     * 
     * @return value
     */
    public String getBlankNum() {
        return blankNum;
    }

    /** 
     * Set the 'BlankNum' element value. ����� ������, ��������� ����
     * 
     * @param blankNum
     */
    public void setBlankNum(String blankNum) {
        this.blankNum = blankNum;
    }
}
