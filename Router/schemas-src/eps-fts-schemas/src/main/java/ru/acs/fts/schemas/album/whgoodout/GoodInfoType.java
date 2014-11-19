
package ru.acs.fts.schemas.album.whgoodout;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHContainerInformationType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WhGoodType;

/** 
 * �������� �������
 */
public class GoodInfoType extends WhGoodType
{
    private List<WHContainerInformationType> containerList = new ArrayList<WHContainerInformationType>();
    private List<DocumentBaseType> transportDocList = new ArrayList<DocumentBaseType>();

    /** 
     * Get the list of 'Container' element items. �������� ����������
     * 
     * @return list
     */
    public List<WHContainerInformationType> getContainerList() {
        return containerList;
    }

    /** 
     * Set the list of 'Container' element items. �������� ����������
     * 
     * @param list
     */
    public void setContainerList(List<WHContainerInformationType> list) {
        containerList = list;
    }

    /** 
     * Get the list of 'TransportDoc' element items. �������� � ������������ ���������
     * 
     * @return list
     */
    public List<DocumentBaseType> getTransportDocList() {
        return transportDocList;
    }

    /** 
     * Set the list of 'TransportDoc' element items. �������� � ������������ ���������
     * 
     * @param list
     */
    public void setTransportDocList(List<DocumentBaseType> list) {
        transportDocList = list;
    }
}
