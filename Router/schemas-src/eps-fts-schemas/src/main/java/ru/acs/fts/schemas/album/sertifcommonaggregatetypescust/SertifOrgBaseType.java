
package ru.acs.fts.schemas.album.sertifcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * ������� �����  ��� �������� ����������� � �����������
 */
public class SertifOrgBaseType extends OrganizationBaseType
{
    private String phone;
    private String fax;
    private String email;
    private AddressType legalAddress;
    private AddressType factAddress;

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
     * Get the 'Fax' element value. �������/����
     * 
     * @return value
     */
    public String getFax() {
        return fax;
    }

    /** 
     * Set the 'Fax' element value. �������/����
     * 
     * @param fax
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /** 
     * Get the 'Email' element value. ����������� �����
     * 
     * @return value
     */
    public String getEmail() {
        return email;
    }

    /** 
     * Set the 'Email' element value. ����������� �����
     * 
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /** 
     * Get the 'LegalAddress' element value. ����������� �����.
     * 
     * @return value
     */
    public AddressType getLegalAddress() {
        return legalAddress;
    }

    /** 
     * Set the 'LegalAddress' element value. ����������� �����.
     * 
     * @param legalAddress
     */
    public void setLegalAddress(AddressType legalAddress) {
        this.legalAddress = legalAddress;
    }

    /** 
     * Get the 'FactAddress' element value. ����������� �����
     * 
     * @return value
     */
    public AddressType getFactAddress() {
        return factAddress;
    }

    /** 
     * Set the 'FactAddress' element value. ����������� �����
     * 
     * @param factAddress
     */
    public void setFactAddress(AddressType factAddress) {
        this.factAddress = factAddress;
    }
}
