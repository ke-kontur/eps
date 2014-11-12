
package ru.acs.fts.schemas.album.custpaymentsdk;

import org.joda.time.LocalDate;

/** 
 * ���������� �����
 */
public class CustomsMarcType
{
    private String markDescription;
    private LocalDate dateInf;

    /** 
     * Get the 'MarkDescription' element value. ��������� ������ / ����� ��������� 
     * 
     * @return value
     */
    public String getMarkDescription() {
        return markDescription;
    }

    /** 
     * Set the 'MarkDescription' element value. ��������� ������ / ����� ��������� 
     * 
     * @param markDescription
     */
    public void setMarkDescription(String markDescription) {
        this.markDescription = markDescription;
    }

    /** 
     * Get the 'DateInf' element value. ���� ������������ �������/ ���� �������� ������� � ��������� ����� �������� (��. 359 ��)
     * 
     * @return value
     */
    public LocalDate getDateInf() {
        return dateInf;
    }

    /** 
     * Set the 'DateInf' element value. ���� ������������ �������/ ���� �������� ������� � ��������� ����� �������� (��. 359 ��)
     * 
     * @param dateInf
     */
    public void setDateInf(LocalDate dateInf) {
        this.dateInf = dateInf;
    }
}
