
package ru.acs.fts.schemas.album.airwaybill;

/** 
 * Описание перемещения груза
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
     * Get the 'FlightNumber' element value. Номер рейса
     * 
     * @return value
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /** 
     * Set the 'FlightNumber' element value. Номер рейса
     * 
     * @param flightNumber
     */
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    /** 
     * Get the 'FlightDate' element value. День вылета для трансфертного груза
     * 
     * @return value
     */
    public String getFlightDate() {
        return flightDate;
    }

    /** 
     * Set the 'FlightDate' element value. День вылета для трансфертного груза
     * 
     * @param flightDate
     */
    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    /** 
     * Get the 'NumPP' element value. Номер перевозчика  по документу 1 - первый, 2 -  второй и т.д.
     * 
     * @return value
     */
    public String getNumPP() {
        return numPP;
    }

    /** 
     * Set the 'NumPP' element value. Номер перевозчика  по документу 1 - первый, 2 -  второй и т.д.
     * 
     * @param numPP
     */
    public void setNumPP(String numPP) {
        this.numPP = numPP;
    }

    /** 
     * Get the 'DestinationPlace' element value. Пункт назначения
     * 
     * @return value
     */
    public String getDestinationPlace() {
        return destinationPlace;
    }

    /** 
     * Set the 'DestinationPlace' element value. Пункт назначения
     * 
     * @param destinationPlace
     */
    public void setDestinationPlace(String destinationPlace) {
        this.destinationPlace = destinationPlace;
    }

    /** 
     * Get the 'CarrierName' element value. Наименование перевозчика
     * 
     * @return value
     */
    public String getCarrierName() {
        return carrierName;
    }

    /** 
     * Set the 'CarrierName' element value. Наименование перевозчика
     * 
     * @param carrierName
     */
    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    /** 
     * Get the 'CarrierCode' element value. Код авиаперевозчика.
     * 
     * @return value
     */
    public String getCarrierCode() {
        return carrierCode;
    }

    /** 
     * Set the 'CarrierCode' element value. Код авиаперевозчика.
     * 
     * @param carrierCode
     */
    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }
}
