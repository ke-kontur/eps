
package ru.acs.fts.schemas.album.rtnrequest;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * Сведения о ТС
 */
public class TSInfoType extends TransportMeansBaseType
{
    private String model;
    private CUOrganizationType TSOwner;

    /** 
     * Get the 'Model' element value. Модель
     * 
     * @return value
     */
    public String getModel() {
        return model;
    }

    /** 
     * Set the 'Model' element value. Модель
     * 
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /** 
     * Get the 'TSOwner' element value. Владелец ТС
     * 
     * @return value
     */
    public CUOrganizationType getTSOwner() {
        return TSOwner;
    }

    /** 
     * Set the 'TSOwner' element value. Владелец ТС
     * 
     * @param TSOwner
     */
    public void setTSOwner(CUOrganizationType TSOwner) {
        this.TSOwner = TSOwner;
    }
}
