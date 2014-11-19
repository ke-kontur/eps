
package ru.acs.fts.schemas.album.ktdin;

import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUConsigmentType;

/** 
 * �������� � ��������� ������� ��. 15, 15�, 17,17�, 18, 19, 21, 25, 26, 29, 53, 
 */
public class KTDinConsigmentType extends CUConsigmentType
{
    private String digitDispatchCountryCode;
    private String digitDestinationCountryCode;
    private KTDinDepartureArrivalTransportType KTDinDepartureArrivalTransport;
    private KTDinBorderTransportType KTDinBorderTransportMeans;

    /** 
     * Get the 'DigitDispatchCountryCode' element value. ������ ����������� (�������� ���).
     * 
     * @return value
     */
    public String getDigitDispatchCountryCode() {
        return digitDispatchCountryCode;
    }

    /** 
     * Set the 'DigitDispatchCountryCode' element value. ������ ����������� (�������� ���).
     * 
     * @param digitDispatchCountryCode
     */
    public void setDigitDispatchCountryCode(String digitDispatchCountryCode) {
        this.digitDispatchCountryCode = digitDispatchCountryCode;
    }

    /** 
     * Get the 'DigitDestinationCountryCode' element value. ������ ����������  (�������� ���)
     * 
     * @return value
     */
    public String getDigitDestinationCountryCode() {
        return digitDestinationCountryCode;
    }

    /** 
     * Set the 'DigitDestinationCountryCode' element value. ������ ����������  (�������� ���)
     * 
     * @param digitDestinationCountryCode
     */
    public void setDigitDestinationCountryCode(
            String digitDestinationCountryCode) {
        this.digitDestinationCountryCode = digitDestinationCountryCode;
    }

    /** 
     * Get the 'KTDinDepartureArrivalTransport' element value. ���. ���������� ������. ������������ �������� ��� ��������/������. ��. 18, 26 ��
     * 
     * @return value
     */
    public KTDinDepartureArrivalTransportType getKTDinDepartureArrivalTransport() {
        return KTDinDepartureArrivalTransport;
    }

    /** 
     * Set the 'KTDinDepartureArrivalTransport' element value. ���. ���������� ������. ������������ �������� ��� ��������/������. ��. 18, 26 ��
     * 
     * @param KTDinDepartureArrivalTransport
     */
    public void setKTDinDepartureArrivalTransport(
            KTDinDepartureArrivalTransportType KTDinDepartureArrivalTransport) {
        this.KTDinDepartureArrivalTransport = KTDinDepartureArrivalTransport;
    }

    /** 
     * Get the 'KTDinBorderTransportMeans' element value. ���. ���������� ������. ������������ �������� �� �������. ��. 21, 25 ��
     * 
     * @return value
     */
    public KTDinBorderTransportType getKTDinBorderTransportMeans() {
        return KTDinBorderTransportMeans;
    }

    /** 
     * Set the 'KTDinBorderTransportMeans' element value. ���. ���������� ������. ������������ �������� �� �������. ��. 21, 25 ��
     * 
     * @param KTDinBorderTransportMeans
     */
    public void setKTDinBorderTransportMeans(
            KTDinBorderTransportType KTDinBorderTransportMeans) {
        this.KTDinBorderTransportMeans = KTDinBorderTransportMeans;
    }
}
