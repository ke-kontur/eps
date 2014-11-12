
package ru.acs.fts.schemas.album.generaldeclarationairtransport;

/** 
 * Информация о количестве пассажиров
 */
public class PassengerQuantityType
{
    private String departurePass;
    private String transferDepartPass;
    private String destinationPass;
    private String transferDestinationPass;

    /** 
     * Get the 'DeparturePass' element value. Количество пассажиров принятых  в пункте отправления
     * 
     * @return value
     */
    public String getDeparturePass() {
        return departurePass;
    }

    /** 
     * Set the 'DeparturePass' element value. Количество пассажиров принятых  в пункте отправления
     * 
     * @param departurePass
     */
    public void setDeparturePass(String departurePass) {
        this.departurePass = departurePass;
    }

    /** 
     * Get the 'TransferDepartPass' element value. Кол-во трансфертных пассажиров в аэропорту убытия
     * 
     * @return value
     */
    public String getTransferDepartPass() {
        return transferDepartPass;
    }

    /** 
     * Set the 'TransferDepartPass' element value. Кол-во трансфертных пассажиров в аэропорту убытия
     * 
     * @param transferDepartPass
     */
    public void setTransferDepartPass(String transferDepartPass) {
        this.transferDepartPass = transferDepartPass;
    }

    /** 
     * Get the 'DestinationPass' element value. Количество пассажиров выходящих  в аэропорту назначения
     * 
     * @return value
     */
    public String getDestinationPass() {
        return destinationPass;
    }

    /** 
     * Set the 'DestinationPass' element value. Количество пассажиров выходящих  в аэропорту назначения
     * 
     * @param destinationPass
     */
    public void setDestinationPass(String destinationPass) {
        this.destinationPass = destinationPass;
    }

    /** 
     * Get the 'TransferDestinationPass' element value. Количество трансфертных пассажиров в аэропорту назначения
     * 
     * @return value
     */
    public String getTransferDestinationPass() {
        return transferDestinationPass;
    }

    /** 
     * Set the 'TransferDestinationPass' element value. Количество трансфертных пассажиров в аэропорту назначения
     * 
     * @param transferDestinationPass
     */
    public void setTransferDestinationPass(String transferDestinationPass) {
        this.transferDestinationPass = transferDestinationPass;
    }
}
