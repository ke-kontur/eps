
package ru.acs.fts.schemas.album.goodstranshipment;

import java.util.ArrayList;
import java.util.List;

/** 
 * Товаротранспортная накладная
 */
public class ConsignmentType
{
    private String regNumber;
    private List<GoodsType> goodsItemList = new ArrayList<GoodsType>();

    /** 
     * Get the 'RegNumber' element value. Номер накладной
     * 
     * @return value
     */
    public String getRegNumber() {
        return regNumber;
    }

    /** 
     * Set the 'RegNumber' element value. Номер накладной
     * 
     * @param regNumber
     */
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    /** 
     * Get the list of 'GoodsItem' element items. Сведения о товаре
     * 
     * @return list
     */
    public List<GoodsType> getGoodsItemList() {
        return goodsItemList;
    }

    /** 
     * Set the list of 'GoodsItem' element items. Сведения о товаре
     * 
     * @param list
     */
    public void setGoodsItemList(List<GoodsType> list) {
        goodsItemList = list;
    }
}
