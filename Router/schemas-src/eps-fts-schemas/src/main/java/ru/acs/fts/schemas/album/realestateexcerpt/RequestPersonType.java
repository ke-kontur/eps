
package ru.acs.fts.schemas.album.realestateexcerpt;

/** 
 * �������� �� ����������� ������������� ��������
 */
public class RequestPersonType extends OwnerType
{
    private String personKind;
    private String identificationSign;
    private OwnerType agent;

    /** 
     * Get the 'PersonKind' element value. ��� ���������
     * 
     * @return value
     */
    public String getPersonKind() {
        return personKind;
    }

    /** 
     * Set the 'PersonKind' element value. ��� ���������
     * 
     * @param personKind
     */
    public void setPersonKind(String personKind) {
        this.personKind = personKind;
    }

    /** 
     * Get the 'IdentificationSign' element value. ������� ������������� �������� ���������
     * 
     * @return value
     */
    public String getIdentificationSign() {
        return identificationSign;
    }

    /** 
     * Set the 'IdentificationSign' element value. ������� ������������� �������� ���������
     * 
     * @param identificationSign
     */
    public void setIdentificationSign(String identificationSign) {
        this.identificationSign = identificationSign;
    }

    /** 
     * Get the 'Agent' element value. ���������� ����
     * 
     * @return value
     */
    public OwnerType getAgent() {
        return agent;
    }

    /** 
     * Set the 'Agent' element value. ���������� ����
     * 
     * @param agent
     */
    public void setAgent(OwnerType agent) {
        this.agent = agent;
    }
}
