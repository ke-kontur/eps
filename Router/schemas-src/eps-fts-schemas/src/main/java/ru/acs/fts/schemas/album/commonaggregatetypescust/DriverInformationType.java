
package ru.acs.fts.schemas.album.commonaggregatetypescust;

/** 
 * ���������� � ��������� ������������ �������. ����������� ��� �������� ������� ������������� �����������
 */
public class DriverInformationType extends PersonBaseType
{
    private String regCountryCode;
    private IdentityCardType identityCard;

    /** 
     * Get the 'RegCountryCode' element value. ��� ������ ����������� �������� ������������� ��������
     * 
     * @return value
     */
    public String getRegCountryCode() {
        return regCountryCode;
    }

    /** 
     * Set the 'RegCountryCode' element value. ��� ������ ����������� �������� ������������� ��������
     * 
     * @param regCountryCode
     */
    public void setRegCountryCode(String regCountryCode) {
        this.regCountryCode = regCountryCode;
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
