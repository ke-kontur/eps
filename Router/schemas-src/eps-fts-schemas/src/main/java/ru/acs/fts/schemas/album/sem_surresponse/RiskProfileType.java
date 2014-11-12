
package ru.acs.fts.schemas.album.sem_surresponse;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.semcommonaggregatetypescust.RiskProfileRegNumberType;

/** 
 * Профиль риска
 */
public class RiskProfileType extends RiskProfileRegNumberType
{
    private List<GoodsType> goodList = new ArrayList<GoodsType>();

    /** 
     * Get the list of 'Goods' element items. Сведения о товарах и неформализованных индикаторах профиля риска, для которых выявлены соответствия
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. Сведения о товарах и неформализованных индикаторах профиля риска, для которых выявлены соответствия
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }
}
