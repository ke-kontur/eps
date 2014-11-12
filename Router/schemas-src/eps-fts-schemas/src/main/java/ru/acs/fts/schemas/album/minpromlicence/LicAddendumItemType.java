
package ru.acs.fts.schemas.album.minpromlicence;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Строка приложения к лицензии (товарная спецификация)
 */
public class LicAddendumItemType
{
    private String positionNumber;
    private List<String> commodityNameList = new ArrayList<String>();
    private String cost;
    private String pageNumber;
    private List<SupplementaryQuantityType> licAddendumMeasureItemList = new ArrayList<SupplementaryQuantityType>();

    /** 
     * Get the 'PositionNumber' element value. Номер позиции
     * 
     * @return value
     */
    public String getPositionNumber() {
        return positionNumber;
    }

    /** 
     * Set the 'PositionNumber' element value. Номер позиции
     * 
     * @param positionNumber
     */
    public void setPositionNumber(String positionNumber) {
        this.positionNumber = positionNumber;
    }

    /** 
     * Get the list of 'CommodityName' element items. Описание товара
     * 
     * @return list
     */
    public List<String> getCommodityNameList() {
        return commodityNameList;
    }

    /** 
     * Set the list of 'CommodityName' element items. Описание товара
     * 
     * @param list
     */
    public void setCommodityNameList(List<String> list) {
        commodityNameList = list;
    }

    /** 
     * Get the 'Cost' element value. Стоимость товара в валюте контакта
     * 
     * @return value
     */
    public String getCost() {
        return cost;
    }

    /** 
     * Set the 'Cost' element value. Стоимость товара в валюте контакта
     * 
     * @param cost
     */
    public void setCost(String cost) {
        this.cost = cost;
    }

    /** 
     * Get the 'PageNumber' element value. Номер листа
     * 
     * @return value
     */
    public String getPageNumber() {
        return pageNumber;
    }

    /** 
     * Set the 'PageNumber' element value. Номер листа
     * 
     * @param pageNumber
     */
    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
    }

    /** 
     * Get the list of 'LicAddendumMeasureItem' element items. Единицы измерения и количества
     * 
     * @return list
     */
    public List<SupplementaryQuantityType> getLicAddendumMeasureItemList() {
        return licAddendumMeasureItemList;
    }

    /** 
     * Set the list of 'LicAddendumMeasureItem' element items. Единицы измерения и количества
     * 
     * @param list
     */
    public void setLicAddendumMeasureItemList(
            List<SupplementaryQuantityType> list) {
        licAddendumMeasureItemList = list;
    }
}
