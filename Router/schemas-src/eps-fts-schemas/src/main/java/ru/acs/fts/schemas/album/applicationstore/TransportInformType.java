
package ru.acs.fts.schemas.album.applicationstore;

/** 
 * Сведения о транспорте
 */
public class TransportInformType extends TransportMeansType
{
    private PlaceInformType place;

    /** 
     * Get the 'Place' element value. Сведения о месте назначения
     * 
     * @return value
     */
    public PlaceInformType getPlace() {
        return place;
    }

    /** 
     * Set the 'Place' element value. Сведения о месте назначения
     * 
     * @param place
     */
    public void setPlace(PlaceInformType place) {
        this.place = place;
    }
}
