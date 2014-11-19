
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * ����������� ��� ��� �������� �����������-�����������
 */
public class WHCarrierType extends OrganizationBaseType
{
    private String countryCode;
    private WHAddressType address;
    private PersonBaseType carrierPerson;

    /** 
     * Get the 'CountryCode' element value. �������� ��� ������ ����������� (�� ����������� ����)
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. �������� ��� ������ ����������� (�� ����������� ����)
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'Address' element value. ����� ����, �����������  ������ �� ��
     * 
     * @return value
     */
    public WHAddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. ����� ����, �����������  ������ �� ��
     * 
     * @param address
     */
    public void setAddress(WHAddressType address) {
        this.address = address;
    }

    /** 
     * Get the 'CarrierPerson' element value. ������������� �����������
     * 
     * @return value
     */
    public PersonBaseType getCarrierPerson() {
        return carrierPerson;
    }

    /** 
     * Set the 'CarrierPerson' element value. ������������� �����������
     * 
     * @param carrierPerson
     */
    public void setCarrierPerson(PersonBaseType carrierPerson) {
        this.carrierPerson = carrierPerson;
    }
}
