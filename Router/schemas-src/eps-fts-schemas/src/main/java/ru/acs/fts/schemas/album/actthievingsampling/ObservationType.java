
package ru.acs.fts.schemas.album.actthievingsampling;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Замечания и заявления присутствующих (участвующих) лиц
 */
public class ObservationType
{
    private String observationContents;
    private PersonSignatureType personSignatureObservation;

    /** 
     * Get the 'ObservationContents' element value. Содержание
     * 
     * @return value
     */
    public String getObservationContents() {
        return observationContents;
    }

    /** 
     * Set the 'ObservationContents' element value. Содержание
     * 
     * @param observationContents
     */
    public void setObservationContents(String observationContents) {
        this.observationContents = observationContents;
    }

    /** 
     * Get the 'PersonSignatureObservation' element value. Фамилия, инициалы лица, сделавшего заявление или замечание.
     * 
     * @return value
     */
    public PersonSignatureType getPersonSignatureObservation() {
        return personSignatureObservation;
    }

    /** 
     * Set the 'PersonSignatureObservation' element value. Фамилия, инициалы лица, сделавшего заявление или замечание.
     * 
     * @param personSignatureObservation
     */
    public void setPersonSignatureObservation(
            PersonSignatureType personSignatureObservation) {
        this.personSignatureObservation = personSignatureObservation;
    }
}
