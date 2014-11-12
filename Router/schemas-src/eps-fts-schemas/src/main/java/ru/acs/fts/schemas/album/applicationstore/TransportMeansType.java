
package ru.acs.fts.schemas.album.applicationstore;

/** 
 * Сведения о транспортном средстве
 */
public class TransportMeansType
{
    private String transportName;
    private String flightNumber;
    private String countryRegTrans;
    private String codeCountryRegTrans;
    private String transportType;
    private String transportIdentifier;

    /** 
     * Get the 'TransportName' element value. Название морского судна/бортовой номер воздушного судна/номер поезда.
     * 
     * @return value
     */
    public String getTransportName() {
        return transportName;
    }

    /** 
     * Set the 'TransportName' element value. Название морского судна/бортовой номер воздушного судна/номер поезда.
     * 
     * @param transportName
     */
    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }

    /** 
     * Get the 'FlightNumber' element value. Номер рейса воздушного судна
     * 
     * @return value
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /** 
     * Set the 'FlightNumber' element value. Номер рейса воздушного судна
     * 
     * @param flightNumber
     */
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    /** 
     * Get the 'CountryRegTrans' element value. Страна  регистрации  транспортного средства
     * 
     * @return value
     */
    public String getCountryRegTrans() {
        return countryRegTrans;
    }

    /** 
     * Set the 'CountryRegTrans' element value. Страна  регистрации  транспортного средства
     * 
     * @param countryRegTrans
     */
    public void setCountryRegTrans(String countryRegTrans) {
        this.countryRegTrans = countryRegTrans;
    }

    /** 
     * Get the 'CodeCountryRegTrans' element value. Код страны, где регистрировано  транспортного средства
     * 
     * @return value
     */
    public String getCodeCountryRegTrans() {
        return codeCountryRegTrans;
    }

    /** 
     * Set the 'CodeCountryRegTrans' element value. Код страны, где регистрировано  транспортного средства
     * 
     * @param codeCountryRegTrans
     */
    public void setCodeCountryRegTrans(String codeCountryRegTrans) {
        this.codeCountryRegTrans = codeCountryRegTrans;
    }

    /** 
     * Get the 'TransportType' element value. Тип транспортного средства, на котором перемещается товар. "1"- воздушное судно; "2" - морское судно; "3" - ЖД транспорт.
     * 
     * @return value
     */
    public String getTransportType() {
        return transportType;
    }

    /** 
     * Set the 'TransportType' element value. Тип транспортного средства, на котором перемещается товар. "1"- воздушное судно; "2" - морское судно; "3" - ЖД транспорт.
     * 
     * @param transportType
     */
    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    /** 
     * Get the 'TransportIdentifier' element value. Идентификационные сведения о транспортном средстве
     * 
     * @return value
     */
    public String getTransportIdentifier() {
        return transportIdentifier;
    }

    /** 
     * Set the 'TransportIdentifier' element value. Идентификационные сведения о транспортном средстве
     * 
     * @param transportIdentifier
     */
    public void setTransportIdentifier(String transportIdentifier) {
        this.transportIdentifier = transportIdentifier;
    }
}
