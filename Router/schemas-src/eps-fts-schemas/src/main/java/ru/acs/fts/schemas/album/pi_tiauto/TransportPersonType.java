
package ru.acs.fts.schemas.album.pi_tiauto;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Сведения о владельце/водителе транспортного средства
 */
public class TransportPersonType extends PersonBaseType
{
    private LocalDate birthDate;
    private IdentityCardInfoType identityCardInfo;
    private AddressType address;

    /** 
     * Get the 'BirthDate' element value. Дата рождения
     * 
     * @return value
     */
    public LocalDate getBirthDate() {
        return birthDate;
    }

    /** 
     * Set the 'BirthDate' element value. Дата рождения
     * 
     * @param birthDate
     */
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    /** 
     * Get the 'IdentityCardInfo' element value. Сведения документа, удостоверяющего личность
     * 
     * @return value
     */
    public IdentityCardInfoType getIdentityCardInfo() {
        return identityCardInfo;
    }

    /** 
     * Set the 'IdentityCardInfo' element value. Сведения документа, удостоверяющего личность
     * 
     * @param identityCardInfo
     */
    public void setIdentityCardInfo(IdentityCardInfoType identityCardInfo) {
        this.identityCardInfo = identityCardInfo;
    }

    /** 
     * Get the 'Address' element value. Адрес
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Адрес
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}
