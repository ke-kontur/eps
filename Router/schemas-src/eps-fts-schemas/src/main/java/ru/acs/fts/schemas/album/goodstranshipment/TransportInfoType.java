
package ru.acs.fts.schemas.album.goodstranshipment;

import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * Новое транспортное средство при отправлении
 */
public class TransportInfoType extends TransportMeansBaseType
{
    private String mode;

    /** 
     * Get the 'Mode' element value. Код вида транспортного средства
     * 
     * @return value
     */
    public String getMode() {
        return mode;
    }

    /** 
     * Set the 'Mode' element value. Код вида транспортного средства
     * 
     * @param mode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }
}
