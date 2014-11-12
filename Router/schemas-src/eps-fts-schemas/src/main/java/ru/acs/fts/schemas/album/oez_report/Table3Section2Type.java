
package ru.acs.fts.schemas.album.oez_report;

import java.util.ArrayList;
import java.util.List;

/** 
 * “аблица 3. –аздел 2. “овары, полученные в результате переработки товаров, помещенных под таможенный режим свободной таможенной зоны, и распор€жение такими товарами
 */
public class Table3Section2Type
{
    private List<Table3Section2GoodsType> table3Section2GoodList = new ArrayList<Table3Section2GoodsType>();

    /** 
     * Get the list of 'Table3Section2Goods' element items. “аблица 3. –аздел 2. “овар, полученный в результате переработки товаров, помещенных под таможенный режим свободной таможенной зоны, и распор€жение такими товарами
     * 
     * @return list
     */
    public List<Table3Section2GoodsType> getTable3Section2GoodList() {
        return table3Section2GoodList;
    }

    /** 
     * Set the list of 'Table3Section2Goods' element items. “аблица 3. –аздел 2. “овар, полученный в результате переработки товаров, помещенных под таможенный режим свободной таможенной зоны, и распор€жение такими товарами
     * 
     * @param list
     */
    public void setTable3Section2GoodList(List<Table3Section2GoodsType> list) {
        table3Section2GoodList = list;
    }
}
