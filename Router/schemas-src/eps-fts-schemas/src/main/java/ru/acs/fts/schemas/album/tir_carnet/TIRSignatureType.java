
package ru.acs.fts.schemas.album.tir_carnet;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * ������� ���������. ����� � ����  ������������ �������.
 */
public class TIRSignatureType
{
    private String signPlace;
    private String signPlaceCountry;
    private LocalDate signDate;
    private PersonBaseType signPerson;

    /** 
     * Get the 'SignPlace' element value. ����� �������. ������������ ����� 
     * 
     * @return value
     */
    public String getSignPlace() {
        return signPlace;
    }

    /** 
     * Set the 'SignPlace' element value. ����� �������. ������������ ����� 
     * 
     * @param signPlace
     */
    public void setSignPlace(String signPlace) {
        this.signPlace = signPlace;
    }

    /** 
     * Get the 'SignPlaceCountry' element value. �����  ������������ �������. ������.
     * 
     * @return value
     */
    public String getSignPlaceCountry() {
        return signPlaceCountry;
    }

    /** 
     * Set the 'SignPlaceCountry' element value. �����  ������������ �������. ������.
     * 
     * @param signPlaceCountry
     */
    public void setSignPlaceCountry(String signPlaceCountry) {
        this.signPlaceCountry = signPlaceCountry;
    }

    /** 
     * Get the 'SignDate' element value. ���� ������������ �������.
     * 
     * @return value
     */
    public LocalDate getSignDate() {
        return signDate;
    }

    /** 
     * Set the 'SignDate' element value. ���� ������������ �������.
     * 
     * @param signDate
     */
    public void setSignDate(LocalDate signDate) {
        this.signDate = signDate;
    }

    /** 
     * Get the 'SignPerson' element value. �������� � ����, ������������ �������
     * 
     * @return value
     */
    public PersonBaseType getSignPerson() {
        return signPerson;
    }

    /** 
     * Set the 'SignPerson' element value. �������� � ����, ������������ �������
     * 
     * @param signPerson
     */
    public void setSignPerson(PersonBaseType signPerson) {
        this.signPerson = signPerson;
    }
}
