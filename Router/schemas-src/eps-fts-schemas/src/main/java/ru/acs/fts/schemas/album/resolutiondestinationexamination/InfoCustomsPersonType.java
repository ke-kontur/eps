
package ru.acs.fts.schemas.album.resolutiondestinationexamination;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;

/** 
 * Сведения о должностном лице, назначившего экспертизу.
 */
public class InfoCustomsPersonType
{
    private String officialTelephone;
    private CustomsPersonType customsPerson;
    private AddressType address;

    /** 
     * Get the 'OfficialTelephone' element value. Служебный номер телефона должностного лица
     * 
     * @return value
     */
    public String getOfficialTelephone() {
        return officialTelephone;
    }

    /** 
     * Set the 'OfficialTelephone' element value. Служебный номер телефона должностного лица
     * 
     * @param officialTelephone
     */
    public void setOfficialTelephone(String officialTelephone) {
        this.officialTelephone = officialTelephone;
    }

    /** 
     * Get the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'Address' element value. Адрес таможенного органа
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Адрес таможенного органа
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}
