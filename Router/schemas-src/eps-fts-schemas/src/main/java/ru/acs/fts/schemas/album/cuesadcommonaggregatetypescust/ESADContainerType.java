
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� � �����������
 */
public class ESADContainerType
{
    private String containerQuantity;
    private String containerKind;
    private List<ContainerNumberType> containerNumberList = new ArrayList<ContainerNumberType>();

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
     * Get the 'ContainerKind' element value. ��� ���������� � ������������ � ��������������� ����� �����, �������� � ����������� ����������
     * 
     * @return value
     */
    public String getContainerKind() {
        return containerKind;
    }

    /** 
     * Set the 'ContainerKind' element value. ��� ���������� � ������������ � ��������������� ����� �����, �������� � ����������� ����������
     * 
     * @param containerKind
     */
    public void setContainerKind(String containerKind) {
        this.containerKind = containerKind;
    }

    /** 
     * Get the list of 'ContainerNumber' element items. ����� ����������
     * 
     * @return list
     */
    public List<ContainerNumberType> getContainerNumberList() {
        return containerNumberList;
    }

    /** 
     * Set the list of 'ContainerNumber' element items. ����� ����������
     * 
     * @param list
     */
    public void setContainerNumberList(List<ContainerNumberType> list) {
        containerNumberList = list;
    }
}
