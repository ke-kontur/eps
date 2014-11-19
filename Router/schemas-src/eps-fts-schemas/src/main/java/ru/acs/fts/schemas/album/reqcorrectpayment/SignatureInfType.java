
package ru.acs.fts.schemas.album.reqcorrectpayment;

import org.joda.time.LocalDate;

/** 
 * �������� � �������
 */
public class SignatureInfType
{
    private String personName;
    private LocalDate date;

    /** 
     * Get the 'PersonName' element value. �.�.�. ������������� ����, �������������� ������, ����������� �������/ ������������ ���� ����������� ������, ������������ �������
     * 
     * @return value
     */
    public String getPersonName() {
        return personName;
    }

    /** 
     * Set the 'PersonName' element value. �.�.�. ������������� ����, �������������� ������, ����������� �������/ ������������ ���� ����������� ������, ������������ �������
     * 
     * @param personName
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /** 
     * Get the 'Date' element value. ���� ��������� �������/���� ����������� �������
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. ���� ��������� �������/���� ����������� �������
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }
}
