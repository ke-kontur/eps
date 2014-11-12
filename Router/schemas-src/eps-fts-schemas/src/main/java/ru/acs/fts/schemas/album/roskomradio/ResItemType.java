
package ru.acs.fts.schemas.album.roskomradio;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Оборудование (Тип РЭС, его комплектация)
 */
public class ResItemType
{
    private String resType;
    private String numeric;
    private String model;
    private String manufacturer;
    private List<String> countryList = new ArrayList<String>();
    private SupplementaryQuantityType quantity;

    /** 
     * Get the 'ResType' element value. Тип РЭС
     * 
     * @return value
     */
    public String getResType() {
        return resType;
    }

    /** 
     * Set the 'ResType' element value. Тип РЭС
     * 
     * @param resType
     */
    public void setResType(String resType) {
        this.resType = resType;
    }

    /** 
     * Get the 'Numeric' element value. Номер позиции товара по приложению разрешительного документа
     * 
     * @return value
     */
    public String getNumeric() {
        return numeric;
    }

    /** 
     * Set the 'Numeric' element value. Номер позиции товара по приложению разрешительного документа
     * 
     * @param numeric
     */
    public void setNumeric(String numeric) {
        this.numeric = numeric;
    }

    /** 
     * Get the 'Model' element value. Модель, платформа
     * 
     * @return value
     */
    public String getModel() {
        return model;
    }

    /** 
     * Set the 'Model' element value. Модель, платформа
     * 
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /** 
     * Get the 'Manufacturer' element value. Производитель
     * 
     * @return value
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /** 
     * Set the 'Manufacturer' element value. Производитель
     * 
     * @param manufacturer
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /** 
     * Get the list of 'Country' element items. Страна - производитель
     * 
     * @return list
     */
    public List<String> getCountryList() {
        return countryList;
    }

    /** 
     * Set the list of 'Country' element items. Страна - производитель
     * 
     * @param list
     */
    public void setCountryList(List<String> list) {
        countryList = list;
    }

    /** 
     * Get the 'Quantity' element value. Количество
     * 
     * @return value
     */
    public SupplementaryQuantityType getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. Количество
     * 
     * @param quantity
     */
    public void setQuantity(SupplementaryQuantityType quantity) {
        this.quantity = quantity;
    }
}
