
package ru.acs.fts.schemas.album.commonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� � �����
 */
public class CargoBaseType
{
    private List<String> cargoDescriptionList = new ArrayList<String>();
    private String grossWeightQuantity;

    /** 
     * Get the list of 'CargoDescription' element items. �������� �����
     * 
     * @return list
     */
    public List<String> getCargoDescriptionList() {
        return cargoDescriptionList;
    }

    /** 
     * Set the list of 'CargoDescription' element items. �������� �����
     * 
     * @param list
     */
    public void setCargoDescriptionList(List<String> list) {
        cargoDescriptionList = list;
    }

    /** 
     * Get the 'GrossWeightQuantity' element value. ��� ������ ������ (��)
     * 
     * @return value
     */
    public String getGrossWeightQuantity() {
        return grossWeightQuantity;
    }

    /** 
     * Set the 'GrossWeightQuantity' element value. ��� ������ ������ (��)
     * 
     * @param grossWeightQuantity
     */
    public void setGrossWeightQuantity(String grossWeightQuantity) {
        this.grossWeightQuantity = grossWeightQuantity;
    }
}
