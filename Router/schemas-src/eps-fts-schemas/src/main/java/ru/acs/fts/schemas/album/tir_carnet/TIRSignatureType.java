
package ru.acs.fts.schemas.album.tir_carnet;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Подпись держателя. Место и дата  проставления подписи.
 */
public class TIRSignatureType
{
    private String signPlace;
    private String signPlaceCountry;
    private LocalDate signDate;
    private PersonBaseType signPerson;

    /** 
     * Get the 'SignPlace' element value. Место подписи. Наименование места 
     * 
     * @return value
     */
    public String getSignPlace() {
        return signPlace;
    }

    /** 
     * Set the 'SignPlace' element value. Место подписи. Наименование места 
     * 
     * @param signPlace
     */
    public void setSignPlace(String signPlace) {
        this.signPlace = signPlace;
    }

    /** 
     * Get the 'SignPlaceCountry' element value. Место  проставления подписи. Страна.
     * 
     * @return value
     */
    public String getSignPlaceCountry() {
        return signPlaceCountry;
    }

    /** 
     * Set the 'SignPlaceCountry' element value. Место  проставления подписи. Страна.
     * 
     * @param signPlaceCountry
     */
    public void setSignPlaceCountry(String signPlaceCountry) {
        this.signPlaceCountry = signPlaceCountry;
    }

    /** 
     * Get the 'SignDate' element value. Дата проставления подписи.
     * 
     * @return value
     */
    public LocalDate getSignDate() {
        return signDate;
    }

    /** 
     * Set the 'SignDate' element value. Дата проставления подписи.
     * 
     * @param signDate
     */
    public void setSignDate(LocalDate signDate) {
        this.signDate = signDate;
    }

    /** 
     * Get the 'SignPerson' element value. Сведения о лице, проставившем подпись
     * 
     * @return value
     */
    public PersonBaseType getSignPerson() {
        return signPerson;
    }

    /** 
     * Set the 'SignPerson' element value. Сведения о лице, проставившем подпись
     * 
     * @param signPerson
     */
    public void setSignPerson(PersonBaseType signPerson) {
        this.signPerson = signPerson;
    }
}
