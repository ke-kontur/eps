
package ru.acs.fts.schemas.album.commonaggregatetypescust;

/** 
 * Информация о водителях транспортных средств. Заполняется при транзите товаров автомобильным транспортом
 */
public class DriverInformationType extends PersonBaseType
{
    private String regCountryCode;
    private IdentityCardType identityCard;

    /** 
     * Get the 'RegCountryCode' element value. Код страны регистрации водителя транспортного средства
     * 
     * @return value
     */
    public String getRegCountryCode() {
        return regCountryCode;
    }

    /** 
     * Set the 'RegCountryCode' element value. Код страны регистрации водителя транспортного средства
     * 
     * @param regCountryCode
     */
    public void setRegCountryCode(String regCountryCode) {
        this.regCountryCode = regCountryCode;
    }

    /** 
     * Get the 'IdentityCard' element value. Документ, удостоверяющий личность
     * 
     * @return value
     */
    public IdentityCardType getIdentityCard() {
        return identityCard;
    }

    /** 
     * Set the 'IdentityCard' element value. Документ, удостоверяющий личность
     * 
     * @param identityCard
     */
    public void setIdentityCard(IdentityCardType identityCard) {
        this.identityCard = identityCard;
    }
}
