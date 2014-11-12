
package ru.acs.fts.schemas.album.rpndecision;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Описание товара
 */
public class GoodsDescriptionType
{
    private List<String> goodNameList = new ArrayList<String>();
    private SupplementaryQuantityType quantity;

    /** 
     * Get the list of 'GoodName' element items. Наименование товара
     * 
     * @return list
     */
    public List<String> getGoodNameList() {
        return goodNameList;
    }

    /** 
     * Set the list of 'GoodName' element items. Наименование товара
     * 
     * @param list
     */
    public void setGoodNameList(List<String> list) {
        goodNameList = list;
    }

    /** 
     * Get the 'Quantity' element value. Количество
     * 
     * @return value
     */
    public SupplementaryQuantityType getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. Количество
     * 
     * @param quantity
     */
    public void setQuantity(SupplementaryQuantityType quantity) {
        this.quantity = quantity;
    }
}
