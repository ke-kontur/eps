
package ru.acs.fts.schemas.album.transportcommonaggregatetypescust;

/** 
 * Номер авианакладной
 */
public class AWBNumberType
{
    private String airlineIATACode;
    private String documentNumber;
    private String airlineSign;

    /** 
     * Get the 'AirlineIATACode' element value. IATA-код авиакомпании. Цифровой
     * 
     * @return value
     */
    public String getAirlineIATACode() {
        return airlineIATACode;
    }

    /** 
     * Set the 'AirlineIATACode' element value. IATA-код авиакомпании. Цифровой
     * 
     * @param airlineIATACode
     */
    public void setAirlineIATACode(String airlineIATACode) {
        this.airlineIATACode = airlineIATACode;
    }

    /** 
     * Get the 'DocumentNumber' element value. Серийный номер накладной
     * 
     * @return value
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /** 
     * Set the 'DocumentNumber' element value. Серийный номер накладной
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /** 
     * Get the 'AirlineSign' element value. Признак того, что авиаперевозчик, сформировавший накладную, является членом ИАТА
     * 
     * @return value
     */
    public String getAirlineSign() {
        return airlineSign;
    }

    /** 
     * Set the 'AirlineSign' element value. Признак того, что авиаперевозчик, сформировавший накладную, является членом ИАТА
     * 
     * @param airlineSign
     */
    public void setAirlineSign(String airlineSign) {
        this.airlineSign = airlineSign;
    }
}
