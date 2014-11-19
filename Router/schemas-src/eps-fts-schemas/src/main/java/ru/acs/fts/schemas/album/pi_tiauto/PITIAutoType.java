
package ru.acs.fts.schemas.album.pi_tiauto;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ��������������� ���������� � ��������� �������� �������� ����������� ������ ����-, ���������������� ������� ��� ������� �����������
 */
public class PITIAutoType extends BaseDocType
{
    private TransportMeanCardType transportMeanCard;
    private TransportPersonType transportDriver;
    private TransportPersonType transportOwner;
    private String documentModeID;

    /** 
     * Get the 'TransportMeanCard' element value. �������� ������������� ��������. �������� � ������������ ��������
     * 
     * @return value
     */
    public TransportMeanCardType getTransportMeanCard() {
        return transportMeanCard;
    }

    /** 
     * Set the 'TransportMeanCard' element value. �������� ������������� ��������. �������� � ������������ ��������
     * 
     * @param transportMeanCard
     */
    public void setTransportMeanCard(TransportMeanCardType transportMeanCard) {
        this.transportMeanCard = transportMeanCard;
    }

    /** 
     * Get the 'TransportDriver' element value. ���������� � ��������� (��������) ������������� ��������
     * 
     * @return value
     */
    public TransportPersonType getTransportDriver() {
        return transportDriver;
    }

    /** 
     * Set the 'TransportDriver' element value. ���������� � ��������� (��������) ������������� ��������
     * 
     * @param transportDriver
     */
    public void setTransportDriver(TransportPersonType transportDriver) {
        this.transportDriver = transportDriver;
    }

    /** 
     * Get the 'TransportOwner' element value. ���������� � ������������ ������������� ��������
     * 
     * @return value
     */
    public TransportPersonType getTransportOwner() {
        return transportOwner;
    }

    /** 
     * Set the 'TransportOwner' element value. ���������� � ������������ ������������� ��������
     * 
     * @param transportOwner
     */
    public void setTransportOwner(TransportPersonType transportOwner) {
        this.transportOwner = transportOwner;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
