
package ru.acs.fts.schemas.album.preliminarytnvedcode;

import java.util.ArrayList;
import java.util.List;

/** 
 * Товар
 */
public class GoodsType
{
    private List<String> goodDescriptionList = new ArrayList<String>();
    private GoodsInformationType goodsInformation;

    /** 
     * Get the list of 'GoodDescription' element items. Наименование товара
     * 
     * @return list
     */
    public List<String> getGoodDescriptionList() {
        return goodDescriptionList;
    }

    /** 
     * Set the list of 'GoodDescription' element items. Наименование товара
     * 
     * @param list
     */
    public void setGoodDescriptionList(List<String> list) {
        goodDescriptionList = list;
    }

    /** 
     * Get the 'GoodsInformation' element value. Характеристика товара
     * 
     * @return value
     */
    public GoodsInformationType getGoodsInformation() {
        return goodsInformation;
    }

    /** 
     * Set the 'GoodsInformation' element value. Характеристика товара
     * 
     * @param goodsInformation
     */
    public void setGoodsInformation(GoodsInformationType goodsInformation) {
        this.goodsInformation = goodsInformation;
    }
}
