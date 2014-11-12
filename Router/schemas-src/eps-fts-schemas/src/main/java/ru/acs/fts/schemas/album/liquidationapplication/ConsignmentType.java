
package ru.acs.fts.schemas.album.liquidationapplication;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Сведения о партии товаров
 */
public class ConsignmentType
{
    private GTDIDType regNumberDT;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();

    /** 
     * Get the 'RegNumberDT' element value. Регистрационный номер ДТ
     * 
     * @return value
     */
    public GTDIDType getRegNumberDT() {
        return regNumberDT;
    }

    /** 
     * Set the 'RegNumberDT' element value. Регистрационный номер ДТ
     * 
     * @param regNumberDT
     */
    public void setRegNumberDT(GTDIDType regNumberDT) {
        this.regNumberDT = regNumberDT;
    }

    /** 
     * Get the list of 'Goods' element items. Товар, помещенный под таможенную процедуру СТЗ
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. Товар, помещенный под таможенную процедуру СТЗ
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }
}
