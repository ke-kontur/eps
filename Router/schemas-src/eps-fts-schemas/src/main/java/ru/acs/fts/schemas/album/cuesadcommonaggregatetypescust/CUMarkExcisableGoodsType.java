
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения о маркированных подакцизных товарах
 */
public class CUMarkExcisableGoodsType
{
    private List<String> seryList = new ArrayList<String>();
    private String number;
    private List<String> quantityMarkList = new ArrayList<String>();

    /** 
     * Get the list of 'Series' element items. Серия марок
     * 
     * @return list
     */
    public List<String> getSeryList() {
        return seryList;
    }

    /** 
     * Set the list of 'Series' element items. Серия марок
     * 
     * @param list
     */
    public void setSeryList(List<String> list) {
        seryList = list;
    }

    /** 
     * Get the 'Number' element value. Номер марки
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. Номер марки
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the list of 'QuantityMark' element items. Количество акцизных марок
     * 
     * @return list
     */
    public List<String> getQuantityMarkList() {
        return quantityMarkList;
    }

    /** 
     * Set the list of 'QuantityMark' element items. Количество акцизных марок
     * 
     * @param list
     */
    public void setQuantityMarkList(List<String> list) {
        quantityMarkList = list;
    }
}
