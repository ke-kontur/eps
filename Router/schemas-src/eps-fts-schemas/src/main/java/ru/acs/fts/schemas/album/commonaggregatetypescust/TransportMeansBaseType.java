
package ru.acs.fts.schemas.album.commonaggregatetypescust;

/** 
 * Ѕазовый тип дл€ описани€ транспортного средства в таможенных документах
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
     * Get the 'VIN' element value. Ќомер шасси (VIN)
     * 
     * @return value
     */
    public String getVIN() {
        return VIN;
    }

    /** 
     * Set the 'VIN' element value. Ќомер шасси (VIN)
     * 
     * @param VIN
     */
    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    /** 
     * Get the 'TransportKindCode' element value.  од типа транспортного средства
     * 
     * @return value
     */
    public String getTransportKindCode() {
        return transportKindCode;
    }

    /** 
     * Set the 'TransportKindCode' element value.  од типа транспортного средства
     * 
     * @param transportKindCode
     */
    public void setTransportKindCode(String transportKindCode) {
        this.transportKindCode = transportKindCode;
    }

    /** 
     * Get the 'TransportMarkCode' element value.  од марки транспортного средства
     * 
     * @return value
     */
    public String getTransportMarkCode() {
        return transportMarkCode;
    }

    /** 
     * Set the 'TransportMarkCode' element value.  од марки транспортного средства
     * 
     * @param transportMarkCode
     */
    public void setTransportMarkCode(String transportMarkCode) {
        this.transportMarkCode = transportMarkCode;
    }

    /** 
     * Get the 'TransportIdentifier' element value. »дентификатор. Ќомер транспортного средства, наименование судна, номер авиарейса, номер поезда, номер железнодорожного вагона (платформ, цистерн и т.п.)
     * 
     * @return value
     */
    public String getTransportIdentifier() {
        return transportIdentifier;
    }

    /** 
     * Set the 'TransportIdentifier' element value. »дентификатор. Ќомер транспортного средства, наименование судна, номер авиарейса, номер поезда, номер железнодорожного вагона (платформ, цистерн и т.п.)
     * 
     * @param transportIdentifier
     */
    public void setTransportIdentifier(String transportIdentifier) {
        this.transportIdentifier = transportIdentifier;
    }

    /** 
     * Get the 'TransportMeansNationalityCode' element value. Ѕуквенный код страны принадлежности транспортного средства по классификатору стран мира
     * 
     * @return value
     */
    public String getTransportMeansNationalityCode() {
        return transportMeansNationalityCode;
    }

    /** 
     * Set the 'TransportMeansNationalityCode' element value. Ѕуквенный код страны принадлежности транспортного средства по классификатору стран мира
     * 
     * @param transportMeansNationalityCode
     */
    public void setTransportMeansNationalityCode(
            String transportMeansNationalityCode) {
        this.transportMeansNationalityCode = transportMeansNationalityCode;
    }

    /** 
     * Get the 'ActiveTransportIdentifier' element value. »дентификатор активного транспортного средства дл€ прицепов, полуприцепов и др.
     * 
     * @return value
     */
    public String getActiveTransportIdentifier() {
        return activeTransportIdentifier;
    }

    /** 
     * Set the 'ActiveTransportIdentifier' element value. »дентификатор активного транспортного средства дл€ прицепов, полуприцепов и др.
     * 
     * @param activeTransportIdentifier
     */
    public void setActiveTransportIdentifier(String activeTransportIdentifier) {
        this.activeTransportIdentifier = activeTransportIdentifier;
    }

    /** 
     * Get the 'TransportRegNumber' element value. Ќомер свидетельства о регистрации транспортного средства дл€ –Ѕ
     * 
     * @return value
     */
    public String getTransportRegNumber() {
        return transportRegNumber;
    }

    /** 
     * Set the 'TransportRegNumber' element value. Ќомер свидетельства о регистрации транспортного средства дл€ –Ѕ
     * 
     * @param transportRegNumber
     */
    public void setTransportRegNumber(String transportRegNumber) {
        this.transportRegNumber = transportRegNumber;
    }
}
