
package ru.acs.fts.schemas.album.priorcommonaggregatetypescust;

/** 
 * Место назначения товаров: Наименование места/код наименование ЖД станции
 */
public class PIDestinationPlaceType
{
    private String destinationRWStationCode;
    private String destinationRWStationName;
    private String destinantionPlaceName;

    /** 
     * Get the 'DestinationRWStationCode' element value. Код ж/д станции назначения
     * 
     * @return value
     */
    public String getDestinationRWStationCode() {
        return destinationRWStationCode;
    }

    /** 
     * Set the 'DestinationRWStationCode' element value. Код ж/д станции назначения
     * 
     * @param destinationRWStationCode
     */
    public void setDestinationRWStationCode(String destinationRWStationCode) {
        this.destinationRWStationCode = destinationRWStationCode;
    }

    /** 
     * Get the 'DestinationRWStationName' element value. Наименование железнодорожной станции назначения
     * 
     * @return value
     */
    public String getDestinationRWStationName() {
        return destinationRWStationName;
    }

    /** 
     * Set the 'DestinationRWStationName' element value. Наименование железнодорожной станции назначения
     * 
     * @param destinationRWStationName
     */
    public void setDestinationRWStationName(String destinationRWStationName) {
        this.destinationRWStationName = destinationRWStationName;
    }

    /** 
     * Get the 'DestinantionPlaceName' element value. Наименование места назначения
     * 
     * @return value
     */
    public String getDestinantionPlaceName() {
        return destinantionPlaceName;
    }

    /** 
     * Set the 'DestinantionPlaceName' element value. Наименование места назначения
     * 
     * @param destinantionPlaceName
     */
    public void setDestinantionPlaceName(String destinantionPlaceName) {
        this.destinantionPlaceName = destinantionPlaceName;
    }
}
