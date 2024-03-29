
package ru.acs.fts.schemas.album.notifgoodsarrive;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.ArriveCustomsDocType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHContainerInformationType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WhPresentDocType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WhTransportType;

/** 
 * �������� � ��������� �������� ������
 */
public class ArriveShipmentType
{
    private List<WhTransportType> arriveTransportMeanList = new ArrayList<WhTransportType>();
    private List<ArriveGoodsType> arriveGoodList = new ArrayList<ArriveGoodsType>();
    private List<WHContainerInformationType> containerInformationList = new ArrayList<WHContainerInformationType>();
    private List<WhPresentDocType> arriveTransportDocList = new ArrayList<WhPresentDocType>();
    private List<ArriveCustomsDocType> arriveCustomsDocList = new ArrayList<ArriveCustomsDocType>();

    /** 
     * Get the list of 'ArriveTransportMeans' element items. �������� ������������ �������
     * 
     * @return list
     */
    public List<WhTransportType> getArriveTransportMeanList() {
        return arriveTransportMeanList;
    }

    /** 
     * Set the list of 'ArriveTransportMeans' element items. �������� ������������ �������
     * 
     * @param list
     */
    public void setArriveTransportMeanList(List<WhTransportType> list) {
        arriveTransportMeanList = list;
    }

    /** 
     * Get the list of 'ArriveGoods' element items. �������� �������
     * 
     * @return list
     */
    public List<ArriveGoodsType> getArriveGoodList() {
        return arriveGoodList;
    }

    /** 
     * Set the list of 'ArriveGoods' element items. �������� �������
     * 
     * @param list
     */
    public void setArriveGoodList(List<ArriveGoodsType> list) {
        arriveGoodList = list;
    }

    /** 
     * Get the list of 'ContainerInformation' element items. ���������� � ����������
     * 
     * @return list
     */
    public List<WHContainerInformationType> getContainerInformationList() {
        return containerInformationList;
    }

    /** 
     * Set the list of 'ContainerInformation' element items. ���������� � ����������
     * 
     * @param list
     */
    public void setContainerInformationList(
            List<WHContainerInformationType> list) {
        containerInformationList = list;
    }

    /** 
     * Get the list of 'ArriveTransportDoc' element items. ������������ ���������
     * 
     * @return list
     */
    public List<WhPresentDocType> getArriveTransportDocList() {
        return arriveTransportDocList;
    }

    /** 
     * Set the list of 'ArriveTransportDoc' element items. ������������ ���������
     * 
     * @param list
     */
    public void setArriveTransportDocList(List<WhPresentDocType> list) {
        arriveTransportDocList = list;
    }

    /** 
     * Get the list of 'ArriveCustomsDoc' element items. ���������� ���������
     * 
     * @return list
     */
    public List<ArriveCustomsDocType> getArriveCustomsDocList() {
        return arriveCustomsDocList;
    }

    /** 
     * Set the list of 'ArriveCustomsDoc' element items. ���������� ���������
     * 
     * @param list
     */
    public void setArriveCustomsDocList(List<ArriveCustomsDocType> list) {
        arriveCustomsDocList = list;
    }
}
