
package ru.acs.fts.schemas.album.airwaybill;

/** 
 * �������� ����������� �����
 */
public class GoodsMovementType
{
    private String flightNumber;
    private String flightDate;
    private String numPP;
    private String destinationPlace;
    private String carrierName;
    private String carrierCode;

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
     * Get the 'FlightDate' element value. ���� ������ ��� ������������� �����
     * 
     * @return value
     */
    public String getFlightDate() {
        return flightDate;
    }

    /** 
     * Set the 'FlightDate' element value. ���� ������ ��� ������������� �����
     * 
     * @param flightDate
     */
    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    /** 
     * Get the 'NumPP' element value. ����� �����������  �� ��������� 1 - ������, 2 -  ������ � �.�.
     * 
     * @return value
     */
    public String getNumPP() {
        return numPP;
    }

    /** 
     * Set the 'NumPP' element value. ����� �����������  �� ��������� 1 - ������, 2 -  ������ � �.�.
     * 
     * @param numPP
     */
    public void setNumPP(String numPP) {
        this.numPP = numPP;
    }

    /** 
     * Get the 'DestinationPlace' element value. ����� ����������
     * 
     * @return value
     */
    public String getDestinationPlace() {
        return destinationPlace;
    }

    /** 
     * Set the 'DestinationPlace' element value. ����� ����������
     * 
     * @param destinationPlace
     */
    public void setDestinationPlace(String destinationPlace) {
        this.destinationPlace = destinationPlace;
    }

    /** 
     * Get the 'CarrierName' element value. ������������ �����������
     * 
     * @return value
     */
    public String getCarrierName() {
        return carrierName;
    }

    /** 
     * Set the 'CarrierName' element value. ������������ �����������
     * 
     * @param carrierName
     */
    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    /** 
     * Get the 'CarrierCode' element value. ��� ���������������.
     * 
     * @return value
     */
    public String getCarrierCode() {
        return carrierCode;
    }

    /** 
     * Set the 'CarrierCode' element value. ��� ���������������.
     * 
     * @param carrierCode
     */
    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }
}
