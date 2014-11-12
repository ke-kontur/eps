
package ru.acs.fts.schemas.album.paymenttransactionreport;

import ru.acs.fts.schemas.album.cardcommonaggregatetypes.IdentityCardType;

/** 
 * ���������� � �����������
 */
public class PayerType extends OrganizationInfoType
{
    private String cardNumber;
    private String OKPO;
    private IdentityCardType identityCard;

    /** 
     * Get the 'CardNumber' element value. ����� ���������� ��������� �����, � �������������� ������� ��� ����������� ������.
     * 
     * @return value
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /** 
     * Set the 'CardNumber' element value. ����� ���������� ��������� �����, � �������������� ������� ��� ����������� ������.
     * 
     * @param cardNumber
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /** 
     * Get the 'OKPO' element value. ����
     * 
     * @return value
     */
    public String getOKPO() {
        return OKPO;
    }

    /** 
     * Set the 'OKPO' element value. ����
     * 
     * @param OKPO
     */
    public void setOKPO(String OKPO) {
        this.OKPO = OKPO;
    }

    /** 
     * Get the 'IdentityCard' element value. ��������, �������������� ��������
     * 
     * @return value
     */
    public IdentityCardType getIdentityCard() {
        return identityCard;
    }

    /** 
     * Set the 'IdentityCard' element value. ��������, �������������� ��������
     * 
     * @param identityCard
     */
    public void setIdentityCard(IdentityCardType identityCard) {
        this.identityCard = identityCard;
    }
}
