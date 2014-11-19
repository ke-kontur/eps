
package ru.acs.fts.schemas.album.goodscomponentlist;

/** 
 * Сведения о компоненте функционального блока
 */
public class MechUnitPartType
        extends
            ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.MechUnitPartType
{
    private String serviceID;

    /** 
     * Get the 'ServiceID' element value. Служебный номер компонента
     * 
     * @return value
     */
    public String getServiceID() {
        return serviceID;
    }

    /** 
     * Set the 'ServiceID' element value. Служебный номер компонента
     * 
     * @param serviceID
     */
    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }
}
