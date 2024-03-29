
package ru.acs.fts.schemas.album.revealingtransportpp;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� � ��������������� ����������
 */
public class TrainInformationType
{
    private String transportModeCode;
    private List<String> wagonNumberList = new ArrayList<String>();

    /** 
     * Get the 'TransportModeCode' element value. ��� ���� ������������� �������� �� �������������� ����� ���������� � ��������������� �������.
     * 
     * @return value
     */
    public String getTransportModeCode() {
        return transportModeCode;
    }

    /** 
     * Set the 'TransportModeCode' element value. ��� ���� ������������� �������� �� �������������� ����� ���������� � ��������������� �������.
     * 
     * @param transportModeCode
     */
    public void setTransportModeCode(String transportModeCode) {
        this.transportModeCode = transportModeCode;
    }

    /** 
     * Get the list of 'WagonNumber' element items. ����� ������
     * 
     * @return list
     */
    public List<String> getWagonNumberList() {
        return wagonNumberList;
    }

    /** 
     * Set the list of 'WagonNumber' element items. ����� ������
     * 
     * @param list
     */
    public void setWagonNumberList(List<String> list) {
        wagonNumberList = list;
    }
}
