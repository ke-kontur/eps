
package ru.acs.fts.schemas.album.veterinarycertificate;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения о благополучии (местности, хозяйства)
 */
public class WellBeingInfoType
{
    private String termWellBeing;
    private String unitTermWellBeing;
    private List<String> descriptionWellBeingList = new ArrayList<String>();

    /** 
     * Get the 'TermWellBeing' element value. Срок благополучия.
     * 
     * @return value
     */
    public String getTermWellBeing() {
        return termWellBeing;
    }

    /** 
     * Set the 'TermWellBeing' element value. Срок благополучия.
     * 
     * @param termWellBeing
     */
    public void setTermWellBeing(String termWellBeing) {
        this.termWellBeing = termWellBeing;
    }

    /** 
     * Get the 'UnitTermWellBeing' element value. Единица измерения срока благополучия.
     * 
     * @return value
     */
    public String getUnitTermWellBeing() {
        return unitTermWellBeing;
    }

    /** 
     * Set the 'UnitTermWellBeing' element value. Единица измерения срока благополучия.
     * 
     * @param unitTermWellBeing
     */
    public void setUnitTermWellBeing(String unitTermWellBeing) {
        this.unitTermWellBeing = unitTermWellBeing;
    }

    /** 
     * Get the list of 'DescriptionWellBeing' element items. Описание благополучия
     * 
     * @return list
     */
    public List<String> getDescriptionWellBeingList() {
        return descriptionWellBeingList;
    }

    /** 
     * Set the list of 'DescriptionWellBeing' element items. Описание благополучия
     * 
     * @param list
     */
    public void setDescriptionWellBeingList(List<String> list) {
        descriptionWellBeingList = list;
    }
}
