
package ru.acs.fts.schemas.album.crewlist;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Реквизиты членов экипажа
 */
public class CockpitPersonnelType extends PersonBaseType
{
    private String persNumeric;
    private String nationality;
    private String birthPlace;
    private LocalDate dateofBirth;
    private IdentityCardType document;

    /** 
     * Get the 'PersNumeric' element value. Порядковый номер (1- номер капитана)
     * 
     * @return value
     */
    public String getPersNumeric() {
        return persNumeric;
    }

    /** 
     * Set the 'PersNumeric' element value. Порядковый номер (1- номер капитана)
     * 
     * @param persNumeric
     */
    public void setPersNumeric(String persNumeric) {
        this.persNumeric = persNumeric;
    }

    /** 
     * Get the 'Nationality' element value. Гражданство (альфа код страны)
     * 
     * @return value
     */
    public String getNationality() {
        return nationality;
    }

    /** 
     * Set the 'Nationality' element value. Гражданство (альфа код страны)
     * 
     * @param nationality
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /** 
     * Get the 'BirthPlace' element value. Место рождения
     * 
     * @return value
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    /** 
     * Set the 'BirthPlace' element value. Место рождения
     * 
     * @param birthPlace
     */
    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    /** 
     * Get the 'DateofBirth' element value. Дата рождения
     * 
     * @return value
     */
    public LocalDate getDateofBirth() {
        return dateofBirth;
    }

    /** 
     * Set the 'DateofBirth' element value. Дата рождения
     * 
     * @param dateofBirth
     */
    public void setDateofBirth(LocalDate dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    /** 
     * Get the 'Document' element value. Вид и номер документа, удостоверяющего личность члена экипажа
     * 
     * @return value
     */
    public IdentityCardType getDocument() {
        return document;
    }

    /** 
     * Set the 'Document' element value. Вид и номер документа, удостоверяющего личность члена экипажа
     * 
     * @param document
     */
    public void setDocument(IdentityCardType document) {
        this.document = document;
    }
}
