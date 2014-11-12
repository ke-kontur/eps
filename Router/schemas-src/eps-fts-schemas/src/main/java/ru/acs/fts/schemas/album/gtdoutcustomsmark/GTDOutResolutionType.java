
package ru.acs.fts.schemas.album.gtdoutcustomsmark;

import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.RUESADDecisionType;

/** 
 * Принятые решения по ДТ / товарам.
 */
public class GTDOutResolutionType extends RUESADDecisionType
{
    private String resolutionDescription;
    private String personName;

    /** 
     * Get the 'ResolutionDescription' element value. Описание принятого решения
     * 
     * @return value
     */
    public String getResolutionDescription() {
        return resolutionDescription;
    }

    /** 
     * Set the 'ResolutionDescription' element value. Описание принятого решения
     * 
     * @param resolutionDescription
     */
    public void setResolutionDescription(String resolutionDescription) {
        this.resolutionDescription = resolutionDescription;
    }

    /** 
     * Get the 'PersonName' element value. ФИО должностного лица таможенного органа
     * 
     * @return value
     */
    public String getPersonName() {
        return personName;
    }

    /** 
     * Set the 'PersonName' element value. ФИО должностного лица таможенного органа
     * 
     * @param personName
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }
}
