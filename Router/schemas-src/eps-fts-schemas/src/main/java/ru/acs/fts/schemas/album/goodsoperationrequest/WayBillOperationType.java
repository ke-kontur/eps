
package ru.acs.fts.schemas.album.goodsoperationrequest;

import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.AWBNumberType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.FlightInfoType;

/** 
 * �������� �� ��������� � ������ �� ���������
 */
public class WayBillOperationType
{
    private String operation;
    private String reasons;
    private FlightInfoType newFlightInfo;
    private AWBNumberType wayBillNumber;

    /** 
     * Get the 'Operation' element value. �������� � ������: 1 - ��������; 2 - ���������� (���������); 3 - ��������; 4 - ���������� �������� � ������
     * 
     * @return value
     */
    public String getOperation() {
        return operation;
    }

    /** 
     * Set the 'Operation' element value. �������� � ������: 1 - ��������; 2 - ���������� (���������); 3 - ��������; 4 - ���������� �������� � ������
     * 
     * @param operation
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /** 
     * Get the 'Reasons' element value. ���������
     * 
     * @return value
     */
    public String getReasons() {
        return reasons;
    }

    /** 
     * Set the 'Reasons' element value. ���������
     * 
     * @param reasons
     */
    public void setReasons(String reasons) {
        this.reasons = reasons;
    }

    /** 
     * Get the 'NewFlightInfo' element value. �������� � ����� �����
     * 
     * @return value
     */
    public FlightInfoType getNewFlightInfo() {
        return newFlightInfo;
    }

    /** 
     * Set the 'NewFlightInfo' element value. �������� � ����� �����
     * 
     * @param newFlightInfo
     */
    public void setNewFlightInfo(FlightInfoType newFlightInfo) {
        this.newFlightInfo = newFlightInfo;
    }

    /** 
     * Get the 'WayBillNumber' element value. ����� ���������
     * 
     * @return value
     */
    public AWBNumberType getWayBillNumber() {
        return wayBillNumber;
    }

    /** 
     * Set the 'WayBillNumber' element value. ����� ���������
     * 
     * @param wayBillNumber
     */
    public void setWayBillNumber(AWBNumberType wayBillNumber) {
        this.wayBillNumber = wayBillNumber;
    }
}
