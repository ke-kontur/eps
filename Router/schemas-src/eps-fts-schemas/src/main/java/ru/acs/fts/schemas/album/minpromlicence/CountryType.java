
package ru.acs.fts.schemas.album.minpromlicence;

/** 
 * ���������� � ������
 */
public class CountryType
{
    private String countryName;
    private String countryAlpha2;

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

    /** 
     * Get the 'CountryAlpha2' element value. ��� �����-2 ������
     * 
     * @return value
     */
    public String getCountryAlpha2() {
        return countryAlpha2;
    }

    /** 
     * Set the 'CountryAlpha2' element value. ��� �����-2 ������
     * 
     * @param countryAlpha2
     */
    public void setCountryAlpha2(String countryAlpha2) {
        this.countryAlpha2 = countryAlpha2;
    }
}
