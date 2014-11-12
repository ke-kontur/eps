
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * ESAD. Сведения об организации. Внутренний формат.
 */
public class ESADOrganizationInType extends OrganizationBaseType
{
    private String ITN;
    private String OKATO;
    private AddressType address;
    private IdentityCardType identityCard;

    /** 
     * Get the 'ITN' element value. ИТН субъекта ВЭД
     * 
     * @return value
     */
    public String getITN() {
        return ITN;
    }

    /** 
     * Set the 'ITN' element value. ИТН субъекта ВЭД
     * 
     * @param ITN
     */
    public void setITN(String ITN) {
        this.ITN = ITN;
    }

    /** 
     * Get the 'OKATO' element value. Код ОКАТО (формируется автоматически в соответствии с приказом ФТС России от 10.10.2007 г. № 1246)
     * 
     * @return value
     */
    public String getOKATO() {
        return OKATO;
    }

    /** 
     * Set the 'OKATO' element value. Код ОКАТО (формируется автоматически в соответствии с приказом ФТС России от 10.10.2007 г. № 1246)
     * 
     * @param OKATO
     */
    public void setOKATO(String OKATO) {
        this.OKATO = OKATO;
    }

    /** 
     * Get the 'Address' element value. Адрес организации.
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Адрес организации.
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }

    /** 
     * Get the 'IdentityCard' element value. Документ, удостоверяющий личность.
     * 
     * @return value
     */
    public IdentityCardType getIdentityCard() {
        return identityCard;
    }

    /** 
     * Set the 'IdentityCard' element value. Документ, удостоверяющий личность.
     * 
     * @param identityCard
     */
    public void setIdentityCard(IdentityCardType identityCard) {
        this.identityCard = identityCard;
    }
}
