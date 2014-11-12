
package ru.acs.fts.schemas.album.pp_revealedrisks;

import java.util.ArrayList;
import java.util.List;

/** 
 * Товар, на котором были выявлены риски
 */
public class GoodsType
{
    private String goodsNumber;
    private List<ProfileRefType> profileRefList = new ArrayList<ProfileRefType>();

    /** 
     * Get the 'GoodsNumber' element value. Номер товара
     * 
     * @return value
     */
    public String getGoodsNumber() {
        return goodsNumber;
    }

    /** 
     * Set the 'GoodsNumber' element value. Номер товара
     * 
     * @param goodsNumber
     */
    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    /** 
     * Get the list of 'ProfileRef' element items. Ссылки на ПР/СПР, которые сработали на конкретный товар
     * 
     * @return list
     */
    public List<ProfileRefType> getProfileRefList() {
        return profileRefList;
    }

    /** 
     * Set the list of 'ProfileRef' element items. Ссылки на ПР/СПР, которые сработали на конкретный товар
     * 
     * @param list
     */
    public void setProfileRefList(List<ProfileRefType> list) {
        profileRefList = list;
    }
}
