
package ru.acs.fts.schemas.album.commonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения о грузе
 */
public class CargoBaseType
{
    private List<String> cargoDescriptionList = new ArrayList<String>();
    private String grossWeightQuantity;

    /** 
     * Get the list of 'CargoDescription' element items. Описание груза
     * 
     * @return list
     */
    public List<String> getCargoDescriptionList() {
        return cargoDescriptionList;
    }

    /** 
     * Set the list of 'CargoDescription' element items. Описание груза
     * 
     * @param list
     */
    public void setCargoDescriptionList(List<String> list) {
        cargoDescriptionList = list;
    }

    /** 
     * Get the 'GrossWeightQuantity' element value. Вес товара брутто (кг)
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. Вес товара брутто (кг)
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }
}
