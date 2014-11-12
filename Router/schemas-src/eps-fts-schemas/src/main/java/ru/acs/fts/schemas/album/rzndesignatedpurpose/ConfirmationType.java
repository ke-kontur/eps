
package ru.acs.fts.schemas.album.rzndesignatedpurpose;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ������������� (�������������)
 */
public class ConfirmationType extends DocumentBaseType
{
    private String duration;

    /** 
     * Get the 'Duration' element value. ���� ��������
     * 
     * @return value
     */
    public String getDuration() {
        return duration;
    }

    /** 
     * Set the 'Duration' element value. ���� ��������
     * 
     * @param duration
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }
}
