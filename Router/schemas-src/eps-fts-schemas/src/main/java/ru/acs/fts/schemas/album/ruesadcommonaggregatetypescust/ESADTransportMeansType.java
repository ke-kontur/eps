
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * �� � ��. ������������ �������� �� ������� / ������ ������. 
 */
public class ESADTransportMeansType
{
    private List<String> transportModeCodeList = new ArrayList<String>();
    private String transportNationalityCode;

    /** 
     * Get the list of 'TransportModeCode' element items. ��� ���� ���������/ ������������� �������� �� �������������� ����� ���������� � ��������������� �������. ��� ���������� 25 ����� ������ ����������� ������ ���� �������.
     * 
     * @return list
     */
    public List<String> getTransportModeCodeList() {
        return transportModeCodeList;
    }

    /** 
     * Set the list of 'TransportModeCode' element items. ��� ���� ���������/ ������������� �������� �� �������������� ����� ���������� � ��������������� �������. ��� ���������� 25 ����� ������ ����������� ������ ���� �������.
     * 
     * @param list
     */
    public void setTransportModeCodeList(List<String> list) {
        transportModeCodeList = list;
    }

    /** 
     * Get the 'TransportNationalityCode' element value. ��������� ��� ������ �������������� ������������ ������� �� ��������������� �������������� ����� ����. 00-������/����������
     * 
     * @return value
     */
    public String getTransportNationalityCode() {
        return transportNationalityCode;
    }

    /** 
     * Set the 'TransportNationalityCode' element value. ��������� ��� ������ �������������� ������������ ������� �� ��������������� �������������� ����� ����. 00-������/����������
     * 
     * @param transportNationalityCode
     */
    public void setTransportNationalityCode(String transportNationalityCode) {
        this.transportNationalityCode = transportNationalityCode;
    }
}
