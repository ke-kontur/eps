
package ru.acs.fts.schemas.album.paymenttransactionreport;

import ru.acs.fts.schemas.album.cardcommonaggregatetypes.IdentityCardType;

/** 
 * Информация о плательщике
 */
public class PayerType extends OrganizationInfoType
{
    private String cardNumber;
    private String OKPO;
    private IdentityCardType identityCard;

    /** 
     * Get the 'CardNumber' element value. Номер таможенной платежной карты, с использованием который был осуществлен платеж.
     * 
     * @return value
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /** 
     * Set the 'CardNumber' element value. Номер таможенной платежной карты, с использованием который был осуществлен платеж.
     * 
     * @param cardNumber
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /** 
     * Get the 'OKPO' element value. ОКПО
     * 
     * @return value
     */
    public String getOKPO() {
        return OKPO;
    }

    /** 
     * Set the 'OKPO' element value. ОКПО
     * 
     * @param OKPO
     */
    public void setOKPO(String OKPO) {
        this.OKPO = OKPO;
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
