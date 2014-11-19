
package ru.acs.fts.schemas.album.preliminarytnvedcode;

/** 
 * ��������������� �����
 */
public class RegistrationNumberType
{
    private String countryCode;
    private String customsCode;
    private String year;
    private String serialNumber;

    /** 
     * Get the 'CountryCode' element value. ��� ����������� 
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. ��� ����������� 
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'CustomsCode' element value. ��� ����������� ������ 
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. ��� ����������� ������ 
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'Year' element value. ��������� ����� ���� �������� ���������������� ������� 
     * 
     * @return value
     */
    public String getYear() {
        return year;
    }

    /** 
     * Set the 'Year' element value. ��������� ����� ���� �������� ���������������� ������� 
     * 
     * @param year
     */
    public void setYear(String year) {
        this.year = year;
    }

    /** 
     * Get the 'SerialNumber' element value. ���������� ��������� ����� ���������������� ������� �� ������������� ������ � ������������ ����
     * 
     * @return value
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /** 
     * Set the 'SerialNumber' element value. ���������� ��������� ����� ���������������� ������� �� ������������� ������ � ������������ ����
     * 
     * @param serialNumber
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
