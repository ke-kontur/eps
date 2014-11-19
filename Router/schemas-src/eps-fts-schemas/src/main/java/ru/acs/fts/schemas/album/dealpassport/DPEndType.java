
package ru.acs.fts.schemas.album.dealpassport;

import org.joda.time.LocalDate;

/** 
 * ���������� � �������� ��
 */
public class DPEndType
{
    private LocalDate date;
    private String reason;

    /** 
     * Get the 'Date' element value. ���� �������� ��
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. ���� �������� ��
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'Reason' element value. ��������� ��� �������� �� (����������� ����� ��������� 3.18.1 - 3.18.3 ������ 3.18 ���������� �� �� �� 15.06.2004 �. N 117-�, �� ��������� �������� ����������� ��)
     * 
     * @return value
     */
    public String getReason() {
        return reason;
    }

    /** 
     * Set the 'Reason' element value. ��������� ��� �������� �� (����������� ����� ��������� 3.18.1 - 3.18.3 ������ 3.18 ���������� �� �� �� 15.06.2004 �. N 117-�, �� ��������� �������� ����������� ��)
     * 
     * @param reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }
}
