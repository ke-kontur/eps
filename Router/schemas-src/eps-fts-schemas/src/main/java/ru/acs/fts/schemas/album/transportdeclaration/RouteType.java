
package ru.acs.fts.schemas.album.transportdeclaration;

/** 
 * Маршрут
 */
public class RouteType
{
    private String destinationCountry;
    private String destinationCountryCode;
    private String destinationPlace;

    /** 
     * Get the 'DestinationCountry' element value. Страна назначения
     * 
     * @return value
     */
    public String getDestinationCountry() {
        return destinationCountry;
    }

    /** 
     * Set the 'DestinationCountry' element value. Страна назначения
     * 
     * @param destinationCountry
     */
    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    /** 
     * Get the 'DestinationCountryCode' element value. Код страны назначения
     * 
     * @return value
     */
    public String getDestinationCountryCode() {
        return destinationCountryCode;
    }

    /** 
     * Set the 'DestinationCountryCode' element value. Код страны назначения
     * 
     * @param destinationCountryCode
     */
    public void setDestinationCountryCode(String destinationCountryCode) {
        this.destinationCountryCode = destinationCountryCode;
    }

    /** 
     * Get the 'DestinationPlace' element value. Пункт назначения (номер рейса)
     * 
     * @return value
     */
    public String getDestinationPlace() {
        return destinationPlace;
    }

    /** 
     * Set the 'DestinationPlace' element value. Пункт назначения (номер рейса)
     * 
     * @param destinationPlace
     */
    public void setDestinationPlace(String destinationPlace) {
        this.destinationPlace = destinationPlace;
    }
}
