
package ru.acs.fts.schemas.album.fitosanitarycertificate;

import java.util.ArrayList;
import java.util.List;

/** 
 * ������������� ����� (����������)
 */
public class ExciseType
{
    private String exciseSerieses;
    private List<String> exciseDescriptionList = new ArrayList<String>();

    /** 
     * Get the 'ExciseSerieses' element value. ����� �����
     * 
     * @return value
     */
    public String getExciseSerieses() {
        return exciseSerieses;
    }

    /** 
     * Set the 'ExciseSerieses' element value. ����� �����
     * 
     * @param exciseSerieses
     */
    public void setExciseSerieses(String exciseSerieses) {
        this.exciseSerieses = exciseSerieses;
    }

    /** 
     * Get the list of 'ExciseDescription' element items. �������� ������������� ������
     * 
     * @return list
     */
    public List<String> getExciseDescriptionList() {
        return exciseDescriptionList;
    }

    /** 
     * Set the list of 'ExciseDescription' element items. �������� ������������� ������
     * 
     * @param list
     */
    public void setExciseDescriptionList(List<String> list) {
        exciseDescriptionList = list;
    }
}
