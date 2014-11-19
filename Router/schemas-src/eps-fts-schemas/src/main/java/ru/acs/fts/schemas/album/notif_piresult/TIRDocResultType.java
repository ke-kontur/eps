
package ru.acs.fts.schemas.album.notif_piresult;

import ru.acs.fts.schemas.album.priorcommonaggregatetypescust.TIRIDType;

/** 
 * Информация по книжке МДП
 */
public class TIRDocResultType extends TIRIDType
{
    private String PIStatus;

    /** 
     * Get the 'PI_Status' element value. Статус предварительной информации
     * 
     * @return value
     */
    public String getPIStatus() {
        return PIStatus;
    }

    /** 
     * Set the 'PI_Status' element value. Статус предварительной информации
     * 
     * @param PIStatus
     */
    public void setPIStatus(String PIStatus) {
        this.PIStatus = PIStatus;
    }
}
