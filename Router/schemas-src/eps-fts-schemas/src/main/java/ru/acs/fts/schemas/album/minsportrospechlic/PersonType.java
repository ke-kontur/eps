
package ru.acs.fts.schemas.album.minsportrospechlic;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Сведения о получателе
 */
public class PersonType extends OrganizationBaseType
{
    private String personStatus;

    /** 
     * Get the 'PersonStatus' element value. Статус получателя Ю/Ф (0 - юридическое лицо; 1 - физическое лицо)
     * 
     * @return value
     */
    public String getPersonStatus() {
        return personStatus;
    }

    /** 
     * Set the 'PersonStatus' element value. Статус получателя Ю/Ф (0 - юридическое лицо; 1 - физическое лицо)
     * 
     * @param personStatus
     */
    public void setPersonStatus(String personStatus) {
        this.personStatus = personStatus;
    }
}
