
package ru.acs.fts.schemas.album.resulttk;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ���������
 */
public class CheckType extends DocumentBaseType
{
    private String sum;

    /** 
     * Get the 'Sum' element value. ����� �������� ������/������
     * 
     * @return value
     */
    public String getSum() {
        return sum;
    }

    /** 
     * Set the 'Sum' element value. ����� �������� ������/������
     * 
     * @param sum
     */
    public void setSum(String sum) {
        this.sum = sum;
    }
}
