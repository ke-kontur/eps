
package ru.acs.fts.schemas.album.indulgencestatement;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * �������� � ����� ��������� 
 */
public class DeclarantBankType extends OrganizationBaseType
{
    private String BICID;
    private String accountNumeric;
    private String phone;
    private String fax;
    private String telex;
    private String OKPOID;
    private String OKATOCode;
    private AddressType legalAddress;

    /** 
     * Get the 'BICID' element value. ��� �����
     * 
     * @return value
     */
    public String getBICID() {
        return BICID;
    }

    /** 
     * Set the 'BICID' element value. ��� �����
     * 
     * @param BICID
     */
    public void setBICID(String BICID) {
        this.BICID = BICID;
    }

    /** 
     * Get the 'AccountNumeric' element value. ����� ������������������ ����� �����
     * 
     * @return value
     */
    public String getAccountNumeric() {
        return accountNumeric;
    }

    /** 
     * Set the 'AccountNumeric' element value. ����� ������������������ ����� �����
     * 
     * @param accountNumeric
     */
    public void setAccountNumeric(String accountNumeric) {
        this.accountNumeric = accountNumeric;
    }

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
     * Get the 'OKPOID' element value. ��� ����������� �� ����.
     * 
     * @return value
     */
    public String getOKPOID() {
        return OKPOID;
    }

    /** 
     * Set the 'OKPOID' element value. ��� ����������� �� ����.
     * 
     * @param OKPOID
     */
    public void setOKPOID(String OKPOID) {
        this.OKPOID = OKPOID;
    }

    /** 
     * Get the 'OKATOCode' element value. ��� �����.
     * 
     * @return value
     */
    public String getOKATOCode() {
        return OKATOCode;
    }

    /** 
     * Set the 'OKATOCode' element value. ��� �����.
     * 
     * @param OKATOCode
     */
    public void setOKATOCode(String OKATOCode) {
        this.OKATOCode = OKATOCode;
    }

    /** 
     * Get the 'LegalAddress' element value. ����������� ����� �����
     * 
     * @return value
     */
    public AddressType getLegalAddress() {
        return legalAddress;
    }

    /** 
     * Set the 'LegalAddress' element value. ����������� ����� �����
     * 
     * @param legalAddress
     */
    public void setLegalAddress(AddressType legalAddress) {
        this.legalAddress = legalAddress;
    }
}
