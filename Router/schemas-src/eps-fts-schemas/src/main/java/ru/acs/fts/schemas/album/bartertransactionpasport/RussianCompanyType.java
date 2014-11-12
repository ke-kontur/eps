
package ru.acs.fts.schemas.album.bartertransactionpasport;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * ��������� ���������� ������� ���������
 */
public class RussianCompanyType
{
    private String name;
    private String OKPOID;
    private String INNID;
    private AddressType postalAddress;

    /** 
     * Get the 'Name' element value. ������������ ����������� ����
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. ������������ ����������� ����
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'OKPOID' element value. ��� ����������� ����  �� ����
     * 
     * @return value
     */
    public String getOKPOID() {
        return OKPOID;
    }

    /** 
     * Set the 'OKPOID' element value. ��� ����������� ����  �� ����
     * 
     * @param OKPOID
     */
    public void setOKPOID(String OKPOID) {
        this.OKPOID = OKPOID;
    }

    /** 
     * Get the 'INNID' element value. �������������� ����� ����������������� 
     * 
     * @return value
     */
    public String getINNID() {
        return INNID;
    }

    /** 
     * Set the 'INNID' element value. �������������� ����� ����������������� 
     * 
     * @param INNID
     */
    public void setINNID(String INNID) {
        this.INNID = INNID;
    }

    /** 
     * Get the 'PostalAddress' element value. ������ ����������� ����� ����������� ����, ������������ �������
     * 
     * @return value
     */
    public AddressType getPostalAddress() {
        return postalAddress;
    }

    /** 
     * Set the 'PostalAddress' element value. ������ ����������� ����� ����������� ����, ������������ �������
     * 
     * @param postalAddress
     */
    public void setPostalAddress(AddressType postalAddress) {
        this.postalAddress = postalAddress;
    }
}
