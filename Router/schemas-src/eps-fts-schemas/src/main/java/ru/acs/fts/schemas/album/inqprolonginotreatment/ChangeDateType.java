
package ru.acs.fts.schemas.album.inqprolonginotreatment;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * �������� ������������� ����� ���������
 */
public class ChangeDateType
{
    private LocalDate newDate;
    private List<String> motivationList = new ArrayList<String>();

    /** 
     * Get the 'NewDate' element value. ����� ���� ��������� �����������
     * 
     * @return value
     */
    public LocalDate getNewDate() {
        return newDate;
    }

    /** 
     * Set the 'NewDate' element value. ����� ���� ��������� �����������
     * 
     * @param newDate
     */
    public void setNewDate(LocalDate newDate) {
        this.newDate = newDate;
    }

    /** 
     * Get the list of 'Motivation' element items. ������� ��������� ������ �����������
     * 
     * @return list
     */
    public List<String> getMotivationList() {
        return motivationList;
    }

    /** 
     * Set the list of 'Motivation' element items. ������� ��������� ������ �����������
     * 
     * @param list
     */
    public void setMotivationList(List<String> list) {
        motivationList = list;
    }
}
