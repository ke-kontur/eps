
package ru.acs.fts.schemas.album.woodshipingspecification;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения о товарах
 */
public class GoodsInfoType
{
    private String packNum;
    private String species;
    private String grade;
    private String depth;
    private String width;
    private String quantity;
    private String volume;
    private List<String> requisiteList = new ArrayList<String>();
    private List<String> detailList = new ArrayList<String>();
    private List<LenghtInfoType> lengthList = new ArrayList<LenghtInfoType>();

    /** 
     * Get the 'PackNum' element value. Номер пакета
     * 
     * @return value
     */
    public String getPackNum() {
        return packNum;
    }

    /** 
     * Set the 'PackNum' element value. Номер пакета
     * 
     * @param packNum
     */
    public void setPackNum(String packNum) {
        this.packNum = packNum;
    }

    /** 
     * Get the 'Species' element value. Порода
     * 
     * @return value
     */
    public String getSpecies() {
        return species;
    }

    /** 
     * Set the 'Species' element value. Порода
     * 
     * @param species
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /** 
     * Get the 'Grade' element value. Сорт
     * 
     * @return value
     */
    public String getGrade() {
        return grade;
    }

    /** 
     * Set the 'Grade' element value. Сорт
     * 
     * @param grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /** 
     * Get the 'Depth' element value. Толщина
     * 
     * @return value
     */
    public String getDepth() {
        return depth;
    }

    /** 
     * Set the 'Depth' element value. Толщина
     * 
     * @param depth
     */
    public void setDepth(String depth) {
        this.depth = depth;
    }

    /** 
     * Get the 'Width' element value. Ширина
     * 
     * @return value
     */
    public String getWidth() {
        return width;
    }

    /** 
     * Set the 'Width' element value. Ширина
     * 
     * @param width
     */
    public void setWidth(String width) {
        this.width = width;
    }

    /** 
     * Get the 'Quantity' element value. Количество в натуральных единицах (шт.)
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. Количество в натуральных единицах (шт.)
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the 'Volume' element value. Объем в куб. метрах
     * 
     * @return value
     */
    public String getVolume() {
        return volume;
    }

    /** 
     * Set the 'Volume' element value. Объем в куб. метрах
     * 
     * @param volume
     */
    public void setVolume(String volume) {
        this.volume = volume;
    }

    /** 
     * Get the list of 'Requisites' element items. Реквизиты
     * 
     * @return list
     */
    public List<String> getRequisiteList() {
        return requisiteList;
    }

    /** 
     * Set the list of 'Requisites' element items. Реквизиты
     * 
     * @param list
     */
    public void setRequisiteList(List<String> list) {
        requisiteList = list;
    }

    /** 
     * Get the list of 'Details' element items. Дополнительные сведения о распределении по сортам, под длинам
     * 
     * @return list
     */
    public List<String> getDetailList() {
        return detailList;
    }

    /** 
     * Set the list of 'Details' element items. Дополнительные сведения о распределении по сортам, под длинам
     * 
     * @param list
     */
    public void setDetailList(List<String> list) {
        detailList = list;
    }

    /** 
     * Get the list of 'Length' element items. Длина
     * 
     * @return list
     */
    public List<LenghtInfoType> getLengthList() {
        return lengthList;
    }

    /** 
     * Set the list of 'Length' element items. Длина
     * 
     * @param list
     */
    public void setLengthList(List<LenghtInfoType> list) {
        lengthList = list;
    }
}
