
package ru.acs.fts.schemas.album.actthievingsampling;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * «амечани€ и за€влени€ присутствующих (участвующих) лиц
 */
public class ObservationType
{
    private String observationContents;
    private PersonSignatureType personSignatureObservation;

    /** 
     * Get the 'ObservationContents' element value. —одержание
     * 
     * @return value
     */
    public String getObservationContents() {
        return observationContents;
    }

    /** 
     * Set the 'ObservationContents' element value. —одержание
     * 
     * @param observationContents
     */
    public void setObservationContents(String observationContents) {
        this.observationContents = observationContents;
    }

    /** 
     * Get the 'PersonSignatureObservation' element value. ‘амили€, инициалы лица, сделавшего за€вление или замечание.
     * 
     * @return value
     */
    public PersonSignatureType getPersonSignatureObservation() {
        return personSignatureObservation;
    }

    /** 
     * Set the 'PersonSignatureObservation' element value. ‘амили€, инициалы лица, сделавшего за€вление или замечание.
     * 
     * @param personSignatureObservation
     */
    public void setPersonSignatureObservation(
            PersonSignatureType personSignatureObservation) {
        this.personSignatureObservation = personSignatureObservation;
    }
}
