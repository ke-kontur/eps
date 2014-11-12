
package ru.acs.fts.schemas.album.billoflading;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ���������� � ����������� �����������.
 */
public class RegistrationDocumentType extends DocumentBaseType
{
    private String place;

    /** 
     * Get the 'Place' element value. ����� ������ ���������.
     * 
     * @return value
     */
    public String getPlace() {
        return place;
    }

    /** 
     * Set the 'Place' element value. ����� ������ ���������.
     * 
     * @param place
     */
    public void setPlace(String place) {
        this.place = place;
    }
}
