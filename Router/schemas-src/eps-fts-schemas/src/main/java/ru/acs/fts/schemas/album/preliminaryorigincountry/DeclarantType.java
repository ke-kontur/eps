
package ru.acs.fts.schemas.album.preliminaryorigincountry;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Сведения о заявителе
 */
public class DeclarantType extends OrganizationType
{
    private PersonBaseType chief;

    /** 
     * Get the 'Chief' element value. Руководитель (заместителя руководителя)
     * 
     * @return value
     */
    public PersonBaseType getChief() {
        return chief;
    }

    /** 
     * Set the 'Chief' element value. Руководитель (заместителя руководителя)
     * 
     * @param chief
     */
    public void setChief(PersonBaseType chief) {
        this.chief = chief;
    }
}
