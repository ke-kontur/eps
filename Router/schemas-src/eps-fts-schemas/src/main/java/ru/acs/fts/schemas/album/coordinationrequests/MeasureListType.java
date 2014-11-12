
package ru.acs.fts.schemas.album.coordinationrequests;

import java.util.ArrayList;
import java.util.List;

/** 
 * Меры на основании которых было сформировано направление в функциональные отделы таможен для принятия решений
 */
public class MeasureListType
{
    private String measureCode;
    private List<GoodsPRInfoType> goodsPRInfoList = new ArrayList<GoodsPRInfoType>();

    /** 
     * Get the 'MeasureCode' element value. Код меры по минимизации риска
     * 
     * @return value
     */
    public String getMeasureCode() {
        return measureCode;
    }

    /** 
     * Set the 'MeasureCode' element value. Код меры по минимизации риска
     * 
     * @param measureCode
     */
    public void setMeasureCode(String measureCode) {
        this.measureCode = measureCode;
    }

    /** 
     * Get the list of 'GoodsPRInfo' element items. Информация о товаре и сработавшем на нем профиле риска, содержащем данную меру по минимизации риска
     * 
     * @return list
     */
    public List<GoodsPRInfoType> getGoodsPRInfoList() {
        return goodsPRInfoList;
    }

    /** 
     * Set the list of 'GoodsPRInfo' element items. Информация о товаре и сработавшем на нем профиле риска, содержащем данную меру по минимизации риска
     * 
     * @param list
     */
    public void setGoodsPRInfoList(List<GoodsPRInfoType> list) {
        goodsPRInfoList = list;
    }
}
