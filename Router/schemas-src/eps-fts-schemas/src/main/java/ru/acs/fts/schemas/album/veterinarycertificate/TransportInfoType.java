
package ru.acs.fts.schemas.album.veterinarycertificate;

/** 
 * Сведения о транспорте
 */
public class TransportInfoType
{
    private String transportName;
    private String transportNumber;
    private String transportModeCode;
    private String transportMeansNationalityCode;

    /** 
     * Get the 'TransportName' element value. Наименование вида транспортного средства.
     * 
     * @return value
     */
    public String getTransportName() {
        return transportName;
    }

    /** 
     * Set the 'TransportName' element value. Наименование вида транспортного средства.
     * 
     * @param transportName
     */
    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }

    /** 
     * Get the 'TransportNumber' element value. Номер транспортного средства, название судна, номер авиарейса, номер вагона.
     * 
     * @return value
     */
    public String getTransportNumber() {
        return transportNumber;
    }

    /** 
     * Set the 'TransportNumber' element value. Номер транспортного средства, название судна, номер авиарейса, номер вагона.
     * 
     * @param transportNumber
     */
    public void setTransportNumber(String transportNumber) {
        this.transportNumber = transportNumber;
    }

    /** 
     * Get the 'TransportModeCode' element value. Код вида транспортного средства по классификатору видов транспорта и транспортировки товаров.
     * 
     * @return value
     */
    public String getTransportModeCode() {
        return transportModeCode;
    }

    /** 
     * Set the 'TransportModeCode' element value. Код вида транспортного средства по классификатору видов транспорта и транспортировки товаров.
     * 
     * @param transportModeCode
     */
    public void setTransportModeCode(String transportModeCode) {
        this.transportModeCode = transportModeCode;
    }

    /** 
     * Get the 'TransportMeansNationalityCode' element value. Буквенный код страны принадлежности транспортного средства по общероссийскому классификатору стран мира.
     * 
     * @return value
     */
    public String getTransportMeansNationalityCode() {
        return transportMeansNationalityCode;
    }

    /** 
     * Set the 'TransportMeansNationalityCode' element value. Буквенный код страны принадлежности транспортного средства по общероссийскому классификатору стран мира.
     * 
     * @param transportMeansNationalityCode
     */
    public void setTransportMeansNationalityCode(
            String transportMeansNationalityCode) {
        this.transportMeansNationalityCode = transportMeansNationalityCode;
    }
}
