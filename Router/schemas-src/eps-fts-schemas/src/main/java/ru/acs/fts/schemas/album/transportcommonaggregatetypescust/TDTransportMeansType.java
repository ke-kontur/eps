
package ru.acs.fts.schemas.album.transportcommonaggregatetypescust;

/** 
 * Транспортное средство в транзитной декларации
 */
public class TDTransportMeansType
{
    private String TMNumber;
    private String VINID;
    private String modeCode;
    private String nationalityCode;

    /** 
     * Get the 'TMNumber' element value. Номер (ведущего) транспортного средства
     * 
     * @return value
     */
    public String getTMNumber() {
        return TMNumber;
    }

    /** 
     * Set the 'TMNumber' element value. Номер (ведущего) транспортного средства
     * 
     * @param TMNumber
     */
    public void setTMNumber(String TMNumber) {
        this.TMNumber = TMNumber;
    }

    /** 
     * Get the 'VINID' element value. Номер VIN транспортного средства
     * 
     * @return value
     */
    public String getVINID() {
        return VINID;
    }

    /** 
     * Set the 'VINID' element value. Номер VIN транспортного средства
     * 
     * @param VINID
     */
    public void setVINID(String VINID) {
        this.VINID = VINID;
    }

    /** 
     * Get the 'ModeCode' element value. Код вида транспортного средства.
     * 
     * @return value
     */
    public String getModeCode() {
        return modeCode;
    }

    /** 
     * Set the 'ModeCode' element value. Код вида транспортного средства.
     * 
     * @param modeCode
     */
    public void setModeCode(String modeCode) {
        this.modeCode = modeCode;
    }

    /** 
     * Get the 'NationalityCode' element value. Код страны принадлежности транспорта.
     * 
     * @return value
     */
    public String getNationalityCode() {
        return nationalityCode;
    }

    /** 
     * Set the 'NationalityCode' element value. Код страны принадлежности транспорта.
     * 
     * @param nationalityCode
     */
    public void setNationalityCode(String nationalityCode) {
        this.nationalityCode = nationalityCode;
    }
}
