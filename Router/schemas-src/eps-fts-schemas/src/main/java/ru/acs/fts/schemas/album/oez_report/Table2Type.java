
package ru.acs.fts.schemas.album.oez_report;

import java.util.ArrayList;
import java.util.List;

/** 
 * “аблица 2. ќтчет о товарах, помещенных под таможенный режим свободной таможенной зоны в цел€х
 */
public class Table2Type
{
    private List<Table2GoodsType> table2GoodList = new ArrayList<Table2GoodsType>();

    /** 
     * Get the list of 'Table2Goods' element items. “аблица 2.“овар, помещЄнный под таможенный режим свободной таможенной зоны, который участвует в производстве продукции (содействует производственному процессу) и полностью или частично потребл€етс€ в процессе использовани€
     * 
     * @return list
     */
    public List<Table2GoodsType> getTable2GoodList() {
        return table2GoodList;
    }

    /** 
     * Set the list of 'Table2Goods' element items. “аблица 2.“овар, помещЄнный под таможенный режим свободной таможенной зоны, который участвует в производстве продукции (содействует производственному процессу) и полностью или частично потребл€етс€ в процессе использовани€
     * 
     * @param list
     */
    public void setTable2GoodList(List<Table2GoodsType> list) {
        table2GoodList = list;
    }
}
