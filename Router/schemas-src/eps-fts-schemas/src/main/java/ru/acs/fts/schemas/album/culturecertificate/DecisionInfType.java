
package ru.acs.fts.schemas.album.culturecertificate;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * —ведени€ о решении, на основании которого разрешен вывоз
 */
public class DecisionInfType extends DocumentBaseType
{
    private String stateStructure;

    /** 
     * Get the 'StateStructure' element value. Ќаименование государственного органа, выдавшего свидетельство
     * 
     * @return value
     */
    public String getStateStructure() {
        return stateStructure;
    }

    /** 
     * Set the 'StateStructure' element value. Ќаименование государственного органа, выдавшего свидетельство
     * 
     * @param stateStructure
     */
    public void setStateStructure(String stateStructure) {
        this.stateStructure = stateStructure;
    }
}
