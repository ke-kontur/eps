
package ru.acs.fts.schemas.album.legalentityinfo;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * Сведения о регистрирующем (налоговом) органе по месту нахождения юр. лица
 */
public class RegOrganType
{
    private String organCode;
    private String organName;
    private AddressType regOrganAddress;

    /** 
     * Get the 'OrganCode' element value. Код органа по справочнику
     * 
     * @return value
     */
    public String getOrganCode() {
        return organCode;
    }

    /** 
     * Set the 'OrganCode' element value. Код органа по справочнику
     * 
     * @param organCode
     */
    public void setOrganCode(String organCode) {
        this.organCode = organCode;
    }

    /** 
     * Get the 'OrganName' element value. Наименование регистрирующего (налогового) органа
     * 
     * @return value
     */
    public String getOrganName() {
        return organName;
    }

    /** 
     * Set the 'OrganName' element value. Наименование регистрирующего (налогового) органа
     * 
     * @param organName
     */
    public void setOrganName(String organName) {
        this.organName = organName;
    }

    /** 
     * Get the 'RegOrganAddress' element value. Адрес налогового органа
     * 
     * @return value
     */
    public AddressType getRegOrganAddress() {
        return regOrganAddress;
    }

    /** 
     * Set the 'RegOrganAddress' element value. Адрес налогового органа
     * 
     * @param regOrganAddress
     */
    public void setRegOrganAddress(AddressType regOrganAddress) {
        this.regOrganAddress = regOrganAddress;
    }
}
