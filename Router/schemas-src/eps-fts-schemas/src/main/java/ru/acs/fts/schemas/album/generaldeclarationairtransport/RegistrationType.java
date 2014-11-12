
package ru.acs.fts.schemas.album.generaldeclarationairtransport;

import org.joda.time.LocalDate;

/** 
 * Сведения о составлении документа
 */
public class RegistrationType
{
    private LocalDate date;
    private String place;
    private String airlineIATACode;
    private String documentNumber;

    /** 
     * Get the 'Date' element value. Дата составления документа
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. Дата составления документа
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'Place' element value. Место составления документа
     * 
     * @return value
     */
    public String getPlace() {
        return place;
    }

    /** 
     * Set the 'Place' element value. Место составления документа
     * 
     * @param place
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /** 
     * Get the 'AirlineIATACode' element value. IATA-код авиакомпании 
     * 
     * @return value
     */
    public String getAirlineIATACode() {
        return airlineIATACode;
    }

    /** 
     * Set the 'AirlineIATACode' element value. IATA-код авиакомпании 
     * 
     * @param airlineIATACode
     */
    public void setAirlineIATACode(String airlineIATACode) {
        this.airlineIATACode = airlineIATACode;
    }

    /** 
     * Get the 'DocumentNumber' element value. Серийный номер документа
     * 
     * @return value
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /** 
     * Set the 'DocumentNumber' element value. Серийный номер документа
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }
}
