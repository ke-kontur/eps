
package ru.acs.fts.schemas.album.measuringprotocol;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� �� ���������� ������ ������� ������� ��������������, ����������� � (��) ������ (����������)
 */
public class MeasuringTransportLogsType
{
    private String transportType;
    private String transportIdentifier;
    private List<PileMeasuringInfoType> pileMeasuringInfoList = new ArrayList<PileMeasuringInfoType>();

    /** 
     * Get the 'TransportType' element value. ��� ������������� ��������: 1 - �����; 2 - ����������; 3 - ������
     * 
     * @return value
     */
    public String getTransportType() {
        return transportType;
    }

    /** 
     * Set the 'TransportType' element value. ��� ������������� ��������: 1 - �����; 2 - ����������; 3 - ������
     * 
     * @param transportType
     */
    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    /** 
     * Get the 'TransportIdentifier' element value. ����� ������������� ��������
     * 
     * @return value
     */
    public String getTransportIdentifier() {
        return transportIdentifier;
    }

    /** 
     * Set the 'TransportIdentifier' element value. ����� ������������� ��������
     * 
     * @param transportIdentifier
     */
    public void setTransportIdentifier(String transportIdentifier) {
        this.transportIdentifier = transportIdentifier;
    }

    /** 
     * Get the list of 'PileMeasuringInfo' element items. ���������� ��������� �������
     * 
     * @return list
     */
    public List<PileMeasuringInfoType> getPileMeasuringInfoList() {
        return pileMeasuringInfoList;
    }

    /** 
     * Set the list of 'PileMeasuringInfo' element items. ���������� ��������� �������
     * 
     * @param list
     */
    public void setPileMeasuringInfoList(List<PileMeasuringInfoType> list) {
        pileMeasuringInfoList = list;
    }
}
