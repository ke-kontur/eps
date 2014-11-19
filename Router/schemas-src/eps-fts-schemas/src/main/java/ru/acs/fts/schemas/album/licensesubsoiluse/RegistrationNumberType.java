
package ru.acs.fts.schemas.album.licensesubsoiluse;

/** 
 * ��������������� �����
 */
public class RegistrationNumberType
{
    private String series;
    private String number;
    private String licenseType;

    /** 
     * Get the 'Series' element value. ����� ��������
     * 
     * @return value
     */
    public String getSeries() {
        return series;
    }

    /** 
     * Set the 'Series' element value. ����� ��������
     * 
     * @param series
     */
    public void setSeries(String series) {
        this.series = series;
    }

    /** 
     * Get the 'Number' element value. ����� ��������
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. ����� ��������
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the 'LicenseType' element value. ��� ��������
     * 
     * @return value
     */
    public String getLicenseType() {
        return licenseType;
    }

    /** 
     * Set the 'LicenseType' element value. ��� ��������
     * 
     * @param licenseType
     */
    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }
}
