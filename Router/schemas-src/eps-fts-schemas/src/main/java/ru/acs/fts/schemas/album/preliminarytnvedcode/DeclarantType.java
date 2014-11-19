
package ru.acs.fts.schemas.album.preliminarytnvedcode;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * �������� � ���������
 */
public class DeclarantType extends OrganizationType
{
    private PersonBaseType chief;

    /** 
     * Get the 'Chief' element value. ������������ (����������� ������������)
     * 
     * @return value
     */
    public PersonBaseType getChief() {
        return chief;
    }

    /** 
     * Set the 'Chief' element value. ������������ (����������� ������������)
     * 
     * @param chief
     */
    public void setChief(PersonBaseType chief) {
        this.chief = chief;
    }
}
