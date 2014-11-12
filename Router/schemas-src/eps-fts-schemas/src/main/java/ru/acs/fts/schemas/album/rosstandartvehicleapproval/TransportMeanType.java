
package ru.acs.fts.schemas.album.rosstandartvehicleapproval;

import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * Транспортное средство
 */
public class TransportMeanType extends TransportMeansBaseType
{
    private String ecoClass;

    /** 
     * Get the 'EcoClass' element value. Экологический класс ТС
     * 
     * @return value
     */
    public String getEcoClass() {
        return ecoClass;
    }

    /** 
     * Set the 'EcoClass' element value. Экологический класс ТС
     * 
     * @param ecoClass
     */
    public void setEcoClass(String ecoClass) {
        this.ecoClass = ecoClass;
    }
}
