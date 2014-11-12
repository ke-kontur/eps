
package ru.acs.fts.schemas.album.oez_exportpass;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� ������������� �������� 
 */
public class TransportMeansType
{
    private String transportKind;
    private String transportMark;
    private List<String> transportRegNumberList = new ArrayList<String>();
    private String activeTransportIdentifier;

    /** 
     * Get the 'TransportKind' element value. ��� ������������� ��������: 1 - �/�; 2 - �/�; 3 - ����
     * 
     * @return value
     */
    public String getTransportKind() {
        return transportKind;
    }

    /** 
     * Set the 'TransportKind' element value. ��� ������������� ��������: 1 - �/�; 2 - �/�; 3 - ����
     * 
     * @param transportKind
     */
    public void setTransportKind(String transportKind) {
        this.transportKind = transportKind;
    }

    /** 
     * Get the 'TransportMark' element value. ����� ������������� ��������
     * 
     * @return value
     */
    public String getTransportMark() {
        return transportMark;
    }

    /** 
     * Set the 'TransportMark' element value. ����� ������������� ��������
     * 
     * @param transportMark
     */
    public void setTransportMark(String transportMark) {
        this.transportMark = transportMark;
    }

    /** 
     * Get the list of 'TransportRegNumber' element items. ��������������� ����� �������/����������� 
     * 
     * @return list
     */
    public List<String> getTransportRegNumberList() {
        return transportRegNumberList;
    }

    /** 
     * Set the list of 'TransportRegNumber' element items. ��������������� ����� �������/����������� 
     * 
     * @param list
     */
    public void setTransportRegNumberList(List<String> list) {
        transportRegNumberList = list;
    }

    /** 
     * Get the 'ActiveTransportIdentifier' element value. ������������� ��������� ������������� �������� ��� ��������, ������������ � ��.
     * 
     * @return value
     */
    public String getActiveTransportIdentifier() {
        return activeTransportIdentifier;
    }

    /** 
     * Set the 'ActiveTransportIdentifier' element value. ������������� ��������� ������������� �������� ��� ��������, ������������ � ��.
     * 
     * @param activeTransportIdentifier
     */
    public void setActiveTransportIdentifier(String activeTransportIdentifier) {
        this.activeTransportIdentifier = activeTransportIdentifier;
    }
}
