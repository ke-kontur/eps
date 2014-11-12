
package ru.acs.fts.schemas.album.billoflading;

/** 
 * ����� ���������/�������� �����
 */
public class ReceiptOrDeliveryPlaceType
{
    private String city;
    private String countryName;

    /** 
     * Get the 'City' element value. �����
     * 
     * @return value
     */
    public String getCity() {
        return city;
    }

    /** 
     * Set the 'City' element value. �����
     * 
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /** 
     * Get the 'CountryName' element value. ������������ ������
     * 
     * @return value
     */
    public String getCountryName() {
        return countryName;
    }

    /** 
     * Set the 'CountryName' element value. ������������ ������
     * 
     * @param countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
