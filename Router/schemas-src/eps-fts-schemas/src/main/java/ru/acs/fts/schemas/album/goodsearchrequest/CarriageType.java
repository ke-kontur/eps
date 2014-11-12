
package ru.acs.fts.schemas.album.goodsearchrequest;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * Сведения о транспортном средстве
 */
public class CarriageType extends TransportMeansBaseType
{
    private List<GoodsType> goodsInfoList = new ArrayList<GoodsType>();

    /** 
     * Get the list of 'GoodsInfo' element items. Описание товара
     * 
     * @return list
     */
    public List<GoodsType> getGoodsInfoList() {
        return goodsInfoList;
    }

    /** 
     * Set the list of 'GoodsInfo' element items. Описание товара
     * 
     * @param list
     */
    public void setGoodsInfoList(List<GoodsType> list) {
        goodsInfoList = list;
    }
}
