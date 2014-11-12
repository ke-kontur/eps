
package ru.acs.fts.schemas.album.whgoodout;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.ConsigneeType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WhTransportType;

/** 
 * ��������� �� ������ �������
 */
public class DeliveryGoodsType
{
    private ConsigneeType consignee;
    private List<WhTransportType> transportList = new ArrayList<WhTransportType>();
    private List<GoodInfoType> goodInfoList = new ArrayList<GoodInfoType>();

    /** 
     * Get the 'Consignee' element value. ���������������
     * 
     * @return value
     */
    public ConsigneeType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. ���������������
     * 
     * @param consignee
     */
    public void setConsignee(ConsigneeType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the list of 'Transport' element items. �������� ������������� ��������
     * 
     * @return list
     */
    public List<WhTransportType> getTransportList() {
        return transportList;
    }

    /** 
     * Set the list of 'Transport' element items. �������� ������������� ��������
     * 
     * @param list
     */
    public void setTransportList(List<WhTransportType> list) {
        transportList = list;
    }

    /** 
     * Get the list of 'GoodInfo' element items. �������� �������
     * 
     * @return list
     */
    public List<GoodInfoType> getGoodInfoList() {
        return goodInfoList;
    }

    /** 
     * Set the list of 'GoodInfo' element items. �������� �������
     * 
     * @param list
     */
    public void setGoodInfoList(List<GoodInfoType> list) {
        goodInfoList = list;
    }
}
