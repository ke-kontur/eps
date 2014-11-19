
package ru.acs.fts.schemas.album.stopgoodsdec;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * �������� � ���������� ������
 */
public class CustomsInfoType extends CustomsType
{
    private String phone;
    private String fax;
    private String telex;
    private String email;
    private AddressType customsAddress;

    /** 
     * Get the 'Phone' element value. ����� ��������.
     * 
     * @return value
     */
    public String getPhone() {
        return phone;
    }

    /** 
     * Set the 'Phone' element value. ����� ��������.
     * 
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /** 
     * Get the 'Fax' element value. ����� �����.
     * 
     * @return value
     */
    public String getFax() {
        return fax;
    }

    /** 
     * Set the 'Fax' element value. ����� �����.
     * 
     * @param fax
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /** 
     * Get the 'Telex' element value. ����� �������.
     * 
     * @return value
     */
    public String getTelex() {
        return telex;
    }

    /** 
     * Set the 'Telex' element value. ����� �������.
     * 
     * @param telex
     */
    public void setTelex(String telex) {
        this.telex = telex;
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
     * Get the 'CustomsAddress' element value. ����� ����������� ������
     * 
     * @return value
     */
    public AddressType getCustomsAddress() {
        return customsAddress;
    }

    /** 
     * Set the 'CustomsAddress' element value. ����� ����������� ������
     * 
     * @param customsAddress
     */
    public void setCustomsAddress(AddressType customsAddress) {
        this.customsAddress = customsAddress;
    }
}
