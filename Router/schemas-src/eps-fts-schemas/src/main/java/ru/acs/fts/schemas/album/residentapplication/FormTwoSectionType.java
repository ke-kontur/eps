
package ru.acs.fts.schemas.album.residentapplication;

import java.util.ArrayList;
import java.util.List;

/** 
 * Раздел в форме №2 
 */
public class FormTwoSectionType
{
    private String name;
    private List<ProductType> productForRecyclingList = new ArrayList<ProductType>();
    private List<ProductOfRecyclingType> productOfRecyclingList = new ArrayList<ProductOfRecyclingType>();
    private List<ProductOfRecyclingType> wasteProductList = new ArrayList<ProductOfRecyclingType>();

    /** 
     * Get the 'Name' element value. Название раздела 
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. Название раздела 
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the list of 'ProductForRecycling' element items. Товар для переработки
     * 
     * @return list
     */
    public List<ProductType> getProductForRecyclingList() {
        return productForRecyclingList;
    }

    /** 
     * Set the list of 'ProductForRecycling' element items. Товар для переработки
     * 
     * @param list
     */
    public void setProductForRecyclingList(List<ProductType> list) {
        productForRecyclingList = list;
    }

    /** 
     * Get the list of 'ProductOfRecycling' element items. Продукт переработки 
     * 
     * @return list
     */
    public List<ProductOfRecyclingType> getProductOfRecyclingList() {
        return productOfRecyclingList;
    }

    /** 
     * Set the list of 'ProductOfRecycling' element items. Продукт переработки 
     * 
     * @param list
     */
    public void setProductOfRecyclingList(List<ProductOfRecyclingType> list) {
        productOfRecyclingList = list;
    }

    /** 
     * Get the list of 'WasteProduct' element items. Отходы 
     * 
     * @return list
     */
    public List<ProductOfRecyclingType> getWasteProductList() {
        return wasteProductList;
    }

    /** 
     * Set the list of 'WasteProduct' element items. Отходы 
     * 
     * @param list
     */
    public void setWasteProductList(List<ProductOfRecyclingType> list) {
        wasteProductList = list;
    }
}
