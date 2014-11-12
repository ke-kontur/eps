
package ru.acs.fts.schemas.album.inventoryin;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� � ��������������� ��������������� ����������
 */
public class PriorInformationType
{
    private List<String> priorInformationIDList = new ArrayList<String>();

    /** 
     * Get the list of 'PriorInformationID' element items. ������������� ��������������� ����������
     * 
     * @return list
     */
    public List<String> getPriorInformationIDList() {
        return priorInformationIDList;
    }

    /** 
     * Set the list of 'PriorInformationID' element items. ������������� ��������������� ����������
     * 
     * @param list
     */
    public void setPriorInformationIDList(List<String> list) {
        priorInformationIDList = list;
    }
}
