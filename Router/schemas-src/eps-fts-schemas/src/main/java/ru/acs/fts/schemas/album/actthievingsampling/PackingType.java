
package ru.acs.fts.schemas.album.actthievingsampling;

import java.util.ArrayList;
import java.util.List;

/** 
 * Упаковка взятых проб или образцов
 */
public class PackingType
{
    private String kindPacking;
    private String numberSeal;
    private List<String> explanatoryLabelList = new ArrayList<String>();

    /** 
     * Get the 'KindPacking' element value. Вид упаковки, которая оклеена ярлыком обеспечения сохранности упаковки
     * 
     * @return value
     */
    public String getKindPacking() {
        return kindPacking;
    }

    /** 
     * Set the 'KindPacking' element value. Вид упаковки, которая оклеена ярлыком обеспечения сохранности упаковки
     * 
     * @param kindPacking
     */
    public void setKindPacking(String kindPacking) {
        this.kindPacking = kindPacking;
    }

    /** 
     * Get the 'NumberSeal' element value. Номер пломбы упаковки
     * 
     * @return value
     */
    public String getNumberSeal() {
        return numberSeal;
    }

    /** 
     * Set the 'NumberSeal' element value. Номер пломбы упаковки
     * 
     * @param numberSeal
     */
    public void setNumberSeal(String numberSeal) {
        this.numberSeal = numberSeal;
    }

    /** 
     * Get the list of 'ExplanatoryLabels' element items. Пояснительные надписи
     * 
     * @return list
     */
    public List<String> getExplanatoryLabelList() {
        return explanatoryLabelList;
    }

    /** 
     * Set the list of 'ExplanatoryLabels' element items. Пояснительные надписи
     * 
     * @param list
     */
    public void setExplanatoryLabelList(List<String> list) {
        explanatoryLabelList = list;
    }
}
