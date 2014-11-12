
package ru.acs.fts.schemas.album.licensesubsoiluse;

/** 
 * Регистрационный номер
 */
public class RegistrationNumberType
{
    private String series;
    private String number;
    private String licenseType;

    /** 
     * Get the 'Series' element value. Серия лицензии
     * 
     * @return value
     */
    public String getSeries() {
        return series;
    }

    /** 
     * Set the 'Series' element value. Серия лицензии
     * 
     * @param series
     */
    public void setSeries(String series) {
        this.series = series;
    }

    /** 
     * Get the 'Number' element value. Номер лицензии
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. Номер лицензии
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the 'LicenseType' element value. Вид лицензии
     * 
     * @return value
     */
    public String getLicenseType() {
        return licenseType;
    }

    /** 
     * Set the 'LicenseType' element value. Вид лицензии
     * 
     * @param licenseType
     */
    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }
}
