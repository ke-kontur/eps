
package ru.acs.fts.schemas.album.airwaybill;

import java.util.ArrayList;
import java.util.List;

/** 
 * Описание груза
 */
public class GoodsDescrType
{
    private String informationCode;
    private List<String> goodsDescriptionList = new ArrayList<String>();

    /** 
     * Get the 'InformationCode' element value. Код  информации
     * 
     * @return value
     */
    public String getInformationCode() {
        return informationCode;
    }

    /** 
     * Set the 'InformationCode' element value. Код  информации
     * 
     * @param informationCode
     */
    public void setInformationCode(String informationCode) {
        this.informationCode = informationCode;
    }

    /** 
     * Get the list of 'GoodsDescription' element items. Описание товара /  дополнительная информация
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. Описание товара /  дополнительная информация
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }
}
