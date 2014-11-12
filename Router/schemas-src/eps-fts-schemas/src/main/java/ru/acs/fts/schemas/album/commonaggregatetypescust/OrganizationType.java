
package ru.acs.fts.schemas.album.commonaggregatetypescust;

/** 
 * �������� �� �����������
 */
public class OrganizationType extends OrganizationBaseType
{
    private String OKPOID;
    private String OKATOCode;
    private AddressType address;
    private ContactType contact;

    /** 
     * Get the 'OKPOID' element value. ��� ����������� �� ����
     * 
     * @return value
     */
    public String getOKPOID() {
        return OKPOID;
    }

    /** 
     * Set the 'OKPOID' element value. ��� ����������� �� ����
     * 
     * @param OKPOID
     */
    public void setOKPOID(String OKPOID) {
        this.OKPOID = OKPOID;
    }

    /** 
     * Get the 'OKATOCode' element value. ��� �����
     * 
     * @return value
     */
    public String getOKATOCode() {
        return OKATOCode;
    }

    /** 
     * Set the 'OKATOCode' element value. ��� �����
     * 
     * @param OKATOCode
     */
    public void setOKATOCode(String OKATOCode) {
        this.OKATOCode = OKATOCode;
    }

    /** 
     * Get the 'Address' element value. ����� 
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. ����� 
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }

    /** 
     * Get the 'Contact' element value. ���������� ����������
     * 
     * @return value
     */
    public ContactType getContact() {
        return contact;
    }

    /** 
     * Set the 'Contact' element value. ���������� ����������
     * 
     * @param contact
     */
    public void setContact(ContactType contact) {
        this.contact = contact;
    }
}
