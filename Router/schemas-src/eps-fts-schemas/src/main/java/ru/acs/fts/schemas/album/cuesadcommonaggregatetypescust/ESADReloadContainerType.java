
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� � ����� �����������
 */
public class ESADReloadContainerType
{
    private List<String> containerNumberList = new ArrayList<String>();

    /** 
     * Get the list of 'ContainerNumber' element items. ����� ������ ����������
     * 
     * @return list
     */
    public List<String> getContainerNumberList() {
        return containerNumberList;
    }

    /** 
     * Set the list of 'ContainerNumber' element items. ����� ������ ����������
     * 
     * @param list
     */
    public void setContainerNumberList(List<String> list) {
        containerNumberList = list;
    }
}
