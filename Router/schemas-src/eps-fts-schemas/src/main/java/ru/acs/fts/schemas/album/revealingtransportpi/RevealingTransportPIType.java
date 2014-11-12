
package ru.acs.fts.schemas.album.revealingtransportpi;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Сообщение о прибытии/убытии транспортного средства
 */
public class RevealingTransportPIType extends BaseDocType
{
    private ServiceInfoType serviceInfo;
    private CarInformationType carInformation;
    private List<ConsignmentType> consignmentList = new ArrayList<ConsignmentType>();
    private String documentModeID;

    /** 
     * Get the 'ServiceInfo' element value. Служебная информация
     * 
     * @return value
     */
    public ServiceInfoType getServiceInfo() {
        return serviceInfo;
    }

    /** 
     * Set the 'ServiceInfo' element value. Служебная информация
     * 
     * @param serviceInfo
     */
    public void setServiceInfo(ServiceInfoType serviceInfo) {
        this.serviceInfo = serviceInfo;
    }

    /** 
     * Get the 'CarInformation' element value. Сведения об автомобильном транспорте
     * 
     * @return value
     */
    public CarInformationType getCarInformation() {
        return carInformation;
    }

    /** 
     * Set the 'CarInformation' element value. Сведения об автомобильном транспорте
     * 
     * @param carInformation
     */
    public void setCarInformation(CarInformationType carInformation) {
        this.carInformation = carInformation;
    }

    /** 
     * Get the list of 'Consignment' element items. Сведения о товарной партии
     * 
     * @return list
     */
    public List<ConsignmentType> getConsignmentList() {
        return consignmentList;
    }

    /** 
     * Set the list of 'Consignment' element items. Сведения о товарной партии
     * 
     * @param list
     */
    public void setConsignmentList(List<ConsignmentType> list) {
        consignmentList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
