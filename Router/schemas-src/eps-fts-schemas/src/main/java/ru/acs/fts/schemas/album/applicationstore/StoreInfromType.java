
package ru.acs.fts.schemas.album.applicationstore;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * Сведения о припасах
 */
public class StoreInfromType
{
    private LocalDate dateMove;
    private String timeMove;
    private List<String> storeActionList = new ArrayList<String>();
    private String placeMove;
    private List<StrListGoodsType> operatingList = new ArrayList<StrListGoodsType>();
    private SoldType sold;
    private List<StrListGoodsType> consumerList = new ArrayList<StrListGoodsType>();

    /** 
     * Get the 'DateMove' element value. Дата перемещения припасов
     * 
     * @return value
     */
    public LocalDate getDateMove() {
        return dateMove;
    }

    /** 
     * Set the 'DateMove' element value. Дата перемещения припасов
     * 
     * @param dateMove
     */
    public void setDateMove(LocalDate dateMove) {
        this.dateMove = dateMove;
    }

    /** 
     * Get the 'TimeMove' element value. Время перемещения припасов
     * 
     * @return value
     */
    public String getTimeMove() {
        return timeMove;
    }

    /** 
     * Set the 'TimeMove' element value. Время перемещения припасов
     * 
     * @param timeMove
     */
    public void setTimeMove(String timeMove) {
        this.timeMove = timeMove;
    }

    /** 
     * Get the list of 'StoreActions' element items. Предполагаемые действия с припасами
     * 
     * @return list
     */
    public List<String> getStoreActionList() {
        return storeActionList;
    }

    /** 
     * Set the list of 'StoreActions' element items. Предполагаемые действия с припасами
     * 
     * @param list
     */
    public void setStoreActionList(List<String> list) {
        storeActionList = list;
    }

    /** 
     * Get the 'PlaceMove' element value. Место перемещения
     * 
     * @return value
     */
    public String getPlaceMove() {
        return placeMove;
    }

    /** 
     * Set the 'PlaceMove' element value. Место перемещения
     * 
     * @param placeMove
     */
    public void setPlaceMove(String placeMove) {
        this.placeMove = placeMove;
    }

    /** 
     * Get the list of 'Operating' element items. Эксплуатационные припасы
     * 
     * @return list
     */
    public List<StrListGoodsType> getOperatingList() {
        return operatingList;
    }

    /** 
     * Set the list of 'Operating' element items. Эксплуатационные припасы
     * 
     * @param list
     */
    public void setOperatingList(List<StrListGoodsType> list) {
        operatingList = list;
    }

    /** 
     * Get the 'Sold' element value. Продаваемые припасы
     * 
     * @return value
     */
    public SoldType getSold() {
        return sold;
    }

    /** 
     * Set the 'Sold' element value. Продаваемые припасы
     * 
     * @param sold
     */
    public void setSold(SoldType sold) {
        this.sold = sold;
    }

    /** 
     * Get the list of 'Consumer' element items. Потребительские припасы
     * 
     * @return list
     */
    public List<StrListGoodsType> getConsumerList() {
        return consumerList;
    }

    /** 
     * Set the list of 'Consumer' element items. Потребительские припасы
     * 
     * @param list
     */
    public void setConsumerList(List<StrListGoodsType> list) {
        consumerList = list;
    }
}
