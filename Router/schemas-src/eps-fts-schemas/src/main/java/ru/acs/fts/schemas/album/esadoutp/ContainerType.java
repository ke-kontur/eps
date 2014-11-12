
package ru.acs.fts.schemas.album.esadoutp;

import java.util.ArrayList;
import java.util.List;

/** 
 * ���������� � �����������
 */
public class ContainerType
{
    private String containerQuantity;
    private List<ContainerInfoType> containerInfoList = new ArrayList<ContainerInfoType>();

    /** 
     * Get the 'ContainerQuantity' element value. ���������� �����������
     * 
     * @return value
     */
    public String getContainerQuantity() {
        return containerQuantity;
    }

    /** 
     * Set the 'ContainerQuantity' element value. ���������� �����������
     * 
     * @param containerQuantity
     */
    public void setContainerQuantity(String containerQuantity) {
        this.containerQuantity = containerQuantity;
    }

    /** 
     * Get the list of 'ContainerInfo' element items. ���������� � ������ ����������
     * 
     * @return list
     */
    public List<ContainerInfoType> getContainerInfoList() {
        return containerInfoList;
    }

    /** 
     * Set the list of 'ContainerInfo' element items. ���������� � ������ ����������
     * 
     * @param list
     */
    public void setContainerInfoList(List<ContainerInfoType> list) {
        containerInfoList = list;
    }
}
