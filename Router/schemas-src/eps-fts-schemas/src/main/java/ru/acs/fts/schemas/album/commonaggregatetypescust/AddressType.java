
package ru.acs.fts.schemas.album.commonaggregatetypescust;

/** 
 * ����� ����������� / ����������� ����
 */
public class AddressType
{
    private String postalCode;
    private String countryCode;
    private String counryName;
    private String region;
    private String city;
    private String streetHouse;

    /** 
     * Get the 'PostalCode' element value. �������� ������
     * 
     * @return value
     */
    public String getPostalCode() {
        return postalCode;
    }

    /** 
     * Set the 'PostalCode' element value. �������� ������
     * 
     * @param postalCode
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /** 
     * Get the 'CountryCode' element value. ��������� ��� ������ � ������������ � ��������������� ����� ����
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. ��������� ��� ������ � ������������ � ��������������� ����� ����
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'CounryName' element value. ������� �������� ������ � ������������ � ��������������� ����� ����
     * 
     * @return value
     */
    public String getCounryName() {
        return counryName;
    }

    /** 
     * Set the 'CounryName' element value. ������� �������� ������ � ������������ � ��������������� ����� ����
     * 
     * @param counryName
     */
    public void setCounryName(String counryName) {
        this.counryName = counryName;
    }

    /** 
     * Get the 'Region' element value. ������� (������, ����, ��������� � �.�.)
     * 
     * @return value
     */
    public String getRegion() {
        return region;
    }

    /** 
     * Set the 'Region' element value. ������� (������, ����, ��������� � �.�.)
     * 
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /** 
     * Get the 'City' element value. ���������� �����
     * 
     * @return value
     */
    public String getCity() {
        return city;
    }

    /** 
     * Set the 'City' element value. ���������� �����
     * 
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /** 
     * Get the 'StreetHouse' element value. �����, ����� ����, ����� �����
     * 
     * @return value
     */
    public String getStreetHouse() {
        return streetHouse;
    }

    /** 
     * Set the 'StreetHouse' element value. �����, ����� ����, ����� �����
     * 
     * @param streetHouse
     */
    public void setStreetHouse(String streetHouse) {
        this.streetHouse = streetHouse;
    }
}
