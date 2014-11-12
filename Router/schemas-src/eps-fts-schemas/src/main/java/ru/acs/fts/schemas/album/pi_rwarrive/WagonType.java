
package ru.acs.fts.schemas.album.pi_rwarrive;

import java.util.ArrayList;
import java.util.List;

/** 
 * Вагон
 */
public class WagonType
{
    private String wagonNumber;
    private String countryRegistrationCode;
    private String departureStation;
    private String destinationStation;
    private String goodsWeightQuantity;
    private String emptyIndicator;
    private List<String> containerNumberList = new ArrayList<String>();
    private String addInformaition;
    private String wagonNumeric;

    /** 
     * Get the 'WagonNumber' element value. Номер вагона
     * 
     * @return value
     */
    public String getWagonNumber() {
        return wagonNumber;
    }

    /** 
     * Set the 'WagonNumber' element value. Номер вагона
     * 
     * @param wagonNumber
     */
    public void setWagonNumber(String wagonNumber) {
        this.wagonNumber = wagonNumber;
    }

    /** 
     * Get the 'CountryRegistrationCode' element value. Буквенный код страны регистрации.
     * 
     * @return value
     */
    public String getCountryRegistrationCode() {
        return countryRegistrationCode;
    }

    /** 
     * Set the 'CountryRegistrationCode' element value. Буквенный код страны регистрации.
     * 
     * @param countryRegistrationCode
     */
    public void setCountryRegistrationCode(String countryRegistrationCode) {
        this.countryRegistrationCode = countryRegistrationCode;
    }

    /** 
     * Get the 'DepartureStation' element value. Станция отправления 
     * 
     * @return value
     */
    public String getDepartureStation() {
        return departureStation;
    }

    /** 
     * Set the 'DepartureStation' element value. Станция отправления 
     * 
     * @param departureStation
     */
    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    /** 
     * Get the 'DestinationStation' element value. Станция назначения
     * 
     * @return value
     */
    public String getDestinationStation() {
        return destinationStation;
    }

    /** 
     * Set the 'DestinationStation' element value. Станция назначения
     * 
     * @param destinationStation
     */
    public void setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
    }

    /** 
     * Get the 'GoodsWeightQuantity' element value. Вес груза
     * 
     * @return value
     */
    public String getGoodsWeightQuantity() {
        return goodsWeightQuantity;
    }

    /** 
     * Set the 'GoodsWeightQuantity' element value. Вес груза
     * 
     * @param goodsWeightQuantity
     */
    public void setGoodsWeightQuantity(String goodsWeightQuantity) {
        this.goodsWeightQuantity = goodsWeightQuantity;
    }

    /** 
     * Get the 'EmptyIndicator' element value. Признак порожний (да\\нет)
     * 
     * @return value
     */
    public String getEmptyIndicator() {
        return emptyIndicator;
    }

    /** 
     * Set the 'EmptyIndicator' element value. Признак порожний (да\\нет)
     * 
     * @param emptyIndicator
     */
    public void setEmptyIndicator(String emptyIndicator) {
        this.emptyIndicator = emptyIndicator;
    }

    /** 
     * Get the list of 'ContainerNumbers' element items. Номера контейнеров
     * 
     * @return list
     */
    public List<String> getContainerNumberList() {
        return containerNumberList;
    }

    /** 
     * Set the list of 'ContainerNumbers' element items. Номера контейнеров
     * 
     * @param list
     */
    public void setContainerNumberList(List<String> list) {
        containerNumberList = list;
    }

    /** 
     * Get the 'AddInformaition' element value. Примечания
     * 
     * @return value
     */
    public String getAddInformaition() {
        return addInformaition;
    }

    /** 
     * Set the 'AddInformaition' element value. Примечания
     * 
     * @param addInformaition
     */
    public void setAddInformaition(String addInformaition) {
        this.addInformaition = addInformaition;
    }

    /** 
     * Get the 'WagonNumeric' element value. Порядковый номер вагона в составе
     * 
     * @return value
     */
    public String getWagonNumeric() {
        return wagonNumeric;
    }

    /** 
     * Set the 'WagonNumeric' element value. Порядковый номер вагона в составе
     * 
     * @param wagonNumeric
     */
    public void setWagonNumeric(String wagonNumeric) {
        this.wagonNumeric = wagonNumeric;
    }
}
