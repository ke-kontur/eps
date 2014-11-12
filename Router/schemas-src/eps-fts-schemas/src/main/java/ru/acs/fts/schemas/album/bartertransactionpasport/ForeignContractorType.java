
package ru.acs.fts.schemas.album.bartertransactionpasport;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * ��������� ������������ �����������
 */
public class ForeignContractorType
{
    private String name;
    private String countryCode;
    private AddressType legalAddress;

    /** 
     * Get the 'Name' element value. ������������ ������������ �����������
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. ������������ ������������ �����������
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'CountryCode' element value. ��� ������ ����������� �����������
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. ��� ������ ����������� �����������
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'LegalAddress' element value. ����������� �����
     * 
     * @return value
     */
    public AddressType getLegalAddress() {
        return legalAddress;
    }

    /** 
     * Set the 'LegalAddress' element value. ����������� �����
     * 
     * @param legalAddress
     */
    public void setLegalAddress(AddressType legalAddress) {
        this.legalAddress = legalAddress;
    }
}
