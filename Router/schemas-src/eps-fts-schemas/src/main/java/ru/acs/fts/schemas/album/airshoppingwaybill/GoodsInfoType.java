
package ru.acs.fts.schemas.album.airshoppingwaybill;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения о товаре
 */
public class GoodsInfoType
{
    private List<String> generalCommentList = new ArrayList<String>();
    private List<FreeGoodsType> freeGoodList = new ArrayList<FreeGoodsType>();
    private SoldGoodsType soldGoods;

    /** 
     * Get the list of 'GeneralComments' element items. Общие комментарии
     * 
     * @return list
     */
    public List<String> getGeneralCommentList() {
        return generalCommentList;
    }

    /** 
     * Set the list of 'GeneralComments' element items. Общие комментарии
     * 
     * @param list
     */
    public void setGeneralCommentList(List<String> list) {
        generalCommentList = list;
    }

    /** 
     * Get the list of 'FreeGoods' element items. Бесплатные товары
     * 
     * @return list
     */
    public List<FreeGoodsType> getFreeGoodList() {
        return freeGoodList;
    }

    /** 
     * Set the list of 'FreeGoods' element items. Бесплатные товары
     * 
     * @param list
     */
    public void setFreeGoodList(List<FreeGoodsType> list) {
        freeGoodList = list;
    }

    /** 
     * Get the 'SoldGoods' element value. Продаваемые товары
     * 
     * @return value
     */
    public SoldGoodsType getSoldGoods() {
        return soldGoods;
    }

    /** 
     * Set the 'SoldGoods' element value. Продаваемые товары
     * 
     * @param soldGoods
     */
    public void setSoldGoods(SoldGoodsType soldGoods) {
        this.soldGoods = soldGoods;
    }
}
