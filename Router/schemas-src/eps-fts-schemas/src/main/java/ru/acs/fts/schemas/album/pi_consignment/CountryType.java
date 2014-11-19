
package ru.acs.fts.schemas.album.pi_consignment;

/** 
 * ������
 */
public class CountryType
{
    private String countryCode;
    private String countryName;

    /** 
     * Get the 'CountryCode' element value. ��������� ��� ������ �� �������������� ����� ���� / 00 (����������)
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. ��������� ��� ������ �� �������������� ����� ���� / 00 (����������)
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'CountryName' element value. ������� �������� ������
     * 
     * @return value
     */
    public String getCountryName() {
        return countryName;
    }

    /** 
     * Set the 'CountryName' element value. ������� �������� ������
     * 
     * @param countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
