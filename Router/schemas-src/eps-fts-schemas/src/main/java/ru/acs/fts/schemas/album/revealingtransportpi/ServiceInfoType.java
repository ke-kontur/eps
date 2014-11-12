
package ru.acs.fts.schemas.album.revealingtransportpi;

import org.joda.time.LocalDate;

/** 
 * ��������� ����������
 */
public class ServiceInfoType
{
    private String transportID;
    private LocalDate crossDate;
    private String customsArriveID;
    private String arriveDateTime;
    private String expDTNumber;

    /** 
     * Get the 'TransportID' element value. ���������� ����������������� ����� ��������������� ����������
     * 
     * @return value
     */
    public String getTransportID() {
        return transportID;
    }

    /** 
     * Set the 'TransportID' element value. ���������� ����������������� ����� ��������������� ����������
     * 
     * @param transportID
     */
    public void setTransportID(String transportID) {
        this.transportID = transportID;
    }

    /** 
     * Get the 'CrossDate' element value. ���� ����������� ��������������� ���������� �� ������ ��� ������
     * 
     * @return value
     */
    public LocalDate getCrossDate() {
        return crossDate;
    }

    /** 
     * Set the 'CrossDate' element value. ���� ����������� ��������������� ���������� �� ������ ��� ������
     * 
     * @param crossDate
     */
    public void setCrossDate(LocalDate crossDate) {
        this.crossDate = crossDate;
    }

    /** 
     * Get the 'CustomsArriveID' element value. ��� ����������� ������, � ������� ����������� �������� ������� �� ���������� ���������� ����������� ����� (����)
     * 
     * @return value
     */
    public String getCustomsArriveID() {
        return customsArriveID;
    }

    /** 
     * Set the 'CustomsArriveID' element value. ��� ����������� ������, � ������� ����������� �������� ������� �� ���������� ���������� ����������� ����� (����)
     * 
     * @param customsArriveID
     */
    public void setCustomsArriveID(String customsArriveID) {
        this.customsArriveID = customsArriveID;
    }

    /** 
     * Get the 'ArriveDateTime' element value. ���� � ����� ������������ �������� ������ �� ���������� ���������� ����������� �����
     * 
     * @return value
     */
    public String getArriveDateTime() {
        return arriveDateTime;
    }

    /** 
     * Set the 'ArriveDateTime' element value. ���� � ����� ������������ �������� ������ �� ���������� ���������� ����������� �����
     * 
     * @param arriveDateTime
     */
    public void setArriveDateTime(String arriveDateTime) {
        this.arriveDateTime = arriveDateTime;
    }

    /** 
     * Get the 'Exp_DTNumber' element value. ����� ���������� ���������� �� ������
     * 
     * @return value
     */
    public String getExpDTNumber() {
        return expDTNumber;
    }

    /** 
     * Set the 'Exp_DTNumber' element value. ����� ���������� ���������� �� ������
     * 
     * @param expDTNumber
     */
    public void setExpDTNumber(String expDTNumber) {
        this.expDTNumber = expDTNumber;
    }
}
