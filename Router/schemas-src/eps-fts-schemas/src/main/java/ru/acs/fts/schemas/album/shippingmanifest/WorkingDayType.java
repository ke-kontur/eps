
package ru.acs.fts.schemas.album.shippingmanifest;

/** 
 * ����� ������
 */
public class WorkingDayType
{
    private String from;
    private String to;

    /** 
     * Get the 'From' element value. ����� ������ �������� ���
     * 
     * @return value
     */
    public String getFrom() {
        return from;
    }

    /** 
     * Set the 'From' element value. ����� ������ �������� ���
     * 
     * @param from
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /** 
     * Get the 'To' element value. ����� ��������� �������� ���
     * 
     * @return value
     */
    public String getTo() {
        return to;
    }

    /** 
     * Set the 'To' element value. ����� ��������� �������� ���
     * 
     * @param to
     */
    public void setTo(String to) {
        this.to = to;
    }
}
