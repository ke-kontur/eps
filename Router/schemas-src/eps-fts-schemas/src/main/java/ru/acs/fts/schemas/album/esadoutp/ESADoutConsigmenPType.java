
package ru.acs.fts.schemas.album.esadoutp;

/** 
 * Сведения о перевозке товаров
 */
public class ESADoutConsigmenPType
{
    private String dispatchCountryCode;
    private String dispatchCountryName;
    private String destinationCountryCode;
    private String destinationCountryName;
    private ESADoutTransportPType ESADoutTransportP;

    /** 
     * Get the 'DispatchCountryCode' element value. Страна отправления. Буквенный код по общероссийскому классификатору стран мира либо по классификатору экономических союзов и сообществ.
     * 
     * @return value
     */
    public String getDispatchCountryCode() {
        return dispatchCountryCode;
    }

    /** 
     * Set the 'DispatchCountryCode' element value. Страна отправления. Буквенный код по общероссийскому классификатору стран мира либо по классификатору экономических союзов и сообществ.
     * 
     * @param dispatchCountryCode
     */
    public void setDispatchCountryCode(String dispatchCountryCode) {
        this.dispatchCountryCode = dispatchCountryCode;
    }

    /** 
     * Get the 'DispatchCountryName' element value. Страна отправления. Наименование.
     * 
     * @return value
     */
    public String getDispatchCountryName() {
        return dispatchCountryName;
    }

    /** 
     * Set the 'DispatchCountryName' element value. Страна отправления. Наименование.
     * 
     * @param dispatchCountryName
     */
    public void setDispatchCountryName(String dispatchCountryName) {
        this.dispatchCountryName = dispatchCountryName;
    }

    /** 
     * Get the 'DestinationCountryCode' element value. Страна назначения. Буквенный код по общероссийскому классификатору стран мира либо по классификатору экономических союзов и сообществ.
     * 
     * @return value
     */
    public String getDestinationCountryCode() {
        return destinationCountryCode;
    }

    /** 
     * Set the 'DestinationCountryCode' element value. Страна назначения. Буквенный код по общероссийскому классификатору стран мира либо по классификатору экономических союзов и сообществ.
     * 
     * @param destinationCountryCode
     */
    public void setDestinationCountryCode(String destinationCountryCode) {
        this.destinationCountryCode = destinationCountryCode;
    }

    /** 
     * Get the 'DestinationCountryName' element value. Страна назначения. Наименование.
     * 
     * @return value
     */
    public String getDestinationCountryName() {
        return destinationCountryName;
    }

    /** 
     * Set the 'DestinationCountryName' element value. Страна назначения. Наименование.
     * 
     * @param destinationCountryName
     */
    public void setDestinationCountryName(String destinationCountryName) {
        this.destinationCountryName = destinationCountryName;
    }

    /** 
     * Get the 'ESADoutTransportP' element value. Сведения о транспортных средствах
     * 
     * @return value
     */
    public ESADoutTransportPType getESADoutTransportP() {
        return ESADoutTransportP;
    }

    /** 
     * Set the 'ESADoutTransportP' element value. Сведения о транспортных средствах
     * 
     * @param ESADoutTransportP
     */
    public void setESADoutTransportP(ESADoutTransportPType ESADoutTransportP) {
        this.ESADoutTransportP = ESADoutTransportP;
    }
}
