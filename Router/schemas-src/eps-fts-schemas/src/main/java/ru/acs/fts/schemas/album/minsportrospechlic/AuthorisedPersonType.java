
package ru.acs.fts.schemas.album.minsportrospechlic;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * �������������� ����
 */
public class AuthorisedPersonType extends PersonBaseType
{
    private String ID;

    /** 
     * Get the 'ID' element value. �������������
     * 
     * @return value
     */
    public String getID() {
        return ID;
    }

    /** 
     * Set the 'ID' element value. �������������
     * 
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }
}
