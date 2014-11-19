
package ru.acs.fts.schemas.album.kdtout_cu;

import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUConsigmentType;

/** 
 * Сведения о перевозке товаров гр. 15, 15а, 17,17а, 18, 19, 21, 25, 26, 29, 53, 55
 */
public class KDTConsigmentType extends CUConsigmentType
{
    private KDTDepartureArrivalTransportType KDToutDepartureArrivalTransport;
    private KDTBorderTransportType KDToutBorderTransport;

    /** 
     * Get the 'KDToutDepartureArrivalTransport' element value. Транспортные средства при прибытии/убытии. Гр. 18,26  КДТ
     * 
     * @return value
     */
    public KDTDepartureArrivalTransportType getKDToutDepartureArrivalTransport() {
        return KDToutDepartureArrivalTransport;
    }

    /** 
     * Set the 'KDToutDepartureArrivalTransport' element value. Транспортные средства при прибытии/убытии. Гр. 18,26  КДТ
     * 
     * @param KDToutDepartureArrivalTransport
     */
    public void setKDToutDepartureArrivalTransport(
            KDTDepartureArrivalTransportType KDToutDepartureArrivalTransport) {
        this.KDToutDepartureArrivalTransport = KDToutDepartureArrivalTransport;
    }

    /** 
     * Get the 'KDToutBorderTransport' element value. Транспортные средства на границе. Гр. 21, 25  КДТ
     * 
     * @return value
     */
    public KDTBorderTransportType getKDToutBorderTransport() {
        return KDToutBorderTransport;
    }

    /** 
     * Set the 'KDToutBorderTransport' element value. Транспортные средства на границе. Гр. 21, 25  КДТ
     * 
     * @param KDToutBorderTransport
     */
    public void setKDToutBorderTransport(
            KDTBorderTransportType KDToutBorderTransport) {
        this.KDToutBorderTransport = KDToutBorderTransport;
    }
}
