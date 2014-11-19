
package ru.acs.fts.schemas.album.esadin;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUConsigmentType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADReloadingInfoType;

/** 
 * �� � ��. ���������� ������. �������� � ��������� ������� ��. 15, 15�, 17,17�, 18, 19, 21, 25, 26, 29
 */
public class ESADinConsigmentType extends CUConsigmentType
{
    private LocalDate dateExpectedArrival;
    private String timeExpectedArrival;
    private ESADinDepartureArrivalTransportType ESADinDepartureArrivalTransport;
    private ESADinBorderTransportType ESADinBorderTransportMeans;
    private List<ESADReloadingInfoType> ESADinReloadingInfoList = new ArrayList<ESADReloadingInfoType>();
    private CUCustomsType deliveryCustomsOffice;
    private CUCustomsType PPBorderCustoms;

    /** 
     * Get the 'DateExpectedArrival' element value. ���� ���������� �������� ������� � ������������ ������� � ����������� ����� ��������. ��
     * 
     * @return value
     */
    public LocalDate getDateExpectedArrival() {
        return dateExpectedArrival;
    }

    /** 
     * Set the 'DateExpectedArrival' element value. ���� ���������� �������� ������� � ������������ ������� � ����������� ����� ��������. ��
     * 
     * @param dateExpectedArrival
     */
    public void setDateExpectedArrival(LocalDate dateExpectedArrival) {
        this.dateExpectedArrival = dateExpectedArrival;
    }

    /** 
     * Get the 'TimeExpectedArrival' element value. ����� ���������� �������� ������� � ������������ ������� � ����������� ����� ��������. ��
     * 
     * @return value
     */
    public String getTimeExpectedArrival() {
        return timeExpectedArrival;
    }

    /** 
     * Set the 'TimeExpectedArrival' element value. ����� ���������� �������� ������� � ������������ ������� � ����������� ����� ��������. ��
     * 
     * @param timeExpectedArrival
     */
    public void setTimeExpectedArrival(String timeExpectedArrival) {
        this.timeExpectedArrival = timeExpectedArrival;
    }

    /** 
     * Get the 'ESADinDepartureArrivalTransport' element value. �� � ��. ���������� ������. ������������ �������� ��� ��������/������. ��. 18, 26 ��
     * 
     * @return value
     */
    public ESADinDepartureArrivalTransportType getESADinDepartureArrivalTransport() {
        return ESADinDepartureArrivalTransport;
    }

    /** 
     * Set the 'ESADinDepartureArrivalTransport' element value. �� � ��. ���������� ������. ������������ �������� ��� ��������/������. ��. 18, 26 ��
     * 
     * @param ESADinDepartureArrivalTransport
     */
    public void setESADinDepartureArrivalTransport(
            ESADinDepartureArrivalTransportType ESADinDepartureArrivalTransport) {
        this.ESADinDepartureArrivalTransport = ESADinDepartureArrivalTransport;
    }

    /** 
     * Get the 'ESADinBorderTransportMeans' element value. �� � ��. ���������� ������. ������������ �������� �� �������. ��. 21, 25 ��
     * 
     * @return value
     */
    public ESADinBorderTransportType getESADinBorderTransportMeans() {
        return ESADinBorderTransportMeans;
    }

    /** 
     * Set the 'ESADinBorderTransportMeans' element value. �� � ��. ���������� ������. ������������ �������� �� �������. ��. 21, 25 ��
     * 
     * @param ESADinBorderTransportMeans
     */
    public void setESADinBorderTransportMeans(
            ESADinBorderTransportType ESADinBorderTransportMeans) {
        this.ESADinBorderTransportMeans = ESADinBorderTransportMeans;
    }

    /** 
     * Get the list of 'ESADinReloadingInfo' element items. ���������� � ���������� �������. ��. 55 ��
     * 
     * @return list
     */
    public List<ESADReloadingInfoType> getESADinReloadingInfoList() {
        return ESADinReloadingInfoList;
    }

    /** 
     * Set the list of 'ESADinReloadingInfo' element items. ���������� � ���������� �������. ��. 55 ��
     * 
     * @param list
     */
    public void setESADinReloadingInfoList(List<ESADReloadingInfoType> list) {
        ESADinReloadingInfoList = list;
    }

    /** 
     * Get the 'DeliveryCustomsOffice' element value. ���������� ����� ���������� ��� ��������.��.53 ��
     * 
     * @return value
     */
    public CUCustomsType getDeliveryCustomsOffice() {
        return deliveryCustomsOffice;
    }

    /** 
     * Set the 'DeliveryCustomsOffice' element value. ���������� ����� ���������� ��� ��������.��.53 ��
     * 
     * @param deliveryCustomsOffice
     */
    public void setDeliveryCustomsOffice(CUCustomsType deliveryCustomsOffice) {
        this.deliveryCustomsOffice = deliveryCustomsOffice;
    }

    /** 
     * Get the 'PPBorderCustoms' element value. ���������� ����� (����������� ����� ��������), � ������� ��������� �������� ������� � ������������ �������
     * 
     * @return value
     */
    public CUCustomsType getPPBorderCustoms() {
        return PPBorderCustoms;
    }

    /** 
     * Set the 'PPBorderCustoms' element value. ���������� ����� (����������� ����� ��������), � ������� ��������� �������� ������� � ������������ �������
     * 
     * @param PPBorderCustoms
     */
    public void setPPBorderCustoms(CUCustomsType PPBorderCustoms) {
        this.PPBorderCustoms = PPBorderCustoms;
    }
}
