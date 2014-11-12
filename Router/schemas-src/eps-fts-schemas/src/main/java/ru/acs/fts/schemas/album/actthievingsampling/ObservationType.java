
package ru.acs.fts.schemas.album.actthievingsampling;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ��������� � ��������� �������������� (�����������) ���
 */
public class ObservationType
{
    private String observationContents;
    private PersonSignatureType personSignatureObservation;

    /** 
     * Get the 'ObservationContents' element value. ����������
     * 
     * @return value
     */
    public String getObservationContents() {
        return observationContents;
    }

    /** 
     * Set the 'ObservationContents' element value. ����������
     * 
     * @param observationContents
     */
    public void setObservationContents(String observationContents) {
        this.observationContents = observationContents;
    }

    /** 
     * Get the 'PersonSignatureObservation' element value. �������, �������� ����, ���������� ��������� ��� ���������.
     * 
     * @return value
     */
    public PersonSignatureType getPersonSignatureObservation() {
        return personSignatureObservation;
    }

    /** 
     * Set the 'PersonSignatureObservation' element value. �������, �������� ����, ���������� ��������� ��� ���������.
     * 
     * @param personSignatureObservation
     */
    public void setPersonSignatureObservation(
            PersonSignatureType personSignatureObservation) {
        this.personSignatureObservation = personSignatureObservation;
    }
}
