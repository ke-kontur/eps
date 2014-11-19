
package ru.acs.fts.schemas.album.contractdealpassport;

/** 
 * ��������� ����������� (������������)
 */
public class NonresidentType
{
    private String name;
    private String countryCode;
    private String countryName;

    /** 
     * Get the 'Name' element value. ������������ ����������� �� ������������ ��������
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. ������������ ����������� �� ������������ ��������
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'CountryCode' element value. �������� ��� ������
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. �������� ��� ������
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'CountryName' element value. ������������ ������ ����� ���������� / ����� ����������.
     * 
     * @return value
     */
    public String getCountryName() {
        return countryName;
    }

    /** 
     * Set the 'CountryName' element value. ������������ ������ ����� ���������� / ����� ����������.
     * 
     * @param countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
