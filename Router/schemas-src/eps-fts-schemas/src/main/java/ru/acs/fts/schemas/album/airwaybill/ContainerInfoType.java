
package ru.acs.fts.schemas.album.airwaybill;

import java.util.ArrayList;
import java.util.List;

/** 
 * ���������� � ����������
 */
public class ContainerInfoType
{
    private List<String> containerNumList = new ArrayList<String>();
    private String containerDescr;

    /** 
     * Get the list of 'ContainerNum' element items. ����� ����������
     * 
     * @return list
     */
    public List<String> getContainerNumList() {
        return containerNumList;
    }

    /** 
     * Set the list of 'ContainerNum' element items. ����� ����������
     * 
     * @param list
     */
    public void setContainerNumList(List<String> list) {
        containerNumList = list;
    }

    /** 
     * Get the 'ContainerDescr' element value. �������� ����������
     * 
     * @return value
     */
    public String getContainerDescr() {
        return containerDescr;
    }

    /** 
     * Set the 'ContainerDescr' element value. �������� ����������
     * 
     * @param containerDescr
     */
    public void setContainerDescr(String containerDescr) {
        this.containerDescr = containerDescr;
    }
}
