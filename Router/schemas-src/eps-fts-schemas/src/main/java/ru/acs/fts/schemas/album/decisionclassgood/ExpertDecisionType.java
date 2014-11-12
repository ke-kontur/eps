
package ru.acs.fts.schemas.album.decisionclassgood;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Обоснование принятия решения. Заключение экспертной организации
 */
public class ExpertDecisionType extends DocumentBaseType
{
    private String expertOrganization;

    /** 
     * Get the 'ExpertOrganization' element value. Наименование экспертной организации
     * 
     * @return value
     */
    public String getExpertOrganization() {
        return expertOrganization;
    }

    /** 
     * Set the 'ExpertOrganization' element value. Наименование экспертной организации
     * 
     * @param expertOrganization
     */
    public void setExpertOrganization(String expertOrganization) {
        this.expertOrganization = expertOrganization;
    }
}
