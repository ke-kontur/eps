
package ru.acs.fts.schemas.album.scvvcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Номер ДТ с порядковыми номерами товаров.
 */
public class GTDInqType extends GTDIDType
{
    private List<String> goodsNumericList = new ArrayList<String>();

    /** 
     * Get the list of 'GoodsNumeric' element items. Номер товара по порядку
     * 
     * @return list
     */
    public List<String> getGoodsNumericList() {
        return goodsNumericList;
    }

    /** 
     * Set the list of 'GoodsNumeric' element items. Номер товара по порядку
     * 
     * @param list
     */
    public void setGoodsNumericList(List<String> list) {
        goodsNumericList = list;
    }
}
