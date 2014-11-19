
package ru.acs.fts.schemas.album.scienceeduminconfirm;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * �������� �� ���������
 */
public class ParticipantType extends CUOrganizationType
{
    private String participantSign;
    private String address1;

    /** 
     * Get the 'ParticipantSign' element value. �������: 0 - ���������� ����; 1 - ����������� ����
     * 
     * @return value
     */
    public String getParticipantSign() {
        return participantSign;
    }

    /** 
     * Set the 'ParticipantSign' element value. �������: 0 - ���������� ����; 1 - ����������� ����
     * 
     * @param participantSign
     */
    public void setParticipantSign(String participantSign) {
        this.participantSign = participantSign;
    }

    /** 
     * Get the 'Address' element value. ����� (������)
     * 
     * @return value
     */
    public String getAddress1() {
        return address1;
    }

    /** 
     * Set the 'Address' element value. ����� (������)
     * 
     * @param address1
     */
    public void setAddress1(String address1) {
        this.address1 = address1;
    }
}
