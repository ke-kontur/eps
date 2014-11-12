
package ru.acs.fts.schemas.album.mistakeletter;

import org.joda.time.LocalDate;

/** 
 * ������ � ���� ���������
 */
public class DocDateMistakeType
{
    private LocalDate dateMistakeValue;
    private LocalDate dateValidValue;

    /** 
     * Get the 'DateMistakeValue' element value. ��������� ��������, ��������� � ������ �� ����� ��-1
     * 
     * @return value
     */
    public LocalDate getDateMistakeValue() {
        return dateMistakeValue;
    }

    /** 
     * Set the 'DateMistakeValue' element value. ��������� ��������, ��������� � ������ �� ����� ��-1
     * 
     * @param dateMistakeValue
     */
    public void setDateMistakeValue(LocalDate dateMistakeValue) {
        this.dateMistakeValue = dateMistakeValue;
    }

    /** 
     * Get the 'DateValidValue' element value. ���������� ��������. ���� �� �������, �� ���������, ��� ��� ������ ��� ������������� �����
     * 
     * @return value
     */
    public LocalDate getDateValidValue() {
        return dateValidValue;
    }

    /** 
     * Set the 'DateValidValue' element value. ���������� ��������. ���� �� �������, �� ���������, ��� ��� ������ ��� ������������� �����
     * 
     * @param dateValidValue
     */
    public void setDateValidValue(LocalDate dateValidValue) {
        this.dateValidValue = dateValidValue;
    }
}
