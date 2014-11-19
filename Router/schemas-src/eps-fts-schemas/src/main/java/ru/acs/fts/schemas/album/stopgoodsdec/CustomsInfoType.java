
package ru.acs.fts.schemas.album.stopgoodsdec;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * Сведения о таможенном органе
 */
public class CustomsInfoType extends CustomsType
{
    private String phone;
    private String fax;
    private String telex;
    private String email;
    private AddressType customsAddress;

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
     * Get the 'Email' element value. Электронная почта
     * 
     * @return value
     */
    public String getEmail() {
        return email;
    }

    /** 
     * Set the 'Email' element value. Электронная почта
     * 
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /** 
     * Get the 'CustomsAddress' element value. Адрес таможенного органа
     * 
     * @return value
     */
    public AddressType getCustomsAddress() {
        return customsAddress;
    }

    /** 
     * Set the 'CustomsAddress' element value. Адрес таможенного органа
     * 
     * @param customsAddress
     */
    public void setCustomsAddress(AddressType customsAddress) {
        this.customsAddress = customsAddress;
    }
}
