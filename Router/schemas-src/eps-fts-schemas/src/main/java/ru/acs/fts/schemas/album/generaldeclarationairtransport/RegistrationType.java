
package ru.acs.fts.schemas.album.generaldeclarationairtransport;

import org.joda.time.LocalDate;

/** 
 * �������� � ����������� ���������
 */
public class RegistrationType
{
    private LocalDate date;
    private String place;
    private String airlineIATACode;
    private String documentNumber;

    /** 
     * Get the 'Date' element value. ���� ����������� ���������
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. ���� ����������� ���������
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'Place' element value. ����� ����������� ���������
     * 
     * @return value
     */
    public String getPlace() {
        return place;
    }

    /** 
     * Set the 'Place' element value. ����� ����������� ���������
     * 
     * @param place
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /** 
     * Get the 'AirlineIATACode' element value. IATA-��� ������������ 
     * 
     * @return value
     */
    public String getAirlineIATACode() {
        return airlineIATACode;
    }

    /** 
     * Set the 'AirlineIATACode' element value. IATA-��� ������������ 
     * 
     * @param airlineIATACode
     */
    public void setAirlineIATACode(String airlineIATACode) {
        this.airlineIATACode = airlineIATACode;
    }

    /** 
     * Get the 'DocumentNumber' element value. �������� ����� ���������
     * 
     * @return value
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /** 
     * Set the 'DocumentNumber' element value. �������� ����� ���������
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }
}
