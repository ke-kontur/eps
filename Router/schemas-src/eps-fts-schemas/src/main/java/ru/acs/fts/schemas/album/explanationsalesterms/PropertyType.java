
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * ����� �������������� ������� ����� ������������� �� �������� � ����������
 */
public class PropertyType
{
    private String dayShipping;
    private String dayPayment;
    private String otherDay;
    private String commentsOtherDay;

    /** 
     * Get the 'DayShipping' element value. ������� �������� ����� ������������� �� �������� � ���������� �� ���� ��������
     * 
     * @return value
     */
    public String getDayShipping() {
        return dayShipping;
    }

    /** 
     * Set the 'DayShipping' element value. ������� �������� ����� ������������� �� �������� � ���������� �� ���� ��������
     * 
     * @param dayShipping
     */
    public void setDayShipping(String dayShipping) {
        this.dayShipping = dayShipping;
    }

    /** 
     * Get the 'DayPayment' element value. ������� �������� ����� ������������� �� �������� � ���������� �� ���� ������
     * 
     * @return value
     */
    public String getDayPayment() {
        return dayPayment;
    }

    /** 
     * Set the 'DayPayment' element value. ������� �������� ����� ������������� �� �������� � ���������� �� ���� ������
     * 
     * @param dayPayment
     */
    public void setDayPayment(String dayPayment) {
        this.dayPayment = dayPayment;
    }

    /** 
     * Get the 'OtherDay' element value. ������� �������� ����� ������������� �� �������� � ���������� � ���� ����
     * 
     * @return value
     */
    public String getOtherDay() {
        return otherDay;
    }

    /** 
     * Set the 'OtherDay' element value. ������� �������� ����� ������������� �� �������� � ���������� � ���� ����
     * 
     * @param otherDay
     */
    public void setOtherDay(String otherDay) {
        this.otherDay = otherDay;
    }

    /** 
     * Get the 'CommentsOtherDay' element value. ���� ����(�����������)
     * 
     * @return value
     */
    public String getCommentsOtherDay() {
        return commentsOtherDay;
    }

    /** 
     * Set the 'CommentsOtherDay' element value. ���� ����(�����������)
     * 
     * @param commentsOtherDay
     */
    public void setCommentsOtherDay(String commentsOtherDay) {
        this.commentsOtherDay = commentsOtherDay;
    }
}
