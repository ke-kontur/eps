
package ru.acs.fts.schemas.album.resulttk;

import java.util.ArrayList;
import java.util.List;

/** 
 * ������� ��������� ��
 */
public class WeightType
{
    private List<String> pinList = new ArrayList<String>();
    private String total;
    private String pinCount;
    private List<String> distanceList = new ArrayList<String>();
    private String cargo;

    /** 
     * Get the list of 'Pin' element items. ������ �������� �� ������ ���, �
     * 
     * @return list
     */
    public List<String> getPinList() {
        return pinList;
    }

    /** 
     * Set the list of 'Pin' element items. ������ �������� �� ������ ���, �
     * 
     * @param list
     */
    public void setPinList(List<String> list) {
        pinList = list;
    }

    /** 
     * Get the 'Total' element value. ��������� �������� �� ��� ��
     * 
     * @return value
     */
    public String getTotal() {
        return total;
    }

    /** 
     * Set the 'Total' element value. ��������� �������� �� ��� ��
     * 
     * @param total
     */
    public void setTotal(String total) {
        this.total = total;
    }

    /** 
     * Get the 'PinCount' element value. ���������� ���� ��
     * 
     * @return value
     */
    public String getPinCount() {
        return pinCount;
    }

    /** 
     * Set the 'PinCount' element value. ���������� ���� ��
     * 
     * @param pinCount
     */
    public void setPinCount(String pinCount) {
        this.pinCount = pinCount;
    }

    /** 
     * Get the list of 'Distance' element items. ������ ���������� ����� �����, �
     * 
     * @return list
     */
    public List<String> getDistanceList() {
        return distanceList;
    }

    /** 
     * Set the list of 'Distance' element items. ������ ���������� ����� �����, �
     * 
     * @param list
     */
    public void setDistanceList(List<String> list) {
        distanceList = list;
    }

    /** 
     * Get the 'Cargo' element value. ��� �����, �
     * 
     * @return value
     */
    public String getCargo() {
        return cargo;
    }

    /** 
     * Set the 'Cargo' element value. ��� �����, �
     * 
     * @param cargo
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
