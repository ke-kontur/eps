
package ru.acs.fts.schemas.album.mpo_declaration;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * Получатель
 */
public class ConsigneeType extends CUOrganizationType
{
    private String cardNumber;

    /** 
     * Get the 'CardNumber' element value. Номер универсальной электронной карты
     * 
     * @return value
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /** 
     * Set the 'CardNumber' element value. Номер универсальной электронной карты
     * 
     * @param cardNumber
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
