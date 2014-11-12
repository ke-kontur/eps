
package ru.acs.fts.schemas.album.indulgencestatement;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Сведения о банке заявителя 
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
     * Get the 'BICID' element value. БИК банка
     * 
     * @return value
     */
    public String getBICID() {
        return BICID;
    }

    /** 
     * Set the 'BICID' element value. БИК банка
     * 
     * @param BICID
     */
    public void setBICID(String BICID) {
        this.BICID = BICID;
    }

    /** 
     * Get the 'AccountNumeric' element value. Номер корреспондентского счета банка
     * 
     * @return value
     */
    public String getAccountNumeric() {
        return accountNumeric;
    }

    /** 
     * Set the 'AccountNumeric' element value. Номер корреспондентского счета банка
     * 
     * @param accountNumeric
     */
    public void setAccountNumeric(String accountNumeric) {
        this.accountNumeric = accountNumeric;
    }

    /** 
     * Get the 'Phone' element value. Номер телефона.
     * 
     * @return value
     */
    public String getPhone() {
        return phone;
    }

    /** 
     * Set the 'Phone' element value. Номер телефона.
     * 
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /** 
     * Get the 'Fax' element value. Номер факса.
     * 
     * @return value
     */
    public String getFax() {
        return fax;
    }

    /** 
     * Set the 'Fax' element value. Номер факса.
     * 
     * @param fax
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /** 
     * Get the 'Telex' element value. Номер телекса.
     * 
     * @return value
     */
    public String getTelex() {
        return telex;
    }

    /** 
     * Set the 'Telex' element value. Номер телекса.
     * 
     * @param telex
     */
    public void setTelex(String telex) {
        this.telex = telex;
    }

    /** 
     * Get the 'OKPOID' element value. Код организации по ОКПО.
     * 
     * @return value
     */
    public String getOKPOID() {
        return OKPOID;
    }

    /** 
     * Set the 'OKPOID' element value. Код организации по ОКПО.
     * 
     * @param OKPOID
     */
    public void setOKPOID(String OKPOID) {
        this.OKPOID = OKPOID;
    }

    /** 
     * Get the 'OKATOCode' element value. Код ОКАТО.
     * 
     * @return value
     */
    public String getOKATOCode() {
        return OKATOCode;
    }

    /** 
     * Set the 'OKATOCode' element value. Код ОКАТО.
     * 
     * @param OKATOCode
     */
    public void setOKATOCode(String OKATOCode) {
        this.OKATOCode = OKATOCode;
    }

    /** 
     * Get the 'LegalAddress' element value. Юридический адрес банка
     * 
     * @return value
     */
    public AddressType getLegalAddress() {
        return legalAddress;
    }

    /** 
     * Set the 'LegalAddress' element value. Юридический адрес банка
     * 
     * @param legalAddress
     */
    public void setLegalAddress(AddressType legalAddress) {
        this.legalAddress = legalAddress;
    }
}
