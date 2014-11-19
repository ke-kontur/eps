
package ru.acs.fts.schemas.album.cutransportcommonaggregatetypescust;

/** 
 * Место назначения/доставки в МДП
 */
public class TIRDestinationType extends TDDestinationBaseType
{
    private String destinationPlaceName;

    /** 
     * Get the 'DestinationPlaceName' element value. Наименование места назначения
     * 
     * @return value
     */
    public String getDestinationPlaceName() {
        return destinationPlaceName;
    }

    /** 
     * Set the 'DestinationPlaceName' element value. Наименование места назначения
     * 
     * @param destinationPlaceName
     */
    public void setDestinationPlaceName(String destinationPlaceName) {
        this.destinationPlaceName = destinationPlaceName;
    }
}
