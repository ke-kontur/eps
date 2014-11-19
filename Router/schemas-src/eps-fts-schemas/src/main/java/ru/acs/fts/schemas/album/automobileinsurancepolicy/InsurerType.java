
package ru.acs.fts.schemas.album.automobileinsurancepolicy;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;

/** 
 * �������� � ������������
 */
public class InsurerType
{
    private String name;
    private String countryCode;
    private String phone;
    private String naturalPersonIndicator;
    private AddressType postalAddress;
    private IdentityCardType identityCard;

    /** 
     * Get the 'Name' element value. ��� ����������� ����/������������ �����������
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. ��� ����������� ����/������������ �����������
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'CountryCode' element value. ����������� ����������� ���� ��� ������ ����������� �����������
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. ����������� ����������� ���� ��� ������ ����������� �����������
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'Phone' element value. �������
     * 
     * @return value
     */
    public String getPhone() {
        return phone;
    }

    /** 
     * Set the 'Phone' element value. �������
     * 
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /** 
     * Get the 'NaturalPersonIndicator' element value. ��������� ���� ������������, ����������� � ������, ���� ������������ - ���������� ����
     * 
     * @return value
     */
    public String getNaturalPersonIndicator() {
        return naturalPersonIndicator;
    }

    /** 
     * Set the 'NaturalPersonIndicator' element value. ��������� ���� ������������, ����������� � ������, ���� ������������ - ���������� ����
     * 
     * @param naturalPersonIndicator
     */
    public void setNaturalPersonIndicator(String naturalPersonIndicator) {
        this.naturalPersonIndicator = naturalPersonIndicator;
    }

    /** 
     * Get the 'PostalAddress' element value. �������� ��������� ������ ������������
     * 
     * @return value
     */
    public AddressType getPostalAddress() {
        return postalAddress;
    }

    /** 
     * Set the 'PostalAddress' element value. �������� ��������� ������ ������������
     * 
     * @param postalAddress
     */
    public void setPostalAddress(AddressType postalAddress) {
        this.postalAddress = postalAddress;
    }

    /** 
     * Get the 'IdentityCard' element value. �������� ��������� ��������������� �������� 
     * 
     * @return value
     */
    public IdentityCardType getIdentityCard() {
        return identityCard;
    }

    /** 
     * Set the 'IdentityCard' element value. �������� ��������� ��������������� �������� 
     * 
     * @param identityCard
     */
    public void setIdentityCard(IdentityCardType identityCard) {
        this.identityCard = identityCard;
    }
}
