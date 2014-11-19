
package ru.acs.fts.schemas.album.transmissionlist;

import java.util.ArrayList;
import java.util.List;

/** 
 * Перечень грузов
 */
public class ListType
{
    private String billNumber;
    private String catalogNumber;
    private String carriageNumber;
    private List<String> goodDescriptionList = new ArrayList<String>();
    private String actNumber;
    private List<String> containerNumberList = new ArrayList<String>();
    private RailwayStationType departureStation;
    private RailwayStationType destinationStation;
    private QuantityGoodsType billQuantity;

    /** 
     * Get the 'BillNumber' element value. Номер накладной
     * 
     * @return value
     */
    public String getBillNumber() {
        return billNumber;
    }

    /** 
     * Set the 'BillNumber' element value. Номер накладной
     * 
     * @param billNumber
     */
    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    /** 
     * Get the 'CatalogNumber' element value. Номер перечня
     * 
     * @return value
     */
    public String getCatalogNumber() {
        return catalogNumber;
    }

    /** 
     * Set the 'CatalogNumber' element value. Номер перечня
     * 
     * @param catalogNumber
     */
    public void setCatalogNumber(String catalogNumber) {
        this.catalogNumber = catalogNumber;
    }

    /** 
     * Get the 'CarriageNumber' element value. Порядковый номер вагона
     * 
     * @return value
     */
    public String getCarriageNumber() {
        return carriageNumber;
    }

    /** 
     * Set the 'CarriageNumber' element value. Порядковый номер вагона
     * 
     * @param carriageNumber
     */
    public void setCarriageNumber(String carriageNumber) {
        this.carriageNumber = carriageNumber;
    }

    /** 
     * Get the list of 'GoodDescription' element items. Наименование груза
     * 
     * @return list
     */
    public List<String> getGoodDescriptionList() {
        return goodDescriptionList;
    }

    /** 
     * Set the list of 'GoodDescription' element items. Наименование груза
     * 
     * @param list
     */
    public void setGoodDescriptionList(List<String> list) {
        goodDescriptionList = list;
    }

    /** 
     * Get the 'ActNumber' element value. Номер акта на несохранность грузов, составленных при передаче
     * 
     * @return value
     */
    public String getActNumber() {
        return actNumber;
    }

    /** 
     * Set the 'ActNumber' element value. Номер акта на несохранность грузов, составленных при передаче
     * 
     * @param actNumber
     */
    public void setActNumber(String actNumber) {
        this.actNumber = actNumber;
    }

    /** 
     * Get the list of 'ContainerNumber' element items. Номер контейнера
     * 
     * @return list
     */
    public List<String> getContainerNumberList() {
        return containerNumberList;
    }

    /** 
     * Set the list of 'ContainerNumber' element items. Номер контейнера
     * 
     * @param list
     */
    public void setContainerNumberList(List<String> list) {
        containerNumberList = list;
    }

    /** 
     * Get the 'DepartureStation' element value. Станция отправления
     * 
     * @return value
     */
    public RailwayStationType getDepartureStation() {
        return departureStation;
    }

    /** 
     * Set the 'DepartureStation' element value. Станция отправления
     * 
     * @param departureStation
     */
    public void setDepartureStation(RailwayStationType departureStation) {
        this.departureStation = departureStation;
    }

    /** 
     * Get the 'DestinationStation' element value. Станция назначения
     * 
     * @return value
     */
    public RailwayStationType getDestinationStation() {
        return destinationStation;
    }

    /** 
     * Set the 'DestinationStation' element value. Станция назначения
     * 
     * @param destinationStation
     */
    public void setDestinationStation(RailwayStationType destinationStation) {
        this.destinationStation = destinationStation;
    }

    /** 
     * Get the 'BillQuantity' element value. Количество груза по накладной
     * 
     * @return value
     */
    public QuantityGoodsType getBillQuantity() {
        return billQuantity;
    }

    /** 
     * Set the 'BillQuantity' element value. Количество груза по накладной
     * 
     * @param billQuantity
     */
    public void setBillQuantity(QuantityGoodsType billQuantity) {
        this.billQuantity = billQuantity;
    }
}
