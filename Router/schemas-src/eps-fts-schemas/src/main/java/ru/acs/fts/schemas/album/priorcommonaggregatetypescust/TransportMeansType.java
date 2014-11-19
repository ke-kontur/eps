
package ru.acs.fts.schemas.album.priorcommonaggregatetypescust;

/** 
 * Транспортное средство.
 */
public class TransportMeansType
{
    private String transportIdentifier;
    private String trailerIdentifier;
    private String secondTrailerIdentifier;
    private String VINID;
    private String transportModeCode;
    private String transportMeansNationalityCode;

    /** 
     * Get the 'TransportIdentifier' element value. Идентификатор (номер) основного транспортного средства / название судна/номер авиарейса, бортовой номер/ номер ж.д. вагона.
     * 
     * @return value
     */
    public String getTransportIdentifier() {
        return transportIdentifier;
    }

    /** 
     * Set the 'TransportIdentifier' element value. Идентификатор (номер) основного транспортного средства / название судна/номер авиарейса, бортовой номер/ номер ж.д. вагона.
     * 
     * @param transportIdentifier
     */
    public void setTransportIdentifier(String transportIdentifier) {
        this.transportIdentifier = transportIdentifier;
    }

    /** 
     * Get the 'TrailerIdentifier' element value. Идентификатор (номер) прицепного транспортного средства.
     * 
     * @return value
     */
    public String getTrailerIdentifier() {
        return trailerIdentifier;
    }

    /** 
     * Set the 'TrailerIdentifier' element value. Идентификатор (номер) прицепного транспортного средства.
     * 
     * @param trailerIdentifier
     */
    public void setTrailerIdentifier(String trailerIdentifier) {
        this.trailerIdentifier = trailerIdentifier;
    }

    /** 
     * Get the 'SecondTrailerIdentifier' element value. Идентификатор (номер) второго прицепного транспортного средства
     * 
     * @return value
     */
    public String getSecondTrailerIdentifier() {
        return secondTrailerIdentifier;
    }

    /** 
     * Set the 'SecondTrailerIdentifier' element value. Идентификатор (номер) второго прицепного транспортного средства
     * 
     * @param secondTrailerIdentifier
     */
    public void setSecondTrailerIdentifier(String secondTrailerIdentifier) {
        this.secondTrailerIdentifier = secondTrailerIdentifier;
    }

    /** 
     * Get the 'VINID' element value. Идентификационный номер транспортного средства (VIN)
     * 
     * @return value
     */
    public String getVINID() {
        return VINID;
    }

    /** 
     * Set the 'VINID' element value. Идентификационный номер транспортного средства (VIN)
     * 
     * @param VINID
     */
    public void setVINID(String VINID) {
        this.VINID = VINID;
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
     * Get the 'TransportMeansNationalityCode' element value. Буквенный код страны принадлежности транспортного средства по общероссийскому классификатору стран мира..
     * 
     * @return value
     */
    public String getTransportMeansNationalityCode() {
        return transportMeansNationalityCode;
    }

    /** 
     * Set the 'TransportMeansNationalityCode' element value. Буквенный код страны принадлежности транспортного средства по общероссийскому классификатору стран мира..
     * 
     * @param transportMeansNationalityCode
     */
    public void setTransportMeansNationalityCode(
            String transportMeansNationalityCode) {
        this.transportMeansNationalityCode = transportMeansNationalityCode;
    }
}
