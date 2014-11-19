
package ru.acs.fts.schemas.album.pp_revealedrisks;

import java.util.ArrayList;
import java.util.List;

/** 
 * Партия товаров, на которой были выявлены риски
 */
public class ConsignmentType
{
    private String lotID;
    private List<ProfileRefType> profileRefList = new ArrayList<ProfileRefType>();
    private List<GoodsType> goodList = new ArrayList<GoodsType>();

    /** 
     * Get the 'LotID' element value. Идентификатор сообщения о прибытии конкретной партии товаров
     * 
     * @return value
     */
    public String getLotID() {
        return lotID;
    }

    /** 
     * Set the 'LotID' element value. Идентификатор сообщения о прибытии конкретной партии товаров
     * 
     * @param lotID
     */
    public void setLotID(String lotID) {
        this.lotID = lotID;
    }

    /** 
     * Get the list of 'ProfileRef' element items. Ссылки на ПР/СПР, которые сработали на партию товара в целом
     * 
     * @return list
     */
    public List<ProfileRefType> getProfileRefList() {
        return profileRefList;
    }

    /** 
     * Set the list of 'ProfileRef' element items. Ссылки на ПР/СПР, которые сработали на партию товара в целом
     * 
     * @param list
     */
    public void setProfileRefList(List<ProfileRefType> list) {
        profileRefList = list;
    }

    /** 
     * Get the list of 'Goods' element items. Товар, на котором были выявлены риски
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. Товар, на котором были выявлены риски
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }
}
