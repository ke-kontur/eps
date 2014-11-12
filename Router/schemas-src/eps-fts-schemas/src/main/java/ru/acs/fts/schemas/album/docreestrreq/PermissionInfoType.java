
package ru.acs.fts.schemas.album.docreestrreq;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * Данные по разрешению
 */
public class PermissionInfoType
{
    private String minNumber;
    private String maxNumber;
    private String count;
    private String country;
    private String information;
    private String restrictCondition;
    private String shipmentKind;
    private String countryRestriction;
    private String transitTransportation;
    private String isTransit;
    private String TSRoute;
    private PermitDocumentType permitDocument;
    private CustomsType APP;
    private List<CarrierType> carrierList = new ArrayList<CarrierType>();

    /** 
     * Get the 'MinNumber' element value. Начало диапазона номеров
     * 
     * @return value
     */
    public String getMinNumber() {
        return minNumber;
    }

    /** 
     * Set the 'MinNumber' element value. Начало диапазона номеров
     * 
     * @param minNumber
     */
    public void setMinNumber(String minNumber) {
        this.minNumber = minNumber;
    }

    /** 
     * Get the 'MaxNumber' element value. Конец диапазона номеров
     * 
     * @return value
     */
    public String getMaxNumber() {
        return maxNumber;
    }

    /** 
     * Set the 'MaxNumber' element value. Конец диапазона номеров
     * 
     * @param maxNumber
     */
    public void setMaxNumber(String maxNumber) {
        this.maxNumber = maxNumber;
    }

    /** 
     * Get the 'Count' element value. Количество номеров в диапазоне
     * 
     * @return value
     */
    public String getCount() {
        return count;
    }

    /** 
     * Set the 'Count' element value. Количество номеров в диапазоне
     * 
     * @param count
     */
    public void setCount(String count) {
        this.count = count;
    }

    /** 
     * Get the 'Country' element value. Страна
     * 
     * @return value
     */
    public String getCountry() {
        return country;
    }

    /** 
     * Set the 'Country' element value. Страна
     * 
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /** 
     * Get the 'Information' element value. Примечание
     * 
     * @return value
     */
    public String getInformation() {
        return information;
    }

    /** 
     * Set the 'Information' element value. Примечание
     * 
     * @param information
     */
    public void setInformation(String information) {
        this.information = information;
    }

    /** 
     * Get the 'RestrictCondition' element value. Ограничения, особые условия по экологическим нормам 
     * 
     * @return value
     */
    public String getRestrictCondition() {
        return restrictCondition;
    }

    /** 
     * Set the 'RestrictCondition' element value. Ограничения, особые условия по экологическим нормам 
     * 
     * @param restrictCondition
     */
    public void setRestrictCondition(String restrictCondition) {
        this.restrictCondition = restrictCondition;
    }

    /** 
     * Get the 'ShipmentKind' element value. Вид перевозки: 1 - двусторонние перевозки  (если вид разрешения "многосторонние перевозки грузов"); 2 - транзитный проезд (если вид разрешения "многосторонние перевозки грузов"); 3 - перевозки в/из третьих стран (если вид разрешения "многосторонние перевозки грузов")
     * 
     * @return value
     */
    public String getShipmentKind() {
        return shipmentKind;
    }

    /** 
     * Set the 'ShipmentKind' element value. Вид перевозки: 1 - двусторонние перевозки  (если вид разрешения "многосторонние перевозки грузов"); 2 - транзитный проезд (если вид разрешения "многосторонние перевозки грузов"); 3 - перевозки в/из третьих стран (если вид разрешения "многосторонние перевозки грузов")
     * 
     * @param shipmentKind
     */
    public void setShipmentKind(String shipmentKind) {
        this.shipmentKind = shipmentKind;
    }

    /** 
     * Get the 'CountryRestriction' element value. Ограничения, особые условия по странам, перевозка в/из которых не разрешена 
     * 
     * @return value
     */
    public String getCountryRestriction() {
        return countryRestriction;
    }

    /** 
     * Set the 'CountryRestriction' element value. Ограничения, особые условия по странам, перевозка в/из которых не разрешена 
     * 
     * @param countryRestriction
     */
    public void setCountryRestriction(String countryRestriction) {
        this.countryRestriction = countryRestriction;
    }

    /** 
     * Get the 'TransitTransportation' element value. Признак только транзитного проезда
     * 
     * @return value
     */
    public String getTransitTransportation() {
        return transitTransportation;
    }

    /** 
     * Set the 'TransitTransportation' element value. Признак только транзитного проезда
     * 
     * @param transitTransportation
     */
    public void setTransitTransportation(String transitTransportation) {
        this.transitTransportation = transitTransportation;
    }

    /** 
     * Get the 'IsTransit' element value. Признак наличия отметки "Транзит"
     * 
     * @return value
     */
    public String getIsTransit() {
        return isTransit;
    }

    /** 
     * Set the 'IsTransit' element value. Признак наличия отметки "Транзит"
     * 
     * @param isTransit
     */
    public void setIsTransit(String isTransit) {
        this.isTransit = isTransit;
    }

    /** 
     * Get the 'TSRoute' element value. Маршрут ТС 
     * 
     * @return value
     */
    public String getTSRoute() {
        return TSRoute;
    }

    /** 
     * Set the 'TSRoute' element value. Маршрут ТС 
     * 
     * @param TSRoute
     */
    public void setTSRoute(String TSRoute) {
        this.TSRoute = TSRoute;
    }

    /** 
     * Get the 'PermitDocument' element value. Разрешение
     * 
     * @return value
     */
    public PermitDocumentType getPermitDocument() {
        return permitDocument;
    }

    /** 
     * Set the 'PermitDocument' element value. Разрешение
     * 
     * @param permitDocument
     */
    public void setPermitDocument(PermitDocumentType permitDocument) {
        this.permitDocument = permitDocument;
    }

    /** 
     * Get the 'APP' element value. АПП, через которые проходит маршрут ТС
     * 
     * @return value
     */
    public CustomsType getAPP() {
        return APP;
    }

    /** 
     * Set the 'APP' element value. АПП, через которые проходит маршрут ТС
     * 
     * @param APP
     */
    public void setAPP(CustomsType APP) {
        this.APP = APP;
    }

    /** 
     * Get the list of 'Carrier' element items. Перевозчик
     * 
     * @return list
     */
    public List<CarrierType> getCarrierList() {
        return carrierList;
    }

    /** 
     * Set the list of 'Carrier' element items. Перевозчик
     * 
     * @param list
     */
    public void setCarrierList(List<CarrierType> list) {
        carrierList = list;
    }
}
