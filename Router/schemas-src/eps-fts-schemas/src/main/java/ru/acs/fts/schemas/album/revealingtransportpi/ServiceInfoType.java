
package ru.acs.fts.schemas.album.revealingtransportpi;

import org.joda.time.LocalDate;

/** 
 * Служебная информация
 */
public class ServiceInfoType
{
    private String transportID;
    private LocalDate crossDate;
    private String customsArriveID;
    private String arriveDateTime;
    private String expDTNumber;

    /** 
     * Get the 'TransportID' element value. Уникальный идентификационный номер предварительной информации
     * 
     * @return value
     */
    public String getTransportID() {
        return transportID;
    }

    /** 
     * Set the 'TransportID' element value. Уникальный идентификационный номер предварительной информации
     * 
     * @param transportID
     */
    public void setTransportID(String transportID) {
        this.transportID = transportID;
    }

    /** 
     * Get the 'CrossDate' element value. Дата регистрации предварительной информации на уровне ФТС России
     * 
     * @return value
     */
    public LocalDate getCrossDate() {
        return crossDate;
    }

    /** 
     * Set the 'CrossDate' element value. Дата регистрации предварительной информации на уровне ФТС России
     * 
     * @param crossDate
     */
    public void setCrossDate(LocalDate crossDate) {
        this.crossDate = crossDate;
    }

    /** 
     * Get the 'CustomsArriveID' element value. Код таможенного органа, в котором планируется прибытие товаров на таможенную территорию Таможенного союза (КТАМ)
     * 
     * @return value
     */
    public String getCustomsArriveID() {
        return customsArriveID;
    }

    /** 
     * Set the 'CustomsArriveID' element value. Код таможенного органа, в котором планируется прибытие товаров на таможенную территорию Таможенного союза (КТАМ)
     * 
     * @param customsArriveID
     */
    public void setCustomsArriveID(String customsArriveID) {
        this.customsArriveID = customsArriveID;
    }

    /** 
     * Get the 'ArriveDateTime' element value. Дата и время планируемого прибытия товара на таможенную территорию Таможенного союза
     * 
     * @return value
     */
    public String getArriveDateTime() {
        return arriveDateTime;
    }

    /** 
     * Set the 'ArriveDateTime' element value. Дата и время планируемого прибытия товара на таможенную территорию Таможенного союза
     * 
     * @param arriveDateTime
     */
    public void setArriveDateTime(String arriveDateTime) {
        this.arriveDateTime = arriveDateTime;
    }

    /** 
     * Get the 'Exp_DTNumber' element value. Номер экспортной декларации на товары
     * 
     * @return value
     */
    public String getExpDTNumber() {
        return expDTNumber;
    }

    /** 
     * Set the 'Exp_DTNumber' element value. Номер экспортной декларации на товары
     * 
     * @param expDTNumber
     */
    public void setExpDTNumber(String expDTNumber) {
        this.expDTNumber = expDTNumber;
    }
}
