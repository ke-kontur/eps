
package ru.acs.fts.schemas.album.kdtout_cu;

import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUConsigmentType;

/** 
 * �������� � ��������� ������� ��. 15, 15�, 17,17�, 18, 19, 21, 25, 26, 29, 53, 55
 */
public class KDTConsigmentType extends CUConsigmentType
{
    private KDTDepartureArrivalTransportType KDToutDepartureArrivalTransport;
    private KDTBorderTransportType KDToutBorderTransport;

    /** 
     * Get the 'KDToutDepartureArrivalTransport' element value. ������������ �������� ��� ��������/������. ��. 18,26  ���
     * 
     * @return value
     */
    public KDTDepartureArrivalTransportType getKDToutDepartureArrivalTransport() {
        return KDToutDepartureArrivalTransport;
    }

    /** 
     * Set the 'KDToutDepartureArrivalTransport' element value. ������������ �������� ��� ��������/������. ��. 18,26  ���
     * 
     * @param KDToutDepartureArrivalTransport
     */
    public void setKDToutDepartureArrivalTransport(
            KDTDepartureArrivalTransportType KDToutDepartureArrivalTransport) {
        this.KDToutDepartureArrivalTransport = KDToutDepartureArrivalTransport;
    }

    /** 
     * Get the 'KDToutBorderTransport' element value. ������������ �������� �� �������. ��. 21, 25  ���
     * 
     * @return value
     */
    public KDTBorderTransportType getKDToutBorderTransport() {
        return KDToutBorderTransport;
    }

    /** 
     * Set the 'KDToutBorderTransport' element value. ������������ �������� �� �������. ��. 21, 25  ���
     * 
     * @param KDToutBorderTransport
     */
    public void setKDToutBorderTransport(
            KDTBorderTransportType KDToutBorderTransport) {
        this.KDToutBorderTransport = KDToutBorderTransport;
    }
}
