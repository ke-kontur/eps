
package ru.acs.fts.schemas.album.declarationconformity;

/** 
 * ��������������� �����
 */
public class RegistrationNumberType
{
    private String serialNumber;
    private String customsCountryCode;

    /** 
     * Get the 'SerialNumber' element value. ����� ���������� � ������������
     * 
     * @return value
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /** 
     * Set the 'SerialNumber' element value. ����� ���������� � ������������
     * 
     * @param serialNumber
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /** 
     * Get the 'CustomsCountryCode' element value. ��� ����������� ����� ����������� �����
     * 
     * @return value
     */
    public String getCustomsCountryCode() {
        return customsCountryCode;
    }

    /** 
     * Set the 'CustomsCountryCode' element value. ��� ����������� ����� ����������� �����
     * 
     * @param customsCountryCode
     */
    public void setCustomsCountryCode(String customsCountryCode) {
        this.customsCountryCode = customsCountryCode;
    }
}
