
package ru.acs.fts.schemas.album.tir_carnet;

import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;

/** 
 * �����������/���������� ������� � ������ ���
 */
public class PersonType extends GeneralParticipantInfoType
{
    private String ITN;
    private IdentityCardType identityCard;

    /** 
     * Get the 'ITN' element value. ���
     * 
     * @return value
     */
    public String getITN() {
        return ITN;
    }

    /** 
     * Set the 'ITN' element value. ���
     * 
     * @param ITN
     */
    public void setITN(String ITN) {
        this.ITN = ITN;
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
