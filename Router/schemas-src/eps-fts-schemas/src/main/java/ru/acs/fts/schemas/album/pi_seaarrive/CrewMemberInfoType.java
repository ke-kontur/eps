
package ru.acs.fts.schemas.album.pi_seaarrive;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Сведения о члене экипажа
 */
public class CrewMemberInfoType extends PersonBaseType
{
    private String nationality;

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
}
