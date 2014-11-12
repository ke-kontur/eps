
package ru.acs.fts.schemas.album.pi_autoarrive;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.priorcommonaggregatetypescust.PIGoodsType;

/** 
 * Информация о перевозимых товарах
 */
public class GoodsInformType
{
    private String totalGoodsNameQuantity;
    private String shipSpecifQuantity;
    private String shipSpecifGoodsQuantity;
    private LocalDate dateExpectedArrival;
    private String timeExpectedArrival;
    private List<PIGoodsType> goodList = new ArrayList<PIGoodsType>();
    private CUCustomsType borderCustoms;

    /** 
     * Get the 'TotalGoodsNameQuantity' element value. Всего наименований товаров
     * 
     * @return value
     */
    public String getTotalGoodsNameQuantity() {
        return totalGoodsNameQuantity;
    }

    /** 
     * Set the 'TotalGoodsNameQuantity' element value. Всего наименований товаров
     * 
     * @param totalGoodsNameQuantity
     */
    public void setTotalGoodsNameQuantity(String totalGoodsNameQuantity) {
        this.totalGoodsNameQuantity = totalGoodsNameQuantity;
    }

    /** 
     * Get the 'ShipSpecifQuantity' element value. Количество отгрузочных спецификаций
     * 
     * @return value
     */
    public String getShipSpecifQuantity() {
        return shipSpecifQuantity;
    }

    /** 
     * Set the 'ShipSpecifQuantity' element value. Количество отгрузочных спецификаций
     * 
     * @param shipSpecifQuantity
     */
    public void setShipSpecifQuantity(String shipSpecifQuantity) {
        this.shipSpecifQuantity = shipSpecifQuantity;
    }

    /** 
     * Get the 'ShipSpecifGoodsQuantity' element value. Количество товаров по отгрузочным спецификациям
     * 
     * @return value
     */
    public String getShipSpecifGoodsQuantity() {
        return shipSpecifGoodsQuantity;
    }

    /** 
     * Set the 'ShipSpecifGoodsQuantity' element value. Количество товаров по отгрузочным спецификациям
     * 
     * @param shipSpecifGoodsQuantity
     */
    public void setShipSpecifGoodsQuantity(String shipSpecifGoodsQuantity) {
        this.shipSpecifGoodsQuantity = shipSpecifGoodsQuantity;
    }

    /** 
     * Get the 'DateExpectedArrival' element value. Дата ожидаемого прибытия товаров и транспортных средств в пограничный пункт пропуска
     * 
     * @return value
     */
    public LocalDate getDateExpectedArrival() {
        return dateExpectedArrival;
    }

    /** 
     * Set the 'DateExpectedArrival' element value. Дата ожидаемого прибытия товаров и транспортных средств в пограничный пункт пропуска
     * 
     * @param dateExpectedArrival
     */
    public void setDateExpectedArrival(LocalDate dateExpectedArrival) {
        this.dateExpectedArrival = dateExpectedArrival;
    }

    /** 
     * Get the 'TimeExpectedArrival' element value. Время ожидаемого прибытия товаров и транспортных средств в пограничный пункт пропуска
     * 
     * @return value
     */
    public String getTimeExpectedArrival() {
        return timeExpectedArrival;
    }

    /** 
     * Set the 'TimeExpectedArrival' element value. Время ожидаемого прибытия товаров и транспортных средств в пограничный пункт пропуска
     * 
     * @param timeExpectedArrival
     */
    public void setTimeExpectedArrival(String timeExpectedArrival) {
        this.timeExpectedArrival = timeExpectedArrival;
    }

    /** 
     * Get the list of 'Goods' element items. Сведения о товарах
     * 
     * @return list
     */
    public List<PIGoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. Сведения о товарах
     * 
     * @param list
     */
    public void setGoodList(List<PIGoodsType> list) {
        goodList = list;
    }

    /** 
     * Get the 'BorderCustoms' element value. Таможенный орган (пограничный пункт пропуска), в который ожидается прибытие товаров и транспортных средств.
     * 
     * @return value
     */
    public CUCustomsType getBorderCustoms() {
        return borderCustoms;
    }

    /** 
     * Set the 'BorderCustoms' element value. Таможенный орган (пограничный пункт пропуска), в который ожидается прибытие товаров и транспортных средств.
     * 
     * @param borderCustoms
     */
    public void setBorderCustoms(CUCustomsType borderCustoms) {
        this.borderCustoms = borderCustoms;
    }
}
