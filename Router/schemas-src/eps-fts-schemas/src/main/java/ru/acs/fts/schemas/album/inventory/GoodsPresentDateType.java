
package ru.acs.fts.schemas.album.inventory;

import org.joda.time.LocalDate;

/** 
 * ���� ������������� �������� ������
 */
public class GoodsPresentDateType
{
    private LocalDate presentDate;

    /** 
     * Get the 'PresentDate' element value. ���� ������������� ������/�������� ������
     * 
     * @return value
     */
    public LocalDate getPresentDate() {
        return presentDate;
    }

    /** 
     * Set the 'PresentDate' element value. ���� ������������� ������/�������� ������
     * 
     * @param presentDate
     */
    public void setPresentDate(LocalDate presentDate) {
        this.presentDate = presentDate;
    }
}
