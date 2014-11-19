
package ru.acs.fts.schemas.album.esadout_cu;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUTransportMeansType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * Транспортные средства при отправлении/прибытии. Гр. 18, 26 ДТ
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
     * Get the 'TransportMeansQuantity' element value. Количество транспортных средств
     * 
     * @return value
     */
    public String getTransportMeansQuantity() {
        return transportMeansQuantity;
    }

    /** 
     * Set the 'TransportMeansQuantity' element value. Количество транспортных средств
     * 
     * @param transportMeansQuantity
     */
    public void setTransportMeansQuantity(String transportMeansQuantity) {
        this.transportMeansQuantity = transportMeansQuantity;
    }

    /** 
     * Get the 'MethodTransport' element value. Способ транспортировки товаров при перемещении по линиям электропередачи или трубопроводным транспортом : 1- газопровод, 2 -нефтепровод, 3- нефтепродуктопровод, 4- линия электропередачи
     * 
     * @return value
     */
    public String getMethodTransport() {
        return methodTransport;
    }

    /** 
     * Set the 'MethodTransport' element value. Способ транспортировки товаров при перемещении по линиям электропередачи или трубопроводным транспортом : 1- газопровод, 2 -нефтепровод, 3- нефтепродуктопровод, 4- линия электропередачи
     * 
     * @param methodTransport
     */
    public void setMethodTransport(String methodTransport) {
        this.methodTransport = methodTransport;
    }

    /** 
     * Get the 'NameObject' element value. Наименование объекта, на котором установлены приборы учета товаров, перемещаемых по линиям электропередачи или трубопроводным транспортом
     * 
     * @return value
     */
    public String getNameObject() {
        return nameObject;
    }

    /** 
     * Set the 'NameObject' element value. Наименование объекта, на котором установлены приборы учета товаров, перемещаемых по линиям электропередачи или трубопроводным транспортом
     * 
     * @param nameObject
     */
    public void setNameObject(String nameObject) {
        this.nameObject = nameObject;
    }

    /** 
     * Get the list of 'TransportMeans' element items. Описание транспортного средства
     * 
     * @return list
     */
    public List<TransportMeansBaseType> getTransportMeanList() {
        return transportMeanList;
    }

    /** 
     * Set the list of 'TransportMeans' element items. Описание транспортного средства
     * 
     * @param list
     */
    public void setTransportMeanList(List<TransportMeansBaseType> list) {
        transportMeanList = list;
    }
}
