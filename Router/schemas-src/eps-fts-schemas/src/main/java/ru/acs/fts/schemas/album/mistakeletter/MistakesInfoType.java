
package ru.acs.fts.schemas.album.mistakeletter;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * �������� � ���������� �������
 */
public class MistakesInfoType
{
    private LocalDate date;
    private String time;
    private List<String> reasonList = new ArrayList<String>();
    private MistakesDescriptionType mistakesDescription;

    /** 
     * Get the 'Date' element value. ���� ��������� ������
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. ���� ��������� ������
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'Time' element value. ����� ��������� ������
     * 
     * @return value
     */
    public String getTime() {
        return time;
    }

    /** 
     * Set the 'Time' element value. ����� ��������� ������
     * 
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /** 
     * Get the list of 'Reasons' element items. �������� ������ ������ � ������������� �� ���������
     * 
     * @return list
     */
    public List<String> getReasonList() {
        return reasonList;
    }

    /** 
     * Set the list of 'Reasons' element items. �������� ������ ������ � ������������� �� ���������
     * 
     * @param list
     */
    public void setReasonList(List<String> list) {
        reasonList = list;
    }

    /** 
     * Get the 'MistakesDescription' element value. �������� ���������� ������
     * 
     * @return value
     */
    public MistakesDescriptionType getMistakesDescription() {
        return mistakesDescription;
    }

    /** 
     * Set the 'MistakesDescription' element value. �������� ���������� ������
     * 
     * @param mistakesDescription
     */
    public void setMistakesDescription(
            MistakesDescriptionType mistakesDescription) {
        this.mistakesDescription = mistakesDescription;
    }
}
