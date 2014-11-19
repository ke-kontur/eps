
package ru.acs.fts.schemas.album.pi_airarrive;

/** 
 * �������� � ���������
 */
public class PassengerInfoType
{
    private String passengersName;
    private AirportInfoType depatureAirport;
    private AirportInfoType destinationAirport;

    /** 
     * Get the 'PassengersName' element value. ��� ���������
     * 
     * @return value
     */
    public String getPassengersName() {
        return passengersName;
    }

    /** 
     * Set the 'PassengersName' element value. ��� ���������
     * 
     * @param passengersName
     */
    public void setPassengersName(String passengersName) {
        this.passengersName = passengersName;
    }

    /** 
     * Get the 'DepatureAirport' element value. ����� ������� ���������(�������� ������)
     * 
     * @return value
     */
    public AirportInfoType getDepatureAirport() {
        return depatureAirport;
    }

    /** 
     * Set the 'DepatureAirport' element value. ����� ������� ���������(�������� ������)
     * 
     * @param depatureAirport
     */
    public void setDepatureAirport(AirportInfoType depatureAirport) {
        this.depatureAirport = depatureAirport;
    }

    /** 
     * Get the 'DestinationAirport' element value. ����� ������� ��������� (�������� ����������)
     * 
     * @return value
     */
    public AirportInfoType getDestinationAirport() {
        return destinationAirport;
    }

    /** 
     * Set the 'DestinationAirport' element value. ����� ������� ��������� (�������� ����������)
     * 
     * @param destinationAirport
     */
    public void setDestinationAirport(AirportInfoType destinationAirport) {
        this.destinationAirport = destinationAirport;
    }
}
