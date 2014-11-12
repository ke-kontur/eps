
package ru.acs.fts.schemas.album.ktdin;

import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUConsigmentType;

/** 
 * Сведения о перевозке товаров гр. 15, 15а, 17,17а, 18, 19, 21, 25, 26, 29, 53, 
 */
public class KTDinConsigmentType extends CUConsigmentType
{
    private String digitDispatchCountryCode;
    private String digitDestinationCountryCode;
    private KTDinDepartureArrivalTransportType KTDinDepartureArrivalTransport;
    private KTDinBorderTransportType KTDinBorderTransportMeans;

    /** 
     * Get the 'DigitDispatchCountryCode' element value. Страна отправления (цифровой код).
     * 
     * @return value
     */
    public String getDigitDispatchCountryCode() {
        return digitDispatchCountryCode;
    }

    /** 
     * Set the 'DigitDispatchCountryCode' element value. Страна отправления (цифровой код).
     * 
     * @param digitDispatchCountryCode
     */
    public void setDigitDispatchCountryCode(String digitDispatchCountryCode) {
        this.digitDispatchCountryCode = digitDispatchCountryCode;
    }

    /** 
     * Get the 'DigitDestinationCountryCode' element value. Страна назначения  (цифровой код)
     * 
     * @return value
     */
    public String getDigitDestinationCountryCode() {
        return digitDestinationCountryCode;
    }

    /** 
     * Set the 'DigitDestinationCountryCode' element value. Страна назначения  (цифровой код)
     * 
     * @param digitDestinationCountryCode
     */
    public void setDigitDestinationCountryCode(
            String digitDestinationCountryCode) {
        this.digitDestinationCountryCode = digitDestinationCountryCode;
    }

    /** 
     * Get the 'KTDinDepartureArrivalTransport' element value. КДТ. Внутренний формат. Транспортные средства при прибытии/убытии. Гр. 18, 26 ДТ
     * 
     * @return value
     */
    public KTDinDepartureArrivalTransportType getKTDinDepartureArrivalTransport() {
        return KTDinDepartureArrivalTransport;
    }

    /** 
     * Set the 'KTDinDepartureArrivalTransport' element value. КДТ. Внутренний формат. Транспортные средства при прибытии/убытии. Гр. 18, 26 ДТ
     * 
     * @param KTDinDepartureArrivalTransport
     */
    public void setKTDinDepartureArrivalTransport(
            KTDinDepartureArrivalTransportType KTDinDepartureArrivalTransport) {
        this.KTDinDepartureArrivalTransport = KTDinDepartureArrivalTransport;
    }

    /** 
     * Get the 'KTDinBorderTransportMeans' element value. КДТ. Внутренний формат. Транспортные средства на границе. Гр. 21, 25 ДТ
     * 
     * @return value
     */
    public KTDinBorderTransportType getKTDinBorderTransportMeans() {
        return KTDinBorderTransportMeans;
    }

    /** 
     * Set the 'KTDinBorderTransportMeans' element value. КДТ. Внутренний формат. Транспортные средства на границе. Гр. 21, 25 ДТ
     * 
     * @param KTDinBorderTransportMeans
     */
    public void setKTDinBorderTransportMeans(
            KTDinBorderTransportType KTDinBorderTransportMeans) {
        this.KTDinBorderTransportMeans = KTDinBorderTransportMeans;
    }
}
