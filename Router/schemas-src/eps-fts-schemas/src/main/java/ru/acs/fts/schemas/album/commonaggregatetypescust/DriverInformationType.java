
package ru.acs.fts.schemas.album.commonaggregatetypescust;

/** 
 * »нформаци€ о водител€х транспортных средств. «аполн€етс€ при транзите товаров автомобильным транспортом
 */
public class DriverInformationType extends PersonBaseType
{
    private String regCountryCode;
    private IdentityCardType identityCard;

    /** 
     * Get the 'RegCountryCode' element value.  од страны регистрации водител€ транспортного средства
     * 
     * @return value
     */
    public String getRegCountryCode() {
        return regCountryCode;
    }

    /** 
     * Set the 'RegCountryCode' element value.  од страны регистрации водител€ транспортного средства
     * 
     * @param regCountryCode
     */
    public void setRegCountryCode(String regCountryCode) {
        this.regCountryCode = regCountryCode;
    }

    /** 
     * Get the 'IdentityCard' element value. ƒокумент, удостовер€ющий личность
     * 
     * @return value
     */
    public IdentityCardType getIdentityCard() {
        return identityCard;
    }

    /** 
     * Set the 'IdentityCard' element value. ƒокумент, удостовер€ющий личность
     * 
     * @param identityCard
     */
    public void setIdentityCard(IdentityCardType identityCard) {
        this.identityCard = identityCard;
    }
}
