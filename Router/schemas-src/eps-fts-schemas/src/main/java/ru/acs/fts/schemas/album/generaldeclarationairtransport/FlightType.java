
package ru.acs.fts.schemas.album.generaldeclarationairtransport;

import org.joda.time.LocalDate;

/** 
 * �������� � ����� 
 */
public class FlightType
{
    private String flNumber;
    private LocalDate flDate;
    private String departureAirport;
    private String destinationAirport;

    /** 
     * Get the 'FlNumber' element value. ����� �����
     * 
     * @return value
     */
    public String getFlNumber() {
        return flNumber;
    }

    /** 
     * Set the 'FlNumber' element value. ����� �����
     * 
     * @param flNumber
     */
    public void setFlNumber(String flNumber) {
        this.flNumber = flNumber;
    }

    /** 
     * Get the 'FlDate' element value. ���� �����
     * 
     * @return value
     */
    public LocalDate getFlDate() {
        return flDate;
    }

    /** 
     * Set the 'FlDate' element value. ���� �����
     * 
     * @param flDate
     */
    public void setFlDate(LocalDate flDate) {
        this.flDate = flDate;
    }

    /** 
     * Get the 'DepartureAirport' element value. �������� ��������� �����������
     * 
     * @return value
     */
    public String getDepartureAirport() {
        return departureAirport;
    }

    /** 
     * Set the 'DepartureAirport' element value. �������� ��������� �����������
     * 
     * @param departureAirport
     */
    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    /** 
     * Get the 'DestinationAirport' element value. �������� ��������� ����������
     * 
     * @return value
     */
    public String getDestinationAirport() {
        return destinationAirport;
    }

    /** 
     * Set the 'DestinationAirport' element value. �������� ��������� ����������
     * 
     * @param destinationAirport
     */
    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }
}
