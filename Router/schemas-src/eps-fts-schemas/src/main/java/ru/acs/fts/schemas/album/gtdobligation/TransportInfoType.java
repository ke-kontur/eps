
package ru.acs.fts.schemas.album.gtdobligation;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUTransportMeansType;

/** 
 * �������� � ����������
 */
public class TransportInfoType extends CUTransportMeansType
{
    private String transportSign;
    private String quantity;
    private List<TransportType> transportMeanList = new ArrayList<TransportType>();

    /** 
     * Get the 'TransportSign' element value. ������� ������������� ��������: 0 - ��� �����������/�������� (18); 1 - �� ������� (21)
     * 
     * @return value
     */
    public String getTransportSign() {
        return transportSign;
    }

    /** 
     * Set the 'TransportSign' element value. ������� ������������� ��������: 0 - ��� �����������/�������� (18); 1 - �� ������� (21)
     * 
     * @param transportSign
     */
    public void setTransportSign(String transportSign) {
        this.transportSign = transportSign;
    }

    /** 
     * Get the 'Quantity' element value. ����� ���������� ������������ �������
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. ����� ���������� ������������ �������
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the list of 'TransportMeans' element items. �������� ������������� ��������
     * 
     * @return list
     */
    public List<TransportType> getTransportMeanList() {
        return transportMeanList;
    }

    /** 
     * Set the list of 'TransportMeans' element items. �������� ������������� ��������
     * 
     * @param list
     */
    public void setTransportMeanList(List<TransportType> list) {
        transportMeanList = list;
    }
}
