
package ru.acs.fts.schemas.album.esadout_cu;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUTransportMeansType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * ������������ �������� ��� �����������/��������. ��. 18, 26 ��
 */
public class ESADoutCUDepartureArrivalTransportType
        extends
            CUTransportMeansType
{
    private String transportMeansQuantity;
    private String methodTransport;
    private String nameObject;
    private List<TransportMeansBaseType> transportMeanList = new ArrayList<TransportMeansBaseType>();

    /** 
     * Get the 'TransportMeansQuantity' element value. ���������� ������������ �������
     * 
     * @return value
     */
    public String getTransportMeansQuantity() {
        return transportMeansQuantity;
    }

    /** 
     * Set the 'TransportMeansQuantity' element value. ���������� ������������ �������
     * 
     * @param transportMeansQuantity
     */
    public void setTransportMeansQuantity(String transportMeansQuantity) {
        this.transportMeansQuantity = transportMeansQuantity;
    }

    /** 
     * Get the 'MethodTransport' element value. ������ ��������������� ������� ��� ����������� �� ������ ��������������� ��� �������������� ����������� : 1- ����������, 2 -�����������, 3- �������������������, 4- ����� ���������������
     * 
     * @return value
     */
    public String getMethodTransport() {
        return methodTransport;
    }

    /** 
     * Set the 'MethodTransport' element value. ������ ��������������� ������� ��� ����������� �� ������ ��������������� ��� �������������� ����������� : 1- ����������, 2 -�����������, 3- �������������������, 4- ����� ���������������
     * 
     * @param methodTransport
     */
    public void setMethodTransport(String methodTransport) {
        this.methodTransport = methodTransport;
    }

    /** 
     * Get the 'NameObject' element value. ������������ �������, �� ������� ����������� ������� ����� �������, ������������ �� ������ ��������������� ��� �������������� �����������
     * 
     * @return value
     */
    public String getNameObject() {
        return nameObject;
    }

    /** 
     * Set the 'NameObject' element value. ������������ �������, �� ������� ����������� ������� ����� �������, ������������ �� ������ ��������������� ��� �������������� �����������
     * 
     * @param nameObject
     */
    public void setNameObject(String nameObject) {
        this.nameObject = nameObject;
    }

    /** 
     * Get the list of 'TransportMeans' element items. �������� ������������� ��������
     * 
     * @return list
     */
    public List<TransportMeansBaseType> getTransportMeanList() {
        return transportMeanList;
    }

    /** 
     * Set the list of 'TransportMeans' element items. �������� ������������� ��������
     * 
     * @param list
     */
    public void setTransportMeanList(List<TransportMeansBaseType> list) {
        transportMeanList = list;
    }
}
