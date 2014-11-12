
package ru.acs.fts.schemas.album.oez_report;

import java.util.ArrayList;
import java.util.List;

/** 
 * Таблица 2. Отчет о товарах, помещенных под таможенный режим свободной таможенной зоны в целях
 */
public class Table2Type
{
    private List<Table2GoodsType> table2GoodList = new ArrayList<Table2GoodsType>();

    /** 
     * Get the list of 'Table2Goods' element items. Таблица 2.Товар, помещённый под таможенный режим свободной таможенной зоны, который участвует в производстве продукции (содействует производственному процессу) и полностью или частично потребляется в процессе использования
     * 
     * @return list
     */
    public List<Table2GoodsType> getTable2GoodList() {
        return table2GoodList;
    }

    /** 
     * Set the list of 'Table2Goods' element items. Таблица 2.Товар, помещённый под таможенный режим свободной таможенной зоны, который участвует в производстве продукции (содействует производственному процессу) и полностью или частично потребляется в процессе использования
     * 
     * @param list
     */
    public void setTable2GoodList(List<Table2GoodsType> list) {
        table2GoodList = list;
    }
}
