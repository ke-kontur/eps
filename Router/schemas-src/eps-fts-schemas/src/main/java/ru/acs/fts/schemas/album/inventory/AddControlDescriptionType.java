
package ru.acs.fts.schemas.album.inventory;

import org.joda.time.LocalDate;

/** 
 * �������� ������� � ���������� �������������� ��������, �� �������� ��������������� ��������.
 */
public class AddControlDescriptionType
{
    private String addControlNumber;
    private LocalDate addControlDate;

    /** 
     * Get the 'AddControlNumber' element value. ���������� ����� ������� � ���������� �������������� �������� 
     * 
     * @return value
     */
    public String getAddControlNumber() {
        return addControlNumber;
    }

    /** 
     * Set the 'AddControlNumber' element value. ���������� ����� ������� � ���������� �������������� �������� 
     * 
     * @param addControlNumber
     */
    public void setAddControlNumber(String addControlNumber) {
        this.addControlNumber = addControlNumber;
    }

    /** 
     * Get the 'AddControlDate' element value. ���� ������� � ���������� �������������� ��������
     * 
     * @return value
     */
    public LocalDate getAddControlDate() {
        return addControlDate;
    }

    /** 
     * Set the 'AddControlDate' element value. ���� ������� � ���������� �������������� ��������
     * 
     * @param addControlDate
     */
    public void setAddControlDate(LocalDate addControlDate) {
        this.addControlDate = addControlDate;
    }
}
