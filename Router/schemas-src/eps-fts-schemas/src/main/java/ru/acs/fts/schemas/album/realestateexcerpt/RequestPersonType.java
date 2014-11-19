
package ru.acs.fts.schemas.album.realestateexcerpt;

/** 
 * Сведения об организации запрашивающей сведения
 */
public class RequestPersonType extends OwnerType
{
    private String personKind;
    private String identificationSign;
    private OwnerType agent;

    /** 
     * Get the 'PersonKind' element value. Вид заявителя
     * 
     * @return value
     */
    public String getPersonKind() {
        return personKind;
    }

    /** 
     * Set the 'PersonKind' element value. Вид заявителя
     * 
     * @param personKind
     */
    public void setPersonKind(String personKind) {
        this.personKind = personKind;
    }

    /** 
     * Get the 'IdentificationSign' element value. Признак подтверждения личности заявителя
     * 
     * @return value
     */
    public String getIdentificationSign() {
        return identificationSign;
    }

    /** 
     * Set the 'IdentificationSign' element value. Признак подтверждения личности заявителя
     * 
     * @param identificationSign
     */
    public void setIdentificationSign(String identificationSign) {
        this.identificationSign = identificationSign;
    }

    /** 
     * Get the 'Agent' element value. Доверенное лицо
     * 
     * @return value
     */
    public OwnerType getAgent() {
        return agent;
    }

    /** 
     * Set the 'Agent' element value. Доверенное лицо
     * 
     * @param agent
     */
    public void setAgent(OwnerType agent) {
        this.agent = agent;
    }
}
