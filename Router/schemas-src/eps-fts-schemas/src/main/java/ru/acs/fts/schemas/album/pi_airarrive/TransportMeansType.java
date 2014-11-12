
package ru.acs.fts.schemas.album.pi_airarrive;

/** 
 * Сведения о транспортном средстве
 */
public class TransportMeansType
{
    private String airModification;
    private String airClass;
    private String airRegNumber;
    private String airNationalityCode;
    private String airOwerInfo;
    private String flightNumber;

    /** 
     * Get the 'AirModification' element value. Наименование и модификация воздушного судна
     * 
     * @return value
     */
    public String getAirModification() {
        return airModification;
    }

    /** 
     * Set the 'AirModification' element value. Наименование и модификация воздушного судна
     * 
     * @param airModification
     */
    public void setAirModification(String airModification) {
        this.airModification = airModification;
    }

    /** 
     * Get the 'AirClass' element value. Категория воздушного судна: 1- ВП(воздушно-пассажирское) 2 - ВГ(воздушно-грузовое) 3 - ВС (воздушно-грузопассажирское)
     * 
     * @return value
     */
    public String getAirClass() {
        return airClass;
    }

    /** 
     * Set the 'AirClass' element value. Категория воздушного судна: 1- ВП(воздушно-пассажирское) 2 - ВГ(воздушно-грузовое) 3 - ВС (воздушно-грузопассажирское)
     * 
     * @param airClass
     */
    public void setAirClass(String airClass) {
        this.airClass = airClass;
    }

    /** 
     * Get the 'AirRegNumber' element value. Регистрационный номер воздушного судна (номер борта или название)
     * 
     * @return value
     */
    public String getAirRegNumber() {
        return airRegNumber;
    }

    /** 
     * Set the 'AirRegNumber' element value. Регистрационный номер воздушного судна (номер борта или название)
     * 
     * @param airRegNumber
     */
    public void setAirRegNumber(String airRegNumber) {
        this.airRegNumber = airRegNumber;
    }

    /** 
     * Get the 'AirNationalityCode' element value. Код страны принадлежности транспорта
     * 
     * @return value
     */
    public String getAirNationalityCode() {
        return airNationalityCode;
    }

    /** 
     * Set the 'AirNationalityCode' element value. Код страны принадлежности транспорта
     * 
     * @param airNationalityCode
     */
    public void setAirNationalityCode(String airNationalityCode) {
        this.airNationalityCode = airNationalityCode;
    }

    /** 
     * Get the 'AirOwerInfo' element value. Сведения о владельце воздушного судна
     * 
     * @return value
     */
    public String getAirOwerInfo() {
        return airOwerInfo;
    }

    /** 
     * Set the 'AirOwerInfo' element value. Сведения о владельце воздушного судна
     * 
     * @param airOwerInfo
     */
    public void setAirOwerInfo(String airOwerInfo) {
        this.airOwerInfo = airOwerInfo;
    }

    /** 
     * Get the 'FlightNumber' element value. Номер рейса
     * 
     * @return value
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /** 
     * Set the 'FlightNumber' element value. Номер рейса
     * 
     * @param flightNumber
     */
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
}
