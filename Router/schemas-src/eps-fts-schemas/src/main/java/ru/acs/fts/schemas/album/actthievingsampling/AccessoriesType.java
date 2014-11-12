
package ru.acs.fts.schemas.album.actthievingsampling;

/** 
 * Принадлежность предметов пробу или образцов, которых берут
 */
public class AccessoriesType
{
    private String locationObject;
    private String departure;
    private String arrival;
    private AccessoriesOrganizationType accessoriesOrganization;
    private AccessoriesPersonType accessoriesPerson;

    /** 
     * Get the 'LocationObject' element value. Нахождение предметов (в ручной клади, багаже, почтовом отправлении №, вагон и т.д.)
     * 
     * @return value
     */
    public String getLocationObject() {
        return locationObject;
    }

    /** 
     * Set the 'LocationObject' element value. Нахождение предметов (в ручной клади, багаже, почтовом отправлении №, вагон и т.д.)
     * 
     * @param locationObject
     */
    public void setLocationObject(String locationObject) {
        this.locationObject = locationObject;
    }

    /** 
     * Get the 'Departure' element value. Страна отправления
     * 
     * @return value
     */
    public String getDeparture() {
        return departure;
    }

    /** 
     * Set the 'Departure' element value. Страна отправления
     * 
     * @param departure
     */
    public void setDeparture(String departure) {
        this.departure = departure;
    }

    /** 
     * Get the 'Arrival' element value. Страна прибытия
     * 
     * @return value
     */
    public String getArrival() {
        return arrival;
    }

    /** 
     * Set the 'Arrival' element value. Страна прибытия
     * 
     * @param arrival
     */
    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    /** 
     * Get the 'AccessoriesOrganization' element value. Организация, которой  принадлежат предметы. 
     * 
     * @return value
     */
    public AccessoriesOrganizationType getAccessoriesOrganization() {
        return accessoriesOrganization;
    }

    /** 
     * Set the 'AccessoriesOrganization' element value. Организация, которой  принадлежат предметы. 
     * 
     * @param accessoriesOrganization
     */
    public void setAccessoriesOrganization(
            AccessoriesOrganizationType accessoriesOrganization) {
        this.accessoriesOrganization = accessoriesOrganization;
    }

    /** 
     * Get the 'AccessoriesPerson' element value. Лицо, которому  принадлежат предметы 
     * 
     * @return value
     */
    public AccessoriesPersonType getAccessoriesPerson() {
        return accessoriesPerson;
    }

    /** 
     * Set the 'AccessoriesPerson' element value. Лицо, которому  принадлежат предметы 
     * 
     * @param accessoriesPerson
     */
    public void setAccessoriesPerson(AccessoriesPersonType accessoriesPerson) {
        this.accessoriesPerson = accessoriesPerson;
    }
}
