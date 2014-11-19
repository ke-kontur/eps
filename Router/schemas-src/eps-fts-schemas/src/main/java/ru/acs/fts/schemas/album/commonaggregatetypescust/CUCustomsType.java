
package ru.acs.fts.schemas.album.commonaggregatetypescust;

/** 
 * �������� � ���������� ������
 */
public class CUCustomsType extends CustomsType
{
    private String customsCountryCode;

    /** 
     * Get the 'CustomsCountryCode' element value. ��� ����������� - ����� ����������� �����. ����������� �������� ���
     * 
     * @return value
     */
    public String getCustomsCountryCode() {
        return customsCountryCode;
    }

    /** 
     * Set the 'CustomsCountryCode' element value. ��� ����������� - ����� ����������� �����. ����������� �������� ���
     * 
     * @param customsCountryCode
     */
    public void setCustomsCountryCode(String customsCountryCode) {
        this.customsCountryCode = customsCountryCode;
    }
}
