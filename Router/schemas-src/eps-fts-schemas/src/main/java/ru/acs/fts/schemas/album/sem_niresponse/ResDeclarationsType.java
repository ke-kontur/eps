
package ru.acs.fts.schemas.album.sem_niresponse;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Результат обработки декларациипо сервису СУР
 */
public class ResDeclarationsType
{
    private GTDIDType gtdRegNumber;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();

    /** 
     * Get the 'GtdRegNumber' element value. Номер декларации
     * 
     * @return value
     */
    public GTDIDType getGtdRegNumber() {
        return gtdRegNumber;
    }

    /** 
     * Set the 'GtdRegNumber' element value. Номер декларации
     * 
     * @param gtdRegNumber
     */
    public void setGtdRegNumber(GTDIDType gtdRegNumber) {
        this.gtdRegNumber = gtdRegNumber;
    }

    /** 
     * Get the list of 'Goods' element items. Обработанные товары
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. Обработанные товары
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }
}
