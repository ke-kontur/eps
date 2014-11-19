
package ru.acs.fts.schemas.album.actthievingsampling;

/** 
 * �������������� ��������� ����� ��� ��������, ������� �����
 */
public class AccessoriesType
{
    private String locationObject;
    private String departure;
    private String arrival;
    private AccessoriesOrganizationType accessoriesOrganization;
    private AccessoriesPersonType accessoriesPerson;

    /** 
     * Get the 'LocationObject' element value. ���������� ��������� (� ������ �����, ������, �������� ����������� �, ����� � �.�.)
     * 
     * @return value
     */
    public String getLocationObject() {
        return locationObject;
    }

    /** 
     * Set the 'LocationObject' element value. ���������� ��������� (� ������ �����, ������, �������� ����������� �, ����� � �.�.)
     * 
     * @param locationObject
     */
    public void setLocationObject(String locationObject) {
        this.locationObject = locationObject;
    }

    /** 
     * Get the 'Departure' element value. ������ �����������
     * 
     * @return value
     */
    public String getDeparture() {
        return departure;
    }

    /** 
     * Set the 'Departure' element value. ������ �����������
     * 
     * @param departure
     */
    public void setDeparture(String departure) {
        this.departure = departure;
    }

    /** 
     * Get the 'Arrival' element value. ������ ��������
     * 
     * @return value
     */
    public String getArrival() {
        return arrival;
    }

    /** 
     * Set the 'Arrival' element value. ������ ��������
     * 
     * @param arrival
     */
    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    /** 
     * Get the 'AccessoriesOrganization' element value. �����������, �������  ����������� ��������. 
     * 
     * @return value
     */
    public AccessoriesOrganizationType getAccessoriesOrganization() {
        return accessoriesOrganization;
    }

    /** 
     * Set the 'AccessoriesOrganization' element value. �����������, �������  ����������� ��������. 
     * 
     * @param accessoriesOrganization
     */
    public void setAccessoriesOrganization(
            AccessoriesOrganizationType accessoriesOrganization) {
        this.accessoriesOrganization = accessoriesOrganization;
    }

    /** 
     * Get the 'AccessoriesPerson' element value. ����, ��������  ����������� �������� 
     * 
     * @return value
     */
    public AccessoriesPersonType getAccessoriesPerson() {
        return accessoriesPerson;
    }

    /** 
     * Set the 'AccessoriesPerson' element value. ����, ��������  ����������� �������� 
     * 
     * @param accessoriesPerson
     */
    public void setAccessoriesPerson(AccessoriesPersonType accessoriesPerson) {
        this.accessoriesPerson = accessoriesPerson;
    }
}
