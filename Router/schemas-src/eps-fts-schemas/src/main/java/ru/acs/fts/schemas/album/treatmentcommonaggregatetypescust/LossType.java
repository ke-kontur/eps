
package ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Производственные потери
 */
public class LossType
{
    private List<String> lossInfoList = new ArrayList<String>();
    private List<TreatProductsType> lossItemList = new ArrayList<TreatProductsType>();

    /** 
     * Get the list of 'LossInfo' element items. Дополнительная информация к графе "Производственные потери"
     * 
     * @return list
     */
    public List<String> getLossInfoList() {
        return lossInfoList;
    }

    /** 
     * Set the list of 'LossInfo' element items. Дополнительная информация к графе "Производственные потери"
     * 
     * @param list
     */
    public void setLossInfoList(List<String> list) {
        lossInfoList = list;
    }

    /** 
     * Get the list of 'LossItem' element items. Производственные потери - описание товара
     * 
     * @return list
     */
    public List<TreatProductsType> getLossItemList() {
        return lossItemList;
    }

    /** 
     * Set the list of 'LossItem' element items. Производственные потери - описание товара
     * 
     * @param list
     */
    public void setLossItemList(List<TreatProductsType> list) {
        lossItemList = list;
    }
}
