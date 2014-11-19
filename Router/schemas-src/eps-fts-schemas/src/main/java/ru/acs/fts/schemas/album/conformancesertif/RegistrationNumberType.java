
package ru.acs.fts.schemas.album.conformancesertif;

/** 
 * ��������������� �����
 */
public class RegistrationNumberType
{
    private String sertifNumber;
    private String customsCountryCode;

    /** 
     * Get the 'SertifNumber' element value. ����� �����������
     * 
     * @return value
     */
    public String getSertifNumber() {
        return sertifNumber;
    }

    /** 
     * Set the 'SertifNumber' element value. ����� �����������
     * 
     * @param sertifNumber
     */
    public void setSertifNumber(String sertifNumber) {
        this.sertifNumber = sertifNumber;
    }

    /** 
     * Get the 'CustomsCountryCode' element value. ��� ����������� ����� ����������� �����. 
     * 
     * @return value
     */
    public String getCustomsCountryCode() {
        return customsCountryCode;
    }

    /** 
     * Set the 'CustomsCountryCode' element value. ��� ����������� ����� ����������� �����. 
     * 
     * @param customsCountryCode
     */
    public void setCustomsCountryCode(String customsCountryCode) {
        this.customsCountryCode = customsCountryCode;
    }
}
