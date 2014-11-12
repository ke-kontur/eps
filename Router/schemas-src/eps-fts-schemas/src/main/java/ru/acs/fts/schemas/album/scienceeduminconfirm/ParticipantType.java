
package ru.acs.fts.schemas.album.scienceeduminconfirm;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * Сведения об участнике
 */
public class ParticipantType extends CUOrganizationType
{
    private String participantSign;
    private String address1;

    /** 
     * Get the 'ParticipantSign' element value. Признак: 0 - физическое лицо; 1 - юридическое лицо
     * 
     * @return value
     */
    public String getParticipantSign() {
        return participantSign;
    }

    /** 
     * Set the 'ParticipantSign' element value. Признак: 0 - физическое лицо; 1 - юридическое лицо
     * 
     * @param participantSign
     */
    public void setParticipantSign(String participantSign) {
        this.participantSign = participantSign;
    }

    /** 
     * Get the 'Address' element value. Адрес (строка)
     * 
     * @return value
     */
    public String getAddress1() {
        return address1;
    }

    /** 
     * Set the 'Address' element value. Адрес (строка)
     * 
     * @param address1
     */
    public void setAddress1(String address1) {
        this.address1 = address1;
    }
}
