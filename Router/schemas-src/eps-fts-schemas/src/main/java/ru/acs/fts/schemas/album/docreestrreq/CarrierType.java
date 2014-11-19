
package ru.acs.fts.schemas.album.docreestrreq;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * ����������
 */
public class CarrierType extends CUOrganizationType
{
    private String isForeign;

    /** 
     * Get the 'IsForeign' element value. ������ �����������: 0 - ����������; 1 - �����������
     * 
     * @return value
     */
    public String getIsForeign() {
        return isForeign;
    }

    /** 
     * Set the 'IsForeign' element value. ������ �����������: 0 - ����������; 1 - �����������
     * 
     * @param isForeign
     */
    public void setIsForeign(String isForeign) {
        this.isForeign = isForeign;
    }
}
