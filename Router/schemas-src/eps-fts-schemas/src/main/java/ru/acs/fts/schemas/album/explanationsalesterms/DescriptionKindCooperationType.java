
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * �������� ���� ��������������.
 */
public class DescriptionKindCooperationType
{
    private String periodTime;
    private String value;

    /** 
     * Get the 'PeriodTime' element value. ������ �������
     * 
     * @return value
     */
    public String getPeriodTime() {
        return periodTime;
    }

    /** 
     * Set the 'PeriodTime' element value. ������ �������
     * 
     * @param periodTime
     */
    public void setPeriodTime(String periodTime) {
        this.periodTime = periodTime;
    }

    /** 
     * Get the 'Value' element value. ���� �������� ����: true ��� 1 - ��; false ��� 0 - ���
     * 
     * @return value
     */
    public String getValue() {
        return value;
    }

    /** 
     * Set the 'Value' element value. ���� �������� ����: true ��� 1 - ��; false ��� 0 - ���
     * 
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }
}
