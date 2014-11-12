
package ru.acs.fts.schemas.album.billoflading;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Информация о регистрации коносамента.
 */
public class RegistrationDocumentType extends DocumentBaseType
{
    private String place;

    /** 
     * Get the 'Place' element value. Место выдачи документа.
     * 
     * @return value
     */
    public String getPlace() {
        return place;
    }

    /** 
     * Set the 'Place' element value. Место выдачи документа.
     * 
     * @param place
     */
    public void setPlace(String place) {
        this.place = place;
    }
}
