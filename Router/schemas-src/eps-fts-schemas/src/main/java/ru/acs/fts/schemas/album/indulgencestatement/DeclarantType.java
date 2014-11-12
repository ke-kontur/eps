
package ru.acs.fts.schemas.album.indulgencestatement;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * Сведения о заявителе
 */
public class DeclarantType extends OrganizationType
{
    private int choiceSelect = -1;
    private static final int NATURAL_PERSON_REGISTRATION_CHOICE = 0;
    private static final int JURIDICAL_PERSON_REGISTRATION_CHOICE = 1;
    private NaturalPersonRegistrationType naturalPersonRegistration;
    private JuridicalPersonRegistrationType juridicalPersonRegistration;

    private void setChoiceSelect(int choice) {
        if (choiceSelect == -1) {
            choiceSelect = choice;
        } else if (choiceSelect != choice) {
            throw new IllegalStateException(
                    "Need to call clearChoiceSelect() before changing existing choice");
        }
    }

    /** 
     * Clear the choice selection.
     */
    public void clearChoiceSelect() {
        choiceSelect = -1;
    }

    /** 
     * Check if NaturalPersonRegistration is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifNaturalPersonRegistration() {
        return choiceSelect == NATURAL_PERSON_REGISTRATION_CHOICE;
    }

    /** 
     * Get the 'NaturalPersonRegistration' element value. Сведения о государственной регистрации индивидуального предпринимателя
     * 
     * @return value
     */
    public NaturalPersonRegistrationType getNaturalPersonRegistration() {
        return naturalPersonRegistration;
    }

    /** 
     * Set the 'NaturalPersonRegistration' element value. Сведения о государственной регистрации индивидуального предпринимателя
     * 
     * @param naturalPersonRegistration
     */
    public void setNaturalPersonRegistration(
            NaturalPersonRegistrationType naturalPersonRegistration) {
        setChoiceSelect(NATURAL_PERSON_REGISTRATION_CHOICE);
        this.naturalPersonRegistration = naturalPersonRegistration;
    }

    /** 
     * Check if JuridicalPersonRegistration is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifJuridicalPersonRegistration() {
        return choiceSelect == JURIDICAL_PERSON_REGISTRATION_CHOICE;
    }

    /** 
     * Get the 'JuridicalPersonRegistration' element value. Сведения о государственной регистрации юридического лица
     * 
     * @return value
     */
    public JuridicalPersonRegistrationType getJuridicalPersonRegistration() {
        return juridicalPersonRegistration;
    }

    /** 
     * Set the 'JuridicalPersonRegistration' element value. Сведения о государственной регистрации юридического лица
     * 
     * @param juridicalPersonRegistration
     */
    public void setJuridicalPersonRegistration(
            JuridicalPersonRegistrationType juridicalPersonRegistration) {
        setChoiceSelect(JURIDICAL_PERSON_REGISTRATION_CHOICE);
        this.juridicalPersonRegistration = juridicalPersonRegistration;
    }
}
