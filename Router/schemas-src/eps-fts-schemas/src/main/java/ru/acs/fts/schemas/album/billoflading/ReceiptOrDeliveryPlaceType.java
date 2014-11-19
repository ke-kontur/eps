
package ru.acs.fts.schemas.album.billoflading;

/** 
 * Место получения/доставки груза
 */
public class ReceiptOrDeliveryPlaceType
{
    private String city;
    private String countryName;

    /** 
     * Get the 'City' element value. Город
     * 
     * @return value
     */
    public String getCity() {
        return city;
    }

    /** 
     * Set the 'City' element value. Город
     * 
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /** 
     * Get the 'CountryName' element value. Наименование страны
     * 
     * @return value
     */
    public String getCountryName() {
        return countryName;
    }

    /** 
     * Set the 'CountryName' element value. Наименование страны
     * 
     * @param countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
