
package ru.acs.fts.schemas.album.pi_seaarrive;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения о судовых припасах
 */
public class StoresType
{
    private List<String> nameList = new ArrayList<String>();
    private String quantity;
    private String measureUnitQualifier;
    private String storeSign;

    /** 
     * Get the list of 'Name' element items. Наименование
     * 
     * @return list
     */
    public List<String> getNameList() {
        return nameList;
    }

    /** 
     * Set the list of 'Name' element items. Наименование
     * 
     * @param list
     */
    public void setNameList(List<String> list) {
        nameList = list;
    }

    /** 
     * Get the 'Quantity' element value. Количество
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. Количество
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the 'MeasureUnitQualifier' element value. Наименование единицы измерения
     * 
     * @return value
     */
    public String getMeasureUnitQualifier() {
        return measureUnitQualifier;
    }

    /** 
     * Set the 'MeasureUnitQualifier' element value. Наименование единицы измерения
     * 
     * @param measureUnitQualifier
     */
    public void setMeasureUnitQualifier(String measureUnitQualifier) {
        this.measureUnitQualifier = measureUnitQualifier;
    }

    /** 
     * Get the 'StoreSign' element value. Признак принадлежности припасов к определенному типу. 1-  эксплуатационные; 2 - продаваемые; 3 - потребительские.
     * 
     * @return value
     */
    public String getStoreSign() {
        return storeSign;
    }

    /** 
     * Set the 'StoreSign' element value. Признак принадлежности припасов к определенному типу. 1-  эксплуатационные; 2 - продаваемые; 3 - потребительские.
     * 
     * @param storeSign
     */
    public void setStoreSign(String storeSign) {
        this.storeSign = storeSign;
    }
}
