
package ru.acs.fts.schemas.album.permitchangedata;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Регистрационный номер КДТ
 */
public class KDTRegNumberType extends GTDIDType
{
    private String serialNumber;

    /** 
     * Get the 'SerialNumber' element value. Порядковый номер КДТ к ДТ, сведения в которой изменяются и (или) дополняются
     * 
     * @return value
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /** 
     * Set the 'SerialNumber' element value. Порядковый номер КДТ к ДТ, сведения в которой изменяются и (или) дополняются
     * 
     * @param serialNumber
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
