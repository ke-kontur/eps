
package ru.acs.fts.schemas.album.kimberleyprocesscertificate;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения об алмазах
 */
public class DiamonsInfoType
{
    private String totalCost;
    private String totalWeight;
    private List<String> characteristicList = new ArrayList<String>();
    private String harmonizedCode;
    private String numeric;

    /** 
     * Get the 'TotalCost' element value. Стоимость алмазов в долл. США
     * 
     * @return value
     */
    public String getTotalCost() {
        return totalCost;
    }

    /** 
     * Set the 'TotalCost' element value. Стоимость алмазов в долл. США
     * 
     * @param totalCost
     */
    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    /** 
     * Get the 'TotalWeight' element value. Общий вес(карат)
     * 
     * @return value
     */
    public String getTotalWeight() {
        return totalWeight;
    }

    /** 
     * Set the 'TotalWeight' element value. Общий вес(карат)
     * 
     * @param totalWeight
     */
    public void setTotalWeight(String totalWeight) {
        this.totalWeight = totalWeight;
    }

    /** 
     * Get the list of 'Characteristics' element items. Характеристики
     * 
     * @return list
     */
    public List<String> getCharacteristicList() {
        return characteristicList;
    }

    /** 
     * Set the list of 'Characteristics' element items. Характеристики
     * 
     * @param list
     */
    public void setCharacteristicList(List<String> list) {
        characteristicList = list;
    }

    /** 
     * Get the 'HarmonizedCode' element value. Код гармонизированной системы описания и кодирования товаров
     * 
     * @return value
     */
    public String getHarmonizedCode() {
        return harmonizedCode;
    }

    /** 
     * Set the 'HarmonizedCode' element value. Код гармонизированной системы описания и кодирования товаров
     * 
     * @param harmonizedCode
     */
    public void setHarmonizedCode(String harmonizedCode) {
        this.harmonizedCode = harmonizedCode;
    }

    /** 
     * Get the 'Numeric' element value. Номер позиции
     * 
     * @return value
     */
    public String getNumeric() {
        return numeric;
    }

    /** 
     * Set the 'Numeric' element value. Номер позиции
     * 
     * @param numeric
     */
    public void setNumeric(String numeric) {
        this.numeric = numeric;
    }
}
