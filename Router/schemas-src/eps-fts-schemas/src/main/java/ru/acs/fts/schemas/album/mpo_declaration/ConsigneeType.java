
package ru.acs.fts.schemas.album.mpo_declaration;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * ����������
 */
public class ConsigneeType extends CUOrganizationType
{
    private String cardNumber;

    /** 
     * Get the 'CardNumber' element value. ����� ������������� ����������� �����
     * 
     * @return value
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /** 
     * Set the 'CardNumber' element value. ����� ������������� ����������� �����
     * 
     * @param cardNumber
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
