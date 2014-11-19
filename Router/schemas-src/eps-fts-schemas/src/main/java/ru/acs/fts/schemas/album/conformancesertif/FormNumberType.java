
package ru.acs.fts.schemas.album.conformancesertif;

/** 
 * ����� ������ �����������
 */
public class FormNumberType
{
    private String number;
    private String customsCountryCode;

    /** 
     * Get the 'Number' element value. �����
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. �����
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
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
