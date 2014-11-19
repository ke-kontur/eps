
package ru.acs.fts.schemas.album.housemanifest;

import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.AWBNumberType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.AirportType;

/** 
 * ��������� ���������
 */
public class HeaderType
{
    private AirportType originLocation;
    private AirportType destinationLocation;
    private AWBNumberType masterWaybillNumber;

    /** 
     * Get the 'OriginLocation' element value. ����� �������������
     * 
     * @return value
     */
    public AirportType getOriginLocation() {
        return originLocation;
    }

    /** 
     * Set the 'OriginLocation' element value. ����� �������������
     * 
     * @param originLocation
     */
    public void setOriginLocation(AirportType originLocation) {
        this.originLocation = originLocation;
    }

    /** 
     * Get the 'DestinationLocation' element value. ����� ����������
     * 
     * @return value
     */
    public AirportType getDestinationLocation() {
        return destinationLocation;
    }

    /** 
     * Set the 'DestinationLocation' element value. ����� ����������
     * 
     * @param destinationLocation
     */
    public void setDestinationLocation(AirportType destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    /** 
     * Get the 'MasterWaybillNumber' element value. �������� ����� ������� ���������
     * 
     * @return value
     */
    public AWBNumberType getMasterWaybillNumber() {
        return masterWaybillNumber;
    }

    /** 
     * Set the 'MasterWaybillNumber' element value. �������� ����� ������� ���������
     * 
     * @param masterWaybillNumber
     */
    public void setMasterWaybillNumber(AWBNumberType masterWaybillNumber) {
        this.masterWaybillNumber = masterWaybillNumber;
    }
}
