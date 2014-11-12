
package ru.acs.fts.schemas.album.transportdeclaration;

/** 
 * �������
 */
public class RouteType
{
    private String destinationCountry;
    private String destinationCountryCode;
    private String destinationPlace;

    /** 
     * Get the 'DestinationCountry' element value. ������ ����������
     * 
     * @return value
     */
    public String getDestinationCountry() {
        return destinationCountry;
    }

    /** 
     * Set the 'DestinationCountry' element value. ������ ����������
     * 
     * @param destinationCountry
     */
    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    /** 
     * Get the 'DestinationCountryCode' element value. ��� ������ ����������
     * 
     * @return value
     */
    public String getDestinationCountryCode() {
        return destinationCountryCode;
    }

    /** 
     * Set the 'DestinationCountryCode' element value. ��� ������ ����������
     * 
     * @param destinationCountryCode
     */
    public void setDestinationCountryCode(String destinationCountryCode) {
        this.destinationCountryCode = destinationCountryCode;
    }

    /** 
     * Get the 'DestinationPlace' element value. ����� ���������� (����� �����)
     * 
     * @return value
     */
    public String getDestinationPlace() {
        return destinationPlace;
    }

    /** 
     * Set the 'DestinationPlace' element value. ����� ���������� (����� �����)
     * 
     * @param destinationPlace
     */
    public void setDestinationPlace(String destinationPlace) {
        this.destinationPlace = destinationPlace;
    }
}
