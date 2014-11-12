
package ru.acs.fts.schemas.album.commonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Описание товаров. Базовый
 */
public class TransportGoodsBaseType
{
    private String goodsMarking;
    private List<String> goodsDescriptionList = new ArrayList<String>();

    /** 
     * Get the 'GoodsMarking' element value. Номер и марка груза
     * 
     * @return value
     */
    public String getGoodsMarking() {
        return goodsMarking;
    }

    /** 
     * Set the 'GoodsMarking' element value. Номер и марка груза
     * 
     * @param goodsMarking
     */
    public void setGoodsMarking(String goodsMarking) {
        this.goodsMarking = goodsMarking;
    }

    /** 
     * Get the list of 'GoodsDescription' element items. Наименование груза
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. Наименование груза
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }
}
