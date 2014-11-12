
package ru.acs.fts.schemas.album.docreestrreq;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * Перевозчик
 */
public class CarrierType extends CUOrganizationType
{
    private String isForeign;

    /** 
     * Get the 'IsForeign' element value. Статус перевозчика: 0 - российский; 1 - иностранный
     * 
     * @return value
     */
    public String getIsForeign() {
        return isForeign;
    }

    /** 
     * Set the 'IsForeign' element value. Статус перевозчика: 0 - российский; 1 - иностранный
     * 
     * @param isForeign
     */
    public void setIsForeign(String isForeign) {
        this.isForeign = isForeign;
    }
}
