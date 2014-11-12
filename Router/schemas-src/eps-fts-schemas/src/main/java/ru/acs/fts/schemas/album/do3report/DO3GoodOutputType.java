
package ru.acs.fts.schemas.album.do3report;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHCargoPlaceType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHSuppQuantityType;

/** 
 * Комплексный тип для описания товара в графе расход по отчету ДО3
 */
public class DO3GoodOutputType
{
    private String cost;
    private String currencyCode;
    private LocalDate outputDate;
    private String outputTime;
    private WHCargoPlaceType cargoPlace;
    private WHSuppQuantityType bruttoVolQuant;
    private WHSuppQuantityType measureQuantity;
    private DocumentBaseType orderCustDoc;

    /** 
     * Get the 'Cost' element value. Стоимость товара 
     * 
     * @return value
     */
    public String getCost() {
        return cost;
    }

    /** 
     * Set the 'Cost' element value. Стоимость товара 
     * 
     * @param cost
     */
    public void setCost(String cost) {
        this.cost = cost;
    }

    /** 
     * Get the 'CurrencyCode' element value. Буквенный код валюты  стоимости
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. Буквенный код валюты  стоимости
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'OutputDate' element value. Дата фактической выдачи  со склада
     * 
     * @return value
     */
    public LocalDate getOutputDate() {
        return outputDate;
    }

    /** 
     * Set the 'OutputDate' element value. Дата фактической выдачи  со склада
     * 
     * @param outputDate
     */
    public void setOutputDate(LocalDate outputDate) {
        this.outputDate = outputDate;
    }

    /** 
     * Get the 'OutputTime' element value. Время фактической выдачи МПО/ со склада
     * 
     * @return value
     */
    public String getOutputTime() {
        return outputTime;
    }

    /** 
     * Set the 'OutputTime' element value. Время фактической выдачи МПО/ со склада
     * 
     * @param outputTime
     */
    public void setOutputTime(String outputTime) {
        this.outputTime = outputTime;
    }

    /** 
     * Get the 'CargoPlace' element value. Сведения о грузовых  местах
     * 
     * @return value
     */
    public WHCargoPlaceType getCargoPlace() {
        return cargoPlace;
    }

    /** 
     * Set the 'CargoPlace' element value. Сведения о грузовых  местах
     * 
     * @param cargoPlace
     */
    public void setCargoPlace(WHCargoPlaceType cargoPlace) {
        this.cargoPlace = cargoPlace;
    }

    /** 
     * Get the 'BruttoVolQuant' element value. Вес брутто / объем
     * 
     * @return value
     */
    public WHSuppQuantityType getBruttoVolQuant() {
        return bruttoVolQuant;
    }

    /** 
     * Set the 'BruttoVolQuant' element value. Вес брутто / объем
     * 
     * @param bruttoVolQuant
     */
    public void setBruttoVolQuant(WHSuppQuantityType bruttoVolQuant) {
        this.bruttoVolQuant = bruttoVolQuant;
    }

    /** 
     * Get the 'MeasureQuantity' element value. Кол-во в дополнительных  единицах измерения
     * 
     * @return value
     */
    public WHSuppQuantityType getMeasureQuantity() {
        return measureQuantity;
    }

    /** 
     * Set the 'MeasureQuantity' element value. Кол-во в дополнительных  единицах измерения
     * 
     * @param measureQuantity
     */
    public void setMeasureQuantity(WHSuppQuantityType measureQuantity) {
        this.measureQuantity = measureQuantity;
    }

    /** 
     * Get the 'OrderCustDoc' element value. Документ, по которому разрешена выдача товара со склада
     * 
     * @return value
     */
    public DocumentBaseType getOrderCustDoc() {
        return orderCustDoc;
    }

    /** 
     * Set the 'OrderCustDoc' element value. Документ, по которому разрешена выдача товара со склада
     * 
     * @param orderCustDoc
     */
    public void setOrderCustDoc(DocumentBaseType orderCustDoc) {
        this.orderCustDoc = orderCustDoc;
    }
}
