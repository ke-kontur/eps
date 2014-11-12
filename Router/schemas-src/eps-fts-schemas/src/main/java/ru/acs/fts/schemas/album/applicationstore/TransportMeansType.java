
package ru.acs.fts.schemas.album.applicationstore;

/** 
 * —ведени€ о транспортном средстве
 */
public class TransportMeansType
{
    private String transportName;
    private String flightNumber;
    private String countryRegTrans;
    private String codeCountryRegTrans;
    private String transportType;

    /** 
     * Get the 'TransportName' element value. Ќазвание морского судна/бортовой номер воздушного судна/номер поезда.
     * 
     * @return value
     */
    public String getTransportName() {
        return transportName;
    }

    /** 
     * Set the 'TransportName' element value. Ќазвание морского судна/бортовой номер воздушного судна/номер поезда.
     * 
     * @param transportName
     */
    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }

    /** 
     * Get the 'FlightNumber' element value. Ќомер рейса воздушного судна
     * 
     * @return value
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /** 
     * Set the 'FlightNumber' element value. Ќомер рейса воздушного судна
     * 
     * @param flightNumber
     */
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    /** 
     * Get the 'CountryRegTrans' element value. —трана  регистрации  транспортного средства
     * 
     * @return value
     */
    public String getCountryRegTrans() {
        return countryRegTrans;
    }

    /** 
     * Set the 'CountryRegTrans' element value. —трана  регистрации  транспортного средства
     * 
     * @param countryRegTrans
     */
    public void setCountryRegTrans(String countryRegTrans) {
        this.countryRegTrans = countryRegTrans;
    }

    /** 
     * Get the 'CodeCountryRegTrans' element value.  од страны, где регистрировано  транспортного средства
     * 
     * @return value
     */
    public String getCodeCountryRegTrans() {
        return codeCountryRegTrans;
    }

    /** 
     * Set the 'CodeCountryRegTrans' element value.  од страны, где регистрировано  транспортного средства
     * 
     * @param codeCountryRegTrans
     */
    public void setCodeCountryRegTrans(String codeCountryRegTrans) {
        this.codeCountryRegTrans = codeCountryRegTrans;
    }

    /** 
     * Get the 'TransportType' element value. “ип транспортного средства, на котором перемещаетс€ товар. "1"- воздушное судно; "2" - морское судно; "3" - ∆ƒ транспорт.
     * 
     * @return value
     */
    public String getTransportType() {
        return transportType;
    }

    /** 
     * Set the 'TransportType' element value. “ип транспортного средства, на котором перемещаетс€ товар. "1"- воздушное судно; "2" - морское судно; "3" - ∆ƒ транспорт.
     * 
     * @param transportType
     */
    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }
}
