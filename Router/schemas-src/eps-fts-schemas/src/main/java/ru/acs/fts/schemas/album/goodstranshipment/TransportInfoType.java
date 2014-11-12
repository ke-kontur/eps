
package ru.acs.fts.schemas.album.goodstranshipment;

import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * ����� ������������ �������� ��� �����������
 */
public class TransportInfoType extends TransportMeansBaseType
{
    private String mode;

    /** 
     * Get the 'Mode' element value. ��� ���� ������������� ��������
     * 
     * @return value
     */
    public String getMode() {
        return mode;
    }

    /** 
     * Set the 'Mode' element value. ��� ���� ������������� ��������
     * 
     * @param mode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }
}
