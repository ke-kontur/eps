
package ru.acs.fts.schemas.album.oez_report;

import java.util.ArrayList;
import java.util.List;

/** 
 * Таблица 3. Раздел 2. Товары, полученные в результате переработки товаров, помещенных под таможенный режим свободной таможенной зоны, и распоряжение такими товарами
 */
public class Table3Section2Type
{
    private List<Table3Section2GoodsType> table3Section2GoodList = new ArrayList<Table3Section2GoodsType>();

    /** 
     * Get the list of 'Table3Section2Goods' element items. Таблица 3. Раздел 2. Товар, полученный в результате переработки товаров, помещенных под таможенный режим свободной таможенной зоны, и распоряжение такими товарами
     * 
     * @return list
     */
    public List<Table3Section2GoodsType> getTable3Section2GoodList() {
        return table3Section2GoodList;
    }

    /** 
     * Set the list of 'Table3Section2Goods' element items. Таблица 3. Раздел 2. Товар, полученный в результате переработки товаров, помещенных под таможенный режим свободной таможенной зоны, и распоряжение такими товарами
     * 
     * @param list
     */
    public void setTable3Section2GoodList(List<Table3Section2GoodsType> list) {
        table3Section2GoodList = list;
    }
}
