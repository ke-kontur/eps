
package ru.acs.fts.schemas.album.pi_seaarrive;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * Реквизиты и характеристики судна
 */
public class ShipDetailsType
{
    private String shipIMONumber;
    private String shipName;
    private String capitainSurname;
    private String shipCountryCode;
    private LocalDate shipRegDate;
    private String shipRegNum;
    private String shipRegPort;
    private String flag;
    private String berth;
    private String grossTonnage;
    private String netTonnage;
    private String shipOwnerName;
    private String shipType;
    private CountryPortInfoType arrivalPlace;
    private CountryPortInfoType depaturePlace;
    private OrganizationType shipAgent;

    /** 
     * Get the 'ShipIMONumber' element value. ИМО номер судна
     * 
     * @return value
     */
    public String getShipIMONumber() {
        return shipIMONumber;
    }

    /** 
     * Set the 'ShipIMONumber' element value. ИМО номер судна
     * 
     * @param shipIMONumber
     */
    public void setShipIMONumber(String shipIMONumber) {
        this.shipIMONumber = shipIMONumber;
    }

    /** 
     * Get the 'ShipName' element value. Наименование судна
     * 
     * @return value
     */
    public String getShipName() {
        return shipName;
    }

    /** 
     * Set the 'ShipName' element value. Наименование судна
     * 
     * @param shipName
     */
    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    /** 
     * Get the 'CapitainSurname' element value. Фамилия капитана судна
     * 
     * @return value
     */
    public String getCapitainSurname() {
        return capitainSurname;
    }

    /** 
     * Set the 'CapitainSurname' element value. Фамилия капитана судна
     * 
     * @param capitainSurname
     */
    public void setCapitainSurname(String capitainSurname) {
        this.capitainSurname = capitainSurname;
    }

    /** 
     * Get the 'ShipCountryCode' element value. Код страны принадлежности судна
     * 
     * @return value
     */
    public String getShipCountryCode() {
        return shipCountryCode;
    }

    /** 
     * Set the 'ShipCountryCode' element value. Код страны принадлежности судна
     * 
     * @param shipCountryCode
     */
    public void setShipCountryCode(String shipCountryCode) {
        this.shipCountryCode = shipCountryCode;
    }

    /** 
     * Get the 'ShipRegDate' element value. Дата регистрации судна
     * 
     * @return value
     */
    public LocalDate getShipRegDate() {
        return shipRegDate;
    }

    /** 
     * Set the 'ShipRegDate' element value. Дата регистрации судна
     * 
     * @param shipRegDate
     */
    public void setShipRegDate(LocalDate shipRegDate) {
        this.shipRegDate = shipRegDate;
    }

    /** 
     * Get the 'ShipRegNum' element value. Номер регистрации судна
     * 
     * @return value
     */
    public String getShipRegNum() {
        return shipRegNum;
    }

    /** 
     * Set the 'ShipRegNum' element value. Номер регистрации судна
     * 
     * @param shipRegNum
     */
    public void setShipRegNum(String shipRegNum) {
        this.shipRegNum = shipRegNum;
    }

    /** 
     * Get the 'ShipRegPort' element value. Порт регистрации судна
     * 
     * @return value
     */
    public String getShipRegPort() {
        return shipRegPort;
    }

    /** 
     * Set the 'ShipRegPort' element value. Порт регистрации судна
     * 
     * @param shipRegPort
     */
    public void setShipRegPort(String shipRegPort) {
        this.shipRegPort = shipRegPort;
    }

    /** 
     * Get the 'Flag' element value. Флаг судна
     * 
     * @return value
     */
    public String getFlag() {
        return flag;
    }

    /** 
     * Set the 'Flag' element value. Флаг судна
     * 
     * @param flag
     */
    public void setFlag(String flag) {
        this.flag = flag;
    }

    /** 
     * Get the 'Berth' element value. Место стоянки судна в порту
     * 
     * @return value
     */
    public String getBerth() {
        return berth;
    }

    /** 
     * Set the 'Berth' element value. Место стоянки судна в порту
     * 
     * @param berth
     */
    public void setBerth(String berth) {
        this.berth = berth;
    }

    /** 
     * Get the 'GrossTonnage' element value. Валовая вместимость(тоннаж)
     * 
     * @return value
     */
    public String getGrossTonnage() {
        return grossTonnage;
    }

    /** 
     * Set the 'GrossTonnage' element value. Валовая вместимость(тоннаж)
     * 
     * @param grossTonnage
     */
    public void setGrossTonnage(String grossTonnage) {
        this.grossTonnage = grossTonnage;
    }

    /** 
     * Get the 'NetTonnage' element value. Чистая вместимость(тоннаж)
     * 
     * @return value
     */
    public String getNetTonnage() {
        return netTonnage;
    }

    /** 
     * Set the 'NetTonnage' element value. Чистая вместимость(тоннаж)
     * 
     * @param netTonnage
     */
    public void setNetTonnage(String netTonnage) {
        this.netTonnage = netTonnage;
    }

    /** 
     * Get the 'ShipOwnerName' element value. Наименование судовладельца
     * 
     * @return value
     */
    public String getShipOwnerName() {
        return shipOwnerName;
    }

    /** 
     * Set the 'ShipOwnerName' element value. Наименование судовладельца
     * 
     * @param shipOwnerName
     */
    public void setShipOwnerName(String shipOwnerName) {
        this.shipOwnerName = shipOwnerName;
    }

    /** 
     * Get the 'ShipType' element value. Тип судна
     * 
     * @return value
     */
    public String getShipType() {
        return shipType;
    }

    /** 
     * Set the 'ShipType' element value. Тип судна
     * 
     * @param shipType
     */
    public void setShipType(String shipType) {
        this.shipType = shipType;
    }

    /** 
     * Get the 'ArrivalPlace' element value. Порт и страна прибытия
     * 
     * @return value
     */
    public CountryPortInfoType getArrivalPlace() {
        return arrivalPlace;
    }

    /** 
     * Set the 'ArrivalPlace' element value. Порт и страна прибытия
     * 
     * @param arrivalPlace
     */
    public void setArrivalPlace(CountryPortInfoType arrivalPlace) {
        this.arrivalPlace = arrivalPlace;
    }

    /** 
     * Get the 'DepaturePlace' element value. Порт и страна отправления
     * 
     * @return value
     */
    public CountryPortInfoType getDepaturePlace() {
        return depaturePlace;
    }

    /** 
     * Set the 'DepaturePlace' element value. Порт и страна отправления
     * 
     * @param depaturePlace
     */
    public void setDepaturePlace(CountryPortInfoType depaturePlace) {
        this.depaturePlace = depaturePlace;
    }

    /** 
     * Get the 'ShipAgent' element value. Сведения о судовом агенте
     * 
     * @return value
     */
    public OrganizationType getShipAgent() {
        return shipAgent;
    }

    /** 
     * Set the 'ShipAgent' element value. Сведения о судовом агенте
     * 
     * @param shipAgent
     */
    public void setShipAgent(OrganizationType shipAgent) {
        this.shipAgent = shipAgent;
    }
}
