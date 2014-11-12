
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * ����������� ��� ��� �������� ������������ ��� ������������ ����������
 */
public class AviaParticularsType
{
    private String flightNumber;
    private LocalDate flightDate;

    /** 
     * Get the 'FlightNumber' element value. ����� �����
     * 
     * @return value
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /** 
     * Set the 'FlightNumber' element value. ����� �����
     * 
     * @param flightNumber
     */
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    /** 
     * Get the 'FlightDate' element value. ���� �����
     * 
     * @return value
     */
    public LocalDate getFlightDate() {
        return flightDate;
    }

    /** 
     * Set the 'FlightDate' element value. ���� �����
     * 
     * @param flightDate
     */
    public void setFlightDate(LocalDate flightDate) {
        this.flightDate = flightDate;
    }
}
