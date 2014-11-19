
package ru.acs.fts.schemas.album.esadout_cu;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUConsigmentType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADReloadingInfoType;

/** 
 * �������� � ��������� �������. ��. 15, 15�, 17,17�, 18, 19, 21, 25, 26, 29  -��/ ��. 15, 17, 18, 19, 21, 25, 26, 29 , 53, 55- ��
 */
public class ESADoutCUConsigmentType extends CUConsigmentType
{
    private LocalDate dateExpectedArrival;
    private String timeExpectedArrival;
    private ESADoutCUDepartureArrivalTransportType ESADoutCUDepartureArrivalTransport;
    private ESADoutCUBorderTransportType ESADoutCUBorderTransport;
    private List<ESADReloadingInfoType> ESADoutCUReloadingInfoList = new ArrayList<ESADReloadingInfoType>();
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
     * Get the 'ESADout_CUDepartureArrivalTransport' element value. ������������ �������� ��� ��������/������. ��. 18, 26
     * 
     * @return value
     */
    public ESADoutCUDepartureArrivalTransportType getESADoutCUDepartureArrivalTransport() {
        return ESADoutCUDepartureArrivalTransport;
    }

    /** 
     * Set the 'ESADout_CUDepartureArrivalTransport' element value. ������������ �������� ��� ��������/������. ��. 18, 26
     * 
     * @param ESADoutCUDepartureArrivalTransport
     */
    public void setESADoutCUDepartureArrivalTransport(
            ESADoutCUDepartureArrivalTransportType ESADoutCUDepartureArrivalTransport) {
        this.ESADoutCUDepartureArrivalTransport = ESADoutCUDepartureArrivalTransport;
    }

    /** 
     * Get the 'ESADout_CUBorderTransport' element value. ������������ �������� �� �������. ��. 21, 25 ��
     * 
     * @return value
     */
    public ESADoutCUBorderTransportType getESADoutCUBorderTransport() {
        return ESADoutCUBorderTransport;
    }

    /** 
     * Set the 'ESADout_CUBorderTransport' element value. ������������ �������� �� �������. ��. 21, 25 ��
     * 
     * @param ESADoutCUBorderTransport
     */
    public void setESADoutCUBorderTransport(
            ESADoutCUBorderTransportType ESADoutCUBorderTransport) {
        this.ESADoutCUBorderTransport = ESADoutCUBorderTransport;
    }

    /** 
     * Get the list of 'ESADout_CUReloadingInfo' element items. ���������� � ���������� �������. ��. 55 ��
     * 
     * @return list
     */
    public List<ESADReloadingInfoType> getESADoutCUReloadingInfoList() {
        return ESADoutCUReloadingInfoList;
    }

    /** 
     * Set the list of 'ESADout_CUReloadingInfo' element items. ���������� � ���������� �������. ��. 55 ��
     * 
     * @param list
     */
    public void setESADoutCUReloadingInfoList(List<ESADReloadingInfoType> list) {
        ESADoutCUReloadingInfoList = list;
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
