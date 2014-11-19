
package ru.acs.fts.schemas.album.commissioninspection;

/** 
 * ����� ��������
 */
public class VolumeInspectionType
{
    private String percent10;
    private String percent50;
    private String percent100;

    /** 
     * Get the 'Percent10' element value. ���� �������� ����: "true" - ��; "false" - ���.
     * 
     * @return value
     */
    public String getPercent10() {
        return percent10;
    }

    /** 
     * Set the 'Percent10' element value. ���� �������� ����: "true" - ��; "false" - ���.
     * 
     * @param percent10
     */
    public void setPercent10(String percent10) {
        this.percent10 = percent10;
    }

    /** 
     * Get the 'Percent50' element value. ���� �������� ����: "true" - ��; "false" - ���.
     * 
     * @return value
     */
    public String getPercent50() {
        return percent50;
    }

    /** 
     * Set the 'Percent50' element value. ���� �������� ����: "true" - ��; "false" - ���.
     * 
     * @param percent50
     */
    public void setPercent50(String percent50) {
        this.percent50 = percent50;
    }

    /** 
     * Get the 'Percent100' element value. ���� �������� ����: "true" - ��; "false" - ���.
     * 
     * @return value
     */
    public String getPercent100() {
        return percent100;
    }

    /** 
     * Set the 'Percent100' element value. ���� �������� ����: "true" - ��; "false" - ���.
     * 
     * @param percent100
     */
    public void setPercent100(String percent100) {
        this.percent100 = percent100;
    }
}
