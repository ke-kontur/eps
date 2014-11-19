
package ru.acs.fts.schemas.album.commercialact;

import java.util.ArrayList;
import java.util.List;

/** 
 * Описание несоответствия наименования (описания) товара сведениям, заявленным в товаросопроводительных документах
 */
public class GoodsDescriptionType
{
    private List<String> goodsDescriptionByDocList = new ArrayList<String>();
    private List<String> goodsDescriptionByFactList = new ArrayList<String>();

    /** 
     * Get the list of 'GoodsDescriptionByDocs' element items. Описание товара согласно товаросопроводительным документам
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionByDocList() {
        return goodsDescriptionByDocList;
    }

    /** 
     * Set the list of 'GoodsDescriptionByDocs' element items. Описание товара согласно товаросопроводительным документам
     * 
     * @param list
     */
    public void setGoodsDescriptionByDocList(List<String> list) {
        goodsDescriptionByDocList = list;
    }

    /** 
     * Get the list of 'GoodsDescriptionByFact' element items. Описание товара фактическое
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionByFactList() {
        return goodsDescriptionByFactList;
    }

    /** 
     * Set the list of 'GoodsDescriptionByFact' element items. Описание товара фактическое
     * 
     * @param list
     */
    public void setGoodsDescriptionByFactList(List<String> list) {
        goodsDescriptionByFactList = list;
    }
}
