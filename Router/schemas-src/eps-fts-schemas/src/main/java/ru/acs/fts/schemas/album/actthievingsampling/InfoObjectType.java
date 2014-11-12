
package ru.acs.fts.schemas.album.actthievingsampling;

import java.util.ArrayList;
import java.util.List;

/** 
 * Информация о предметах, взятых в качестве проб или образцов.
 */
public class InfoObjectType
{
    private String position;
    private List<String> nameOdjectList = new ArrayList<String>();
    private String quantityWeight;
    private String unit;
    private String cost;
    private String currency;

    /** 
     * Get the 'Position' element value. Порядковый номер
     * 
     * @return value
     */
    public String getPosition() {
        return position;
    }

    /** 
     * Set the 'Position' element value. Порядковый номер
     * 
     * @param position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /** 
     * Get the list of 'NameOdject' element items. Наименование, индивидуальные признаки предметов, взятых в качестве проб или образцов.
     * 
     * @return list
     */
    public List<String> getNameOdjectList() {
        return nameOdjectList;
    }

    /** 
     * Set the list of 'NameOdject' element items. Наименование, индивидуальные признаки предметов, взятых в качестве проб или образцов.
     * 
     * @param list
     */
    public void setNameOdjectList(List<String> list) {
        nameOdjectList = list;
    }

    /** 
     * Get the 'QuantityWeight' element value. Количество, вес
     * 
     * @return value
     */
    public String getQuantityWeight() {
        return quantityWeight;
    }

    /** 
     * Set the 'QuantityWeight' element value. Количество, вес
     * 
     * @param quantityWeight
     */
    public void setQuantityWeight(String quantityWeight) {
        this.quantityWeight = quantityWeight;
    }

    /** 
     * Get the 'Unit' element value. Единица измерения 
     * 
     * @return value
     */
    public String getUnit() {
        return unit;
    }

    /** 
     * Set the 'Unit' element value. Единица измерения 
     * 
     * @param unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /** 
     * Get the 'Cost' element value. Стоимость
     * 
     * @return value
     */
    public String getCost() {
        return cost;
    }

    /** 
     * Set the 'Cost' element value. Стоимость
     * 
     * @param cost
     */
    public void setCost(String cost) {
        this.cost = cost;
    }

    /** 
     * Get the 'Currency' element value. Валюта
     * 
     * @return value
     */
    public String getCurrency() {
        return currency;
    }

    /** 
     * Set the 'Currency' element value. Валюта
     * 
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
