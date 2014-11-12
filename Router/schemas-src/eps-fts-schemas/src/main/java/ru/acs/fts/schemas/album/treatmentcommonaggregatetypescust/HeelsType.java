
package ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Остатки
 */
public class HeelsType
{
    private List<String> heelsInfoList = new ArrayList<String>();
    private String heelsOutProcedure;
    private List<TreatProductsType> heelsItemList = new ArrayList<TreatProductsType>();

    /** 
     * Get the list of 'HeelsInfo' element items. Дополнительные сведения к  гр. "Остатки"
     * 
     * @return list
     */
    public List<String> getHeelsInfoList() {
        return heelsInfoList;
    }

    /** 
     * Set the list of 'HeelsInfo' element items. Дополнительные сведения к  гр. "Остатки"
     * 
     * @param list
     */
    public void setHeelsInfoList(List<String> list) {
        heelsInfoList = list;
    }

    /** 
     * Get the 'HeelsOutProcedure' element value. Режим выпуска остатков
     * 
     * @return value
     */
    public String getHeelsOutProcedure() {
        return heelsOutProcedure;
    }

    /** 
     * Set the 'HeelsOutProcedure' element value. Режим выпуска остатков
     * 
     * @param heelsOutProcedure
     */
    public void setHeelsOutProcedure(String heelsOutProcedure) {
        this.heelsOutProcedure = heelsOutProcedure;
    }

    /** 
     * Get the list of 'HeelsItem' element items. Остатки - описание товара
     * 
     * @return list
     */
    public List<TreatProductsType> getHeelsItemList() {
        return heelsItemList;
    }

    /** 
     * Set the list of 'HeelsItem' element items. Остатки - описание товара
     * 
     * @param list
     */
    public void setHeelsItemList(List<TreatProductsType> list) {
        heelsItemList = list;
    }
}
