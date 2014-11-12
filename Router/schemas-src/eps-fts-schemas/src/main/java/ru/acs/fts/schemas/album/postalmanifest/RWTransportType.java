
package ru.acs.fts.schemas.album.postalmanifest;

import org.joda.time.LocalDate;

/** 
 * Железнодорожный транспорт/Автотранспорт
 */
public class RWTransportType
{
    private LocalDate sendDate;
    private String sendTime;
    private String transportNumber;
    private String direction;
    private String sealID;

    /** 
     * Get the 'SendDate' element value. Дата отправления
     * 
     * @return value
     */
    public LocalDate getSendDate() {
        return sendDate;
    }

    /** 
     * Set the 'SendDate' element value. Дата отправления
     * 
     * @param sendDate
     */
    public void setSendDate(LocalDate sendDate) {
        this.sendDate = sendDate;
    }

    /** 
     * Get the 'SendTime' element value. Время отправления
     * 
     * @return value
     */
    public String getSendTime() {
        return sendTime;
    }

    /** 
     * Set the 'SendTime' element value. Время отправления
     * 
     * @param sendTime
     */
    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    /** 
     * Get the 'TransportNumber' element value. Номер поезда/автомобиля
     * 
     * @return value
     */
    public String getTransportNumber() {
        return transportNumber;
    }

    /** 
     * Set the 'TransportNumber' element value. Номер поезда/автомобиля
     * 
     * @param transportNumber
     */
    public void setTransportNumber(String transportNumber) {
        this.transportNumber = transportNumber;
    }

    /** 
     * Get the 'Direction' element value. Направление
     * 
     * @return value
     */
    public String getDirection() {
        return direction;
    }

    /** 
     * Set the 'Direction' element value. Направление
     * 
     * @param direction
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }

    /** 
     * Get the 'SealID' element value. Номер печати
     * 
     * @return value
     */
    public String getSealID() {
        return sealID;
    }

    /** 
     * Set the 'SealID' element value. Номер печати
     * 
     * @param sealID
     */
    public void setSealID(String sealID) {
        this.sealID = sealID;
    }
}
