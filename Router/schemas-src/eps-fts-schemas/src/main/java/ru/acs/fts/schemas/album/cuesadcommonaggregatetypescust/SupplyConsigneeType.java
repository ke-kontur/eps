
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * ���������� ��������. ��� ��
 */
public class SupplyConsigneeType extends OrganizationBaseType
{
    private String countryCode;

    /** 
     * Get the 'CountryCode' element value. ��������� ��� ������
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. ��������� ��� ������
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
