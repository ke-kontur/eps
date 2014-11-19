
package ru.acs.fts.schemas.album.notifviolation;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� ��������, ������� ���������� ��������������� ��� ���������� ��������� ��� ���������� ������� �������
 */
public class CorrectReqType
{
    private List<String> correctDescriptionList = new ArrayList<String>();
    private String correctDateLimit;

    /** 
     * Get the list of 'CorrectDescription' element items. �������� ��������, ������� ���������� ���������������
     * 
     * @return list
     */
    public List<String> getCorrectDescriptionList() {
        return correctDescriptionList;
    }

    /** 
     * Set the list of 'CorrectDescription' element items. �������� ��������, ������� ���������� ���������������
     * 
     * @param list
     */
    public void setCorrectDescriptionList(List<String> list) {
        correctDescriptionList = list;
    }

    /** 
     * Get the 'CorrectDateLimit' element value. ���� �� �������� ���������� ��������������� ��������
     * 
     * @return value
     */
    public String getCorrectDateLimit() {
        return correctDateLimit;
    }

    /** 
     * Set the 'CorrectDateLimit' element value. ���� �� �������� ���������� ��������������� ��������
     * 
     * @param correctDateLimit
     */
    public void setCorrectDateLimit(String correctDateLimit) {
        this.correctDateLimit = correctDateLimit;
    }
}
