
package ru.acs.fts.schemas.album.postalmanifest;

import org.joda.time.LocalDate;

/** 
 * ��������������� ���������/�������������
 */
public class RWTransportType
{
    private LocalDate sendDate;
    private String sendTime;
    private String transportNumber;
    private String direction;
    private String sealID;

    /** 
     * Get the 'SendDate' element value. ���� �����������
     * 
     * @return value
     */
    public LocalDate getSendDate() {
        return sendDate;
    }

    /** 
     * Set the 'SendDate' element value. ���� �����������
     * 
     * @param sendDate
     */
    public void setSendDate(LocalDate sendDate) {
        this.sendDate = sendDate;
    }

    /** 
     * Get the 'SendTime' element value. ����� �����������
     * 
     * @return value
     */
    public String getSendTime() {
        return sendTime;
    }

    /** 
     * Set the 'SendTime' element value. ����� �����������
     * 
     * @param sendTime
     */
    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    /** 
     * Get the 'TransportNumber' element value. ����� ������/����������
     * 
     * @return value
     */
    public String getTransportNumber() {
        return transportNumber;
    }

    /** 
     * Set the 'TransportNumber' element value. ����� ������/����������
     * 
     * @param transportNumber
     */
    public void setTransportNumber(String transportNumber) {
        this.transportNumber = transportNumber;
    }

    /** 
     * Get the 'Direction' element value. �����������
     * 
     * @return value
     */
    public String getDirection() {
        return direction;
    }

    /** 
     * Set the 'Direction' element value. �����������
     * 
     * @param direction
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }

    /** 
     * Get the 'SealID' element value. ����� ������
     * 
     * @return value
     */
    public String getSealID() {
        return sealID;
    }

    /** 
     * Set the 'SealID' element value. ����� ������
     * 
     * @param sealID
     */
    public void setSealID(String sealID) {
        this.sealID = sealID;
    }
}
