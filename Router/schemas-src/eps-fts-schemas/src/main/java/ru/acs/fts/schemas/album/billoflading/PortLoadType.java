
package ru.acs.fts.schemas.album.billoflading;

import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.PortType;

/** 
 * �������� � ��������/��������� ����� � �����
 */
public class PortLoadType extends PortType
{
    private String transferTime;

    /** 
     * Get the 'TransferTime' element value. ����� � �����, ������� ��������� �� �������� -���������, �������� �����.
     * 
     * @return value
     */
    public String getTransferTime() {
        return transferTime;
    }

    /** 
     * Set the 'TransferTime' element value. ����� � �����, ������� ��������� �� �������� -���������, �������� �����.
     * 
     * @param transferTime
     */
    public void setTransferTime(String transferTime) {
        this.transferTime = transferTime;
    }
}
