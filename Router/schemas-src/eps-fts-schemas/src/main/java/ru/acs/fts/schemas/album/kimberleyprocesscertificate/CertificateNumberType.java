
package ru.acs.fts.schemas.album.kimberleyprocesscertificate;

/** 
 * ���������� ����� �����������
 */
public class CertificateNumberType
{
    private String countryCode;
    private String number;

    /** 
     * Get the 'CountryCode' element value. ��� ������
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. ��� ������
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'Number' element value. ����� �����������
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. ����� �����������
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }
}
