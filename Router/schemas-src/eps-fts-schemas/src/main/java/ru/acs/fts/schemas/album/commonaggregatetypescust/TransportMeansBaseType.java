
package ru.acs.fts.schemas.album.commonaggregatetypescust;

/** 
 * Базовый тип для описания транспортного средства в таможенных документах
 */
public class TransportMeansBaseType
{
    private String VIN;
    private String transportKindCode;
    private String transportMarkCode;
    private String transportIdentifier;
    private String transportMeansNationalityCode;
    private String activeTransportIdentifier;
    private String transportRegNumber;

    /** 
     * Get the 'VIN' element value. Номер шасси (VIN)
     * 
     * @return value
     */
    public String getVIN() {
        return VIN;
    }

    /** 
     * Set the 'VIN' element value. Номер шасси (VIN)
     * 
     * @param VIN
     */
    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    /** 
     * Get the 'TransportKindCode' element value. Код типа транспортного средства
     * 
     * @return value
     */
    public String getTransportKindCode() {
        return transportKindCode;
    }

    /** 
     * Set the 'TransportKindCode' element value. Код типа транспортного средства
     * 
     * @param transportKindCode
     */
    public void setTransportKindCode(String transportKindCode) {
        this.transportKindCode = transportKindCode;
    }

    /** 
     * Get the 'TransportMarkCode' element value. Код марки транспортного средства
     * 
     * @return value
     */
    public String getTransportMarkCode() {
        return transportMarkCode;
    }

    /** 
     * Set the 'TransportMarkCode' element value. Код марки транспортного средства
     * 
     * @param transportMarkCode
     */
    public void setTransportMarkCode(String transportMarkCode) {
        this.transportMarkCode = transportMarkCode;
    }

    /** 
     * Get the 'TransportIdentifier' element value. Идентификатор. Номер транспортного средства, наименование судна, номер авиарейса, номер поезда, номер железнодорожного вагона (платформ, цистерн и т.п.)
     * 
     * @return value
     */
    public String getTransportIdentifier() {
        return transportIdentifier;
    }

    /** 
     * Set the 'TransportIdentifier' element value. Идентификатор. Номер транспортного средства, наименование судна, номер авиарейса, номер поезда, номер железнодорожного вагона (платформ, цистерн и т.п.)
     * 
     * @param transportIdentifier
     */
    public void setTransportIdentifier(String transportIdentifier) {
        this.transportIdentifier = transportIdentifier;
    }

    /** 
     * Get the 'TransportMeansNationalityCode' element value. Буквенный код страны принадлежности транспортного средства по классификатору стран мира
     * 
     * @return value
     */
    public String getTransportMeansNationalityCode() {
        return transportMeansNationalityCode;
    }

    /** 
     * Set the 'TransportMeansNationalityCode' element value. Буквенный код страны принадлежности транспортного средства по классификатору стран мира
     * 
     * @param transportMeansNationalityCode
     */
    public void setTransportMeansNationalityCode(
            String transportMeansNationalityCode) {
        this.transportMeansNationalityCode = transportMeansNationalityCode;
    }

    /** 
     * Get the 'ActiveTransportIdentifier' element value. Идентификатор активного транспортного средства для прицепов, полуприцепов и др.
     * 
     * @return value
     */
    public String getActiveTransportIdentifier() {
        return activeTransportIdentifier;
    }

    /** 
     * Set the 'ActiveTransportIdentifier' element value. Идентификатор активного транспортного средства для прицепов, полуприцепов и др.
     * 
     * @param activeTransportIdentifier
     */
    public void setActiveTransportIdentifier(String activeTransportIdentifier) {
        this.activeTransportIdentifier = activeTransportIdentifier;
    }

    /** 
     * Get the 'TransportRegNumber' element value. Номер свидетельства о регистрации транспортного средства для РБ
     * 
     * @return value
     */
    public String getTransportRegNumber() {
        return transportRegNumber;
    }

    /** 
     * Set the 'TransportRegNumber' element value. Номер свидетельства о регистрации транспортного средства для РБ
     * 
     * @param transportRegNumber
     */
    public void setTransportRegNumber(String transportRegNumber) {
        this.transportRegNumber = transportRegNumber;
    }
}
