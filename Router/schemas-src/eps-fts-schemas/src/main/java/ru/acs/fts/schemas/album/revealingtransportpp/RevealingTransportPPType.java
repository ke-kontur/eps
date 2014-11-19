
package ru.acs.fts.schemas.album.revealingtransportpp;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ��������� � ��������/������ ������������� ��������
 */
public class RevealingTransportPPType extends BaseDocType
{
    private ServiceInfoType serviceInfo;
    private TransportType transport;
    private List<ConsignmentType> consignmentList = new ArrayList<ConsignmentType>();
    private GTDIDType registrationNumber;
    private String documentModeID;

    /** 
     * Get the 'ServiceInfo' element value. ��������� ����������
     * 
     * @return value
     */
    public ServiceInfoType getServiceInfo() {
        return serviceInfo;
    }

    /** 
     * Set the 'ServiceInfo' element value. ��������� ����������
     * 
     * @param serviceInfo
     */
    public void setServiceInfo(ServiceInfoType serviceInfo) {
        this.serviceInfo = serviceInfo;
    }

    /** 
     * Get the 'Transport' element value. �������� � ������������ ��������
     * 
     * @return value
     */
    public TransportType getTransport() {
        return transport;
    }

    /** 
     * Set the 'Transport' element value. �������� � ������������ ��������
     * 
     * @param transport
     */
    public void setTransport(TransportType transport) {
        this.transport = transport;
    }

    /** 
     * Get the list of 'Consignment' element items. �������� � �������� ������
     * 
     * @return list
     */
    public List<ConsignmentType> getConsignmentList() {
        return consignmentList;
    }

    /** 
     * Set the list of 'Consignment' element items. �������� � �������� ������
     * 
     * @param list
     */
    public void setConsignmentList(List<ConsignmentType> list) {
        consignmentList = list;
    }

    /** 
     * Get the 'RegistrationNumber' element value. ��������������� ����� ����������� � �������� / ������.
     * 
     * @return value
     */
    public GTDIDType getRegistrationNumber() {
        return registrationNumber;
    }

    /** 
     * Set the 'RegistrationNumber' element value. ��������������� ����� ����������� � �������� / ������.
     * 
     * @param registrationNumber
     */
    public void setRegistrationNumber(GTDIDType registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ��������� (��� ��������� � ������� �������� ��� ��)
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ��������� (��� ��������� � ������� �������� ��� ��)
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
