
package ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Информация о замене товаров для переработки эквивалентными товарами
 */
public class SubstituteType
{
    private List<String> substituteList = new ArrayList<String>();
    private List<TreatProductsType> substituteItemList = new ArrayList<TreatProductsType>();

    /** 
     * Get the list of 'Substitute' element items. Дополнительная информация
     * 
     * @return list
     */
    public List<String> getSubstituteList() {
        return substituteList;
    }

    /** 
     * Set the list of 'Substitute' element items. Дополнительная информация
     * 
     * @param list
     */
    public void setSubstituteList(List<String> list) {
        substituteList = list;
    }

    /** 
     * Get the list of 'SubstituteItem' element items. Описание товара
     * 
     * @return list
     */
    public List<TreatProductsType> getSubstituteItemList() {
        return substituteItemList;
    }

    /** 
     * Set the list of 'SubstituteItem' element items. Описание товара
     * 
     * @param list
     */
    public void setSubstituteItemList(List<TreatProductsType> list) {
        substituteItemList = list;
    }
}
