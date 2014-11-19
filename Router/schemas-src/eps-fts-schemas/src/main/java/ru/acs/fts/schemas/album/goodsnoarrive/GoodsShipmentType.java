
package ru.acs.fts.schemas.album.goodsnoarrive;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ContainerNumberType;

/** 
 * �������� ������
 */
public class GoodsShipmentType
{
    private List<PresentDocumentType> presentDocumentList = new ArrayList<PresentDocumentType>();
    private List<ContainerNumberType> containerNumberList = new ArrayList<ContainerNumberType>();

    /** 
     * Get the list of 'PresentDocument' element items. �������������� ��������
     * 
     * @return list
     */
    public List<PresentDocumentType> getPresentDocumentList() {
        return presentDocumentList;
    }

    /** 
     * Set the list of 'PresentDocument' element items. �������������� ��������
     * 
     * @param list
     */
    public void setPresentDocumentList(List<PresentDocumentType> list) {
        presentDocumentList = list;
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
