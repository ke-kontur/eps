
package ru.acs.fts.schemas.album.dtsoutcustomsmark;

import ru.acs.fts.schemas.album.ruesaddtscommonaggregatetypescust.CustomsCostDecisionType;

/** 
 * Принятие решения по таможенной стоимости
 */
public class DTSOuDecisionType extends CustomsCostDecisionType
{
    private String personName;

    /** 
     * Get the 'PersonName' element value. ФИО должностного лица
     * 
     * @return value
     */
    public String getPersonName() {
        return personName;
    }

    /** 
     * Set the 'PersonName' element value. ФИО должностного лица
     * 
     * @param personName
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }
}
