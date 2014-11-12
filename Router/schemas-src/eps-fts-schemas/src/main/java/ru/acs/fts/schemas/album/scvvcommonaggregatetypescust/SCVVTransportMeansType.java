
package ru.acs.fts.schemas.album.scvvcommonaggregatetypescust;

/** 
 * “ранспортное средство
 */
public class SCVVTransportMeansType
{
    private String transportIdentifier;
    private String trailerIdentifier;
    private String secondTrailerIdentifier;
    private String transportModeCode;
    private String transportMeansNationalityCode;
    private String transportTraditionalName;

    /** 
     * Get the 'TransportIdentifier' element value. »дентификатор (номер) основного транспортного средства.
     * 
     * @return value
     */
    public String getTransportIdentifier() {
        return transportIdentifier;
    }

    /** 
     * Set the 'TransportIdentifier' element value. »дентификатор (номер) основного транспортного средства.
     * 
     * @param transportIdentifier
     */
    public void setTransportIdentifier(String transportIdentifier) {
        this.transportIdentifier = transportIdentifier;
    }

    /** 
     * Get the 'TrailerIdentifier' element value. »дентификатор (номер) прицепного транспортного средства.
     * 
     * @return value
     */
    public String getTrailerIdentifier() {
        return trailerIdentifier;
    }

    /** 
     * Set the 'TrailerIdentifier' element value. »дентификатор (номер) прицепного транспортного средства.
     * 
     * @param trailerIdentifier
     */
    public void setTrailerIdentifier(String trailerIdentifier) {
        this.trailerIdentifier = trailerIdentifier;
    }

    /** 
     * Get the 'SecondTrailerIdentifier' element value. »дентификатор (номер) второго прицепного транспортного средства
     * 
     * @return value
     */
    public String getSecondTrailerIdentifier() {
        return secondTrailerIdentifier;
    }

    /** 
     * Set the 'SecondTrailerIdentifier' element value. »дентификатор (номер) второго прицепного транспортного средства
     * 
     * @param secondTrailerIdentifier
     */
    public void setSecondTrailerIdentifier(String secondTrailerIdentifier) {
        this.secondTrailerIdentifier = secondTrailerIdentifier;
    }

    /** 
     * Get the 'TransportModeCode' element value.  од вида транспортного средства по классификатору видов транспорта и транспортировки товаров.
     * 
     * @return value
     */
    public String getTransportModeCode() {
        return transportModeCode;
    }

    /** 
     * Set the 'TransportModeCode' element value.  од вида транспортного средства по классификатору видов транспорта и транспортировки товаров.
     * 
     * @param transportModeCode
     */
    public void setTransportModeCode(String transportModeCode) {
        this.transportModeCode = transportModeCode;
    }

    /** 
     * Get the 'TransportMeansNationalityCode' element value. Ѕуквенный код страны принадлежности транспортного средства по общероссийскому классификатору стран мира.
     * 
     * @return value
     */
    public String getTransportMeansNationalityCode() {
        return transportMeansNationalityCode;
    }

    /** 
     * Set the 'TransportMeansNationalityCode' element value. Ѕуквенный код страны принадлежности транспортного средства по общероссийскому классификатору стран мира.
     * 
     * @param transportMeansNationalityCode
     */
    public void setTransportMeansNationalityCode(
            String transportMeansNationalityCode) {
        this.transportMeansNationalityCode = transportMeansNationalityCode;
    }

    /** 
     * Get the 'TransportTraditionalName' element value. “радиционное наименование транспортного средства. по классификатору видов транспорта и транспортировки товаров.. 
     * 
     * @return value
     */
    public String getTransportTraditionalName() {
        return transportTraditionalName;
    }

    /** 
     * Set the 'TransportTraditionalName' element value. “радиционное наименование транспортного средства. по классификатору видов транспорта и транспортировки товаров.. 
     * 
     * @param transportTraditionalName
     */
    public void setTransportTraditionalName(String transportTraditionalName) {
        this.transportTraditionalName = transportTraditionalName;
    }
}
