
package ru.acs.fts.schemas.album.rznmedizd;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * �����������
 */
public class OrganizationType extends CUOrganizationType
{
    private String id;

    /** 
     * Get the 'Id' element value. ���������� ������������� �����������
     * 
     * @return value
     */
    public String getId() {
        return id;
    }

    /** 
     * Set the 'Id' element value. ���������� ������������� �����������
     * 
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }
}
