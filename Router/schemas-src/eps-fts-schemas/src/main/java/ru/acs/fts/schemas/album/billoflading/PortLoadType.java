
package ru.acs.fts.schemas.album.billoflading;

import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.PortType;

/** 
 * Сведения о погрузке/разгрузке груза в порту
 */
public class PortLoadType extends PortType
{
    private String transferTime;

    /** 
     * Get the 'TransferTime' element value. Время в часах, которое отводится на погрузку -разгрузку, передачу груза.
     * 
     * @return value
     */
    public String getTransferTime() {
        return transferTime;
    }

    /** 
     * Set the 'TransferTime' element value. Время в часах, которое отводится на погрузку -разгрузку, передачу груза.
     * 
     * @param transferTime
     */
    public void setTransferTime(String transferTime) {
        this.transferTime = transferTime;
    }
}
