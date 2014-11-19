
package ru.acs.fts.schemas.album.addinfoforeigntradecontract;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADContractListType;

/** 
 * —ведени€ о товарах
 */
public class GoodsType
{
    private String goodsNumeric;
    private List<ESADContractListType> contractList = new ArrayList<ESADContractListType>();

    /** 
     * Get the 'GoodsNumeric' element value. ѕор€дковый номер декларируемого  товара / номер товара по списку
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. ѕор€дковый номер декларируемого  товара / номер товара по списку
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }

    /** 
     * Get the list of 'ContractList' element items. —ведени€ по внешнеторговым контрактам. 
     * 
     * @return list
     */
    public List<ESADContractListType> getContractList() {
        return contractList;
    }

    /** 
     * Set the list of 'ContractList' element items. —ведени€ по внешнеторговым контрактам. 
     * 
     * @param list
     */
    public void setContractList(List<ESADContractListType> list) {
        contractList = list;
    }
}
