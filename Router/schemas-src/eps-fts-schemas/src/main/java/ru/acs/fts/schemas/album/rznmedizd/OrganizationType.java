
package ru.acs.fts.schemas.album.rznmedizd;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * Организация
 */
public class OrganizationType extends CUOrganizationType
{
    private String id;

    /** 
     * Get the 'Id' element value. Внутренний идентификатор организации
     * 
     * @return value
     */
    public String getId() {
        return id;
    }

    /** 
     * Set the 'Id' element value. Внутренний идентификатор организации
     * 
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }
}
