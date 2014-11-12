
package ru.acs.fts.schemas.album.applicationstore;

/** 
 * �������� � ����������
 */
public class TransportInformType extends TransportMeansType
{
    private PlaceInformType place;

    /** 
     * Get the 'Place' element value. �������� � ����� ����������
     * 
     * @return value
     */
    public PlaceInformType getPlace() {
        return place;
    }

    /** 
     * Set the 'Place' element value. �������� � ����� ����������
     * 
     * @param place
     */
    public void setPlace(PlaceInformType place) {
        this.place = place;
    }
}
