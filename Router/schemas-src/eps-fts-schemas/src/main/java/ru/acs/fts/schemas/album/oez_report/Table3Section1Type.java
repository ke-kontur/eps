
package ru.acs.fts.schemas.album.oez_report;

import java.util.ArrayList;
import java.util.List;

/** 
 * Таблица 3. Раздел 1. Товары, помещенные под таможенный режим свободной таможенной зоны для целей переработки
 */
public class Table3Section1Type
{
    private List<Table3Section1GoodsType> table3Section1GoodList = new ArrayList<Table3Section1GoodsType>();

    /** 
     * Get the list of 'Table3Section1Goods' element items. Таблица 3. Раздел 1. Товар, помещённый под таможенный режим свободной таможенной зоны для целей переработки
     * 
     * @return list
     */
    public List<Table3Section1GoodsType> getTable3Section1GoodList() {
        return table3Section1GoodList;
    }

    /** 
     * Set the list of 'Table3Section1Goods' element items. Таблица 3. Раздел 1. Товар, помещённый под таможенный режим свободной таможенной зоны для целей переработки
     * 
     * @param list
     */
    public void setTable3Section1GoodList(List<Table3Section1GoodsType> list) {
        table3Section1GoodList = list;
    }
}
