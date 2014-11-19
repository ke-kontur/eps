
package ru.acs.fts.schemas.album.goodsearchrequest;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * �������� � ������������ ��������
 */
public class CarriageType extends TransportMeansBaseType
{
    private List<GoodsType> goodsInfoList = new ArrayList<GoodsType>();

    /** 
     * Get the list of 'GoodsInfo' element items. �������� ������
     * 
     * @return list
     */
    public List<GoodsType> getGoodsInfoList() {
        return goodsInfoList;
    }

    /** 
     * Set the list of 'GoodsInfo' element items. �������� ������
     * 
     * @param list
     */
    public void setGoodsInfoList(List<GoodsType> list) {
        goodsInfoList = list;
    }
}
