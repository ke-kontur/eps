
package ru.acs.fts.schemas.album.cmr;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cutransportcommonaggregatetypescust.TRPackingInfoType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.TransportGoodsType;

/** 
 * �������� � ������� (��.6,7,9,10,11,12)
 */
public class CMRGoodsType extends TransportGoodsType
{
    private String goodsQuantity;
    private String grossWeightQuantity;
    private List<TRPackingInfoType> goodsPackingInfoList = new ArrayList<TRPackingInfoType>();

    /** 
     * Get the 'GoodsQuantity' element value. ���������� ������������ ����� 
     * 
     * @return value
     */
    public String getGoodsQuantity() {
        return goodsQuantity;
    }

    /** 
     * Set the 'GoodsQuantity' element value. ���������� ������������ ����� 
     * 
     * @param goodsQuantity
     */
    public void setGoodsQuantity(String goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }

    /** 
     * Get the 'GrossWeightQuantity' element value. ��� ������, ������ (��)
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. ��� ������, ������ (��)
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }

    /** 
     * Get the list of 'GoodsPackingInfo' element items. ���������� �� �������� �����
     * 
     * @return list
     */
    public List<TRPackingInfoType> getGoodsPackingInfoList() {
        return goodsPackingInfoList;
    }

    /** 
     * Set the list of 'GoodsPackingInfo' element items. ���������� �� �������� �����
     * 
     * @param list
     */
    public void setGoodsPackingInfoList(List<TRPackingInfoType> list) {
        goodsPackingInfoList = list;
    }
}
