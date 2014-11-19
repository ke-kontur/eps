
package ru.acs.fts.schemas.album.noticerubykz;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Водитель
 */
public class DriverType extends PersonBaseType
{
    private String ID;

    /** 
     * Get the 'ID' element value. Идентификатор
     * 
     * @return value
     */
    public String getID() {
        return ID;
    }

    /** 
     * Set the 'ID' element value. Идентификатор
     * 
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }
}
