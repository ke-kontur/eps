
package ru.acs.fts.schemas.album.exportdiamondscertificate;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * �������� � �����������
 */
public class OrganizationInfoType extends OrganizationBaseType
{
    private String countryName;
    private String countryCodeN;
    private String countryCodeA;

    /** 
     * Get the 'CountryName' element value. ������������ ������
     * 
     * @return value
     */
    public String getCountryName() {
        return countryName;
    }

    /** 
     * Set the 'CountryName' element value. ������������ ������
     * 
     * @param countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /** 
     * Get the 'CountryCodeN' element value. �������� ��� ������
     * 
     * @return value
     */
    public String getCountryCodeN() {
        return countryCodeN;
    }

    /** 
     * Set the 'CountryCodeN' element value. �������� ��� ������
     * 
     * @param countryCodeN
     */
    public void setCountryCodeN(String countryCodeN) {
        this.countryCodeN = countryCodeN;
    }

    /** 
     * Get the 'CountryCodeA' element value. ��������� ��� ������
     * 
     * @return value
     */
    public String getCountryCodeA() {
        return countryCodeA;
    }

    /** 
     * Set the 'CountryCodeA' element value. ��������� ��� ������
     * 
     * @param countryCodeA
     */
    public void setCountryCodeA(String countryCodeA) {
        this.countryCodeA = countryCodeA;
    }
}
