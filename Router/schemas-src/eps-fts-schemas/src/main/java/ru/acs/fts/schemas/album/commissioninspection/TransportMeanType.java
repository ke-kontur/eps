
package ru.acs.fts.schemas.album.commissioninspection;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUTransportMeansType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * �������� � ����������
 */
public class TransportMeanType extends CUTransportMeansType
{
    private List<TransportMeansBaseType> transportMeanList = new ArrayList<TransportMeansBaseType>();

    /** 
     * Get the list of 'TransportMeans' element items. ������������ ��������
     * 
     * @return list
     */
    public List<TransportMeansBaseType> getTransportMeanList() {
        return transportMeanList;
    }

    /** 
     * Set the list of 'TransportMeans' element items. ������������ ��������
     * 
     * @param list
     */
    public void setTransportMeanList(List<TransportMeansBaseType> list) {
        transportMeanList = list;
    }
}
