
package ru.acs.fts.schemas.album.pi_seaarrive;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� � ����������
 */
public class PassengersType
{
    private String RFPassengersCount;
    private String foreignPassengerCount;
    private List<PassengerInfoType> passengerInfoList = new ArrayList<PassengerInfoType>();

    /** 
     * Get the 'RFPassengersCount' element value. ���������� ���������� �������
     * 
     * @return value
     */
    public String getRFPassengersCount() {
        return RFPassengersCount;
    }

    /** 
     * Set the 'RFPassengersCount' element value. ���������� ���������� �������
     * 
     * @param RFPassengersCount
     */
    public void setRFPassengersCount(String RFPassengersCount) {
        this.RFPassengersCount = RFPassengersCount;
    }

    /** 
     * Get the 'ForeignPassengerCount' element value. ���������� ����������� �������
     * 
     * @return value
     */
    public String getForeignPassengerCount() {
        return foreignPassengerCount;
    }

    /** 
     * Set the 'ForeignPassengerCount' element value. ���������� ����������� �������
     * 
     * @param foreignPassengerCount
     */
    public void setForeignPassengerCount(String foreignPassengerCount) {
        this.foreignPassengerCount = foreignPassengerCount;
    }

    /** 
     * Get the list of 'PassengerInfo' element items. �������� � ���������
     * 
     * @return list
     */
    public List<PassengerInfoType> getPassengerInfoList() {
        return passengerInfoList;
    }

    /** 
     * Set the list of 'PassengerInfo' element items. �������� � ���������
     * 
     * @param list
     */
    public void setPassengerInfoList(List<PassengerInfoType> list) {
        passengerInfoList = list;
    }
}
