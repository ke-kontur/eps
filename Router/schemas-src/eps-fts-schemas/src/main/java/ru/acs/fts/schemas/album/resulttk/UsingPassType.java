
package ru.acs.fts.schemas.album.resulttk;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Использование спец.разрешения на поездку
 */
public class UsingPassType extends DocumentBaseType
{
    private String controlStatusName;

    /** 
     * Get the 'ControlStatusName' element value. Статус проверки разрешения
     * 
     * @return value
     */
    public String getControlStatusName() {
        return controlStatusName;
    }

    /** 
     * Set the 'ControlStatusName' element value. Статус проверки разрешения
     * 
     * @param controlStatusName
     */
    public void setControlStatusName(String controlStatusName) {
        this.controlStatusName = controlStatusName;
    }
}
